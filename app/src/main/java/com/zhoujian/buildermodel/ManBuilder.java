package com.zhoujian.buildermodel;

/**
 * Created by zhoujian on 2016/12/8.
 */

public class ManBuilder implements PersonBuider
{


    private Person mPerson;

    public ManBuilder()
    {
        mPerson = new Man();

    }

    @Override
    public void buliderHead() {

        mPerson.setBody("建造男人的头");

    }

    @Override
    public void builderBody()
    {
        mPerson.setBody("建造男人的身体");

    }

    @Override
    public void bulderFoot()
    {

        mPerson.setFoot("建造男人的脚");
    }

    @Override
    public Person builderPeson() {
        return mPerson;
    }
}
