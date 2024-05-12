package com.ss.android.ugc.aweme.creative.model;

import X.C78920UyC;
import X.HCN;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class InitialMobParams implements Parcelable {
    public static final Parcelable.Creator<InitialMobParams> CREATOR = new HCN();

    @InterfaceC65349Pkn("enter_type")
    public final String enterType;

    @InterfaceC65349Pkn("is_upload_direct_enter")
    public Boolean isUploadDirectEnter;

    /* JADX WARN: Multi-variable type inference failed */
    public InitialMobParams() {
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
        if (!(obj instanceof InitialMobParams)) {
            return false;
        }
        InitialMobParams initialMobParams = (InitialMobParams) obj;
        return o.LJ(this.enterType, initialMobParams.enterType) && o.LJ(this.isUploadDirectEnter, initialMobParams.isUploadDirectEnter);
    }

    public final int hashCode() {
        String str = this.enterType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isUploadDirectEnter;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int i2;
        o.LJIIIZ(out, "out");
        out.writeString(this.enterType);
        Boolean bool = this.isUploadDirectEnter;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InitialMobParams(enterType=");
        LIZ.append(this.enterType);
        LIZ.append(", isUploadDirectEnter=");
        return C78920UyC.LIZIZ(LIZ, this.isUploadDirectEnter, ')', LIZ);
    }

    public InitialMobParams(String str, Boolean bool) {
        this.enterType = str;
        this.isUploadDirectEnter = bool;
    }

    public /* synthetic */ InitialMobParams(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
    }
}
