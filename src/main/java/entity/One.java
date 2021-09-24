package entity;

public class One {
    private String name;
    private String age;
    private String number;
    private String pinyin;
    private String gender;
    private String certificate17;
    private String certificate18;
    private String certificate19;
    private String certificate20;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCertificate17() {
        return certificate17;
    }

    public void setCertificate17(String certificate17) {
        this.certificate17 = certificate17;
    }

    public String getCertificate18() {
        return certificate18;
    }

    public void setCertificate18(String certificate18) {
        this.certificate18 = certificate18;
    }

    public String getCertificate19() {
        return certificate19;
    }

    public void setCertificate19(String certificate19) {
        this.certificate19 = certificate19;
    }

    public String getCertificate20() {
        return certificate20;
    }

    public void setCertificate20(String certificate20) {
        this.certificate20 = certificate20;
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", number='" + number + '\'' +
                ", pinyin='" + pinyin + '\'' +
                ", gender='" + gender + '\'' +
                ", certificate17='" + certificate17 + '\'' +
                ", certificate18='" + certificate18 + '\'' +
                ", certificate19='" + certificate19 + '\'' +
                ", certificate20='" + certificate20 + '\'' +
                '}';
    }
}
