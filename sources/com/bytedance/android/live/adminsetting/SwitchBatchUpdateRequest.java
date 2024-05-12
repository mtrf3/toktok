package com.bytedance.android.live.adminsetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SwitchBatchUpdateRequest extends F9E {

    @InterfaceC65349Pkn("switch_value_list")
    public final List<SwitchValue> modifications;

    @InterfaceC65349Pkn("room_id")
    public final long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.roomId), this.modifications};
    }

    public SwitchBatchUpdateRequest(long j, List<SwitchValue> modifications) {
        o.LJIIIZ(modifications, "modifications");
        this.roomId = j;
        this.modifications = modifications;
    }
}
