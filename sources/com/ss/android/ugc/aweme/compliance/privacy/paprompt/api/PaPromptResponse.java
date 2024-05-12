package com.ss.android.ugc.aweme.compliance.privacy.paprompt.api;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestriction;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PaPromptResponse extends BaseResponse {

    @InterfaceC65349Pkn("privacy_restriction")
    public final PrivacySettingsRestriction privacySettingsRestriction;

    @InterfaceC65349Pkn("privacy_settings")
    public final Map<String, Integer> privacyUserSettings;

    /* JADX WARN: Multi-variable type inference failed */
    public PaPromptResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaPromptResponse)) {
            return false;
        }
        PaPromptResponse paPromptResponse = (PaPromptResponse) obj;
        return o.LJ(this.privacySettingsRestriction, paPromptResponse.privacySettingsRestriction) && o.LJ(this.privacyUserSettings, paPromptResponse.privacyUserSettings);
    }

    public final int hashCode() {
        PrivacySettingsRestriction privacySettingsRestriction = this.privacySettingsRestriction;
        int hashCode = (privacySettingsRestriction == null ? 0 : privacySettingsRestriction.hashCode()) * 31;
        Map<String, Integer> map = this.privacyUserSettings;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaPromptResponse(privacySettingsRestriction=");
        LIZ.append(this.privacySettingsRestriction);
        LIZ.append(", privacyUserSettings=");
        return C15890jp.LIZ(LIZ, this.privacyUserSettings, ')', LIZ);
    }

    public PaPromptResponse(PrivacySettingsRestriction privacySettingsRestriction, Map<String, Integer> map) {
        this.privacySettingsRestriction = privacySettingsRestriction;
        this.privacyUserSettings = map;
    }

    public /* synthetic */ PaPromptResponse(PrivacySettingsRestriction privacySettingsRestriction, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : privacySettingsRestriction, (i & 2) != 0 ? null : map);
    }
}
