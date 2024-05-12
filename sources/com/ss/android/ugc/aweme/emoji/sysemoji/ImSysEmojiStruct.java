package com.ss.android.ugc.aweme.emoji.sysemoji;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class ImSysEmojiStruct implements Serializable {

    @InterfaceC65349Pkn("d")
    public List<? extends Emoji> d;

    @InterfaceC65349Pkn("v")
    public String v;

    public final List<Emoji> getD() {
        return this.d;
    }

    public final String getV() {
        return this.v;
    }

    public final void setD(List<? extends Emoji> list) {
        this.d = list;
    }

    public final void setV(String str) {
        this.v = str;
    }
}
