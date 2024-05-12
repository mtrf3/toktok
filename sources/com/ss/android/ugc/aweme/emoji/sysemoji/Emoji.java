package com.ss.android.ugc.aweme.emoji.sysemoji;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class Emoji implements Serializable {

    @InterfaceC65349Pkn("business")
    public int business;

    @InterfaceC65349Pkn("emoji")
    public List<String> emoji;

    @InterfaceC65349Pkn("ios")
    public String ios = "";

    @InterfaceC65349Pkn("and")
    public String and = "";

    public final String getAnd() {
        return this.and;
    }

    public final int getBusiness() {
        return this.business;
    }

    public final List<String> getEmoji() {
        return this.emoji;
    }

    public final String getIos() {
        return this.ios;
    }

    public final void setAnd(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.and = str;
    }

    public final void setBusiness(int i) {
        this.business = i;
    }

    public final void setEmoji(List<String> list) {
        this.emoji = list;
    }

    public final void setIos(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.ios = str;
    }
}
