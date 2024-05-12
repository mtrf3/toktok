package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C27279AnD;
import X.C27305And;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MapLocateEvent implements Parcelable {

    @InterfaceC65349Pkn("errorCode")
    public final String errorCode;

    @InterfaceC65349Pkn("locateMsg")
    public final Integer locateMsg;

    @InterfaceC65349Pkn("locateStatus")
    public final int locateStatus;
    public static final C27305And Companion = new C27305And();
    public static final Parcelable.Creator<MapLocateEvent> CREATOR = new C27279AnD();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLocateEvent)) {
            return false;
        }
        MapLocateEvent mapLocateEvent = (MapLocateEvent) obj;
        return this.locateStatus == mapLocateEvent.locateStatus && o.LJ(this.locateMsg, mapLocateEvent.locateMsg) && o.LJ(this.errorCode, mapLocateEvent.errorCode);
    }

    public final int hashCode() {
        int i = this.locateStatus * 31;
        Integer num = this.locateMsg;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.errorCode;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeInt(this.locateStatus);
        Integer num = this.locateMsg;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.errorCode);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MapLocateEvent(locateStatus=");
        LIZ.append(this.locateStatus);
        LIZ.append(", locateMsg=");
        LIZ.append(this.locateMsg);
        LIZ.append(", errorCode=");
        return q.LIZIZ(LIZ, this.errorCode, ')', LIZ);
    }

    public MapLocateEvent(int i, Integer num, String str) {
        this.locateStatus = i;
        this.locateMsg = num;
        this.errorCode = str;
    }
}
