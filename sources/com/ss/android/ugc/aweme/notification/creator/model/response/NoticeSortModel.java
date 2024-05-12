package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.C57095Max;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeSortModel implements Parcelable {
    public static final Parcelable.Creator<NoticeSortModel> CREATOR = new C57095Max();

    @InterfaceC65349Pkn("option_id")
    public final int sortId;

    @InterfaceC65349Pkn("option_text")
    public final String sortName;

    @InterfaceC65349Pkn("tracking_text")
    public final String trackingName;

    public static /* synthetic */ NoticeSortModel copy$default(NoticeSortModel noticeSortModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = noticeSortModel.sortId;
        }
        if ((i2 & 2) != 0) {
            str = noticeSortModel.sortName;
        }
        if ((i2 & 4) != 0) {
            str2 = noticeSortModel.trackingName;
        }
        return noticeSortModel.copy(i, str, str2);
    }

    public final NoticeSortModel copy(int i, String str, String str2) {
        return new NoticeSortModel(i, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeSortModel)) {
            return false;
        }
        NoticeSortModel noticeSortModel = (NoticeSortModel) obj;
        return this.sortId == noticeSortModel.sortId && o.LJ(this.sortName, noticeSortModel.sortName) && o.LJ(this.trackingName, noticeSortModel.trackingName);
    }

    public int hashCode() {
        int i = this.sortId * 31;
        String str = this.sortName;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.trackingName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.sortId);
        out.writeString(this.sortName);
        out.writeString(this.trackingName);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeSortModel(sortId=");
        LIZ.append(this.sortId);
        LIZ.append(", sortName=");
        LIZ.append(this.sortName);
        LIZ.append(", trackingName=");
        return q.LIZIZ(LIZ, this.trackingName, ')', LIZ);
    }

    public NoticeSortModel(int i, String str, String str2) {
        this.sortId = i;
        this.sortName = str;
        this.trackingName = str2;
    }

    public /* synthetic */ NoticeSortModel(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2);
    }
}
