package com.ss.android.ugc.aweme.audio.copyrightdetect;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AutoCheckRequest {

    @InterfaceC65349Pkn("type")
    public final int type;

    @InterfaceC65349Pkn("value_int32")
    public final Integer value_int32;

    public static /* synthetic */ AutoCheckRequest copy$default(AutoCheckRequest autoCheckRequest, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = autoCheckRequest.type;
        }
        if ((i2 & 2) != 0) {
            num = autoCheckRequest.value_int32;
        }
        return autoCheckRequest.copy(i, num);
    }

    public final AutoCheckRequest copy(int i, Integer num) {
        return new AutoCheckRequest(i, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCheckRequest)) {
            return false;
        }
        AutoCheckRequest autoCheckRequest = (AutoCheckRequest) obj;
        return this.type == autoCheckRequest.type && o.LJ(this.value_int32, autoCheckRequest.value_int32);
    }

    public int hashCode() {
        int i = this.type * 31;
        Integer num = this.value_int32;
        return i + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCheckRequest(type=");
        LIZ.append(this.type);
        LIZ.append(", value_int32=");
        return s0.LIZJ(LIZ, this.value_int32, ')', LIZ);
    }

    public final int getType() {
        return this.type;
    }

    public final Integer getValue_int32() {
        return this.value_int32;
    }

    public AutoCheckRequest(int i, Integer num) {
        this.type = i;
        this.value_int32 = num;
    }

    public /* synthetic */ AutoCheckRequest(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, num);
    }
}
