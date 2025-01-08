# Java Integer Overflow Bug

This repository demonstrates an uncommon bug in Java programming: integer overflow.  The program attempts to add 1 to the maximum value of an integer, causing an overflow that results in a negative value.  This illustrates the importance of careful consideration of data types and potential overflow situations in your code. The solution shows how to avoid this with appropriate handling of potential integer overflows.

## Bug Description

The `UncommonBug.java` file contains code that exhibits integer overflow.  The code attempts to add 1 to the maximum value of an integer (`Integer.MAX_VALUE`), causing an arithmetic overflow which results in an incorrect negative number.

## Solution

The `UncommonBugSolution.java` file provides a solution that handles the potential overflow using the `Math.addExact()` method.  This method throws an `ArithmeticException` if an overflow occurs, making the issue explicit and allowing for appropriate error handling.  Consider using larger data types (like `long`) if you are working with numbers that could exceed the capacity of an `int`.
