using System;

namespace NovaStellar_DunEDU___CWEB1216_01___Lab_2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            String[] size = new string[3];
            var user = new User();

            for (int i = 0; i < size.Length; i++)
            {
                Console.Write(user.Questions()[i]);
                size[i] = Console.ReadLine();
                user.setDetails(size);
                Console.WriteLine();

                String[] display = user.Output();

                if (i == 1)
                {
                    Console.WriteLine(display[0]);
                    Console.WriteLine();
                }

                if (i == 2)
                {
                    Console.WriteLine(display[1]);
                    Console.WriteLine(display[2]);
                }
            }
        }

    }

    class User
    {
        private String[] UserDetails = new String[3];
        public String[] setDetails(String[] UserDetails)
        {
            for (int r = 0; r < UserDetails.Length; r++)
            {
                this.UserDetails[r] = UserDetails[r];
            }
            return UserDetails;
        }

        public String[] Output()
        {
            String[] Output = { " ", " ", " " };

            Output[0] = "Name: " + UserDetails[0] + ", Age: " + UserDetails[1];
            Output[1] = "Name: " + UserDetails[0] + ", Age: " + UserDetails[1] + ", Hobby: " + UserDetails[2];

            int RetAge = 65;

            if (int.TryParse(UserDetails[1], out int Age))
            {
                
            }

            if (RetAge > Age)
            {
                RetAge = 65 - Age;
                Output[2] = UserDetails[0] + " will retire in " + RetAge + " years.";
            }
            else
            {
                RetAge = Age - 65;
                Output[2] = UserDetails[0] + " would have retired " + RetAge + " years ago.";
            }
            return Output;
        }

        public String[] Questions()
        {
            String[] Questions = { "Enter your Name: ", "Enter your Age: ", "Enter your Hobby: " };

            return Questions;
        }
    }
}

