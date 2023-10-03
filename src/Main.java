public class Main {
    public static void main(String[] args) {
        Months month1 = Months.JANUARY;
        System.out.println(Months.JANUARY);

        Months month3 = Months.MARCH;
        System.out.println(Months.MARCH);

        Weekday weekday = Weekday.MONDAY;
        System.out.println(Weekday.MONDAY.isWeekDay());

        Weekday holiday = Weekday.SUNDAY;
        System.out.println(Weekday.SUNDAY.isHoliday());

        Boolean t = new Boolean( "tRue" );
        boolean t1 =  t;
        Byte b = new Byte("120");
        byte b1 = b;
        Short s = new Short("32000");
        short s1 = s;
        Integer i = new Integer(147895632);
        int i1 = i;
        Long l = new Long("987654321987654321");
        long l1 = l;
        Double d = new Double ("4444.5d");
        double d1 = d;
        Float f = new Float("2354.56f");
        float f1=f;
    }
}