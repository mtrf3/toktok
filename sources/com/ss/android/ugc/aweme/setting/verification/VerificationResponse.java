package com.ss.android.ugc.aweme.setting.verification;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes7.dex */
public final class VerificationResponse extends BaseResponse {

    @InterfaceC65349Pkn("cert_status")
    public MtCertStatusEnum mtCertStatusEnum;

    @InterfaceC65349Pkn("certing_action")
    public MtCertingActionEnum mtCertingActionEnum;

    public final boolean isCerted() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_EMPTY) {
            return true;
        }
        return false;
    }

    public final boolean isCertedAgain() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING) {
            return true;
        }
        return false;
    }

    public final boolean isCerting() {
        MtCertStatusEnum mtCertStatusEnum = this.mtCertStatusEnum;
        if (mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || (mtCertStatusEnum == MtCertStatusEnum.CS_EMPTY && this.mtCertingActionEnum == MtCertingActionEnum.CA_CERTING)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        MtCertStatusEnum mtCertStatusEnum = this.mtCertStatusEnum;
        if ((mtCertStatusEnum == MtCertStatusEnum.CS_EMPTY && this.mtCertingActionEnum == MtCertingActionEnum.CA_EMPTY) || mtCertStatusEnum == MtCertStatusEnum.CS_DENIED) {
            return true;
        }
        return false;
    }

    public final boolean isUpdating() {
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTED && this.mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowChangeMobileDialog() {
        MtCertingActionEnum mtCertingActionEnum;
        MtCertStatusEnum mtCertStatusEnum = this.mtCertStatusEnum;
        if (mtCertStatusEnum == MtCertStatusEnum.CS_CERTED || mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || (mtCertingActionEnum = this.mtCertingActionEnum) == MtCertingActionEnum.CA_CERTING || mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowProfileUpdatingToast() {
        MtCertingActionEnum mtCertingActionEnum;
        if (this.mtCertStatusEnum == MtCertStatusEnum.CS_CERTING || (mtCertingActionEnum = this.mtCertingActionEnum) == MtCertingActionEnum.CA_CERTING || mtCertingActionEnum == MtCertingActionEnum.CA_UPDATING) {
            return true;
        }
        return false;
    }

    public final MtCertStatusEnum getMtCertStatusEnum() {
        return this.mtCertStatusEnum;
    }

    public final MtCertingActionEnum getMtCertingActionEnum() {
        return this.mtCertingActionEnum;
    }

    public final void setMtCertStatusEnum(MtCertStatusEnum mtCertStatusEnum) {
        this.mtCertStatusEnum = mtCertStatusEnum;
    }

    public final void setMtCertingActionEnum(MtCertingActionEnum mtCertingActionEnum) {
        this.mtCertingActionEnum = mtCertingActionEnum;
    }
}
