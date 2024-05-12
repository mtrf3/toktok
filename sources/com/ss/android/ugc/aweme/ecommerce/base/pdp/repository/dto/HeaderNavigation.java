package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RXF;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class HeaderNavigation implements Parcelable {
    public static final Parcelable.Creator<HeaderNavigation> CREATOR = new RXF();

    @InterfaceC65349Pkn("header_nav_buttons")
    public final List<NavButton> headerNavButtons;

    @InterfaceC65349Pkn("more_buttons")
    public final List<NavButton> moreButtons;

    /* JADX WARN: Multi-variable type inference failed */
    public HeaderNavigation() {
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
        if (!(obj instanceof HeaderNavigation)) {
            return false;
        }
        HeaderNavigation headerNavigation = (HeaderNavigation) obj;
        return o.LJ(this.headerNavButtons, headerNavigation.headerNavButtons) && o.LJ(this.moreButtons, headerNavigation.moreButtons);
    }

    public final int hashCode() {
        List<NavButton> list = this.headerNavButtons;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NavButton> list2 = this.moreButtons;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HeaderNavigation(headerNavButtons=");
        LIZ.append(this.headerNavButtons);
        LIZ.append(", moreButtons=");
        return C1NE.LIZIZ(LIZ, this.moreButtons, ')', LIZ);
    }

    public HeaderNavigation(List<NavButton> list, List<NavButton> list2) {
        this.headerNavButtons = list;
        this.moreButtons = list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        List<NavButton> list = this.headerNavButtons;
        if (list == null) {
            out.writeInt(0);
        } else {
            Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
            while (LIZIZ.hasNext()) {
                ((NavButton) LIZIZ.next()).writeToParcel(out, i);
            }
        }
        List<NavButton> list2 = this.moreButtons;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ2 = C279017q.LIZIZ(out, 1, list2);
        while (LIZIZ2.hasNext()) {
            ((NavButton) LIZIZ2.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ HeaderNavigation(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
