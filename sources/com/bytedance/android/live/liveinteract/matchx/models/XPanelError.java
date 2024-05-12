package com.bytedance.android.live.liveinteract.matchx.models;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class XPanelError extends F9E {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("description")
    public final String description;

    /* JADX WARN: Multi-variable type inference failed */
    public XPanelError() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.description, Integer.valueOf(this.code)};
    }

    public XPanelError(String description, int i) {
        o.LJIIIZ(description, "description");
        this.description = description;
        this.code = i;
    }

    public /* synthetic */ XPanelError(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
