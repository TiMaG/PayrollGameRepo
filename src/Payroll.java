public class Payroll {
    private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
    private int[] hours = new int[7];
    private double[] payrate = new double[7];
    private double[] wages;

    public void countWages()
    {
        wages = new double[7];

        for (int i = 0; i < 7; i++)
        {
            wages[i] = hours[i] * payrate[i];
        }
    }

    public int getEmpId(int i)
    {
        return employeeId[i];
    }

    public int[] getHours()
    {
        return hours;
    }

    public int getHours(int i)
    {
        return hours[i];
    }

    public double[] getPayrate()
    {
        return payrate;
    }

    public double getPayrate(int index)
    {
        return payrate[index];
    }


    public double getWage(int id)
    {
        for (int i = 0; i < 7; i++)
        {
            if (id == employeeId[i])
            {
                return wages[id];
            }
        }

        return -1;
    }

    public double[] getWages()
    {
        return wages;
    }

    public double getWages(int i)
    {
        return wages[i];
    }

    public void setEmployeeId(int i, int employeeId)
    {
        this.employeeId[i] = employeeId;
    }

    public void setHours(int i, int hours)
    {
        this.hours[i] = hours;
    }

    public void setPayRate(int i, double payRate)
    {
        this.payrate[i] = payRate;
    }

    public void setWages(int i, double wages)
    {
        this.wages[i] = wages;
    }
}