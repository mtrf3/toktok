package com.bytedance.android.live.broadcast.api.blockword.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BlockWordAddResponse {

    @InterfaceC65349Pkn("id")
    public final Integer id;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BlockWordAddResponse) && o.LJ(this.id, ((BlockWordAddResponse) obj).id);
    }

    public final int hashCode() {
        Integer num = this.id;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlockWordAddResponse(id=");
        return s0.LIZJ(LIZ, this.id, ')', LIZ);
    }

    public BlockWordAddResponse(Integer num) {
        this.id = num;
    }
}
