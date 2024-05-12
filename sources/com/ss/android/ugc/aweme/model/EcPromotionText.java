package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EcPromotionText {

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("style")
    public final String style;

    /* JADX WARN: Multi-variable type inference failed */
    public EcPromotionText() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ EcPromotionText copy$default(EcPromotionText ecPromotionText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ecPromotionText.content;
        }
        if ((i & 2) != 0) {
            str2 = ecPromotionText.style;
        }
        return ecPromotionText.copy(str, str2);
    }

    public final EcPromotionText copy(String str, String str2) {
        return new EcPromotionText(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcPromotionText)) {
            return false;
        }
        EcPromotionText ecPromotionText = (EcPromotionText) obj;
        return o.LJ(this.content, ecPromotionText.content) && o.LJ(this.style, ecPromotionText.style);
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.style;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcPromotionText(content=");
        LIZ.append(this.content);
        LIZ.append(", style=");
        return q.LIZIZ(LIZ, this.style, ')', LIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final String getStyle() {
        return this.style;
    }

    public EcPromotionText(String str, String str2) {
        this.content = str;
        this.style = str2;
    }

    public /* synthetic */ EcPromotionText(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
