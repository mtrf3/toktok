package com.bytedance.android.live.effect.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class ModificationUploadRequest extends F9E {

    @InterfaceC65349Pkn("modifications")
    public List<Modification> modifications;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roomId), this.modifications};
    }

    public ModificationUploadRequest(long j, List<Modification> modifications) {
        o.LJIIIZ(modifications, "modifications");
        this.roomId = j;
        this.modifications = modifications;
    }
}
