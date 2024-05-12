package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightData {

    @InterfaceC65349Pkn("icon_bubble_str")
    public String bubbleStr;

    @InterfaceC65349Pkn("icon_bubble_type")
    public String bubbleType;

    @InterfaceC65349Pkn("new_user_popup")
    public NewUserPopUp newUserPopup;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HighlightData)) {
            return false;
        }
        HighlightData highlightData = (HighlightData) obj;
        return o.LJ(this.newUserPopup, highlightData.newUserPopup) && o.LJ(this.bubbleStr, highlightData.bubbleStr) && o.LJ(this.bubbleType, highlightData.bubbleType);
    }

    public final int hashCode() {
        NewUserPopUp newUserPopUp = this.newUserPopup;
        int hashCode = (newUserPopUp == null ? 0 : newUserPopUp.hashCode()) * 31;
        String str = this.bubbleStr;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.bubbleType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HighlightData(newUserPopup=");
        LIZ.append(this.newUserPopup);
        LIZ.append(", bubbleStr=");
        LIZ.append(this.bubbleStr);
        LIZ.append(", bubbleType=");
        return q.LIZIZ(LIZ, this.bubbleType, ')', LIZ);
    }

    public HighlightData(NewUserPopUp newUserPopUp, String str, String str2) {
        this.newUserPopup = newUserPopUp;
        this.bubbleStr = str;
        this.bubbleType = str2;
    }
}
