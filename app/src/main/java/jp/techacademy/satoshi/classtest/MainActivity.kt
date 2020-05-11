package jp.techacademy.satoshi.classtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  //追加した行

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //インスタンステスト
        Log.d("kotlintest","↓↓↓↓↓インスタンステスト↓↓↓↓↓↓↓")
        //名前をポチ、年齢3歳で、dogインスタンスを作る
        val dogp = Dog("ポチ",3)
        dogp.say() //ポチが吠えます(ログ出力)
        Log.d("kotlintest","犬の名前は" + dogp.name + "です。")
        Log.d("kotlintest","犬の年齢は" + dogp.age + "です。")

        //名前をハチ、年齢10歳で、dog2インスタンスを作る
        val dogh = Dog("ハチ",10)
        dogh.say() //ハチが吠えます(ログ出力)
        Log.d("kotlintest","犬の名前は" + dogh.name + "です。")
        Log.d("kotlintest","犬の年齢は" + dogh.age + "です。")

        //犬クラスのコンパニオンオブジェクト確認　※javaでいうところのstaticメンバ
        Dog.introduce()
        Log.d("kotlintest",Dog.to_jp + "のクラス変数です。")

        //クラス継承テスト
        Log.d("kotlintest","↓↓↓↓↓↓↓クラス継承テスト↓↓↓↓↓↓↓")

        val dog = Dog("ポチ",3)
        dog.say()
        Log.d("kotlintest","犬の名前は" + dog.name + "です。")
        Log.d("kotlintest","犬の年齢は" + dog.age + "です。")

        val bigdog = BigDog("ヨーゼフ", 15)
        bigdog.say()
        Log.d("kotlintest","犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")
    }
}
