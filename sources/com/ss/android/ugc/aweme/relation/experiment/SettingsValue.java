package com.ss.android.ugc.aweme.relation.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SettingsValue {

    @InterfaceC65349Pkn("android_block_channels")
    public final List<String> blockChannelKeys;

    /* JADX WARN: Multi-variable type inference failed */
    public SettingsValue() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SettingsValue) && o.LJ(this.blockChannelKeys, ((SettingsValue) obj).blockChannelKeys);
    }

    public final int hashCode() {
        List<String> list = this.blockChannelKeys;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingsValue(blockChannelKeys=");
        return C1NE.LIZIZ(LIZ, this.blockChannelKeys, ')', LIZ);
    }

    public SettingsValue(List<String> list) {
        this.blockChannelKeys = list;
    }

    public /* synthetic */ SettingsValue(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
