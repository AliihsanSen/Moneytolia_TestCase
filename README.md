# <div align="center"><p>💻 Moneytolia Çalışma Senaryosu 💻 </p> </div>
### Projede Kullandığım Toollar <br> 
[<a href="https://www.jetbrains.com/idea/features/" target="_blank" rel=”noopener”> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQalKFwVDd0H7Xx8HaqWBbUmDRdrgxUoicGBZC0eIzTsww7Sev-ySXJ3in9Udv2R9CR3lo&usqp=CAU" alt="IntelliJ" width="50" height="50"/> </a>][intellij]
[<img height="50" width="50" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/java/java.png">][java]
[<img height="50" width="50" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/selenium/selenium.png">][selenium]
<img src="https://github.com/devicons/devicon/blob/master/icons/cucumber/cucumber-plain.svg" title="Cucumber" alt="Cucumber" width="50" height="50"/>
[<img height="50" width="50" src="https://raw.githubusercontent.com/github/explore/5b3600551e122a3277c2c5368af2ad5725ffa9a1/topics/github/github.png">][github]

[intellij]: https://www.jetbrains.com/idea/download/#section=windows
[java]: https://www.java.com/
[selenium]: https://www.selenium.dev/
[cucumber]: https://cucumber.io/
[github]: https://github.com/AliihsanSen

<hr>

## Proje Hakkında
### 1️⃣ Otomasyon Test Projesi
### Framework

⚡Otomasyon kodlarımı yazarken Java programlama dilini ve Selenium kütüphanesini kullandım. <br>
⚡Java programlama dili ile birlikte OOP (Object - Oriented Programming) konseptini kullandım. <br>
⚡Cucumber frameworkunu POM (Page Object Model) modeli üzerine oluşturdum. <br>
⚡'test' sonrasında 'java' package'ının altında 'hooks', 'pages', 'runners', 'stepDefinitions', 'utilities'  package'leri oluşturdum. <br> <br>
![image](https://github.com/AliihsanSen/Moneytolia_TestCase/assets/111094912/2e1c7b7a-7686-4dd7-b8bb-cf093bc040ef)

### Kodlama
⚡Kodlarımı yazarken solid prensiplerine uygun olarak clean kod yazmaya dikkat ettim. <br>
⚡Verilen task kapsamında ilgili sitenin locate'lerini alarak 'AllProductsPage', 'CheckoutPage' ve 'loginPage' class'larına koydum ve daha sonra bu class'tan oluşturduğum obje ile bu locate'leri kullandım. <br>
⚡'features' package'ının altında oluşturduğum .feature uzantılı dosyada test steplerini Gherkin Language ile yazdım. <br>
⚡.feature uzantılı dosyada yazdığım steplerin kodlarını 'AmazonStepDefinitions' class'ında yazdım. <br>
⚡Gherkin Language ile oluşturduğum steplerde bazı değerleri parametreli oluşturarak daha dinamik bir kod yazımını hedefledim. <br> <br>
![image](https://github.com/AliihsanSen/Moneytolia_TestCase/assets/111094912/37640a43-b822-4b3f-b881-7532b615c121)
⚡'configuration.properties' file'ını oluşturarak tekrar tekrar kullanılacak olan verileri buraya kaydettim ve bu verileri utilities package'ı altındaki ConfigReader class'ı aracılığı ile dinamik bir şekilde kullandım. <br> <br>

### Projenin Ayağa Kaldırılması
⚡Projem hem .feature uzantılı file'dan hem de Runners class'ından ayağa kaldırılabilmektedir. <br>
⚡Projenin ayağa kalkmasından sonra test adımları çalışarak sırasıyla .feature dosyasındaki adımlar gerçekleşmektedir. <br>
⚡Aşağıdaki linkte testin koşum videosu bulunmaktadır. <br>
[test_case12.zip](https://github.com/AliihsanSen/Moneytolia_TestCase/files/15261641/test_case12.zip)

### Raporlama
⚡'runners' package'ı altındaki Runner class'ındaki plugin sayesinde kod her çalıştığında 'target' klasörünün altında .html uzantılı bir dosya oluşturularak raporlarım bu dosyaya kaydedildi. <br>
⚡Raporlamayı alabilmek için projenin .feature uzantılı file'dan değil Runner class'ından ayağa kaldırılması gerekmektedir. <br>
⚡Bu .html uzantılı dosyayı tarayıcıda açtığımda bana raporları sağlıklı bir şekilde verdi. <br> <br>
![image](https://github.com/AliihsanSen/Moneytolia_TestCase/assets/111094912/3efa21ec-dc4d-43c6-80df-c2fca22d6958)
![image](https://github.com/AliihsanSen/Moneytolia_TestCase/assets/111094912/d1cfa165-86c0-49a9-a955-6bcaf8f54d14)
![image](https://github.com/AliihsanSen/Moneytolia_TestCase/assets/111094912/19ad88e8-89db-4d9f-8dfd-00b0f1c0bfc1)



### 2️⃣ Manuel Test Case Yazımı





