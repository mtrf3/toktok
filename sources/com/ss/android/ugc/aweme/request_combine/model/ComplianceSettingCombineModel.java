package com.ss.android.ugc.aweme.request_combine.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ComplianceSettingCombineModel extends BaseCombineMode {

    @InterfaceC65349Pkn("body")
    public ComplianceSetting complianceSetting;

    /* JADX WARN: Multi-variable type inference failed */
    public ComplianceSettingCombineModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ComplianceSettingCombineModel copy$default(ComplianceSettingCombineModel complianceSettingCombineModel, ComplianceSetting complianceSetting, int i, Object obj) {
        if ((i & 1) != 0) {
            complianceSetting = complianceSettingCombineModel.complianceSetting;
        }
        return complianceSettingCombineModel.copy(complianceSetting);
    }

    public final ComplianceSettingCombineModel copy(ComplianceSetting complianceSetting) {
        return new ComplianceSettingCombineModel(complianceSetting);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ComplianceSettingCombineModel) && o.LJ(this.complianceSetting, ((ComplianceSettingCombineModel) obj).complianceSetting);
    }

    public int hashCode() {
        ComplianceSetting complianceSetting = this.complianceSetting;
        if (complianceSetting == null) {
            return 0;
        }
        return complianceSetting.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComplianceSettingCombineModel(complianceSetting=");
        LIZ.append(this.complianceSetting);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final ComplianceSetting getComplianceSetting() {
        return this.complianceSetting;
    }

    public ComplianceSettingCombineModel(ComplianceSetting complianceSetting) {
        this.complianceSetting = complianceSetting;
    }

    public final void setComplianceSetting(ComplianceSetting complianceSetting) {
        this.complianceSetting = complianceSetting;
    }

    public /* synthetic */ ComplianceSettingCombineModel(ComplianceSetting complianceSetting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : complianceSetting);
    }
}
