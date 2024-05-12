package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECSearchLivePdpAccurateModel {

    @InterfaceC65349Pkn("duration")
    public final Integer duration;

    @InterfaceC65349Pkn("enable")
    public final int enable;

    /* JADX WARN: Multi-variable type inference failed */
    public ECSearchLivePdpAccurateModel() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECSearchLivePdpAccurateModel)) {
            return false;
        }
        ECSearchLivePdpAccurateModel eCSearchLivePdpAccurateModel = (ECSearchLivePdpAccurateModel) obj;
        return this.enable == eCSearchLivePdpAccurateModel.enable && o.LJ(this.duration, eCSearchLivePdpAccurateModel.duration);
    }

    public final int hashCode() {
        int i = this.enable * 31;
        Integer num = this.duration;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSearchLivePdpAccurateModel(enable=");
        LIZ.append(this.enable);
        LIZ.append(", duration=");
        return s0.LIZJ(LIZ, this.duration, ')', LIZ);
    }

    public ECSearchLivePdpAccurateModel(int i, Integer num) {
        this.enable = i;
        this.duration = num;
    }

    public /* synthetic */ ECSearchLivePdpAccurateModel(int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : num);
    }
}
