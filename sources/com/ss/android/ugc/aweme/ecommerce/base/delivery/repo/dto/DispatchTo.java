package com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto;

import X.C26765Aev;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.Icon;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class DispatchTo implements Parcelable {
    public static final Parcelable.Creator<DispatchTo> CREATOR = new C26765Aev();

    @InterfaceC65349Pkn("icon_to")
    public final Icon iconTo;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchTo() {
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
        if (!(obj instanceof DispatchTo)) {
            return false;
        }
        DispatchTo dispatchTo = (DispatchTo) obj;
        return o.LJ(this.iconTo, dispatchTo.iconTo) && o.LJ(this.title, dispatchTo.title);
    }

    public final int hashCode() {
        Icon icon = this.iconTo;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Icon icon = this.iconTo;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.title);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DispatchTo(iconTo=");
        LIZ.append(this.iconTo);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.title, ')', LIZ);
    }

    public DispatchTo(Icon icon, String str) {
        this.iconTo = icon;
        this.title = str;
    }

    public /* synthetic */ DispatchTo(Icon icon, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : icon, (i & 2) != 0 ? null : str);
    }
}
