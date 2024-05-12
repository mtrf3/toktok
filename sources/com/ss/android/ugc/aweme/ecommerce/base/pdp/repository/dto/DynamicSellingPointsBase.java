package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RW0;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class DynamicSellingPointsBase implements Parcelable {
    public static final Parcelable.Creator<DynamicSellingPointsBase> CREATOR = new RW0();

    @InterfaceC65349Pkn("dynamic_selling_points")
    public final List<DynamicSellingPoint> dynamicSellingPoints;

    @InterfaceC65349Pkn("start_to_show_time")
    public final Integer startToShowTime;

    @InterfaceC65349Pkn("stay_time")
    public final Integer stayTime;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSellingPointsBase)) {
            return false;
        }
        DynamicSellingPointsBase dynamicSellingPointsBase = (DynamicSellingPointsBase) obj;
        return o.LJ(this.dynamicSellingPoints, dynamicSellingPointsBase.dynamicSellingPoints) && o.LJ(this.startToShowTime, dynamicSellingPointsBase.startToShowTime) && o.LJ(this.stayTime, dynamicSellingPointsBase.stayTime);
    }

    public final int hashCode() {
        List<DynamicSellingPoint> list = this.dynamicSellingPoints;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.startToShowTime;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.stayTime;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSellingPointsBase(dynamicSellingPoints=");
        LIZ.append(this.dynamicSellingPoints);
        LIZ.append(", startToShowTime=");
        LIZ.append(this.startToShowTime);
        LIZ.append(", stayTime=");
        return s0.LIZJ(LIZ, this.stayTime, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<DynamicSellingPoint> list = this.dynamicSellingPoints;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((DynamicSellingPoint) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        Integer num = this.startToShowTime;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.stayTime;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public DynamicSellingPointsBase(List<DynamicSellingPoint> list, Integer num, Integer num2) {
        this.dynamicSellingPoints = list;
        this.startToShowTime = num;
        this.stayTime = num2;
    }
}
