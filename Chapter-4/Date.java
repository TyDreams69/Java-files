
    public class Date
    {
        private int month;
        private int day; 
        private int year;

    
        public Date(int month, int day, int year)
        {
            if ( month > 0 && month < 13)
               this.month = month;
            else
                this.month = 12;

            if ( year > 1922 && year < 2123)
               this.year = year;
            else
                this.year = 2000;

            if ((month == 2) && (day > 0 && day < 29) || (year % 4 == 0) && (month == 2) && (day > 0 && day < 30))
               this.day = day;
            else
               this.day = 1;
       
            if ((month == 6 || month == 4 || month == 9 || month == 11) && (day > 0 && day < 31)) 
               this.day = day;

            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 0 && day < 32))
               this.day = day;
            
            if ((year % 4 == 0) && (month == 2) && (day > 0 && day < 30))
               this.day = day;
         }         
            
            public void setDay(int day)
            {
               if (((month == 2) && (day > 0 && day < 29)) || ((year % 4 == 0) && (month == 2) && (day > 0 && day < 30)))
                  this.day = day;

               else if ((month == 6 || month == 4 || month == 9 || month == 11) && (day > 0 && day < 31))
                       this.day = day;

               else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 0 && day < 32))
                        this.day = day;
               else
                   this.day = 1;
             }         

            public void setMonth(int month)
            {
              if ( month > 0 && month < 13)
               this.month = month;
              else
                  this.month = 12;
            }

            public void setYear(int year)
            {
                if ( year > 1922 && year < 2124)
                   this.year = year;
                else
                    this.year = 2000;
            }

            public int getMonth()
            {
                return month;
            }
         
            public int getDay()
            {
                return day;
            }
 
            public int getYear()
            {
                return year;
            }  
     
            public void displayDate()
            {
               System.out.printf("%d/%d/%d", month, day, year);
            }
    }