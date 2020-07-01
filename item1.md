# Yapıcı Metot(Constructor) Yerine Statik Fabrika Metotlarını(Static Factory Method) Kullanınız

Normal şartlarda bir sınıf kendisinden nesne oluşturulmasını istiyorsa public bir constructor tanımlar ve diğer sınıflar bunu kullanarak nesne oluşturabilir.Başka bir yöntem ise statik fabrika metotlarını kullanmaktır.Statik fabrika metotlarında;
* Sınıf, dönüş değeri kendi nesnesi olan statik bir fabrika metodu tanımlar ve bu sınıftan nesne oluşturmak isteyenler bu metodu kullanır.Örneğin, JDK içerisinde bulunan Boolean sınıfından valueOf metodu bu şekilde çalışır.Bu metot primitive bir boolean değeri
Boolean türünde bir nesneye dönüştürür.
```java
public static Boolean valueOf(boolean b) {
       return b? Boolean.TRUE : Boolean.FALSE;}
```
**Not:**
Statik fabrika metotları Fabrika(Factory) metot tasarım deseninden farklıdır.Bu metotlarında direkt karşılığı olan bir tasarım deseni bulunmamaktadır.

**Statik fabrika metotlarının avantajları**
* Contructor metotların aksine bir isimleri vardır. Bu sayede kolay anlaşılabilir.
* Her çağırıldıklarında yeni bir nesne yaratmak zorunda değildirler. Bu avantaj sınıf içerisinde daha önceden yaratılmış nesneleri ön bellekten döndürmeye olanak sağlar ve böylece aynı nesneyi tekrar tekrar yaratmak zorunda kalmayız.
Bu teknik Flyweight tasarım desenine benzer. Statik fabrika metotlarından döndürelecek nesneyi kontrol altında tutabilmek, o sınıfa çalışma zamanında(runtime) hangi nesneden kaç tane tutulacağını belirleme imkanı sağlar.(singleton nesneler yaratabiliriz.)
(instance-controlled sınıflar)
* Bir diğer avantajı ise, bu metotlardan alt türlere ait nesneler de döndürebilmektir. Bu durum bize döndürülecek nesne türünü belirlemede esneklik verirken, kapsülleme(encapsulation) imkanı da verir.
```java
Interface
  return Interface imp Class
```
Arayüz tabanlı API tasarımı interface-based)
  
**Statik fabrika metotlarının dezavantajları**
* Bir sınıfa sadece statik fabrika metotu koyup public veya protected bir constructor koymazsak o sınıfı kalıltamayız. Fakat bu durumda kalıtım yerine kompozisyon kullanılabilir.
* Statik fabrika metotları bir bakışta klasik metotlardan ayırt edilemeyebilir. Bunun için ise dokümantasyon ve isimlendirme önemli.

**Statik fabrika metotları için kullanılan yaygın isimler**
* from
```java
Date d = Date.from(instant);
```
* of
```java
Set<Rank> faceCards = EnumSet.of(JACK, QUEEN, KING);
```
* valueOf
```java
BigInteger prime = BigInteger.valueOf(Integer, MAX_VALUES);
```
* instance/getInstance
* create/newInstance
* getType
```java
FileStore fs = Files.getFileStore(path);
```
* getNewType
```java
BufferedReader br = Files.newBufferedReader(path);
```
