package com.ss.android.ugc.aweme.shortvideo.beauty;

import X.F9E;
import X.HBV;
import X.HKW;
import X.HKX;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BeautifySegmentInfo extends F9E implements Parcelable, Serializable {

    @InterfaceC65349Pkn("is_beautify")
    public boolean isBeautify;

    @InterfaceC65349Pkn("shoot_beautify_category")
    public String mobShootBeautifyCategory;

    @InterfaceC65349Pkn("shoot_beautify_name")
    public String mobShootBeautifyName;

    @InterfaceC65349Pkn("shoot_beautify_value")
    public String mobShootBeautifyValue;

    @InterfaceC65349Pkn("shoot_body_shape_name_list")
    public String mobShootBodyShapeNameList;

    @InterfaceC65349Pkn("shoot_body_shape_value_list")
    public String mobShootBodyShapeValueList;

    @InterfaceC65349Pkn("shoot_makeup_name")
    public String mobShootMakeupName;

    @InterfaceC65349Pkn("shoot_makeup_value")
    public String mobShootMakeupValue;
    public static final HKX Companion = new HKX();
    public static final Parcelable.Creator<BeautifySegmentInfo> CREATOR = new HKW();

    /* JADX WARN: Multi-variable type inference failed */
    public BeautifySegmentInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 255, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeautifySegmentInfo copy$default(BeautifySegmentInfo beautifySegmentInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautifySegmentInfo.mobShootBeautifyName;
        }
        if ((i & 2) != 0) {
            str2 = beautifySegmentInfo.mobShootBeautifyValue;
        }
        if ((i & 4) != 0) {
            str3 = beautifySegmentInfo.mobShootBeautifyCategory;
        }
        if ((i & 8) != 0) {
            str4 = beautifySegmentInfo.mobShootMakeupName;
        }
        if ((i & 16) != 0) {
            str5 = beautifySegmentInfo.mobShootMakeupValue;
        }
        if ((i & 32) != 0) {
            str6 = beautifySegmentInfo.mobShootBodyShapeNameList;
        }
        if ((i & 64) != 0) {
            str7 = beautifySegmentInfo.mobShootBodyShapeValueList;
        }
        if ((i & 128) != 0) {
            z = beautifySegmentInfo.isBeautify;
        }
        return beautifySegmentInfo.copy(str, str2, str3, str4, str5, str6, str7, z);
    }

    public final BeautifySegmentInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        return new BeautifySegmentInfo(str, str2, str3, str4, str5, str6, str7, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.mobShootBeautifyName, this.mobShootBeautifyValue, this.mobShootBeautifyCategory, this.mobShootMakeupName, this.mobShootMakeupValue, this.mobShootBodyShapeNameList, this.mobShootBodyShapeValueList, Boolean.valueOf(this.isBeautify)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        o.LJIIIZ(parcel, "parcel");
        parcel.writeString(this.mobShootBeautifyName);
        parcel.writeString(this.mobShootBeautifyValue);
        parcel.writeString(this.mobShootBeautifyCategory);
        parcel.writeString(this.mobShootMakeupName);
        parcel.writeString(this.mobShootMakeupValue);
        parcel.writeString(this.mobShootBodyShapeNameList);
        parcel.writeString(this.mobShootBodyShapeValueList);
        parcel.writeInt(this.isBeautify ? 1 : 0);
    }

    public final String getMobShootBeautifyCategory() {
        return this.mobShootBeautifyCategory;
    }

    public final String getMobShootBeautifyName() {
        return this.mobShootBeautifyName;
    }

    public final String getMobShootBeautifyValue() {
        return this.mobShootBeautifyValue;
    }

    public final String getMobShootBodyShapeNameList() {
        return this.mobShootBodyShapeNameList;
    }

    public final String getMobShootBodyShapeValueList() {
        return this.mobShootBodyShapeValueList;
    }

    public final String getMobShootMakeupName() {
        return this.mobShootMakeupName;
    }

    public final String getMobShootMakeupValue() {
        return this.mobShootMakeupValue;
    }

    public final boolean isBeautify() {
        return this.isBeautify;
    }

    public static final void register(HBV mapping) {
        Companion.getClass();
        o.LJIIIZ(mapping, "mapping");
        mapping.LIZ(BeautifySegmentInfo.class, "beauty_segment_info");
    }

    public final void setBeautify(boolean z) {
        this.isBeautify = z;
    }

    public final void setMobShootBeautifyCategory(String str) {
        this.mobShootBeautifyCategory = str;
    }

    public final void setMobShootBeautifyName(String str) {
        this.mobShootBeautifyName = str;
    }

    public final void setMobShootBeautifyValue(String str) {
        this.mobShootBeautifyValue = str;
    }

    public final void setMobShootBodyShapeNameList(String str) {
        this.mobShootBodyShapeNameList = str;
    }

    public final void setMobShootBodyShapeValueList(String str) {
        this.mobShootBodyShapeValueList = str;
    }

    public final void setMobShootMakeupName(String str) {
        this.mobShootMakeupName = str;
    }

    public final void setMobShootMakeupValue(String str) {
        this.mobShootMakeupValue = str;
    }

    public BeautifySegmentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.mobShootBeautifyName = str;
        this.mobShootBeautifyValue = str2;
        this.mobShootBeautifyCategory = str3;
        this.mobShootMakeupName = str4;
        this.mobShootMakeupValue = str5;
        this.mobShootBodyShapeNameList = str6;
        this.mobShootBodyShapeValueList = str7;
        this.isBeautify = z;
    }

    public /* synthetic */ BeautifySegmentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? false : z);
    }
}
