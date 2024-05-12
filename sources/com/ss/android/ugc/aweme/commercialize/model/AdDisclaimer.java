package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AdDisclaimer implements Serializable {

    @InterfaceC65349Pkn("pure_text")
    public String pureText;

    @InterfaceC65349Pkn("spliced_texts")
    public List<DisclaimerText> textList;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public AdDisclaimer() {
        this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdDisclaimer copy$default(AdDisclaimer adDisclaimer, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adDisclaimer.type;
        }
        if ((i2 & 2) != 0) {
            str = adDisclaimer.pureText;
        }
        if ((i2 & 4) != 0) {
            list = adDisclaimer.textList;
        }
        return adDisclaimer.copy(i, str, list);
    }

    public final AdDisclaimer copy(int i, String pureText, List<DisclaimerText> list) {
        o.LJIIIZ(pureText, "pureText");
        return new AdDisclaimer(i, pureText, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDisclaimer)) {
            return false;
        }
        AdDisclaimer adDisclaimer = (AdDisclaimer) obj;
        return this.type == adDisclaimer.type && o.LJ(this.pureText, adDisclaimer.pureText) && o.LJ(this.textList, adDisclaimer.textList);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.pureText, this.type * 31, 31);
        List<DisclaimerText> list = this.textList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdDisclaimer(type=");
        LIZ.append(this.type);
        LIZ.append(", pureText=");
        LIZ.append(this.pureText);
        LIZ.append(", textList=");
        return C1NE.LIZIZ(LIZ, this.textList, ')', LIZ);
    }

    public final String getPureText() {
        return this.pureText;
    }

    public final List<DisclaimerText> getTextList() {
        return this.textList;
    }

    public final int getType() {
        return this.type;
    }

    public final void setPureText(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.pureText = str;
    }

    public final void setTextList(List<DisclaimerText> list) {
        this.textList = list;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public AdDisclaimer(int i, String pureText, List<DisclaimerText> list) {
        o.LJIIIZ(pureText, "pureText");
        this.type = i;
        this.pureText = pureText;
        this.textList = list;
    }

    public /* synthetic */ AdDisclaimer(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : list);
    }
}
