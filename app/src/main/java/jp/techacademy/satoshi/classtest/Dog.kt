package jp.techacademy.satoshi.classtest

import android.util.Log

open class Dog {
    //プロパティ
    var name: String
    var age: Int

    //コンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    //メソッド
    open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }

    //コンパニオンオブジェクト
    companion object {
        val to_jp = "犬"

        fun introduce(){
            Log.d("kotlintest","これは犬クラスです。")
        }
    }

}