package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MicPositionData extends F9E {

    @InterfaceC65349Pkn("link")
    public LinkPosition linkPosition;

    @InterfaceC65349Pkn("type")
    public int type;

    /* JADX WARN: Multi-variable type inference failed */
    public MicPositionData() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type), this.linkPosition};
    }

    public MicPositionData(int i, LinkPosition linkPosition) {
        this.type = i;
        this.linkPosition = linkPosition;
    }

    public /* synthetic */ MicPositionData(int i, LinkPosition linkPosition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : linkPosition);
    }
}
