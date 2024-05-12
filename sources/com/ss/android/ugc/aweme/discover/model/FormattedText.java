package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class FormattedText implements Serializable {

    @InterfaceC65349Pkn("bold")
    public final String bold;

    @InterfaceC65349Pkn("text")
    public final String text;

    public static /* synthetic */ FormattedText copy$default(FormattedText formattedText, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattedText.text;
        }
        if ((i & 2) != 0) {
            str2 = formattedText.bold;
        }
        return formattedText.copy(str, str2);
    }

    public final FormattedText copy(String text, String str) {
        o.LJIIIZ(text, "text");
        return new FormattedText(text, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedText)) {
            return false;
        }
        FormattedText formattedText = (FormattedText) obj;
        return o.LJ(this.text, formattedText.text) && o.LJ(this.bold, formattedText.bold);
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.bold;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FormattedText(text=");
        LIZ.append(this.text);
        LIZ.append(", bold=");
        return q.LIZIZ(LIZ, this.bold, ')', LIZ);
    }

    public final String getBold() {
        return this.bold;
    }

    public final String getText() {
        return this.text;
    }

    public FormattedText(String text, String str) {
        o.LJIIIZ(text, "text");
        this.text = text;
        this.bold = str;
    }
}
