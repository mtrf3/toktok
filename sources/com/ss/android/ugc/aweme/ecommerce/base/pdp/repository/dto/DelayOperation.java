package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.C48303IxX;
import X.C48304IxY;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DelayOperation implements Parcelable {

    @InterfaceC65349Pkn("after_second")
    public final Long afterSecond;

    @InterfaceC65349Pkn("need_interact")
    public final Boolean needInteract;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final Integer scene;
    public static final C48304IxY DelayScene = new C48304IxY();
    public static final Parcelable.Creator<DelayOperation> CREATOR = new C48303IxX();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DelayOperation)) {
            return false;
        }
        DelayOperation delayOperation = (DelayOperation) obj;
        return o.LJ(this.scene, delayOperation.scene) && o.LJ(this.afterSecond, delayOperation.afterSecond) && o.LJ(this.needInteract, delayOperation.needInteract);
    }

    public final int hashCode() {
        Integer num = this.scene;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.afterSecond;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.needInteract;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DelayOperation(scene=");
        LIZ.append(this.scene);
        LIZ.append(", afterSecond=");
        LIZ.append(this.afterSecond);
        LIZ.append(", needInteract=");
        return C78920UyC.LIZIZ(LIZ, this.needInteract, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.scene;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Long l = this.afterSecond;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Boolean bool = this.needInteract;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }

    public DelayOperation(Integer num, Long l, Boolean bool) {
        this.scene = num;
        this.afterSecond = l;
        this.needInteract = bool;
    }
}
