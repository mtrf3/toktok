package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShowTextInfo {

    @InterfaceC65349Pkn("format_text")
    public final String formatText;

    @InterfaceC65349Pkn("highlight_text")
    public final String highlightText;

    /* JADX WARN: Multi-variable type inference failed */
    public ShowTextInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShowTextInfo)) {
            return false;
        }
        ShowTextInfo showTextInfo = (ShowTextInfo) obj;
        return o.LJ(this.formatText, showTextInfo.formatText) && o.LJ(this.highlightText, showTextInfo.highlightText);
    }

    public final int hashCode() {
        String str = this.formatText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.highlightText;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowTextInfo(formatText=");
        LIZ.append(this.formatText);
        LIZ.append(", highlightText=");
        return q.LIZIZ(LIZ, this.highlightText, ')', LIZ);
    }

    public ShowTextInfo(String str, String str2) {
        this.formatText = str;
        this.highlightText = str2;
    }

    public /* synthetic */ ShowTextInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
