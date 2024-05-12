package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InlineLink implements Serializable {

    @InterfaceC65349Pkn("link_type")
    public Integer linkType;

    @InterfaceC65349Pkn("text")
    public String text;

    @InterfaceC65349Pkn("url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineLink() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InlineLink copy$default(InlineLink inlineLink, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inlineLink.text;
        }
        if ((i & 2) != 0) {
            str2 = inlineLink.url;
        }
        if ((i & 4) != 0) {
            num = inlineLink.linkType;
        }
        return inlineLink.copy(str, str2, num);
    }

    public final InlineLink copy(String text, String str, Integer num) {
        o.LJIIIZ(text, "text");
        return new InlineLink(text, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InlineLink)) {
            return false;
        }
        InlineLink inlineLink = (InlineLink) obj;
        return o.LJ(this.text, inlineLink.text) && o.LJ(this.url, inlineLink.url) && o.LJ(this.linkType, inlineLink.linkType);
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.url;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.linkType;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InlineLink(text=");
        LIZ.append(this.text);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", linkType=");
        return s0.LIZJ(LIZ, this.linkType, ')', LIZ);
    }

    public final Integer getLinkType() {
        return this.linkType;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUrl() {
        return this.url;
    }

    public InlineLink(String text, String str, Integer num) {
        o.LJIIIZ(text, "text");
        this.text = text;
        this.url = str;
        this.linkType = num;
    }

    public /* synthetic */ InlineLink(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num);
    }
}
