package com.zhoujian.buildermodel;

/**
 * Created by zhoujian on 2016/12/8.
 */

public class PersonDirector
{

    private Person mPerson;

    public Person contructPerson(PersonBuider mPersonBuilder)
    {

        mPersonBuilder.buliderHead();

        mPersonBuilder.builderBody();

        mPersonBuilder.bulderFoot();

        mPerson = mPersonBuilder.builderPeson();

        return mPerson;
    }
}
