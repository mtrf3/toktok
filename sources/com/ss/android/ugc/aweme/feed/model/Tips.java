package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class Tips implements Serializable {

    @InterfaceC65349Pkn("key_id")
    public Integer key_id = 0;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("type")
    public String type;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tips(type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public final Integer getKey_id() {
        return this.key_id;
    }

    public final String getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public final void setKey_id(Integer num) {
        this.key_id = num;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setType(String str) {
        this.type = str;
    }
}
