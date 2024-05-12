package com.ss.android.ugc.gamora.editor.sticker.donation.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TextHighlight implements Serializable {

    @InterfaceC65349Pkn("end")
    public Integer endIndex;

    @InterfaceC65349Pkn("start")
    public Integer startIndex;

    public static /* synthetic */ TextHighlight copy$default(TextHighlight textHighlight, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = textHighlight.startIndex;
        }
        if ((i & 2) != 0) {
            num2 = textHighlight.endIndex;
        }
        return textHighlight.copy(num, num2);
    }

    public final TextHighlight copy(Integer num, Integer num2) {
        return new TextHighlight(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextHighlight)) {
            return false;
        }
        TextHighlight textHighlight = (TextHighlight) obj;
        return o.LJ(this.startIndex, textHighlight.startIndex) && o.LJ(this.endIndex, textHighlight.endIndex);
    }

    public int hashCode() {
        Integer num = this.startIndex;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.endIndex;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TextHighlight(startIndex=");
        LIZ.append(this.startIndex);
        LIZ.append(", endIndex=");
        return s0.LIZJ(LIZ, this.endIndex, ')', LIZ);
    }

    public final Integer getEndIndex() {
        return this.endIndex;
    }

    public final Integer getStartIndex() {
        return this.startIndex;
    }

    public final void setEndIndex(Integer num) {
        this.endIndex = num;
    }

    public final void setStartIndex(Integer num) {
        this.startIndex = num;
    }

    public TextHighlight(Integer num, Integer num2) {
        this.startIndex = num;
        this.endIndex = num2;
    }
}
