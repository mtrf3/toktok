package com.ss.android.ugc.aweme.live.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.Extra;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreloadRoomExtra extends Extra {

    @InterfaceC65349Pkn("reason")
    public String reason;

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadRoomExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PreloadRoomExtra) && o.LJ(this.reason, ((PreloadRoomExtra) obj).reason);
    }

    public final int hashCode() {
        String str = this.reason;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadRoomExtra(reason=");
        return q.LIZIZ(LIZ, this.reason, ')', LIZ);
    }

    public PreloadRoomExtra(String str) {
        this.reason = str;
    }

    public /* synthetic */ PreloadRoomExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
