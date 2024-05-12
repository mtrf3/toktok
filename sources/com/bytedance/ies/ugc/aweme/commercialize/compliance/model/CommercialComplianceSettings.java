package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CommercialComplianceSettings extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("data_control_3p_data")
    public TherePartyDataControlModel therePartyData;

    /* JADX WARN: Multi-variable type inference failed */
    public CommercialComplianceSettings() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final TherePartyDataControlModel getTherePartyData() {
        return this.therePartyData;
    }

    public CommercialComplianceSettings(TherePartyDataControlModel therePartyDataControlModel) {
        this.therePartyData = therePartyDataControlModel;
    }

    public final void setTherePartyData(TherePartyDataControlModel therePartyDataControlModel) {
        this.therePartyData = therePartyDataControlModel;
    }

    public /* synthetic */ CommercialComplianceSettings(TherePartyDataControlModel therePartyDataControlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : therePartyDataControlModel);
    }
}
