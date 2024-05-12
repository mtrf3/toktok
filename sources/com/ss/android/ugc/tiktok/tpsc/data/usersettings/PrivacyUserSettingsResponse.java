package com.ss.android.ugc.tiktok.tpsc.data.usersettings;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.data.LogPbBean;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PrivacyUserSettingsResponse extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("privacy_settings")
    public final PrivacyUserSettingsV2 privacyUserSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyUserSettingsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PrivacyUserSettingsResponse copy$default(PrivacyUserSettingsResponse privacyUserSettingsResponse, PrivacyUserSettingsV2 privacyUserSettingsV2, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            privacyUserSettingsV2 = privacyUserSettingsResponse.privacyUserSettings;
        }
        if ((i & 2) != 0) {
            logPbBean = privacyUserSettingsResponse.logPb;
        }
        return privacyUserSettingsResponse.copy(privacyUserSettingsV2, logPbBean);
    }

    public final PrivacyUserSettingsResponse copy(PrivacyUserSettingsV2 privacyUserSettingsV2, LogPbBean logPbBean) {
        return new PrivacyUserSettingsResponse(privacyUserSettingsV2, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyUserSettingsResponse)) {
            return false;
        }
        PrivacyUserSettingsResponse privacyUserSettingsResponse = (PrivacyUserSettingsResponse) obj;
        return o.LJ(this.privacyUserSettings, privacyUserSettingsResponse.privacyUserSettings) && o.LJ(this.logPb, privacyUserSettingsResponse.logPb);
    }

    public int hashCode() {
        PrivacyUserSettingsV2 privacyUserSettingsV2 = this.privacyUserSettings;
        int hashCode = (privacyUserSettingsV2 == null ? 0 : privacyUserSettingsV2.hashCode()) * 31;
        LogPbBean logPbBean = this.logPb;
        return hashCode + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyUserSettingsResponse(privacyUserSettings=");
        LIZ.append(this.privacyUserSettings);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final PrivacyUserSettingsV2 getPrivacyUserSettings() {
        return this.privacyUserSettings;
    }

    public PrivacyUserSettingsResponse(PrivacyUserSettingsV2 privacyUserSettingsV2, LogPbBean logPbBean) {
        this.privacyUserSettings = privacyUserSettingsV2;
        this.logPb = logPbBean;
    }

    public /* synthetic */ PrivacyUserSettingsResponse(PrivacyUserSettingsV2 privacyUserSettingsV2, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : privacyUserSettingsV2, (i & 2) != 0 ? null : logPbBean);
    }
}
