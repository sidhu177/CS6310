// Taken from concise and practical introduction to algorithms using Java by Frank Nielsen

static Person[] array = new Person[5];

static String LinearSearch(String lastname, String firstname)
{
for (int i=0;i<array.length;i++)
{
if ((lastname.equals(array[i].lastname)&&(firstname.equals(array[i].firstname))))
{
return array[i].phone;
}
return "Not found in dictionary";
}