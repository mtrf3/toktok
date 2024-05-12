package com.ss.android.ugc.aweme.mix.model;

import X.InterfaceC65349Pkn;
import X.M8O;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class MixStatusStruct implements Serializable {
    public static final M8O Companion = new M8O();

    @InterfaceC65349Pkn("status")
    public int status;

    public MixStatusStruct() {
    }

    public final int getStatus() {
        return this.status;
    }

    public MixStatusStruct(int i) {
        this.status = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
