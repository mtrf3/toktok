package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AwemeActivityContent implements Serializable {

    @InterfaceC65349Pkn("color")
    public String color;

    @InterfaceC65349Pkn("size")
    public String size;

    @InterfaceC65349Pkn("text")
    public String text;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeActivityContent() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AwemeActivityContent copy$default(AwemeActivityContent awemeActivityContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeActivityContent.text;
        }
        if ((i & 2) != 0) {
            str2 = awemeActivityContent.color;
        }
        if ((i & 4) != 0) {
            str3 = awemeActivityContent.size;
        }
        return awemeActivityContent.copy(str, str2, str3);
    }

    public final AwemeActivityContent copy(String str, String str2, String str3) {
        return new AwemeActivityContent(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeActivityContent)) {
            return false;
        }
        AwemeActivityContent awemeActivityContent = (AwemeActivityContent) obj;
        return o.LJ(this.text, awemeActivityContent.text) && o.LJ(this.color, awemeActivityContent.color) && o.LJ(this.size, awemeActivityContent.size);
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.size;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeActivityContent(text=");
        LIZ.append(this.text);
        LIZ.append(", color=");
        LIZ.append(this.color);
        LIZ.append(", size=");
        return q.LIZIZ(LIZ, this.size, ')', LIZ);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getSize() {
        return this.size;
    }

    public final String getText() {
        return this.text;
    }

    public AwemeActivityContent(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.size = str3;
    }

    public /* synthetic */ AwemeActivityContent(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
