package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C1NE;
import X.C27629Asr;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AdditionInfo implements Parcelable {
    public static final Parcelable.Creator<AdditionInfo> CREATOR = new C27629Asr();

    @InterfaceC65349Pkn("info_items")
    public final List<AdditionalInfoItem> items;

    @InterfaceC65349Pkn("info_title")
    public final String title;

    @InterfaceC65349Pkn("type")
    public final Integer type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionInfo)) {
            return false;
        }
        AdditionInfo additionInfo = (AdditionInfo) obj;
        return o.LJ(this.type, additionInfo.type) && o.LJ(this.title, additionInfo.title) && o.LJ(this.items, additionInfo.items);
    }

    public final int hashCode() {
        Integer num = this.type;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<AdditionalInfoItem> list = this.items;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdditionInfo(type=");
        LIZ.append(this.type);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", items=");
        return C1NE.LIZIZ(LIZ, this.items, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.type;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.title);
        List<AdditionalInfoItem> list = this.items;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((AdditionalInfoItem) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public AdditionInfo(Integer num, String str, List<AdditionalInfoItem> list) {
        this.type = num;
        this.title = str;
        this.items = list;
    }
}
