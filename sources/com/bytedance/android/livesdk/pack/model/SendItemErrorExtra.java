package com.bytedance.android.livesdk.pack.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Extra;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SendItemErrorExtra extends Extra {

    @InterfaceC65349Pkn("need_reload")
    public Boolean needReload;

    /* JADX WARN: Multi-variable type inference failed */
    public SendItemErrorExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public SendItemErrorExtra(Boolean bool) {
        this.needReload = bool;
    }

    public /* synthetic */ SendItemErrorExtra(Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool);
    }
}
