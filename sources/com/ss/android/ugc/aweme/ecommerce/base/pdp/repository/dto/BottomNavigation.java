package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RXE;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BottomNavigation implements Parcelable {
    public static final Parcelable.Creator<BottomNavigation> CREATOR = new RXE();

    @InterfaceC65349Pkn("checkout_hint")
    public final String checkOutHint;

    @InterfaceC65349Pkn("bottom_nav_buttons")
    public final List<NavButton> items;

    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigation() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomNavigation)) {
            return false;
        }
        BottomNavigation bottomNavigation = (BottomNavigation) obj;
        return o.LJ(this.items, bottomNavigation.items) && o.LJ(this.checkOutHint, bottomNavigation.checkOutHint);
    }

    public final int hashCode() {
        List<NavButton> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.checkOutHint;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BottomNavigation(items=");
        LIZ.append(this.items);
        LIZ.append(", checkOutHint=");
        return q.LIZIZ(LIZ, this.checkOutHint, ')', LIZ);
    }

    public BottomNavigation(List<NavButton> list, String str) {
        this.items = list;
        this.checkOutHint = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<NavButton> list = this.items;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((NavButton) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        out.writeString(this.checkOutHint);
    }

    public /* synthetic */ BottomNavigation(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
