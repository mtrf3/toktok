package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TTSeller implements Serializable {

    @InterfaceC65349Pkn("is_allow_list_seller")
    public final boolean isAllowListSeller;

    @InterfaceC65349Pkn("seller_account_type")
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public TTSeller() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isAllowListSeller() {
        return this.isAllowListSeller;
    }

    public TTSeller(int i, boolean z) {
        this.type = i;
        this.isAllowListSeller = z;
    }

    public /* synthetic */ TTSeller(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }
}
