package com.bytedance.android.livesdk.model;

import X.C07670Rv;
import X.C59419NTr;
import X.C59420NTs;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdLiveEnterRoomConfig implements Parcelable {

    @InterfaceC65349Pkn("ad_id")
    public final String adId;

    @InterfaceC65349Pkn("adv_id")
    public final String advId;

    @InterfaceC65349Pkn("aweme_id")
    public final String aid;

    @InterfaceC65349Pkn("author_id")
    public final String authorId;

    @InterfaceC65349Pkn("creative_id")
    public final String creativeId;

    @InterfaceC65349Pkn("dislike_info")
    public final String dislikeInfo;

    @InterfaceC65349Pkn("enter_from_ad")
    public boolean enterFromAd;

    @InterfaceC65349Pkn("follow_status")
    public String followStatus;

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("is_pseudo_ad")
    public final String isPseudoAd;

    @InterfaceC65349Pkn("live_ad_type")
    public final String liveAdType;

    @InterfaceC65349Pkn("log_extra")
    public final String logExtra;

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("traffic_from_position")
    public final int trafficFromPosition;

    @InterfaceC65349Pkn("value")
    public final String value;
    public static final C59420NTs Companion = new C59420NTs();
    public static final Parcelable.Creator<AdLiveEnterRoomConfig> CREATOR = new C59419NTr();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdLiveEnterRoomConfig)) {
            return false;
        }
        AdLiveEnterRoomConfig adLiveEnterRoomConfig = (AdLiveEnterRoomConfig) obj;
        return o.LJ(this.liveAdType, adLiveEnterRoomConfig.liveAdType) && o.LJ(this.creativeId, adLiveEnterRoomConfig.creativeId) && o.LJ(this.value, adLiveEnterRoomConfig.value) && o.LJ(this.logExtra, adLiveEnterRoomConfig.logExtra) && o.LJ(this.groupId, adLiveEnterRoomConfig.groupId) && this.trafficFromPosition == adLiveEnterRoomConfig.trafficFromPosition && o.LJ(this.aid, adLiveEnterRoomConfig.aid) && o.LJ(this.adId, adLiveEnterRoomConfig.adId) && o.LJ(this.advId, adLiveEnterRoomConfig.advId) && o.LJ(this.roomId, adLiveEnterRoomConfig.roomId) && o.LJ(this.authorId, adLiveEnterRoomConfig.authorId) && o.LJ(this.dislikeInfo, adLiveEnterRoomConfig.dislikeInfo) && o.LJ(this.isPseudoAd, adLiveEnterRoomConfig.isPseudoAd);
    }

    public final int hashCode() {
        String str = this.liveAdType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.creativeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.logExtra;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.groupId;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.trafficFromPosition) * 31;
        String str6 = this.aid;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.adId;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.advId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.roomId;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.authorId;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.dislikeInfo;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.isPseudoAd;
        return hashCode11 + (str12 != null ? str12.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.liveAdType);
        out.writeString(this.creativeId);
        out.writeString(this.value);
        out.writeString(this.logExtra);
        out.writeString(this.groupId);
        out.writeInt(this.trafficFromPosition);
        out.writeString(this.aid);
        out.writeString(this.adId);
        out.writeString(this.advId);
        out.writeString(this.roomId);
        out.writeString(this.authorId);
        out.writeString(this.dislikeInfo);
        out.writeString(this.isPseudoAd);
    }

    public final Map<String, Object> LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("traffic_from_position", Integer.valueOf(this.trafficFromPosition));
        String str = this.roomId;
        if (str != null) {
            linkedHashMap.put("room_id", str);
        }
        String str2 = this.authorId;
        if (str2 != null) {
            linkedHashMap.put("anchor_id", str2);
        }
        return linkedHashMap;
    }

    public final HashMap<String, String> LIZIZ() {
        HashMap<String, String> hashMap = new HashMap<>();
        String str = this.value;
        if (str != null) {
            hashMap.put("value", str);
        }
        String str2 = this.creativeId;
        if (str2 != null) {
            hashMap.put("creative_id", str2);
        }
        String str3 = this.logExtra;
        if (str3 != null) {
            hashMap.put("log_extra", str3);
        }
        String str4 = this.groupId;
        if (str4 != null) {
            hashMap.put("group_id", str4);
        }
        hashMap.put("traffic_from_position", String.valueOf(this.trafficFromPosition));
        String str5 = this.isPseudoAd;
        if (str5 != null) {
            hashMap.put("is_pseudo_ad", str5);
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdLiveEnterRoomConfig(liveAdType=");
        sb.append(this.liveAdType);
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        sb.append(", value=");
        sb.append(this.value);
        sb.append(", logExtra=");
        sb.append(this.logExtra);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", trafficFromPosition=");
        sb.append(this.trafficFromPosition);
        sb.append(", aid=");
        sb.append(this.aid);
        sb.append(", adId=");
        sb.append(this.adId);
        sb.append(", advId=");
        sb.append(this.advId);
        sb.append(", roomId=");
        sb.append(this.roomId);
        sb.append(", authorId=");
        sb.append(this.authorId);
        sb.append(", dislikeInfo=");
        sb.append(this.dislikeInfo);
        sb.append(", isPseudoAd=");
        return C07670Rv.LIZIZ(sb, this.isPseudoAd, ')');
    }

    public AdLiveEnterRoomConfig(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.liveAdType = str;
        this.creativeId = str2;
        this.value = str3;
        this.logExtra = str4;
        this.groupId = str5;
        this.trafficFromPosition = i;
        this.aid = str6;
        this.adId = str7;
        this.advId = str8;
        this.roomId = str9;
        this.authorId = str10;
        this.dislikeInfo = str11;
        this.isPseudoAd = str12;
        this.enterFromAd = true;
    }

    public /* synthetic */ AdLiveEnterRoomConfig(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CardStruct.IStatusCode.DEFAULT : str, str2, str3, str4, str5, i, str6, str7, str8, str9, str10, (i2 & 2048) != 0 ? null : str11, (i2 & 4096) == 0 ? str12 : CardStruct.IStatusCode.DEFAULT);
    }
}
