package com.bytedance.android.livesdk.sei;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LiveSeiMuteMic extends F9E {

    @InterfaceC65349Pkn("is_mute_mic")
    public int isMuteMic;

    public LiveSeiMuteMic() {
        this(0, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.isMuteMic)};
    }

    public LiveSeiMuteMic(int i) {
        this.isMuteMic = i;
    }

    public /* synthetic */ LiveSeiMuteMic(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
