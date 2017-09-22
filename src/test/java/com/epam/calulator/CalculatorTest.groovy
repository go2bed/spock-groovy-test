package com.epam.calulator

import com.epam.calculator.Calculator
import org.spockframework.runtime.ConditionFailedWithExceptionError
import spock.lang.FailsWith
import spock.lang.IgnoreIf
import spock.lang.Specification

/**
 * @author by Администратор on 21.09.2017.
 */

class SimpleCalcTest extends Specification {

    def "just sum of two even numbers"() {
        given:
        def calc = new Calculator()

        expect:
        interest == calc.sum(awt, y)

        where:
        interest = 8
        awt = 5
        y = 3
    }


    def "show off data table"() {
        given:
        def calc = new Calculator()

        expect:
        interest == calc.sum(awt, y)

        where:
        interest | awt | y
        6        | 3   | 3
        9        | 5   | 4
    }


    @FailsWith(ConditionFailedWithExceptionError)
    def "catch ConditionFailedWithExceptionError"() {
        given:
        def calc = new Calculator()

        expect:
        8 == calc.sum("a", 5)
    }

    @FailsWith(IllegalArgumentException)
    def "catch illegal exception"() {
        given:
        def calc = new Calculator()

        expect:
        5 == calc.trowIllegalException(5)
    }

    @IgnoreIf({ jvm.java8 })
    //This test will be ignored if it is trying to run on java 8
    def "java 8 feature"() {
        given:
        def friends = ["John", "Sara", "Bob"]

        expect:
        friends.stream().getFirst() != null

    }

}