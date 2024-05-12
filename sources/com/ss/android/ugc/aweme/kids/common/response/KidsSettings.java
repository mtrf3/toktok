package com.ss.android.ugc.aweme.kids.common.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.j;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class KidsSettings extends BaseResponse {

    @InterfaceC65349Pkn("ab_test_params")
    public final j abTestParamStruct;

    @InterfaceC65349Pkn("compliance_settings")
    public final KidsComplianceSettings complianceSettings;

    public static /* synthetic */ KidsSettings copy$default(KidsSettings kidsSettings, KidsComplianceSettings kidsComplianceSettings, j jVar, int i, Object obj) {
        if ((i & 1) != 0) {
            kidsComplianceSettings = kidsSettings.complianceSettings;
        }
        if ((i & 2) != 0) {
            jVar = kidsSettings.abTestParamStruct;
        }
        return kidsSettings.copy(kidsComplianceSettings, jVar);
    }

    public final KidsSettings copy(KidsComplianceSettings kidsComplianceSettings, j jVar) {
        return new KidsSettings(kidsComplianceSettings, jVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KidsSettings)) {
            return false;
        }
        KidsSettings kidsSettings = (KidsSettings) obj;
        return o.LJ(this.complianceSettings, kidsSettings.complianceSettings) && o.LJ(this.abTestParamStruct, kidsSettings.abTestParamStruct);
    }

    public int hashCode() {
        KidsComplianceSettings kidsComplianceSettings = this.complianceSettings;
        int hashCode = (kidsComplianceSettings == null ? 0 : kidsComplianceSettings.hashCode()) * 31;
        j jVar = this.abTestParamStruct;
        return hashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KidsSettings(complianceSettings=");
        LIZ.append(this.complianceSettings);
        LIZ.append(", abTestParamStruct=");
        LIZ.append(this.abTestParamStruct);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final j getAbTestParamStruct() {
        return this.abTestParamStruct;
    }

    public final KidsComplianceSettings getComplianceSettings() {
        return this.complianceSettings;
    }

    public KidsSettings(KidsComplianceSettings kidsComplianceSettings, j jVar) {
        this.complianceSettings = kidsComplianceSettings;
        this.abTestParamStruct = jVar;
    }

    public /* synthetic */ KidsSettings(KidsComplianceSettings kidsComplianceSettings, j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kidsComplianceSettings, (i & 2) != 0 ? null : jVar);
    }
}
