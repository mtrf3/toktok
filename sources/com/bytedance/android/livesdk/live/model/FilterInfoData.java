package com.bytedance.android.livesdk.live.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FilterInfoData {

    @InterfaceC65349Pkn("is_filtered")
    public boolean isFiltered;

    @InterfaceC65349Pkn("reason")
    public String reason;

    /* JADX WARN: Multi-variable type inference failed */
    public FilterInfoData() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public FilterInfoData(boolean z, String str) {
        this.isFiltered = z;
        this.reason = str;
    }

    public /* synthetic */ FilterInfoData(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }
}
