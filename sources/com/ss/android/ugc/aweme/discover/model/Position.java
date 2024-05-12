package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public class Position implements Serializable {

    @InterfaceC65349Pkn("begin")
    public int begin;

    @InterfaceC65349Pkn("end")
    public int end;

    public Position() {
    }

    public int getBegin() {
        return this.begin;
    }

    public int getEnd() {
        return this.end;
    }

    public void setBegin(int i) {
        this.begin = i;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public Position(int i, int i2) {
        setBegin(i);
        setEnd(i2);
    }
}
