def salary(Whrs:Int,Ohrs:Int):Double={
    return(Whrs*250+Ohrs*85)
}

def tax(Whrs:Int,Ohrs:Int):Double={
    return(salary(Whrs,Ohrs)*0.12)
}

def TakeHomeSalary(Whrs:Int,Ohrs:Int):Double={
    return(salary(Whrs,Ohrs)-tax(Whrs,Ohrs))
}

def main(args: Array[String])={
    println("Take home salary of an employee :"+TakeHomeSalary(40,30))
}