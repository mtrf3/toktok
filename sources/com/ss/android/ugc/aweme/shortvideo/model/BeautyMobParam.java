package com.ss.android.ugc.aweme.shortvideo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class BeautyMobParam extends F9E implements Parcelable, Serializable {
    public static final Parcelable.Creator<BeautyMobParam> CREATOR = new Creator();

    @InterfaceC65349Pkn("beautifyChildIdListStr")
    public final String beautifyChildIdListStr;

    @InterfaceC65349Pkn("beautifyChildNameListStr")
    public final String beautifyChildNameListStr;

    @InterfaceC65349Pkn("beautifyChildValueListStr")
    public final String beautifyChildValueListStr;

    @InterfaceC65349Pkn("beautifyParentIdListStr")
    public final String beautifyParentIdListStr;

    @InterfaceC65349Pkn("beautifyParentNameListStr")
    public final String beautifyParentNameListStr;

    @InterfaceC65349Pkn("beautifyParentValueListStr")
    public final String beautifyParentValueListStr;

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<BeautyMobParam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeautyMobParam createFromParcel(Parcel parcel) {
            o.LJIIIZ(parcel, "parcel");
            return new BeautyMobParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BeautyMobParam[] newArray(int i) {
            return new BeautyMobParam[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeautyMobParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BeautyMobParam copy$default(BeautyMobParam beautyMobParam, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = beautyMobParam.beautifyChildIdListStr;
        }
        if ((i & 2) != 0) {
            str2 = beautyMobParam.beautifyChildNameListStr;
        }
        if ((i & 4) != 0) {
            str3 = beautyMobParam.beautifyChildValueListStr;
        }
        if ((i & 8) != 0) {
            str4 = beautyMobParam.beautifyParentIdListStr;
        }
        if ((i & 16) != 0) {
            str5 = beautyMobParam.beautifyParentNameListStr;
        }
        if ((i & 32) != 0) {
            str6 = beautyMobParam.beautifyParentValueListStr;
        }
        return beautyMobParam.copy(str, str2, str3, str4, str5, str6);
    }

    public final BeautyMobParam copy(String beautifyChildIdListStr, String beautifyChildNameListStr, String beautifyChildValueListStr, String beautifyParentIdListStr, String beautifyParentNameListStr, String beautifyParentValueListStr) {
        o.LJIIIZ(beautifyChildIdListStr, "beautifyChildIdListStr");
        o.LJIIIZ(beautifyChildNameListStr, "beautifyChildNameListStr");
        o.LJIIIZ(beautifyChildValueListStr, "beautifyChildValueListStr");
        o.LJIIIZ(beautifyParentIdListStr, "beautifyParentIdListStr");
        o.LJIIIZ(beautifyParentNameListStr, "beautifyParentNameListStr");
        o.LJIIIZ(beautifyParentValueListStr, "beautifyParentValueListStr");
        return new BeautyMobParam(beautifyChildIdListStr, beautifyChildNameListStr, beautifyChildValueListStr, beautifyParentIdListStr, beautifyParentNameListStr, beautifyParentValueListStr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.beautifyChildIdListStr, this.beautifyChildNameListStr, this.beautifyChildValueListStr, this.beautifyParentIdListStr, this.beautifyParentNameListStr, this.beautifyParentValueListStr};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.beautifyChildIdListStr);
        out.writeString(this.beautifyChildNameListStr);
        out.writeString(this.beautifyChildValueListStr);
        out.writeString(this.beautifyParentIdListStr);
        out.writeString(this.beautifyParentNameListStr);
        out.writeString(this.beautifyParentValueListStr);
    }

    public final String getBeautifyChildIdListStr() {
        return this.beautifyChildIdListStr;
    }

    public final String getBeautifyChildNameListStr() {
        return this.beautifyChildNameListStr;
    }

    public final String getBeautifyChildValueListStr() {
        return this.beautifyChildValueListStr;
    }

    public final String getBeautifyParentIdListStr() {
        return this.beautifyParentIdListStr;
    }

    public final String getBeautifyParentNameListStr() {
        return this.beautifyParentNameListStr;
    }

    public final String getBeautifyParentValueListStr() {
        return this.beautifyParentValueListStr;
    }

    public BeautyMobParam(String beautifyChildIdListStr, String beautifyChildNameListStr, String beautifyChildValueListStr, String beautifyParentIdListStr, String beautifyParentNameListStr, String beautifyParentValueListStr) {
        o.LJIIIZ(beautifyChildIdListStr, "beautifyChildIdListStr");
        o.LJIIIZ(beautifyChildNameListStr, "beautifyChildNameListStr");
        o.LJIIIZ(beautifyChildValueListStr, "beautifyChildValueListStr");
        o.LJIIIZ(beautifyParentIdListStr, "beautifyParentIdListStr");
        o.LJIIIZ(beautifyParentNameListStr, "beautifyParentNameListStr");
        o.LJIIIZ(beautifyParentValueListStr, "beautifyParentValueListStr");
        this.beautifyChildIdListStr = beautifyChildIdListStr;
        this.beautifyChildNameListStr = beautifyChildNameListStr;
        this.beautifyChildValueListStr = beautifyChildValueListStr;
        this.beautifyParentIdListStr = beautifyParentIdListStr;
        this.beautifyParentNameListStr = beautifyParentNameListStr;
        this.beautifyParentValueListStr = beautifyParentValueListStr;
    }

    public /* synthetic */ BeautyMobParam(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "");
    }
}
