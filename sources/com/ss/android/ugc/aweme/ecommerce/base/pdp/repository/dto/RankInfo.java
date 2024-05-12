package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FJ;
import X.C27332Ao4;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RankInfo implements Parcelable {
    public static final Parcelable.Creator<RankInfo> CREATOR = new C27332Ao4();

    @InterfaceC65349Pkn("rank_hint")
    public final String rankHint;

    @InterfaceC65349Pkn("rank_id")
    public final String rankId;

    @InterfaceC65349Pkn("rank_info_style")
    public final Integer rankInfoStyle;

    @InterfaceC65349Pkn("rank_level_num")
    public final Integer rankLevelNum;

    @InterfaceC65349Pkn("rank_level_str")
    public final String rankLevelStr;

    @InterfaceC65349Pkn("rank_name")
    public final String rankName;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("uniq_tpp_name")
    public final String tpp;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankInfo)) {
            return false;
        }
        RankInfo rankInfo = (RankInfo) obj;
        return o.LJ(this.rankHint, rankInfo.rankHint) && o.LJ(this.rankLevelNum, rankInfo.rankLevelNum) && o.LJ(this.rankLevelStr, rankInfo.rankLevelStr) && o.LJ(this.rankName, rankInfo.rankName) && o.LJ(this.tpp, rankInfo.tpp) && o.LJ(this.schema, rankInfo.schema) && o.LJ(this.rankId, rankInfo.rankId) && o.LJ(this.rankInfoStyle, rankInfo.rankInfoStyle);
    }

    public final int hashCode() {
        String str = this.rankHint;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.rankLevelNum;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.rankLevelStr;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rankName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tpp;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.schema;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rankId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.rankInfoStyle;
        return hashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RankInfo(rankHint=");
        LIZ.append(this.rankHint);
        LIZ.append(", rankLevelNum=");
        LIZ.append(this.rankLevelNum);
        LIZ.append(", rankLevelStr=");
        LIZ.append(this.rankLevelStr);
        LIZ.append(", rankName=");
        LIZ.append(this.rankName);
        LIZ.append(", tpp=");
        LIZ.append(this.tpp);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", rankId=");
        LIZ.append(this.rankId);
        LIZ.append(", rankInfoStyle=");
        return s0.LIZJ(LIZ, this.rankInfoStyle, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.rankHint);
        Integer num = this.rankLevelNum;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        out.writeString(this.rankLevelStr);
        out.writeString(this.rankName);
        out.writeString(this.tpp);
        out.writeString(this.schema);
        out.writeString(this.rankId);
        Integer num2 = this.rankInfoStyle;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
    }

    public RankInfo(String str, Integer num, String str2, String str3, String str4, String str5, String str6, Integer num2) {
        this.rankHint = str;
        this.rankLevelNum = num;
        this.rankLevelStr = str2;
        this.rankName = str3;
        this.tpp = str4;
        this.schema = str5;
        this.rankId = str6;
        this.rankInfoStyle = num2;
    }
}
