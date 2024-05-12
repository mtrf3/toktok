package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69593RSz;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundleBrief implements Parcelable {
    public static final Parcelable.Creator<BundleBrief> CREATOR = new C69593RSz();

    @InterfaceC65349Pkn("bundle_id_list")
    public final List<String> bundleIdList;

    @InterfaceC65349Pkn("position")
    public final Integer position;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundleBrief)) {
            return false;
        }
        BundleBrief bundleBrief = (BundleBrief) obj;
        return o.LJ(this.bundleIdList, bundleBrief.bundleIdList) && o.LJ(this.position, bundleBrief.position);
    }

    public final int hashCode() {
        List<String> list = this.bundleIdList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.position;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeStringList(this.bundleIdList);
        Integer num = this.position;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundleBrief(bundleIdList=");
        LIZ.append(this.bundleIdList);
        LIZ.append(", position=");
        return s0.LIZJ(LIZ, this.position, ')', LIZ);
    }

    public BundleBrief(List<String> list, Integer num) {
        this.bundleIdList = list;
        this.position = num;
    }
}
