package com.ss.android.ugc.aweme.aigc;

import X.AbstractC36908Ee8;
import X.C1NE;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ResponseAIGCStyles extends AbstractC36908Ee8 {

    @InterfaceC65349Pkn("aigc_styles")
    public final List<ResponseAIGCStyle> aigcStyles;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("status_code")
    public final int status_code;

    @InterfaceC65349Pkn("status_msg")
    public final String status_msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseAIGCStyles)) {
            return false;
        }
        ResponseAIGCStyles responseAIGCStyles = (ResponseAIGCStyles) obj;
        return this.status_code == responseAIGCStyles.status_code && o.LJ(this.status_msg, responseAIGCStyles.status_msg) && o.LJ(this.aigcStyles, responseAIGCStyles.aigcStyles);
    }

    public final int hashCode() {
        int i = this.status_code * 31;
        String str = this.status_msg;
        return this.aigcStyles.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResponseAIGCStyles(status_code=");
        LIZ.append(this.status_code);
        LIZ.append(", status_msg=");
        LIZ.append(this.status_msg);
        LIZ.append(", aigcStyles=");
        return C1NE.LIZIZ(LIZ, this.aigcStyles, ')', LIZ);
    }

    public ResponseAIGCStyles(int i, String str, List<ResponseAIGCStyle> aigcStyles) {
        o.LJIIIZ(aigcStyles, "aigcStyles");
        this.status_code = i;
        this.status_msg = str;
        this.aigcStyles = aigcStyles;
    }

    public /* synthetic */ ResponseAIGCStyles(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, list);
    }
}
