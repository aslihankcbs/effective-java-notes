# Çok Sayıda Parametre ile Karşılaştığınızda Builder Kullanın

Sınıf yapıcılar(constructor) ve statik fabrika metotlarının(static factory method) ortak kısıtı: Çok fazla parametre geçme durumları.
Böyle bir durumda kullanışsız hale gelirler.
* Yazılımcılar bu gibi durumlarda genellikle iç içe geçmiş yaoıcı metotlar kullanırlar(telescobing constructor pattern). Yani öncelikle zorunlu parametreleri içeren bir constructor, sonra zorunlu + bir opsiyonel, daha sonra zorunlu + iki opsiyonel...
Bu yöntemin okunabilirliği oldukça zordur. Ve aynı zamanda kullanırkende zorluklar yaşanabilir. Örneğin, sadece bir opsiyonel parametreyi kullanmak için diğerlerine sıfır gibi etkisiz değerler geçmek zorunda kalınabilir.
* İkinci bir alternatif ise JavaBeans yöntemini kullanmaktır. Bu yöntemde parametre almayan bir yapıcı metot çağırılır ve daha sonra değer atamak istediğimiz alanlara atama metotları(setter method) kullanarak değer atarız.