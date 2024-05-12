package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C57094Maw;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeFilterModel implements Parcelable {
    public static final Parcelable.Creator<NoticeFilterModel> CREATOR = new C57094Maw();

    @InterfaceC65349Pkn("option_id")
    public final int filterId;

    @InterfaceC65349Pkn("option_text")
    public final String filterName;

    @InterfaceC65349Pkn("tracking_text")
    public final String trackingName;

    public static /* synthetic */ NoticeFilterModel copy$default(NoticeFilterModel noticeFilterModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = noticeFilterModel.filterId;
        }
        if ((i2 & 2) != 0) {
            str = noticeFilterModel.filterName;
        }
        if ((i2 & 4) != 0) {
            str2 = noticeFilterModel.trackingName;
        }
        return noticeFilterModel.copy(i, str, str2);
    }

    public final NoticeFilterModel copy(int i, String str, String str2) {
        return new NoticeFilterModel(i, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeFilterModel)) {
            return false;
        }
        NoticeFilterModel noticeFilterModel = (NoticeFilterModel) obj;
        return this.filterId == noticeFilterModel.filterId && o.LJ(this.filterName, noticeFilterModel.filterName) && o.LJ(this.trackingName, noticeFilterModel.trackingName);
    }

    public int hashCode() {
        int i = this.filterId * 31;
        String str = this.filterName;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.filterId);
        out.writeString(this.filterName);
        out.writeString(this.trackingName);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeFilterModel(filterId=");
        LIZ.append(this.filterId);
        LIZ.append(", filterName=");
        LIZ.append(this.filterName);
        LIZ.append(", trackingName=");
        return q.LIZIZ(LIZ, this.trackingName, ')', LIZ);
    }

    public NoticeFilterModel(int i, String str, String str2) {
        this.filterId = i;
        this.filterName = str;
        this.trackingName = str2;
    }

    public /* synthetic */ NoticeFilterModel(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2);
    }
}
