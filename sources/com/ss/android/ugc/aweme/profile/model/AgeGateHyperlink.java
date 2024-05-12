package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AgeGateHyperlink implements Serializable {

    @InterfaceC65349Pkn("age_gate_hyperlink_action")
    public String ageGateHyperlinkAction;

    @InterfaceC65349Pkn("age_gate_hyperlink_text")
    public String ageGateHyperlinkText;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeGateHyperlink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AgeGateHyperlink copy$default(AgeGateHyperlink ageGateHyperlink, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageGateHyperlink.ageGateHyperlinkText;
        }
        if ((i & 2) != 0) {
            str2 = ageGateHyperlink.ageGateHyperlinkAction;
        }
        return ageGateHyperlink.copy(str, str2);
    }

    public final AgeGateHyperlink copy(String str, String str2) {
        return new AgeGateHyperlink(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateHyperlink)) {
            return false;
        }
        AgeGateHyperlink ageGateHyperlink = (AgeGateHyperlink) obj;
        return o.LJ(this.ageGateHyperlinkText, ageGateHyperlink.ageGateHyperlinkText) && o.LJ(this.ageGateHyperlinkAction, ageGateHyperlink.ageGateHyperlinkAction);
    }

    public int hashCode() {
        String str = this.ageGateHyperlinkText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ageGateHyperlinkAction;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AgeGateHyperlink(ageGateHyperlinkText=");
        LIZ.append(this.ageGateHyperlinkText);
        LIZ.append(", ageGateHyperlinkAction=");
        return q.LIZIZ(LIZ, this.ageGateHyperlinkAction, ')', LIZ);
    }

    public final String getAgeGateHyperlinkAction() {
        return this.ageGateHyperlinkAction;
    }

    public final String getAgeGateHyperlinkText() {
        return this.ageGateHyperlinkText;
    }

    public final void setAgeGateHyperlinkAction(String str) {
        this.ageGateHyperlinkAction = str;
    }

    public final void setAgeGateHyperlinkText(String str) {
        this.ageGateHyperlinkText = str;
    }

    public AgeGateHyperlink(String str, String str2) {
        this.ageGateHyperlinkText = str;
        this.ageGateHyperlinkAction = str2;
    }

    public /* synthetic */ AgeGateHyperlink(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
