package com.ss.android.ugc.aweme.compliance.protection.common.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ProtectionApiResponse extends BaseResponse {

    @InterfaceC65349Pkn("dw")
    public final DigitalWellbeingBean digitalWellbeingBean;

    @InterfaceC65349Pkn("fp")
    public final FamilyPairingBean familyPairingBean;

    @InterfaceC65349Pkn("user_details")
    public final UserDetailsInfoBean userDetailsInfoBean;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtectionApiResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtectionApiResponse)) {
            return false;
        }
        ProtectionApiResponse protectionApiResponse = (ProtectionApiResponse) obj;
        return o.LJ(this.familyPairingBean, protectionApiResponse.familyPairingBean) && o.LJ(this.digitalWellbeingBean, protectionApiResponse.digitalWellbeingBean) && o.LJ(this.userDetailsInfoBean, protectionApiResponse.userDetailsInfoBean);
    }

    public final int hashCode() {
        FamilyPairingBean familyPairingBean = this.familyPairingBean;
        int hashCode = (familyPairingBean == null ? 0 : familyPairingBean.hashCode()) * 31;
        DigitalWellbeingBean digitalWellbeingBean = this.digitalWellbeingBean;
        return this.userDetailsInfoBean.hashCode() + ((hashCode + (digitalWellbeingBean != null ? digitalWellbeingBean.hashCode() : 0)) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProtectionApiResponse(familyPairingBean=");
        LIZ.append(this.familyPairingBean);
        LIZ.append(", digitalWellbeingBean=");
        LIZ.append(this.digitalWellbeingBean);
        LIZ.append(", userDetailsInfoBean=");
        LIZ.append(this.userDetailsInfoBean);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ProtectionApiResponse(FamilyPairingBean familyPairingBean, DigitalWellbeingBean digitalWellbeingBean, UserDetailsInfoBean userDetailsInfoBean) {
        o.LJIIIZ(userDetailsInfoBean, "userDetailsInfoBean");
        this.familyPairingBean = familyPairingBean;
        this.digitalWellbeingBean = digitalWellbeingBean;
        this.userDetailsInfoBean = userDetailsInfoBean;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ProtectionApiResponse(com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean r21, com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean r22, com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r20 = this;
            r1 = r23
            r2 = r21
            r3 = r22
            r0 = r24 & 1
            r4 = 0
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean r2 = new com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean
            r0 = 3
            r2.<init>(r4, r4, r0, r4)
        L11:
            r0 = r24 & 2
            if (r0 == 0) goto L2d
            com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean r3 = new com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean
            r5 = 0
            r18 = 16383(0x3fff, float:2.2957E-41)
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r19 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L2d:
            r0 = r24 & 4
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean r1 = new com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean
            r0 = 1
            r1.<init>(r4, r0, r4)
        L37:
            r0 = r20
            r0.<init>(r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.protection.common.model.ProtectionApiResponse.<init>(com.ss.android.ugc.aweme.compliance.protection.common.model.FamilyPairingBean, com.ss.android.ugc.aweme.compliance.protection.common.model.DigitalWellbeingBean, com.ss.android.ugc.aweme.compliance.protection.common.model.UserDetailsInfoBean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
