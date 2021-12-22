package com.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@Fork(value = 1, warmups = 1)
@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class JMHDigitCounter {

    @State(Scope.Benchmark)
    public static class BenchmarkState {
        final long[] digits = new long[19];

        public BenchmarkState() {
            long number = new Random().nextInt(9) + 1;
            for (int i = 0; i < 19; i++) {
                digits[i] = number;
                number = number * 10L;
            }
        }
    }

    @Benchmark
    public void countDigitsByDivideAndConquer(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByDivideAndConquer(state.digits[i]);
        }
    }

    @Benchmark
    public void countDigitsByDivision(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByDivision(state.digits[i]);
        }
    }

    @Benchmark
    public void countDigitsByDoWhile(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByDoWhile(state.digits[i]);
        }
    }

    @Benchmark
    public void countDigitsByFor(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByFor(state.digits[i]);
        }
    }

    @Benchmark
    public void countDigitsByLogarithmic(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByLogarithmic(state.digits[i]);
        }
    }

    @Benchmark
    public void countDigitsByPowersOfTwo(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByPowersOfTwo(state.digits[i]);
        }
    }

    @Benchmark
    public void countDigitsByStringLength(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByStringLength(state.digits[1]);
        }
    }

    @Benchmark
    public void countDigitsByWhile(BenchmarkState state) {
        var counter = new DigitCounter();
        for (int i = 0; i < state.digits.length; i++) {
            counter.countDigitsByWhile(state.digits[1]);
        }
    }

    public static void main(String[] args) throws RunnerException {
        var opt = new OptionsBuilder()
                .include(DigitCounter.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }

}
