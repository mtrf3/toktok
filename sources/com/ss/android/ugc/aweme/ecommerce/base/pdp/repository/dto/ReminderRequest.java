package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.RV1;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReminderRequest implements Parcelable {
    public static final Parcelable.Creator<ReminderRequest> CREATOR = new RV1();

    @InterfaceC65349Pkn("activity_code")
    public final String activityCode;

    @InterfaceC65349Pkn("item_list")
    public final List<ReminderItem> images;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReminderRequest)) {
            return false;
        }
        ReminderRequest reminderRequest = (ReminderRequest) obj;
        return o.LJ(this.activityCode, reminderRequest.activityCode) && o.LJ(this.images, reminderRequest.images);
    }

    public final int hashCode() {
        String str = this.activityCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ReminderItem> list = this.images;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReminderRequest(activityCode=");
        LIZ.append(this.activityCode);
        LIZ.append(", images=");
        return C1NE.LIZIZ(LIZ, this.images, ')', LIZ);
    }

    public ReminderRequest(String str, List<ReminderItem> list) {
        this.activityCode = str;
        this.images = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.activityCode);
        List<ReminderItem> list = this.images;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((ReminderItem) LIZIZ.next()).writeToParcel(out, i);
        }
    }

    public /* synthetic */ ReminderRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, list);
    }
}
