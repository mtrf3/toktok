package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27641At3;
import X.C27642At4;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class BrickInfo implements Parcelable {

    @InterfaceC65349Pkn("brick_biz_data")
    public final String brickBizData;

    @InterfaceC65349Pkn("brick_biz_extra")
    public final String brickBizExtra;

    @InterfaceC65349Pkn("brick_lynx_schema")
    public final String brickLynxSchema;

    @InterfaceC65349Pkn("brick_name")
    public final int brickName;

    @InterfaceC65349Pkn("brick_option")
    public final Integer brickOption;

    @InterfaceC65349Pkn("brick_style")
    public final BrickStyle brickStyle;

    @InterfaceC65349Pkn("brick_type")
    public final Integer brickType;

    @InterfaceC65349Pkn("brick_version")
    public final String brickVersion;
    public static final C27642At4 Companion = new C27642At4();
    public static final Parcelable.Creator<BrickInfo> CREATOR = new C27641At3();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrickInfo)) {
            return false;
        }
        BrickInfo brickInfo = (BrickInfo) obj;
        return o.LJ(this.brickBizData, brickInfo.brickBizData) && o.LJ(this.brickBizExtra, brickInfo.brickBizExtra) && o.LJ(this.brickLynxSchema, brickInfo.brickLynxSchema) && this.brickName == brickInfo.brickName && o.LJ(this.brickOption, brickInfo.brickOption) && o.LJ(this.brickType, brickInfo.brickType) && o.LJ(this.brickVersion, brickInfo.brickVersion) && o.LJ(this.brickStyle, brickInfo.brickStyle);
    }

    public final int hashCode() {
        String str = this.brickBizData;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brickBizExtra;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.brickLynxSchema;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.brickName) * 31;
        Integer num = this.brickOption;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.brickType;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.brickVersion;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BrickStyle brickStyle = this.brickStyle;
        return hashCode6 + (brickStyle != null ? brickStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BrickInfo(brickBizData=");
        LIZ.append(this.brickBizData);
        LIZ.append(", brickBizExtra=");
        LIZ.append(this.brickBizExtra);
        LIZ.append(", brickLynxSchema=");
        LIZ.append(this.brickLynxSchema);
        LIZ.append(", brickName=");
        LIZ.append(this.brickName);
        LIZ.append(", brickOption=");
        LIZ.append(this.brickOption);
        LIZ.append(", brickType=");
        LIZ.append(this.brickType);
        LIZ.append(", brickVersion=");
        LIZ.append(this.brickVersion);
        LIZ.append(", brickStyle=");
        LIZ.append(this.brickStyle);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.brickBizData);
        out.writeString(this.brickBizExtra);
        out.writeString(this.brickLynxSchema);
        out.writeInt(this.brickName);
        Integer num = this.brickOption;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Integer num2 = this.brickType;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        out.writeString(this.brickVersion);
        BrickStyle brickStyle = this.brickStyle;
        if (brickStyle == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            brickStyle.writeToParcel(out, i);
        }
    }

    public BrickInfo(String str, String str2, String str3, int i, Integer num, Integer num2, String str4, BrickStyle brickStyle) {
        this.brickBizData = str;
        this.brickBizExtra = str2;
        this.brickLynxSchema = str3;
        this.brickName = i;
        this.brickOption = num;
        this.brickType = num2;
        this.brickVersion = str4;
        this.brickStyle = brickStyle;
    }
}
