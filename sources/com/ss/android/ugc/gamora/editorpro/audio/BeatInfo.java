package com.ss.android.ugc.gamora.editorpro.audio;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public final class BeatInfo extends F9E {

    @InterfaceC65349Pkn("time")
    public final int timestampInMS;

    @InterfaceC65349Pkn("value")
    public final int value;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.timestampInMS), Integer.valueOf(this.value)};
    }

    public BeatInfo(int i, int i2) {
        this.timestampInMS = i;
        this.value = i2;
    }
}
