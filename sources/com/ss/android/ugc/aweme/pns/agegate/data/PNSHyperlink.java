package com.ss.android.ugc.aweme.pns.agegate.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PNSHyperlink implements Serializable {

    @InterfaceC65349Pkn("age_gate_hyperlink_action")
    public final String ageGateHyperlinkAction;

    @InterfaceC65349Pkn("age_gate_hyperlink_text")
    public final String ageGateHyperlinkText;

    /* JADX WARN: Multi-variable type inference failed */
    public PNSHyperlink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PNSHyperlink copy$default(PNSHyperlink pNSHyperlink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pNSHyperlink.ageGateHyperlinkText;
        }
        if ((i & 2) != 0) {
            str2 = pNSHyperlink.ageGateHyperlinkAction;
        }
        return pNSHyperlink.copy(str, str2);
    }

    public final PNSHyperlink copy(String str, String str2) {
        return new PNSHyperlink(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSHyperlink)) {
            return false;
        }
        PNSHyperlink pNSHyperlink = (PNSHyperlink) obj;
        return o.LJ(this.ageGateHyperlinkText, pNSHyperlink.ageGateHyperlinkText) && o.LJ(this.ageGateHyperlinkAction, pNSHyperlink.ageGateHyperlinkAction);
    }

    public int hashCode() {
        String str = this.ageGateHyperlinkText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ageGateHyperlinkAction;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSHyperlink(ageGateHyperlinkText=");
        LIZ.append((Object) this.ageGateHyperlinkText);
        LIZ.append(", ageGateHyperlinkAction=");
        LIZ.append((Object) this.ageGateHyperlinkAction);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAgeGateHyperlinkAction() {
        return this.ageGateHyperlinkAction;
    }

    public final String getAgeGateHyperlinkText() {
        return this.ageGateHyperlinkText;
    }

    public PNSHyperlink(String str, String str2) {
        this.ageGateHyperlinkText = str;
        this.ageGateHyperlinkAction = str2;
    }

    public /* synthetic */ PNSHyperlink(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
