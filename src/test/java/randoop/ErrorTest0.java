package randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Seconds seconds3 = days1.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds3, days0, and days0", !(seconds3.compareTo(days0) == 0) || (Math.signum(seconds3.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.Seconds seconds3 = days2.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds3, days0, and days0", !(seconds3.compareTo(days0) == 0) || (Math.signum(seconds3.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Weeks weeks3 = days0.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks3, days2, and days2", !(weeks3.compareTo(days2) == 0) || (Math.signum(weeks3.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int i4 = days1.get(durationFieldType3);
        org.joda.time.Seconds seconds5 = days1.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds5, days2, and days2", !(seconds5.compareTo(days2) == 0) || (Math.signum(seconds5.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Hours hours6 = days1.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours6, days5, and days3", !(hours6.compareTo(days5) == 0) || (Math.signum(hours6.compareTo(days3)) == Math.signum(days5.compareTo(days3))));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Hours hours3 = days1.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours3, days2, and days2", !(hours3.compareTo(days2) == 0) || (Math.signum(hours3.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.SIX;
        org.joda.time.PeriodType periodType5 = days4.getPeriodType();
        org.joda.time.Seconds seconds6 = days4.toStandardSeconds();
        boolean b7 = days1.equals((java.lang.Object) days4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on days2 and seconds6", Math.signum(days2.compareTo(seconds6)) == -Math.signum(seconds6.compareTo(days2)));
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
        org.joda.time.DurationFieldType durationFieldType4 = days0.getFieldType(0);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days0, seconds2, and seconds2", !(days0.compareTo(seconds2) == 0) || (Math.signum(days0.compareTo(seconds2)) == Math.signum(seconds2.compareTo(seconds2))));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        org.joda.time.Hours hours8 = days7.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours8, days3, and days3", !(hours8.compareTo(days3) == 0) || (Math.signum(hours8.compareTo(days3)) == Math.signum(days3.compareTo(days3))));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Days days4 = days0.plus((int) (byte) -1);
        org.joda.time.Hours hours5 = days4.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours5, days2, and days2", !(hours5.compareTo(days2) == 0) || (Math.signum(hours5.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days5 = days1.dividedBy(1);
        org.joda.time.Weeks weeks6 = days1.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks6, days0, and days1", !(weeks6.compareTo(days0) == 0) || (Math.signum(weeks6.compareTo(days1)) == Math.signum(days0.compareTo(days1))));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.joda.time.Days days0 = org.joda.time.Days.TWO;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Period period2 = days1.toPeriod();
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days1.negated();
        boolean b7 = days0.equals((java.lang.Object) days6);
        org.joda.time.Hours hours8 = days0.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours8, days5, and days5", !(hours8.compareTo(days5) == 0) || (Math.signum(hours8.compareTo(days5)) == Math.signum(days5.compareTo(days5))));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days1.toStandardDuration();
        org.joda.time.Days days5 = days1.multipliedBy((int) (short) 0);
        org.joda.time.Minutes minutes6 = days1.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes6, days5, and days5", !(minutes6.compareTo(days5) == 0) || (Math.signum(minutes6.compareTo(days5)) == Math.signum(days5.compareTo(days5))));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.joda.time.Days days0 = org.joda.time.Days.ZERO;
        org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
        int i2 = minutes1.size();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes1, days0, and days0", !(minutes1.compareTo(days0) == 0) || (Math.signum(minutes1.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days1);
        org.joda.time.Days days4 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Weeks weeks5 = days4.toStandardWeeks();
        boolean b6 = days3.isLessThan(days4);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on weeks5 and days3", Math.signum(weeks5.compareTo(days3)) == -Math.signum(days3.compareTo(weeks5)));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.joda.time.Days days0 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Weeks weeks1 = days0.toStandardWeeks();
        org.joda.time.Period period2 = days0.toPeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days0, weeks1, and weeks1", !(days0.compareTo(weeks1) == 0) || (Math.signum(days0.compareTo(weeks1)) == Math.signum(weeks1.compareTo(weeks1))));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.PeriodType periodType1 = days0.getPeriodType();
        org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
        org.joda.time.Days days3 = org.joda.time.Days.SIX;
        org.joda.time.Period period4 = days3.toPeriod();
        org.joda.time.Duration duration5 = days3.toStandardDuration();
        org.joda.time.Days days7 = days3.multipliedBy((int) (short) 0);
        org.joda.time.Days days8 = days3.negated();
        org.joda.time.Days days9 = days0.plus(days3);
        org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on days7 and seconds2", Math.signum(days7.compareTo(seconds2)) == -Math.signum(seconds2.compareTo(days7)));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Weeks weeks5 = days4.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks5, days1, and days0", !(weeks5.compareTo(days1) == 0) || (Math.signum(weeks5.compareTo(days0)) == Math.signum(days1.compareTo(days0))));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.PeriodType periodType2 = days1.getPeriodType();
        org.joda.time.Hours hours3 = days1.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours3, days0, and days0", !(hours3.compareTo(days0) == 0) || (Math.signum(hours3.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
        org.joda.time.Seconds seconds3 = days0.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days0, seconds2, and seconds2", !(days0.compareTo(seconds2) == 0) || (Math.signum(days0.compareTo(seconds2)) == Math.signum(seconds2.compareTo(seconds2))));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Days days2 = org.joda.time.Days.FOUR;
        org.joda.time.Days days3 = days2.negated();
        org.joda.time.Days days4 = days2.negated();
        org.joda.time.DurationFieldType durationFieldType5 = days2.getFieldType();
        boolean b6 = days0.isGreaterThan(days2);
        org.joda.time.Hours hours7 = days0.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours7, days3, and days3", !(hours7.compareTo(days3) == 0) || (Math.signum(hours7.compareTo(days3)) == Math.signum(days3.compareTo(days3))));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        boolean b4 = days0.equals((java.lang.Object) days1);
        org.joda.time.Duration duration5 = days1.toStandardDuration();
        org.joda.time.Days days7 = days1.plus((int) '4');
        org.joda.time.Minutes minutes8 = days7.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes8, days1, and days1", !(minutes8.compareTo(days1) == 0) || (Math.signum(minutes8.compareTo(days1)) == Math.signum(days1.compareTo(days1))));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        int i4 = days1.get(durationFieldType3);
        org.joda.time.Days days6 = days1.dividedBy((int) (short) 10);
        org.joda.time.Weeks weeks7 = days6.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks7, days2, and days2", !(weeks7.compareTo(days2) == 0) || (Math.signum(weeks7.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days4 = days0.minus((int) 'a');
        org.joda.time.Weeks weeks5 = days4.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks5, days0, and days0", !(weeks5.compareTo(days0) == 0) || (Math.signum(weeks5.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Days days6 = days4.multipliedBy((int) ' ');
        org.joda.time.Weeks weeks7 = days6.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks7, days4, and days4", !(weeks7.compareTo(days4) == 0) || (Math.signum(weeks7.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.Duration duration3 = days2.toStandardDuration();
        org.joda.time.Days days4 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days2);
        org.joda.time.Seconds seconds5 = days2.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds5, days4, and days4", !(seconds5.compareTo(days4) == 0) || (Math.signum(seconds5.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Hours hours5 = days3.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours5, days4, and days4", !(hours5.compareTo(days4) == 0) || (Math.signum(hours5.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        org.joda.time.Hours hours14 = days10.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours14, days7, and days7", !(hours14.compareTo(days7) == 0) || (Math.signum(hours14.compareTo(days7)) == Math.signum(days7.compareTo(days7))));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        org.joda.time.Seconds seconds15 = days7.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds15, days8, and days8", !(seconds15.compareTo(days8) == 0) || (Math.signum(seconds15.compareTo(days8)) == Math.signum(days8.compareTo(days8))));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days4 = days0.minus((int) 'a');
        org.joda.time.Seconds seconds5 = days0.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds5, days4, and days4", !(seconds5.compareTo(days4) == 0) || (Math.signum(seconds5.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.MIN_VALUE;
        int i2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Hours hours3 = days0.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours3, days1, and days1", !(hours3.compareTo(days1) == 0) || (Math.signum(hours3.compareTo(days1)) == Math.signum(days1.compareTo(days1))));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days6 = days0.multipliedBy(10);
        org.joda.time.MutablePeriod mutablePeriod7 = days0.toMutablePeriod();
        org.joda.time.Hours hours8 = days0.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours8, days4, and days4", !(hours8.compareTo(days4) == 0) || (Math.signum(hours8.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        org.joda.time.Seconds seconds13 = days12.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds13, days6, and days6", !(seconds13.compareTo(days6) == 0) || (Math.signum(seconds13.compareTo(days6)) == Math.signum(days6.compareTo(days6))));
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days0.plus(100);
        org.joda.time.Days days5 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days6 = days0.minus(days5);
        org.joda.time.Hours hours7 = days5.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours7, days4, and days4", !(hours7.compareTo(days4) == 0) || (Math.signum(hours7.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.PeriodType periodType3 = days0.getPeriodType();
        org.joda.time.Minutes minutes4 = days0.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes4, days2, and days2", !(minutes4.compareTo(days2) == 0) || (Math.signum(minutes4.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Days days6 = days4.multipliedBy((int) ' ');
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.PeriodType periodType8 = days7.getPeriodType();
        boolean b9 = days4.equals((java.lang.Object) days7);
        org.joda.time.Hours hours10 = days7.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours10, days6, and days6", !(hours10.compareTo(days6) == 0) || (Math.signum(hours10.compareTo(days6)) == Math.signum(days6.compareTo(days6))));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Duration duration2 = days0.toStandardDuration();
        org.joda.time.Days days4 = days0.multipliedBy((int) (short) 0);
        org.joda.time.Days days5 = days0.negated();
        org.joda.time.Seconds seconds6 = days5.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds6, days4, and days4", !(seconds6.compareTo(days4) == 0) || (Math.signum(seconds6.compareTo(days4)) == Math.signum(days4.compareTo(days4))));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days6 = days4.multipliedBy((int) '#');
        org.joda.time.Days days7 = org.joda.time.Days.SIX;
        org.joda.time.Period period8 = days7.toPeriod();
        org.joda.time.Duration duration9 = days7.toStandardDuration();
        org.joda.time.Days days11 = days7.multipliedBy((int) (short) 0);
        org.joda.time.Days days13 = days7.multipliedBy(10);
        org.joda.time.MutablePeriod mutablePeriod14 = days7.toMutablePeriod();
        int i15 = days4.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days7);
        org.joda.time.Weeks weeks16 = days7.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks16, days11, and days11", !(weeks16.compareTo(days11) == 0) || (Math.signum(weeks16.compareTo(days11)) == Math.signum(days11.compareTo(days11))));
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        org.joda.time.Days days1 = org.joda.time.Days.days((int) (byte) 1);
        org.joda.time.Seconds seconds2 = days1.toStandardSeconds();
        int i3 = days1.getDays();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days1, seconds2, and seconds2", !(days1.compareTo(seconds2) == 0) || (Math.signum(days1.compareTo(seconds2)) == Math.signum(seconds2.compareTo(seconds2))));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        org.joda.time.DurationFieldType durationFieldType8 = days2.getFieldType();
        org.joda.time.Hours hours9 = days2.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours9, days3, and days3", !(hours9.compareTo(days3) == 0) || (Math.signum(hours9.compareTo(days3)) == Math.signum(days3.compareTo(days3))));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.MIN_VALUE;
        int i2 = days0.compareTo((org.joda.time.base.BaseSingleFieldPeriod) days1);
        org.joda.time.Days days4 = days0.plus(12);
        org.joda.time.Days days6 = days4.minus((-1));
        org.joda.time.Hours hours7 = days4.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours7, days6, and days6", !(hours7.compareTo(days6) == 0) || (Math.signum(hours7.compareTo(days6)) == Math.signum(days6.compareTo(days6))));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        int i4 = days1.getDays();
        org.joda.time.Days days6 = days1.plus((int) (byte) 0);
        org.joda.time.Days days7 = org.joda.time.Days.MAX_VALUE;
        org.joda.time.Weeks weeks8 = days7.toStandardWeeks();
        boolean b9 = days6.equals((java.lang.Object) weeks8);
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks8, days2, and days2", !(weeks8.compareTo(days2) == 0) || (Math.signum(weeks8.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        int i4 = days1.getDays();
        org.joda.time.Days days6 = days1.plus((int) (byte) 0);
        org.joda.time.Days days8 = days6.multipliedBy((int) 'a');
        boolean b10 = days6.equals((java.lang.Object) true);
        org.joda.time.Hours hours11 = days6.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours11, days2, and days2", !(hours11.compareTo(days2) == 0) || (Math.signum(hours11.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod3 = seconds2.toMutablePeriod();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds2, days0, and days0", !(seconds2.compareTo(days0) == 0) || (Math.signum(seconds2.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Days days2 = days0.negated();
        org.joda.time.DurationFieldType durationFieldType3 = days0.getFieldType();
        org.joda.time.Minutes minutes4 = days0.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes4, days1, and days1", !(minutes4.compareTo(days1) == 0) || (Math.signum(minutes4.compareTo(days1)) == Math.signum(days1.compareTo(days1))));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Minutes minutes4 = days3.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes4, days1, and days0", !(minutes4.compareTo(days1) == 0) || (Math.signum(minutes4.compareTo(days0)) == Math.signum(days1.compareTo(days0))));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        org.joda.time.Days days0 = org.joda.time.Days.FOUR;
        org.joda.time.Days days1 = days0.negated();
        org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes2, days0, and days0", !(minutes2.compareTo(days0) == 0) || (Math.signum(minutes2.compareTo(days0)) == Math.signum(days0.compareTo(days0))));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        boolean b2 = days0.isGreaterThan(days1);
        org.joda.time.Days days4 = days1.plus((int) (short) -1);
        org.joda.time.Days days6 = days1.multipliedBy((int) ' ');
        org.joda.time.Duration duration7 = days1.toStandardDuration();
        org.joda.time.Weeks weeks8 = days1.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks8, days6, and days6", !(weeks8.compareTo(days6) == 0) || (Math.signum(weeks8.compareTo(days6)) == Math.signum(days6.compareTo(days6))));
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test49");
        org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = org.joda.time.Days.SIX;
        org.joda.time.Days days3 = days1.plus(days2);
        org.joda.time.MutablePeriod mutablePeriod4 = days2.toMutablePeriod();
        org.joda.time.Days days5 = null;
        boolean b6 = days2.isGreaterThan(days5);
        org.joda.time.Days days7 = days0.minus(days2);
        org.joda.time.Days days9 = days0.dividedBy(100);
        org.joda.time.Weeks weeks10 = days0.toStandardWeeks();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks10, days9, and days9", !(weeks10.compareTo(days9) == 0) || (Math.signum(weeks10.compareTo(days9)) == Math.signum(days9.compareTo(days9))));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test50");
        org.joda.time.Days days0 = org.joda.time.Days.FIVE;
        int i1 = days0.size();
        org.joda.time.PeriodType periodType2 = days0.getPeriodType();
        org.joda.time.Days days3 = org.joda.time.Days.standardDaysIn((org.joda.time.ReadablePeriod) days0);
        org.joda.time.Days days4 = days3.negated();
        org.joda.time.Days days6 = days4.multipliedBy((int) ' ');
        org.joda.time.Hours hours7 = days4.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours7, days6, and days6", !(hours7.compareTo(days6) == 0) || (Math.signum(hours7.compareTo(days6)) == Math.signum(days6.compareTo(days6))));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test51");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Days days1 = org.joda.time.Days.SIX;
        org.joda.time.Days days2 = days0.plus(days1);
        org.joda.time.MutablePeriod mutablePeriod3 = days1.toMutablePeriod();
        int i4 = days1.getDays();
        org.joda.time.Days days6 = days1.plus((int) (byte) 0);
        org.joda.time.Days days8 = days6.multipliedBy((int) 'a');
        org.joda.time.Seconds seconds9 = days6.toStandardSeconds();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds9, days2, and days2", !(seconds9.compareTo(days2) == 0) || (Math.signum(seconds9.compareTo(days2)) == Math.signum(days2.compareTo(days2))));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test52");
        org.joda.time.Days days0 = org.joda.time.Days.SIX;
        org.joda.time.Period period1 = days0.toPeriod();
        org.joda.time.Seconds seconds2 = days0.toStandardSeconds();
        org.joda.time.Hours hours3 = days0.toStandardHours();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours3, seconds2, and seconds2", !(hours3.compareTo(seconds2) == 0) || (Math.signum(hours3.compareTo(seconds2)) == Math.signum(seconds2.compareTo(seconds2))));
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test53");
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
        org.joda.time.Minutes minutes12 = days10.toStandardMinutes();
        org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes12, days3, and days3", !(minutes12.compareTo(days3) == 0) || (Math.signum(minutes12.compareTo(days3)) == Math.signum(days3.compareTo(days3))));
    }
}

