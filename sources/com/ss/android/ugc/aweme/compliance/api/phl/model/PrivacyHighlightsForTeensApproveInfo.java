package com.ss.android.ugc.aweme.compliance.api.phl.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PrivacyHighlightsForTeensApproveInfo {

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("operation")
    public final Integer operation;

    @InterfaceC65349Pkn("policy_version")
    public final String policyVersion;

    @InterfaceC65349Pkn("style")
    public final String style;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyHighlightsForTeensApproveInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyHighlightsForTeensApproveInfo)) {
            return false;
        }
        PrivacyHighlightsForTeensApproveInfo privacyHighlightsForTeensApproveInfo = (PrivacyHighlightsForTeensApproveInfo) obj;
        return o.LJ(this.business, privacyHighlightsForTeensApproveInfo.business) && o.LJ(this.policyVersion, privacyHighlightsForTeensApproveInfo.policyVersion) && o.LJ(this.style, privacyHighlightsForTeensApproveInfo.style) && o.LJ(this.extra, privacyHighlightsForTeensApproveInfo.extra) && o.LJ(this.operation, privacyHighlightsForTeensApproveInfo.operation);
    }

    public final int hashCode() {
        int hashCode = this.business.hashCode() * 31;
        String str = this.policyVersion;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.extra;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.operation;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyHighlightsForTeensApproveInfo(business=");
        LIZ.append(this.business);
        LIZ.append(", policyVersion=");
        LIZ.append(this.policyVersion);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", operation=");
        return s0.LIZJ(LIZ, this.operation, ')', LIZ);
    }

    public PrivacyHighlightsForTeensApproveInfo(String business, String str, String str2, String str3, Integer num) {
        o.LJIIIZ(business, "business");
        this.business = business;
        this.policyVersion = str;
        this.style = str2;
        this.extra = str3;
        this.operation = num;
    }

    public /* synthetic */ PrivacyHighlightsForTeensApproveInfo(String str, String str2, String str3, String str4, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? num : null);
    }
}
