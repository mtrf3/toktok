package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class Lemon8GeneralAnchorContentInfo implements Serializable {

    @InterfaceC65349Pkn("keyword")
    public String keyword = "";

    @InterfaceC65349Pkn("subtype")
    public String subtype = "";

    @InterfaceC65349Pkn("type")
    public int type;

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final int getType() {
        return this.type;
    }

    public final void setKeyword(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.keyword = str;
    }

    public final void setSubtype(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.subtype = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
