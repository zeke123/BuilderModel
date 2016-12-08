package com.zhoujian.buildermodel;

/**
 * Created by zhoujian on 2016/12/8.
 */

public class WomanBuilder implements PersonBuider
{
    private Person mPerson;


    public WomanBuilder()
    {
        mPerson = new Woman();
    }

    @Override
    public void buliderHead() {

        mPerson.setHead("建造女人的头");

    }

    @Override
    public void builderBody()
    {
        mPerson.setBody("建造女人的身体");
    }

    @Override
    public void bulderFoot() {

        mPerson.setFoot("建造女人的脚");
    }

    @Override
    public Person builderPeson() {
        return mPerson;
    }
}
