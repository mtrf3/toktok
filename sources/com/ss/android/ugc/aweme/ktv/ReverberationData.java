package com.ss.android.ugc.aweme.ktv;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ReverberationData implements Serializable {

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("path")
    public String path;

    @InterfaceC65349Pkn("res_id")
    public String resId;

    @InterfaceC65349Pkn("index")
    public int index = -1;

    @InterfaceC65349Pkn("uuid")
    public String uuid = "";

    public final String getId() {
        return this.id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getResId() {
        return this.resId;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setResId(String str) {
        this.resId = str;
    }

    public final void setUuid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.uuid = str;
    }
}
