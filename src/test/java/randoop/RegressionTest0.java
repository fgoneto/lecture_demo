package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        try {
            org.joda.time.Days days2 = org.joda.time.Days.daysBetween(readableInstant0, readableInstant1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.Days days0 = org.joda.time.Days.THREE;
        org.junit.Assert.assertNotNull(days0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        try {
            org.joda.time.Days days2 = org.joda.time.Days.daysBetween(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.FIVE;
        int i3 = days2.size();
        org.joda.time.Days days4 = days2.negated();
        try {
            org.joda.time.Days days5 = days0.minus(days4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P2147483647D" + "'", str1.equals("P2147483647D"));
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        try {
            org.joda.time.Days days1 = org.joda.time.Days.parseDays("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        try {
            org.joda.time.Days days6 = days0.dividedBy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        org.joda.time.Days days4 = null;
        boolean b5 = days1.isGreaterThan(days4);
        try {
            org.joda.time.DurationFieldType durationFieldType7 = days1.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Days days4 = days0.plus((int) (byte) -1);
        try {
            int i6 = days0.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Days days6 = days1.plus((int) (byte) 1);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        try {
            org.joda.time.DurationFieldType durationFieldType6 = days4.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        java.lang.String str1 = days0.toString();
        try {
            org.joda.time.Days days3 = days0.dividedBy((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P2147483647D" + "'", str1.equals("P2147483647D"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
        try {
            int i3 = days0.getValue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(minutes1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        boolean b2 = days0.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        org.joda.time.Days days11 = days10.negated();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days5);
        int i7 = days5.getDays();
        org.joda.time.Days days8 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days5);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(i7 == 6);
        org.junit.Assert.assertNotNull(days8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        int i3 = days2.size();
        org.joda.time.Duration duration4 = days2.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNotNull(duration4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.Days days1 = org.joda.time.Days.days(6);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = days4.multipliedBy(0);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days6);
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Days days9 = org.joda.time.Days.FOUR;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = days9.negated();
        org.joda.time.DurationFieldType durationFieldType12 = days9.getFieldType();
        int i13 = days8.get(durationFieldType12);
        boolean b14 = days7.isSupported(durationFieldType12);
        int i15 = days2.get(durationFieldType12);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P2147483647D");
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = days5.plus(days6);
        org.joda.time.MutablePeriod mutablePeriod8 = days6.toMutablePeriod();
        org.joda.time.Days days9 = null;
        boolean b10 = days6.isGreaterThan(days9);
        org.joda.time.Days days11 = days4.minus(days6);
        org.joda.time.DurationFieldType durationFieldType12 = days6.getFieldType();
        int i13 = days1.get(durationFieldType12);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue(i13 == 6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days7 = days5.minus(0);
        org.joda.time.MutablePeriod mutablePeriod8 = days7.toMutablePeriod();
        org.joda.time.Days days9 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Days days12 = days10.plus(days11);
        org.joda.time.MutablePeriod mutablePeriod13 = days11.toMutablePeriod();
        org.joda.time.Days days14 = null;
        boolean b15 = days11.isGreaterThan(days14);
        org.joda.time.Days days16 = days9.minus(days11);
        org.joda.time.DurationFieldType durationFieldType17 = days11.getFieldType();
        boolean b18 = days7.isSupported(durationFieldType17);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue(b18 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        boolean b5 = days3.isGreaterThan(days4);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.dividedBy(1);
        boolean b9 = days0.equals((java.lang.Object) days8);
        int i10 = days0.size();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) -1);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        boolean b5 = days3.isGreaterThan(days4);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.dividedBy(1);
        boolean b9 = days0.equals((java.lang.Object) days8);
        try {
            int i11 = days0.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days1 = days0.negated();
        try {
            org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = days6.plus(days7);
        org.joda.time.Duration duration9 = days7.toStandardDuration();
        org.joda.time.Days days11 = days7.multipliedBy((int) (short) 0);
        org.joda.time.Days days13 = days7.multipliedBy((int) (short) -1);
        boolean b14 = days5.isLessThan(days7);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        int i5 = days4.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(i5 == 12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        boolean b5 = days3.isGreaterThan(days4);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.dividedBy(1);
        boolean b9 = days0.equals((java.lang.Object) days8);
        org.joda.time.Days days10 = org.joda.time.Days.TWO;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Period period12 = days11.toPeriod();
        org.joda.time.Duration duration13 = days11.toStandardDuration();
        org.joda.time.Days days15 = days11.multipliedBy((int) (short) 0);
        org.joda.time.Days days16 = days11.negated();
        boolean b17 = days10.equals((java.lang.Object) days16);
        org.joda.time.Days days18 = days0.plus(days10);
        org.joda.time.DurationFieldType durationFieldType20 = days18.getFieldType(0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(durationFieldType20);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        boolean b5 = days3.isGreaterThan(days4);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.dividedBy(1);
        boolean b9 = days0.equals((java.lang.Object) days8);
        org.joda.time.Days days10 = org.joda.time.Days.TWO;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Period period12 = days11.toPeriod();
        org.joda.time.Duration duration13 = days11.toStandardDuration();
        org.joda.time.Days days15 = days11.multipliedBy((int) (short) 0);
        org.joda.time.Days days16 = days11.negated();
        boolean b17 = days10.equals((java.lang.Object) days16);
        org.joda.time.Days days18 = days0.plus(days10);
        org.joda.time.Period period19 = days18.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days7 = days1.multipliedBy((int) (short) -1);
        org.joda.time.Days days9 = days1.plus(0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days7 = days1.plus((int) '4');
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Days days9 = org.joda.time.Days.FOUR;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = days9.negated();
        org.joda.time.DurationFieldType durationFieldType12 = days9.getFieldType();
        int i13 = days8.get(durationFieldType12);
        int i14 = days7.get(durationFieldType12);
        org.joda.time.DurationFieldType durationFieldType16 = days7.getFieldType(0);
        int i17 = days7.getDays();
        org.joda.time.Duration duration18 = days7.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 58);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue(i17 == 58);
        org.junit.Assert.assertNotNull(duration18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        org.joda.time.Days days9 = days0.dividedBy(100);
        org.joda.time.PeriodType periodType10 = days0.getPeriodType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) 10);
        org.joda.time.Weeks weeks2 = days1.toStandardWeeks();
        try {
            int i4 = weeks2.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(weeks2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = days6.plus(days7);
        org.joda.time.Days days10 = days6.plus((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod11 = days6.toMutablePeriod();
        org.joda.time.Days days12 = days6.negated();
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = org.joda.time.Days.SIX;
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.Days days16 = days14.plus(days15);
        boolean b17 = days13.equals((java.lang.Object) days14);
        org.joda.time.DurationFieldType durationFieldType18 = days13.getFieldType();
        int i19 = days6.get(durationFieldType18);
        int i20 = days4.get(durationFieldType18);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue(i19 == 6);
        org.junit.Assert.assertTrue(i20 == 5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        org.joda.time.PeriodType periodType11 = days9.getPeriodType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(periodType11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        org.joda.time.Days days4 = days1.negated();
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = days5.plus(days6);
        org.joda.time.MutablePeriod mutablePeriod8 = days6.toMutablePeriod();
        org.joda.time.Days days9 = null;
        boolean b10 = days6.isGreaterThan(days9);
        boolean b11 = days1.equals((java.lang.Object) b10);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.DurationFieldType durationFieldType5 = days0.getFieldType();
        org.joda.time.Days days6 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days6);
        try {
            org.joda.time.Days days8 = days0.plus(days7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days7 = days1.multipliedBy((int) (short) -1);
        int i8 = days7.size();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        int i4 = days3.getDays();
        org.joda.time.MutablePeriod mutablePeriod5 = days3.toMutablePeriod();
        org.joda.time.Days days6 = null;
        org.joda.time.Days days7 = days3.minus(days6);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(i4 == 5);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.PeriodType periodType6 = days1.getPeriodType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        try {
            int i3 = days1.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        org.joda.time.Days days1 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        try {
            int i3 = days0.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        int i11 = days10.size();
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days10);
        int i13 = days10.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue(i13 == 10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.PeriodType periodType3 = days0.getPeriodType();
        int i4 = days0.size();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.DurationFieldType durationFieldType2 = days0.getFieldType();
        org.joda.time.Days days4 = org.joda.time.Days.days((int) ' ');
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Period period6 = days5.toPeriod();
        org.joda.time.DurationFieldType durationFieldType7 = days5.getFieldType();
        boolean b8 = days4.isSupported(durationFieldType7);
        boolean b9 = days0.isSupported(durationFieldType7);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days5 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days6 = days5.negated();
        boolean b7 = days2.isGreaterThan(days5);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Seconds seconds3 = days0.toStandardSeconds();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(seconds3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        boolean b8 = days6.isGreaterThan(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days11 = days7.dividedBy(1);
        boolean b12 = days1.isGreaterThan(days11);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        try {
            int i3 = days0.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Period period5 = days4.toPeriod();
        org.joda.time.Duration duration6 = days4.toStandardDuration();
        org.joda.time.Days days8 = days4.multipliedBy((int) (short) 0);
        org.joda.time.Days days10 = days4.multipliedBy(10);
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = days12.plus(days13);
        boolean b15 = days11.equals((java.lang.Object) days12);
        org.joda.time.Days days16 = days10.minus(days12);
        boolean b17 = days2.isLessThan(days10);
        org.joda.time.DurationFieldType durationFieldType18 = days10.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(durationFieldType18);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        java.lang.String str11 = days10.toString();
        org.joda.time.PeriodType periodType12 = days10.getPeriodType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "P10D" + "'", str11.equals("P10D"));
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = org.joda.time.Days.FOUR;
        org.joda.time.Days days2 = days1.negated();
        org.joda.time.PeriodType periodType3 = days2.getPeriodType();
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        java.lang.String str5 = days4.toString();
        org.joda.time.Days days6 = days0.plus(days4);
        org.joda.time.Period period7 = days0.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "P-4D" + "'", str5.equals("P-4D"));
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.joda.time.ReadablePeriod readablePeriod0 = null;
        org.joda.time.Days days1 = org.joda.time.Days.standardDaysIn(readablePeriod0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.MIN_VALUE;
        int i2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        int i11 = days10.size();
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days10);
        org.joda.time.Days days13 = org.joda.time.Days.FOUR;
        org.joda.time.Days days14 = days13.negated();
        org.joda.time.Days days15 = days13.negated();
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        org.joda.time.Days days17 = org.joda.time.Days.SIX;
        boolean b18 = days16.isGreaterThan(days17);
        org.joda.time.Days days19 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days17);
        org.joda.time.Days days21 = days17.dividedBy(1);
        boolean b22 = days13.equals((java.lang.Object) days21);
        org.joda.time.Days days23 = org.joda.time.Days.TWO;
        org.joda.time.Days days24 = org.joda.time.Days.SIX;
        org.joda.time.Period period25 = days24.toPeriod();
        org.joda.time.Duration duration26 = days24.toStandardDuration();
        org.joda.time.Days days28 = days24.multipliedBy((int) (short) 0);
        org.joda.time.Days days29 = days24.negated();
        boolean b30 = days23.equals((java.lang.Object) days29);
        org.joda.time.Days days31 = days13.plus(days23);
        org.joda.time.Days days32 = org.joda.time.Days.FOUR;
        org.joda.time.Days days33 = days32.negated();
        org.joda.time.Days days34 = days32.negated();
        org.joda.time.DurationFieldType durationFieldType35 = days32.getFieldType();
        int i36 = days31.get(durationFieldType35);
        boolean b37 = days12.isSupported(durationFieldType35);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue(i36 == 6);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Period period3 = days2.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(period3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        int i3 = days0.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days1 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        try {
            org.joda.time.Hours hours2 = days1.toStandardHours();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days3 = days0.minus(12);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days0.plus(100);
        org.joda.time.Days days5 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days6 = days0.minus(days5);
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = days7.plus(days8);
        int i10 = days6.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue(i10 == (-1));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = days7.plus(days8);
        boolean b10 = days6.equals((java.lang.Object) days7);
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.Days days12 = org.joda.time.Days.FOUR;
        org.joda.time.Days days13 = days12.negated();
        org.joda.time.PeriodType periodType14 = days13.getPeriodType();
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days13);
        org.joda.time.Days days16 = days7.minus(days15);
        int i17 = days16.size();
        org.joda.time.Days days18 = org.joda.time.Days.SIX;
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        boolean b20 = days18.isGreaterThan(days19);
        org.joda.time.Days days22 = days18.plus(100);
        org.joda.time.Days days23 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days24 = days18.minus(days23);
        int i25 = days16.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days23);
        boolean b26 = days4.isLessThan(days23);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(i17 == 1);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertTrue(i25 == 1);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days5 = days0.minus(6);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Duration duration1 = days0.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(duration1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days1 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        int i3 = days2.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i3 == 2147483647);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        int i11 = days10.size();
        org.joda.time.Days days13 = days10.multipliedBy(100);
        org.joda.time.Period period14 = days10.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.DurationFieldType durationFieldType5 = days1.getFieldType((int) (byte) 0);
        org.joda.time.Days days7 = org.joda.time.Days.days(100);
        org.joda.time.DurationFieldType durationFieldType9 = days7.getFieldType(0);
        boolean b10 = days1.isSupported(durationFieldType9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        java.lang.String str1 = days0.toString();
        try {
            org.joda.time.Minutes minutes2 = days0.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
        } catch (java.lang.ArithmeticException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P2147483647D" + "'", str1.equals("P2147483647D"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        boolean b8 = days6.isGreaterThan(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days11 = days7.dividedBy(1);
        org.joda.time.Days days13 = days11.minus(0);
        org.joda.time.Days days14 = days5.plus(days11);
        int i15 = days5.size();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue(i15 == 1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Period period2 = days1.toPeriod();
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days1.negated();
        boolean b7 = days0.equals((java.lang.Object) days6);
        org.joda.time.Days days9 = days0.minus(6);
        org.joda.time.Days days11 = days9.plus((int) (short) 1);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days0.plus(100);
        org.joda.time.Days days5 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days6 = days0.minus(days5);
        org.joda.time.DurationFieldType durationFieldType7 = days5.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int i4 = days1.get(durationFieldType3);
        org.joda.time.Days days6 = days1.dividedBy((int) (short) 10);
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Period period8 = days7.toPeriod();
        org.joda.time.Days days9 = org.joda.time.Days.FOUR;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = days9.negated();
        org.joda.time.DurationFieldType durationFieldType12 = days9.getFieldType();
        boolean b13 = days7.isGreaterThan(days9);
        java.lang.String str14 = days7.toString();
        boolean b15 = days1.isLessThan(days7);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "P6D" + "'", str14.equals("P6D"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        int i4 = days3.getDays();
        org.joda.time.MutablePeriod mutablePeriod5 = days3.toMutablePeriod();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = days7.plus(days8);
        boolean b10 = days6.equals((java.lang.Object) days7);
        org.joda.time.Duration duration11 = days7.toStandardDuration();
        org.joda.time.Days days13 = days7.plus((int) '4');
        org.joda.time.Days days14 = org.joda.time.Days.ZERO;
        org.joda.time.Days days15 = org.joda.time.Days.FOUR;
        org.joda.time.Days days16 = days15.negated();
        org.joda.time.Days days17 = days15.negated();
        org.joda.time.DurationFieldType durationFieldType18 = days15.getFieldType();
        int i19 = days14.get(durationFieldType18);
        int i20 = days13.get(durationFieldType18);
        boolean b21 = days3.isSupported(durationFieldType18);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.Days days23 = org.joda.time.Days.SIX;
        org.joda.time.Days days24 = days22.plus(days23);
        org.joda.time.Duration duration25 = days24.toStandardDuration();
        org.joda.time.Days days26 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days24);
        boolean b27 = days3.isLessThan(days26);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(i4 == 5);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(i20 == 58);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertTrue(b27 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        boolean b5 = days3.isGreaterThan(days4);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.dividedBy(1);
        boolean b9 = days0.equals((java.lang.Object) days8);
        org.joda.time.Days days10 = org.joda.time.Days.TWO;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Period period12 = days11.toPeriod();
        org.joda.time.Duration duration13 = days11.toStandardDuration();
        org.joda.time.Days days15 = days11.multipliedBy((int) (short) 0);
        org.joda.time.Days days16 = days11.negated();
        boolean b17 = days10.equals((java.lang.Object) days16);
        org.joda.time.Days days18 = days0.plus(days10);
        org.joda.time.Days days19 = org.joda.time.Days.FOUR;
        org.joda.time.Days days20 = days19.negated();
        org.joda.time.Days days21 = days19.negated();
        org.joda.time.DurationFieldType durationFieldType22 = days19.getFieldType();
        int i23 = days18.get(durationFieldType22);
        java.lang.String str24 = days18.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue(i23 == 6);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "P6D" + "'", str24.equals("P6D"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        int i11 = days10.size();
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        boolean b14 = days12.isGreaterThan(days13);
        org.joda.time.Days days15 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days13);
        org.joda.time.Days days17 = days13.multipliedBy((int) '4');
        org.joda.time.Days days18 = org.joda.time.Days.SIX;
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        org.joda.time.Days days20 = org.joda.time.Days.SIX;
        org.joda.time.Days days21 = days19.plus(days20);
        boolean b22 = days18.equals((java.lang.Object) days19);
        org.joda.time.Duration duration23 = days19.toStandardDuration();
        org.joda.time.Days days25 = days19.plus((int) '4');
        org.joda.time.Days days26 = org.joda.time.Days.ZERO;
        org.joda.time.Days days27 = org.joda.time.Days.FOUR;
        org.joda.time.Days days28 = days27.negated();
        org.joda.time.Days days29 = days27.negated();
        org.joda.time.DurationFieldType durationFieldType30 = days27.getFieldType();
        int i31 = days26.get(durationFieldType30);
        int i32 = days25.get(durationFieldType30);
        org.joda.time.DurationFieldType durationFieldType34 = days25.getFieldType(0);
        org.joda.time.Days days35 = days13.plus(days25);
        boolean b36 = days10.isLessThan(days35);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(i32 == 58);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertNotNull(days35);
        org.junit.Assert.assertTrue(b36 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.parseDays("P-4D");
        boolean b5 = days0.isGreaterThan(days4);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        java.lang.String str11 = days10.toString();
        org.joda.time.Days days13 = org.joda.time.Days.days(1);
        org.joda.time.Duration duration14 = days13.toStandardDuration();
        org.joda.time.Days days15 = days10.plus(days13);
        org.joda.time.Days days17 = days10.minus(4);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "P10D" + "'", str11.equals("P10D"));
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        boolean b8 = days6.isGreaterThan(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days11 = days7.dividedBy(1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days11);
        boolean b13 = days4.isGreaterThan(days12);
        java.lang.String str14 = days12.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "P6D" + "'", str14.equals("P6D"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days7 = days1.plus((int) '4');
        org.joda.time.Days days8 = org.joda.time.Days.FOUR;
        org.joda.time.Days days9 = days8.negated();
        org.joda.time.Days days11 = days9.plus(10);
        boolean b12 = days7.isGreaterThan(days9);
        try {
            org.joda.time.DurationFieldType durationFieldType14 = days9.getFieldType(58);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        boolean b8 = days6.isGreaterThan(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days11 = days7.dividedBy(1);
        org.joda.time.Days days13 = days11.minus(0);
        org.joda.time.Days days14 = days5.plus(days11);
        org.joda.time.Days days16 = days11.dividedBy((int) (short) -1);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days0.plus(100);
        org.joda.time.Days days6 = days4.multipliedBy((int) (byte) 10);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Days days4 = days0.plus((int) (byte) -1);
        org.joda.time.Days days6 = days0.multipliedBy(4);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.Days days1 = org.joda.time.Days.parseDays("P-4D");
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Days days5 = days3.plus(days4);
        boolean b6 = days2.equals((java.lang.Object) days3);
        org.joda.time.Duration duration7 = days3.toStandardDuration();
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Period period9 = days8.toPeriod();
        org.joda.time.Duration duration10 = days8.toStandardDuration();
        org.joda.time.Days days12 = days8.multipliedBy((int) (short) 0);
        org.joda.time.Period period13 = days8.toPeriod();
        int i14 = days3.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days8);
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        org.joda.time.Days days17 = org.joda.time.Days.SIX;
        org.joda.time.Days days18 = days16.plus(days17);
        boolean b19 = days15.equals((java.lang.Object) days16);
        org.joda.time.Duration duration20 = days16.toStandardDuration();
        org.joda.time.Days days21 = org.joda.time.Days.FOUR;
        org.joda.time.Days days22 = days21.negated();
        org.joda.time.PeriodType periodType23 = days22.getPeriodType();
        org.joda.time.Days days24 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days22);
        org.joda.time.Days days25 = days16.minus(days24);
        boolean b26 = days8.equals((java.lang.Object) days16);
        int i27 = days1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days16);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(i27 == (-1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        int i2 = days1.getDays();
        org.joda.time.Days days4 = days1.multipliedBy((-4));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(i2 == (-4));
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        int i3 = days2.size();
        org.joda.time.PeriodType periodType4 = days2.getPeriodType();
        org.joda.time.Days days5 = days2.negated();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Period period7 = days6.toPeriod();
        org.joda.time.Seconds seconds8 = days6.toStandardSeconds();
        try {
            int i9 = days2.compareTo((org.joda.time.base.BaseSingleFieldPeriod) seconds8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(seconds8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        org.joda.time.Days days4 = null;
        boolean b5 = days1.isGreaterThan(days4);
        try {
            int i7 = days1.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days3.multipliedBy((int) (short) 100);
        org.joda.time.Days days7 = days3.plus((int) (short) -1);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days6 = days1.multipliedBy((int) ' ');
        java.lang.String str7 = days1.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "P6D" + "'", str7.equals("P6D"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Days days6 = days4.multipliedBy((int) ' ');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        int i8 = days6.get(durationFieldType7);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.MutablePeriod mutablePeriod3 = days0.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days5 = days0.negated();
        org.joda.time.MutablePeriod mutablePeriod6 = days0.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Period period7 = days6.toPeriod();
        org.joda.time.Duration duration8 = days6.toStandardDuration();
        org.joda.time.Days days10 = days6.multipliedBy((int) (short) 0);
        org.joda.time.Period period11 = days6.toPeriod();
        int i12 = days1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = org.joda.time.Days.SIX;
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.Days days16 = days14.plus(days15);
        boolean b17 = days13.equals((java.lang.Object) days14);
        org.joda.time.Duration duration18 = days14.toStandardDuration();
        org.joda.time.Days days19 = org.joda.time.Days.FOUR;
        org.joda.time.Days days20 = days19.negated();
        org.joda.time.PeriodType periodType21 = days20.getPeriodType();
        org.joda.time.Days days22 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days20);
        org.joda.time.Days days23 = days14.minus(days22);
        boolean b24 = days6.equals((java.lang.Object) days14);
        org.joda.time.Days days26 = days6.multipliedBy((-58));
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(days26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        int i3 = days0.getDays();
        org.joda.time.Days days4 = org.joda.time.Days.ZERO;
        org.joda.time.Days days5 = org.joda.time.Days.FOUR;
        org.joda.time.Days days6 = days5.negated();
        org.joda.time.Days days7 = days5.negated();
        org.joda.time.DurationFieldType durationFieldType8 = days5.getFieldType();
        int i9 = days4.get(durationFieldType8);
        int i10 = days0.get(durationFieldType8);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertTrue(i3 == 4);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) '#');
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        int i4 = days1.getDays();
        org.joda.time.Days days6 = days1.plus((int) (byte) 0);
        int i7 = days1.size();
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = org.joda.time.Days.SIX;
        org.joda.time.Days days10 = days8.plus(days9);
        org.joda.time.MutablePeriod mutablePeriod11 = days9.toMutablePeriod();
        org.joda.time.Days days12 = days9.negated();
        org.joda.time.Days days13 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days9);
        boolean b14 = days1.isLessThan(days13);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue(i4 == 6);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days5 = org.joda.time.Days.MAX_VALUE;
        java.lang.String str6 = days5.toString();
        boolean b7 = days4.equals((java.lang.Object) str6);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "P2147483647D" + "'", str6.equals("P2147483647D"));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days5 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        boolean b8 = days6.isGreaterThan(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days11 = days7.dividedBy(1);
        org.joda.time.Days days12 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days11);
        boolean b13 = days4.isGreaterThan(days12);
        org.joda.time.ReadableInterval readableInterval14 = null;
        org.joda.time.Days days15 = org.joda.time.Days.daysIn(readableInterval14);
        int i16 = days4.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days15);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertTrue(i16 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days0.multipliedBy(10);
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = org.joda.time.Days.SIX;
        org.joda.time.Days days10 = days8.plus(days9);
        boolean b11 = days7.equals((java.lang.Object) days8);
        org.joda.time.Days days12 = days6.minus(days8);
        org.joda.time.Duration duration13 = days6.toStandardDuration();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(duration13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days5);
        int i7 = days5.getDays();
        org.joda.time.Days days8 = org.joda.time.Days.FIVE;
        int i9 = days8.size();
        org.joda.time.PeriodType periodType10 = days8.getPeriodType();
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        int i12 = days11.getDays();
        org.joda.time.MutablePeriod mutablePeriod13 = days11.toMutablePeriod();
        org.joda.time.Days days14 = org.joda.time.Days.SIX;
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        org.joda.time.Days days17 = days15.plus(days16);
        boolean b18 = days14.equals((java.lang.Object) days15);
        org.joda.time.Duration duration19 = days15.toStandardDuration();
        org.joda.time.Days days21 = days15.plus((int) '4');
        org.joda.time.Days days22 = org.joda.time.Days.ZERO;
        org.joda.time.Days days23 = org.joda.time.Days.FOUR;
        org.joda.time.Days days24 = days23.negated();
        org.joda.time.Days days25 = days23.negated();
        org.joda.time.DurationFieldType durationFieldType26 = days23.getFieldType();
        int i27 = days22.get(durationFieldType26);
        int i28 = days21.get(durationFieldType26);
        boolean b29 = days11.isSupported(durationFieldType26);
        boolean b30 = days5.isGreaterThan(days11);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(i7 == 6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue(i12 == 5);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue(i27 == 0);
        org.junit.Assert.assertTrue(i28 == 58);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b30 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        org.joda.time.DurationFieldType durationFieldType8 = days2.getFieldType();
        org.joda.time.Days days10 = days2.plus((int) (byte) -1);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(days10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Period period2 = days1.toPeriod();
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days1.negated();
        boolean b7 = days0.equals((java.lang.Object) days6);
        org.joda.time.DurationFieldType durationFieldType8 = days6.getFieldType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.MIN_VALUE;
        int i2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Days days4 = days0.dividedBy((int) (byte) 100);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertNotNull(days4);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        try {
            int i5 = days3.getValue((-58));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        int i8 = days7.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = days6.plus(days7);
        boolean b9 = days5.equals((java.lang.Object) days6);
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        boolean b12 = days10.isGreaterThan(days11);
        int i13 = days5.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days11);
        org.joda.time.Days days14 = days1.plus(days11);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(days14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days7 = days1.plus(0);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        boolean b5 = days3.isGreaterThan(days4);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days4.dividedBy(1);
        boolean b9 = days0.equals((java.lang.Object) days8);
        org.joda.time.Days days10 = org.joda.time.Days.TWO;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Period period12 = days11.toPeriod();
        org.joda.time.Duration duration13 = days11.toStandardDuration();
        org.joda.time.Days days15 = days11.multipliedBy((int) (short) 0);
        org.joda.time.Days days16 = days11.negated();
        boolean b17 = days10.equals((java.lang.Object) days16);
        org.joda.time.Days days18 = days0.plus(days10);
        int i19 = days18.size();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days6 = days4.plus((int) (byte) 1);
        java.lang.String str7 = days4.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "P5D" + "'", str7.equals("P5D"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days7 = days1.plus((int) '4');
        org.joda.time.Days days8 = org.joda.time.Days.ZERO;
        org.joda.time.Days days9 = org.joda.time.Days.FOUR;
        org.joda.time.Days days10 = days9.negated();
        org.joda.time.Days days11 = days9.negated();
        org.joda.time.DurationFieldType durationFieldType12 = days9.getFieldType();
        int i13 = days8.get(durationFieldType12);
        int i14 = days7.get(durationFieldType12);
        org.joda.time.MutablePeriod mutablePeriod15 = days7.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(i14 == 58);
        org.junit.Assert.assertNotNull(mutablePeriod15);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = days4.plus(days5);
        org.joda.time.MutablePeriod mutablePeriod7 = days5.toMutablePeriod();
        org.joda.time.Days days8 = days3.plus(days5);
        org.joda.time.Period period9 = days5.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days3 = days1.dividedBy((int) (byte) 10);
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Period period5 = days4.toPeriod();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.Days days8 = days6.negated();
        org.joda.time.DurationFieldType durationFieldType9 = days6.getFieldType();
        boolean b10 = days4.isGreaterThan(days6);
        java.lang.String str11 = days4.toString();
        boolean b12 = days1.isLessThan(days4);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "P6D" + "'", str11.equals("P6D"));
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = org.joda.time.Days.ZERO;
        org.joda.time.Days days5 = org.joda.time.Days.FOUR;
        org.joda.time.Days days6 = days5.negated();
        org.joda.time.Days days7 = days5.negated();
        org.joda.time.DurationFieldType durationFieldType8 = days5.getFieldType();
        int i9 = days4.get(durationFieldType8);
        boolean b10 = days3.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = days3.getFieldType();
        org.joda.time.Days days12 = days3.negated();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(days12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = days4.plus(days5);
        org.joda.time.MutablePeriod mutablePeriod7 = days5.toMutablePeriod();
        org.joda.time.Days days8 = days3.plus(days5);
        org.joda.time.Days days9 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Days days10 = days9.negated();
        boolean b11 = days5.isGreaterThan(days9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(mutablePeriod7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.Days days1 = org.joda.time.Days.days(5);
        org.joda.time.Days days2 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Period period7 = days6.toPeriod();
        org.joda.time.Duration duration8 = days6.toStandardDuration();
        org.joda.time.Days days10 = days6.multipliedBy((int) (short) 0);
        org.joda.time.Period period11 = days6.toPeriod();
        int i12 = days1.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days6);
        try {
            int i14 = days1.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Days days5 = days2.multipliedBy((int) '4');
        org.joda.time.MutablePeriod mutablePeriod6 = days2.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(mutablePeriod6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        try {
            int i3 = days0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(i1 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Period period5 = days4.toPeriod();
        org.joda.time.Duration duration6 = days4.toStandardDuration();
        org.joda.time.Days days8 = days4.multipliedBy((int) (short) 0);
        org.joda.time.Days days10 = days4.multipliedBy(10);
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = days12.plus(days13);
        boolean b15 = days11.equals((java.lang.Object) days12);
        org.joda.time.Days days16 = days10.minus(days12);
        boolean b17 = days2.isLessThan(days10);
        try {
            org.joda.time.DurationFieldType durationFieldType19 = days2.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Period period5 = days4.toPeriod();
        org.joda.time.Duration duration6 = days4.toStandardDuration();
        org.joda.time.Days days8 = days4.multipliedBy((int) (short) 0);
        org.joda.time.Days days10 = days4.multipliedBy(10);
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = days12.plus(days13);
        boolean b15 = days11.equals((java.lang.Object) days12);
        org.joda.time.Days days16 = days10.minus(days12);
        boolean b17 = days2.isLessThan(days10);
        org.joda.time.Days days18 = org.joda.time.Days.SIX;
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        org.joda.time.Days days20 = days18.plus(days19);
        org.joda.time.Days days22 = days18.plus((int) (byte) -1);
        org.joda.time.Days days24 = days18.multipliedBy((int) (byte) 1);
        org.joda.time.Days days26 = days24.minus((int) (short) 1);
        org.joda.time.Days days27 = days10.plus(days24);
        org.joda.time.Days days28 = org.joda.time.Days.SIX;
        org.joda.time.Days days29 = org.joda.time.Days.SIX;
        boolean b30 = days28.isGreaterThan(days29);
        org.joda.time.Days days31 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days29);
        org.joda.time.Days days33 = days29.multipliedBy((int) '4');
        org.joda.time.Days days34 = days27.plus(days29);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days33);
        org.junit.Assert.assertNotNull(days34);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days7 = days1.plus((int) '4');
        org.joda.time.Days days8 = org.joda.time.Days.ONE;
        org.joda.time.Days days10 = days8.multipliedBy(0);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days10);
        org.joda.time.Days days12 = org.joda.time.Days.ZERO;
        org.joda.time.Days days13 = org.joda.time.Days.FOUR;
        org.joda.time.Days days14 = days13.negated();
        org.joda.time.Days days15 = days13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = days13.getFieldType();
        int i17 = days12.get(durationFieldType16);
        boolean b18 = days11.isSupported(durationFieldType16);
        org.joda.time.DurationFieldType durationFieldType19 = days11.getFieldType();
        int i20 = days1.get(durationFieldType19);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertTrue(i20 == 6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days0.multipliedBy(10);
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = org.joda.time.Days.SIX;
        org.joda.time.Days days10 = days8.plus(days9);
        boolean b11 = days7.equals((java.lang.Object) days8);
        org.joda.time.Days days12 = days6.minus(days8);
        org.joda.time.Days days14 = days8.multipliedBy((-1));
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        boolean b17 = days15.isGreaterThan(days16);
        org.joda.time.Days days19 = days16.plus((int) (short) -1);
        org.joda.time.Days days21 = days16.multipliedBy((int) ' ');
        boolean b22 = days14.isLessThan(days16);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        try {
            org.joda.time.DurationFieldType durationFieldType5 = days1.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Days days6 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days5);
        org.joda.time.Period period7 = days6.toPeriod();
        org.joda.time.Days days8 = org.joda.time.Days.ONE;
        org.joda.time.Days days10 = days8.multipliedBy(0);
        org.joda.time.Days days11 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days10);
        org.joda.time.Days days12 = org.joda.time.Days.ZERO;
        org.joda.time.Days days13 = org.joda.time.Days.FOUR;
        org.joda.time.Days days14 = days13.negated();
        org.joda.time.Days days15 = days13.negated();
        org.joda.time.DurationFieldType durationFieldType16 = days13.getFieldType();
        int i17 = days12.get(durationFieldType16);
        boolean b18 = days11.isSupported(durationFieldType16);
        org.joda.time.Days days19 = org.joda.time.Days.SIX;
        org.joda.time.Days days20 = org.joda.time.Days.SIX;
        org.joda.time.Days days21 = org.joda.time.Days.SIX;
        org.joda.time.Days days22 = days20.plus(days21);
        boolean b23 = days19.equals((java.lang.Object) days20);
        org.joda.time.Duration duration24 = days20.toStandardDuration();
        org.joda.time.Days days26 = days20.plus((int) '4');
        org.joda.time.Days days27 = org.joda.time.Days.ZERO;
        org.joda.time.Days days28 = org.joda.time.Days.FOUR;
        org.joda.time.Days days29 = days28.negated();
        org.joda.time.Days days30 = days28.negated();
        org.joda.time.DurationFieldType durationFieldType31 = days28.getFieldType();
        int i32 = days27.get(durationFieldType31);
        int i33 = days26.get(durationFieldType31);
        org.joda.time.DurationFieldType durationFieldType35 = days26.getFieldType(0);
        org.joda.time.Days days36 = days11.minus(days26);
        org.joda.time.Days days37 = org.joda.time.Days.SIX;
        org.joda.time.Days days38 = org.joda.time.Days.SIX;
        org.joda.time.Days days39 = days37.plus(days38);
        org.joda.time.Days days41 = days37.plus((int) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod42 = days37.toMutablePeriod();
        org.joda.time.Days days43 = days37.negated();
        org.joda.time.Days days44 = org.joda.time.Days.SIX;
        org.joda.time.Days days45 = org.joda.time.Days.SIX;
        org.joda.time.Days days46 = org.joda.time.Days.SIX;
        org.joda.time.Days days47 = days45.plus(days46);
        boolean b48 = days44.equals((java.lang.Object) days45);
        org.joda.time.DurationFieldType durationFieldType49 = days44.getFieldType();
        int i50 = days37.get(durationFieldType49);
        int i51 = days36.get(durationFieldType49);
        boolean b52 = days6.isSupported(durationFieldType49);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(days19);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(i33 == 58);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(days36);
        org.junit.Assert.assertNotNull(days37);
        org.junit.Assert.assertNotNull(days38);
        org.junit.Assert.assertNotNull(days39);
        org.junit.Assert.assertNotNull(days41);
        org.junit.Assert.assertNotNull(mutablePeriod42);
        org.junit.Assert.assertNotNull(days43);
        org.junit.Assert.assertNotNull(days44);
        org.junit.Assert.assertNotNull(days45);
        org.junit.Assert.assertNotNull(days46);
        org.junit.Assert.assertNotNull(days47);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertTrue(i50 == 6);
        org.junit.Assert.assertTrue(i51 == (-58));
        org.junit.Assert.assertTrue(b52 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = org.joda.time.Days.FOUR;
        org.joda.time.Days days8 = days7.negated();
        org.joda.time.PeriodType periodType9 = days8.getPeriodType();
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        java.lang.String str11 = days10.toString();
        org.joda.time.Days days12 = days6.plus(days10);
        boolean b13 = days5.isGreaterThan(days10);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "P-4D" + "'", str11.equals("P-4D"));
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days5 = days0.negated();
        int i6 = days5.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue(i6 == (-6));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Period period2 = days1.toPeriod();
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days1.negated();
        boolean b7 = days0.equals((java.lang.Object) days6);
        try {
            org.joda.time.DurationFieldType durationFieldType9 = days6.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        int i4 = days1.getDays();
        org.joda.time.Days days5 = org.joda.time.Days.SIX;
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = days6.plus(days7);
        boolean b9 = days5.equals((java.lang.Object) days6);
        org.joda.time.Duration duration10 = days6.toStandardDuration();
        org.joda.time.Days days12 = days6.plus((int) '4');
        org.joda.time.Days days13 = org.joda.time.Days.ZERO;
        org.joda.time.Days days14 = org.joda.time.Days.FOUR;
        org.joda.time.Days days15 = days14.negated();
        org.joda.time.Days days16 = days14.negated();
        org.joda.time.DurationFieldType durationFieldType17 = days14.getFieldType();
        int i18 = days13.get(durationFieldType17);
        int i19 = days12.get(durationFieldType17);
        org.joda.time.DurationFieldType durationFieldType21 = days12.getFieldType(0);
        boolean b22 = days1.isSupported(durationFieldType21);
        org.joda.time.PeriodType periodType23 = days1.getPeriodType();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue(i4 == 6);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(i19 == 58);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(periodType23);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days7 = days1.multipliedBy((int) (byte) 100);
        int i8 = days1.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(i8 == 6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (short) 100);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        org.joda.time.Days days9 = days2.multipliedBy(10);
        org.joda.time.Days days10 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(mutablePeriod4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.joda.time.Days days0 = org.joda.time.Days.ONE;
        org.joda.time.Days days2 = days0.multipliedBy(0);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Days days4 = org.joda.time.Days.ZERO;
        org.joda.time.Days days5 = org.joda.time.Days.FOUR;
        org.joda.time.Days days6 = days5.negated();
        org.joda.time.Days days7 = days5.negated();
        org.joda.time.DurationFieldType durationFieldType8 = days5.getFieldType();
        int i9 = days4.get(durationFieldType8);
        boolean b10 = days3.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = days3.getFieldType();
        org.joda.time.Days days13 = days3.minus((int) '#');
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(days13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days2.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.SIX;
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        boolean b8 = days6.isGreaterThan(days7);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days6);
        org.joda.time.Days days10 = org.joda.time.Days.SIX;
        org.joda.time.Days days11 = org.joda.time.Days.SIX;
        org.joda.time.Days days12 = days10.plus(days11);
        org.joda.time.MutablePeriod mutablePeriod13 = days11.toMutablePeriod();
        int i14 = days11.getDays();
        org.joda.time.Days days16 = days11.plus((int) (byte) 0);
        boolean b17 = days9.isGreaterThan(days11);
        boolean b18 = days1.isGreaterThan(days9);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertNotNull(days11);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertTrue(i14 == 6);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        int i4 = days1.getDays();
        org.joda.time.Days days6 = days1.plus((int) (byte) 0);
        org.joda.time.Days days8 = days6.multipliedBy((int) 'a');
        boolean b10 = days6.equals((java.lang.Object) true);
        org.joda.time.MutablePeriod mutablePeriod11 = days6.toMutablePeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertTrue(i4 == 6);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(mutablePeriod11);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.Days days5 = days3.plus(days4);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        int i7 = days4.get(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType8 = days4.getFieldType();
        int i9 = days2.get(durationFieldType8);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue(i9 == 12);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Period period5 = days0.toPeriod();
        org.joda.time.Days days6 = org.joda.time.Days.ONE;
        org.joda.time.Days days8 = days6.multipliedBy(0);
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days8);
        boolean b10 = days0.equals((java.lang.Object) days8);
        try {
            int i12 = days8.getValue(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        org.joda.time.Days days4 = org.joda.time.Days.FIVE;
        int i5 = days4.size();
        org.joda.time.PeriodType periodType6 = days4.getPeriodType();
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days4);
        org.joda.time.Days days8 = days7.negated();
        org.joda.time.Days days10 = days8.multipliedBy((int) ' ');
        boolean b11 = days1.isGreaterThan(days8);
        org.joda.time.Days days12 = org.joda.time.Days.FIVE;
        int i13 = days12.size();
        org.joda.time.PeriodType periodType14 = days12.getPeriodType();
        boolean b15 = days1.isLessThan(days12);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(mutablePeriod3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) 0);
        org.junit.Assert.assertNotNull(days1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.multipliedBy((int) '4');
        int i6 = days5.size();
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Days days9 = days7.plus(days8);
        org.joda.time.MutablePeriod mutablePeriod10 = days8.toMutablePeriod();
        int i11 = days8.getDays();
        org.joda.time.Days days13 = days8.plus((int) (byte) 0);
        org.joda.time.Days days15 = days13.multipliedBy((int) 'a');
        org.joda.time.PeriodType periodType16 = days13.getPeriodType();
        org.joda.time.Days days17 = null;
        boolean b18 = days13.isLessThan(days17);
        org.joda.time.Days days19 = days5.plus(days13);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(mutablePeriod10);
        org.junit.Assert.assertTrue(i11 == 6);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(days19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        int i11 = days10.size();
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        boolean b14 = days12.isGreaterThan(days13);
        org.joda.time.Days days16 = days12.plus(100);
        org.joda.time.Days days17 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days18 = days12.minus(days17);
        int i19 = days10.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days17);
        org.joda.time.Days days20 = org.joda.time.Days.SIX;
        org.joda.time.Days days21 = org.joda.time.Days.SIX;
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.Days days23 = days21.plus(days22);
        boolean b24 = days20.equals((java.lang.Object) days21);
        org.joda.time.Duration duration25 = days21.toStandardDuration();
        org.joda.time.Days days27 = days21.plus((int) '4');
        org.joda.time.Days days28 = org.joda.time.Days.ZERO;
        org.joda.time.Days days29 = org.joda.time.Days.FOUR;
        org.joda.time.Days days30 = days29.negated();
        org.joda.time.Days days31 = days29.negated();
        org.joda.time.DurationFieldType durationFieldType32 = days29.getFieldType();
        int i33 = days28.get(durationFieldType32);
        int i34 = days27.get(durationFieldType32);
        boolean b35 = days17.isSupported(durationFieldType32);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertNotNull(days21);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(days27);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days29);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(i34 == 58);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days0.dividedBy(58);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        java.lang.String str1 = days0.toString();
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        boolean b4 = days2.isGreaterThan(days3);
        org.joda.time.Duration duration5 = days3.toStandardDuration();
        boolean b6 = days0.equals((java.lang.Object) duration5);
        int i7 = days0.getDays();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "P2147483647D" + "'", str1.equals("P2147483647D"));
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 2147483647);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        int i2 = days0.size();
        java.lang.String str3 = days0.toString();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertTrue(i2 == 1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P4D" + "'", str3.equals("P4D"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days6 = org.joda.time.Days.FOUR;
        org.joda.time.Days days7 = days6.negated();
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        org.joda.time.Days days9 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days7);
        org.joda.time.Days days10 = days1.minus(days9);
        int i11 = days10.size();
        org.joda.time.Days days12 = org.joda.time.Days.SIX;
        org.joda.time.Days days13 = org.joda.time.Days.SIX;
        org.joda.time.Days days14 = days12.plus(days13);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        int i16 = days13.get(durationFieldType15);
        org.joda.time.Days days18 = days13.dividedBy((int) (short) 10);
        org.joda.time.Days days19 = days10.plus(days13);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(days1);
        org.junit.Assert.assertNotNull(days2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(days9);
        org.junit.Assert.assertNotNull(days10);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days13);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertNotNull(days19);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Period period5 = days0.toPeriod();
        org.joda.time.DurationFieldType durationFieldType6 = days0.getFieldType();
        org.joda.time.Days days8 = days0.plus(6);
        org.joda.time.Period period9 = days8.toPeriod();
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(duration2);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = org.joda.time.Days.ONE;
        org.joda.time.Days days6 = days4.multipliedBy(0);
        org.joda.time.Days days7 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days6);
        org.joda.time.Days days8 = org.joda.time.Days.SIX;
        org.joda.time.Period period9 = days8.toPeriod();
        org.joda.time.Duration duration10 = days8.toStandardDuration();
        org.joda.time.Days days12 = days8.multipliedBy((int) (short) 0);
        org.joda.time.Days days14 = days8.multipliedBy(10);
        org.joda.time.Days days15 = org.joda.time.Days.SIX;
        org.joda.time.Days days16 = org.joda.time.Days.SIX;
        org.joda.time.Days days17 = org.joda.time.Days.SIX;
        org.joda.time.Days days18 = days16.plus(days17);
        boolean b19 = days15.equals((java.lang.Object) days16);
        org.joda.time.Days days20 = days14.minus(days16);
        boolean b21 = days6.isLessThan(days14);
        org.joda.time.Days days22 = org.joda.time.Days.SIX;
        org.joda.time.Days days23 = org.joda.time.Days.SIX;
        org.joda.time.Days days24 = days22.plus(days23);
        org.joda.time.Days days26 = days22.plus((int) (byte) -1);
        org.joda.time.Days days28 = days22.multipliedBy((int) (byte) 1);
        org.joda.time.Days days30 = days28.minus((int) (short) 1);
        org.joda.time.Days days31 = days14.plus(days28);
        org.joda.time.Days days32 = days3.minus(days14);
        org.junit.Assert.assertNotNull(days0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(days3);
        org.junit.Assert.assertNotNull(days4);
        org.junit.Assert.assertNotNull(days6);
        org.junit.Assert.assertNotNull(days7);
        org.junit.Assert.assertNotNull(days8);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(days12);
        org.junit.Assert.assertNotNull(days14);
        org.junit.Assert.assertNotNull(days15);
        org.junit.Assert.assertNotNull(days16);
        org.junit.Assert.assertNotNull(days17);
        org.junit.Assert.assertNotNull(days18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(days20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(days22);
        org.junit.Assert.assertNotNull(days23);
        org.junit.Assert.assertNotNull(days24);
        org.junit.Assert.assertNotNull(days26);
        org.junit.Assert.assertNotNull(days28);
        org.junit.Assert.assertNotNull(days30);
        org.junit.Assert.assertNotNull(days31);
        org.junit.Assert.assertNotNull(days32);
    }
}

