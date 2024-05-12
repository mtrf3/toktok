package com.bytedance.ies.ugc.aweme.commercialize.compliance.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class TherePartyDataControlModel implements Serializable {

    @InterfaceC65349Pkn("is_submitted")
    public Boolean isSubmitted;

    @InterfaceC65349Pkn("last_submitted_time")
    public Integer lastSubmittedTime;

    @InterfaceC65349Pkn("is_show_3p_data_control")
    public Boolean shouldShow3PDataControl;

    /* JADX WARN: Multi-variable type inference failed */
    public TherePartyDataControlModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final Integer getLastSubmittedTime() {
        return this.lastSubmittedTime;
    }

    public final Boolean getShouldShow3PDataControl() {
        return this.shouldShow3PDataControl;
    }

    public final Boolean isSubmitted() {
        return this.isSubmitted;
    }

    public final void setLastSubmittedTime(Integer num) {
        this.lastSubmittedTime = num;
    }

    public final void setShouldShow3PDataControl(Boolean bool) {
        this.shouldShow3PDataControl = bool;
    }

    public final void setSubmitted(Boolean bool) {
        this.isSubmitted = bool;
    }

    public TherePartyDataControlModel(Boolean bool, Boolean bool2, Integer num) {
        this.shouldShow3PDataControl = bool;
        this.isSubmitted = bool2;
        this.lastSubmittedTime = num;
    }

    public /* synthetic */ TherePartyDataControlModel(Boolean bool, Boolean bool2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? null : num);
    }
}
