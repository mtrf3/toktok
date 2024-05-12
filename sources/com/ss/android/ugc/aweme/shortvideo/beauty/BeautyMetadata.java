package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.C43149Gwb;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BeautyMetadata implements Serializable, Parcelable {
    public static final C43149Gwb CREATOR = new C43149Gwb();

    @InterfaceC65349Pkn("te_record_beauty_id")
    public String beautyId;

    @InterfaceC65349Pkn("te_record_beauty_name")
    public String beautyName;

    @InterfaceC65349Pkn("te_record_beauty_res")
    public String beautyRes;

    @InterfaceC65349Pkn("te_record_beauty_strength")
    public String beautyStrength;

    @InterfaceC65349Pkn("te_record_beauty_res_valid")
    public String beautyValid;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BeautyMetadata() {
        this.beautyName = "";
        this.beautyStrength = "";
        this.beautyId = "";
        this.beautyRes = "";
        this.beautyValid = "";
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BeautyMetadata:id=");
        LIZ.append(this.beautyId);
        LIZ.append(",name=");
        LIZ.append(this.beautyName);
        LIZ.append(",strength=");
        LIZ.append(this.beautyStrength);
        LIZ.append(",res=");
        LIZ.append(this.beautyRes);
        LIZ.append(",valid=");
        LIZ.append(this.beautyValid);
        return X1D.LIZIZ(LIZ);
    }

    public final String getBeautyId() {
        return this.beautyId;
    }

    public final String getBeautyName() {
        return this.beautyName;
    }

    public final String getBeautyRes() {
        return this.beautyRes;
    }

    public final String getBeautyStrength() {
        return this.beautyStrength;
    }

    public final String getBeautyValid() {
        return this.beautyValid;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BeautyMetadata(Parcel parcel) {
        this();
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        this.beautyName = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        this.beautyStrength = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        this.beautyId = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        this.beautyRes = readString4 == null ? "" : readString4;
        String readString5 = parcel.readString();
        this.beautyValid = readString5 != null ? readString5 : "";
    }

    public final void setBeautyId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.beautyId = str;
    }

    public final void setBeautyName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.beautyName = str;
    }

    public final void setBeautyRes(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.beautyRes = str;
    }

    public final void setBeautyStrength(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.beautyStrength = str;
    }

    public final void setBeautyValid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.beautyValid = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i) {
        o.LJIIIZ(dest, "dest");
        dest.writeString(this.beautyName);
        dest.writeString(this.beautyStrength);
        dest.writeString(this.beautyId);
        dest.writeString(this.beautyRes);
        dest.writeString(this.beautyValid);
    }
}
