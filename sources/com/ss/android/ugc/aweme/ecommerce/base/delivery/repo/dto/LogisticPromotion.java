package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C1NE;
import X.C27064Ajk;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LogisticPromotion implements Parcelable {
    public static final Parcelable.Creator<LogisticPromotion> CREATOR = new C27064Ajk();

    @InterfaceC65349Pkn("items")
    public final List<LogisticItem> items;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LogisticPromotion) && o.LJ(this.items, ((LogisticPromotion) obj).items);
    }

    public final int hashCode() {
        List<LogisticItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogisticPromotion(items=");
        return C1NE.LIZIZ(LIZ, this.items, ')', LIZ);
    }

    public LogisticPromotion(List<LogisticItem> list) {
        this.items = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<LogisticItem> list = this.items;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((LogisticItem) LIZIZ.next()).writeToParcel(out, i);
        }
    }
}
