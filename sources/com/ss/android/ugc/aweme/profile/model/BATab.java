package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class BATab implements Serializable {

    @InterfaceC65349Pkn("show_biz_page_tab")
    public Boolean showBATab;

    /* JADX WARN: Multi-variable type inference failed */
    public BATab() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Boolean getShowBATab() {
        return this.showBATab;
    }

    public BATab(Boolean bool) {
        this.showBATab = bool;
    }

    public final void setShowBATab(Boolean bool) {
        this.showBATab = bool;
    }

    public /* synthetic */ BATab(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
