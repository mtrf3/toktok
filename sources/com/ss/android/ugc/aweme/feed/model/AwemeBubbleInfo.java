package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AwemeBubbleInfo implements Serializable {

    @InterfaceC65349Pkn("biz")
    public final int biz;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("scheme_url")
    public final String schemeUrl;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final int type;

    public static /* synthetic */ AwemeBubbleInfo copy$default(AwemeBubbleInfo awemeBubbleInfo, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = awemeBubbleInfo.biz;
        }
        if ((i3 & 2) != 0) {
            i2 = awemeBubbleInfo.type;
        }
        if ((i3 & 4) != 0) {
            str = awemeBubbleInfo.text;
        }
        if ((i3 & 8) != 0) {
            str2 = awemeBubbleInfo.schemeUrl;
        }
        if ((i3 & 16) != 0) {
            str3 = awemeBubbleInfo.logExtra;
        }
        return awemeBubbleInfo.copy(i, i2, str, str2, str3);
    }

    public final AwemeBubbleInfo copy(int i, int i2, String str, String str2, String str3) {
        return new AwemeBubbleInfo(i, i2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeBubbleInfo)) {
            return false;
        }
        AwemeBubbleInfo awemeBubbleInfo = (AwemeBubbleInfo) obj;
        return this.biz == awemeBubbleInfo.biz && this.type == awemeBubbleInfo.type && o.LJ(this.text, awemeBubbleInfo.text) && o.LJ(this.schemeUrl, awemeBubbleInfo.schemeUrl) && o.LJ(this.logExtra, awemeBubbleInfo.logExtra);
    }

    public int hashCode() {
        int i = ((this.biz * 31) + this.type) * 31;
        String str = this.text;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.schemeUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.logExtra;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeBubbleInfo(biz=");
        LIZ.append(this.biz);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", schemeUrl=");
        LIZ.append(this.schemeUrl);
        LIZ.append(", logExtra=");
        return q.LIZIZ(LIZ, this.logExtra, ')', LIZ);
    }

    public final int getBiz() {
        return this.biz;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getSchemeUrl() {
        return this.schemeUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final int getType() {
        return this.type;
    }

    public AwemeBubbleInfo(int i, int i2, String str, String str2, String str3) {
        this.biz = i;
        this.type = i2;
        this.text = str;
        this.schemeUrl = str2;
        this.logExtra = str3;
    }
}
