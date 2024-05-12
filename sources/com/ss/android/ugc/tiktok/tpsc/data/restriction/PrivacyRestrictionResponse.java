package com.ss.android.ugc.tiktok.tpsc.data.restriction;

import X.C12400eC;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.data.LogPbBean;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacyRestrictionResponse extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("popup_agreement")
    public final Map<String, PrivacySettingsAgreementRecord> popupAgreement;

    @InterfaceC65349Pkn("post_record")
    public final Map<String, PrivacySettingsAgreementRecord> postRecord;

    @InterfaceC65349Pkn("privacy_restriction")
    public final PrivacySettingsRestriction privacySettingsRestriction;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivacyRestrictionResponse copy$default(PrivacyRestrictionResponse privacyRestrictionResponse, PrivacySettingsRestriction privacySettingsRestriction, Map map, Map map2, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            privacySettingsRestriction = privacyRestrictionResponse.privacySettingsRestriction;
        }
        if ((i & 2) != 0) {
            map = privacyRestrictionResponse.popupAgreement;
        }
        if ((i & 4) != 0) {
            map2 = privacyRestrictionResponse.postRecord;
        }
        if ((i & 8) != 0) {
            logPbBean = privacyRestrictionResponse.logPb;
        }
        return privacyRestrictionResponse.copy(privacySettingsRestriction, map, map2, logPbBean);
    }

    public final PrivacyRestrictionResponse copy(PrivacySettingsRestriction privacySettingsRestriction, Map<String, PrivacySettingsAgreementRecord> popupAgreement, Map<String, PrivacySettingsAgreementRecord> postRecord, LogPbBean logPbBean) {
        o.LJIIIZ(popupAgreement, "popupAgreement");
        o.LJIIIZ(postRecord, "postRecord");
        return new PrivacyRestrictionResponse(privacySettingsRestriction, popupAgreement, postRecord, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyRestrictionResponse)) {
            return false;
        }
        PrivacyRestrictionResponse privacyRestrictionResponse = (PrivacyRestrictionResponse) obj;
        return o.LJ(this.privacySettingsRestriction, privacyRestrictionResponse.privacySettingsRestriction) && o.LJ(this.popupAgreement, privacyRestrictionResponse.popupAgreement) && o.LJ(this.postRecord, privacyRestrictionResponse.postRecord) && o.LJ(this.logPb, privacyRestrictionResponse.logPb);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyRestrictionResponse(privacySettingsRestriction=");
        LIZ.append(this.privacySettingsRestriction);
        LIZ.append(", popupAgreement=");
        LIZ.append(this.popupAgreement);
        LIZ.append(", postRecord=");
        LIZ.append(this.postRecord);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        PrivacySettingsRestriction privacySettingsRestriction = this.privacySettingsRestriction;
        int i = 0;
        if (privacySettingsRestriction == null) {
            hashCode = 0;
        } else {
            hashCode = privacySettingsRestriction.hashCode();
        }
        int LIZ = C12400eC.LIZ(this.postRecord, C12400eC.LIZ(this.popupAgreement, hashCode * 31, 31), 31);
        LogPbBean logPbBean = this.logPb;
        if (logPbBean != null) {
            i = logPbBean.hashCode();
        }
        return LIZ + i;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final Map<String, PrivacySettingsAgreementRecord> getPopupAgreement() {
        return this.popupAgreement;
    }

    public final Map<String, PrivacySettingsAgreementRecord> getPostRecord() {
        return this.postRecord;
    }

    public final PrivacySettingsRestriction getPrivacySettingsRestriction() {
        return this.privacySettingsRestriction;
    }

    public PrivacyRestrictionResponse(PrivacySettingsRestriction privacySettingsRestriction, Map<String, PrivacySettingsAgreementRecord> popupAgreement, Map<String, PrivacySettingsAgreementRecord> postRecord, LogPbBean logPbBean) {
        o.LJIIIZ(popupAgreement, "popupAgreement");
        o.LJIIIZ(postRecord, "postRecord");
        this.privacySettingsRestriction = privacySettingsRestriction;
        this.popupAgreement = popupAgreement;
        this.postRecord = postRecord;
        this.logPb = logPbBean;
    }

    public /* synthetic */ PrivacyRestrictionResponse(PrivacySettingsRestriction privacySettingsRestriction, Map map, Map map2, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : privacySettingsRestriction, map, map2, (i & 8) != 0 ? null : logPbBean);
    }
}
