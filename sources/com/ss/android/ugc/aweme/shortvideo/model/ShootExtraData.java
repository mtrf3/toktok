package com.ss.android.ugc.aweme.shortvideo.model;

import X.C05040Hs;
import X.C1FJ;
import X.C1FL;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ShootExtraData implements Parcelable, Serializable {

    @InterfaceC65349Pkn("recommend_music_clip_id")
    public Long clipId;

    @InterfaceC65349Pkn("recommend_music_cml_clip_id")
    public Long cmlClipId;

    @InterfaceC65349Pkn("recommend_music_cml_meta_song_id")
    public String cmlMetaSongId;

    @InterfaceC65349Pkn("from_banner_id")
    public String fromBannerId;

    @InterfaceC65349Pkn("is_bundled")
    public Integer isBundled;

    @InterfaceC65349Pkn("is_commercial_use")
    public Integer isCommercialUse;

    @InterfaceC65349Pkn("is_recommend_music")
    public Boolean isRecommendMusic;

    @InterfaceC65349Pkn("recommend_music_meta_song_id")
    public String metaSongId;

    @InterfaceC65349Pkn("shoot_enter_from")
    public String shootEnterFrom;

    @InterfaceC65349Pkn("shoot_enter_method")
    public String shootEnterMethod;

    @InterfaceC65349Pkn("recommend_music_suggestion_id")
    public Long suggestionId;

    @InterfaceC65349Pkn("recommend_music_version")
    public String version;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ShootExtraData> CREATOR = new Creator();

    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ShootExtraData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShootExtraData createFromParcel(Parcel parcel) {
            Boolean valueOf;
            o.LJIIIZ(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShootExtraData(readString, readString2, valueOf2, valueOf, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShootExtraData[] newArray(int i) {
            return new ShootExtraData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4095, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4094, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4092, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num) {
        this(str, str2, num, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4088, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool) {
        this(str, str2, num, bool, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4080, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3) {
        this(str, str2, num, bool, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4064, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2) {
        this(str, str2, num, bool, str3, num2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4032, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l) {
        this(str, str2, num, bool, str3, num2, l, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3968, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4) {
        this(str, str2, num, bool, str3, num2, l, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3840, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3584, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, null, 0 == true ? 1 : 0, 3072, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6) {
        this(str, str2, num, bool, str3, num2, l, str4, l2, str5, str6, null, 2048, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final Long getClipId() {
        return this.clipId;
    }

    public final Long getCmlClipId() {
        return this.cmlClipId;
    }

    public final String getCmlMetaSongId() {
        return this.cmlMetaSongId;
    }

    public final String getFromBannerId() {
        return this.fromBannerId;
    }

    public final String getMetaSongId() {
        return this.metaSongId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final String getShootEnterMethod() {
        return this.shootEnterMethod;
    }

    public final Long getSuggestionId() {
        return this.suggestionId;
    }

    public final String getVersion() {
        return this.version;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final Integer isCommercialUse() {
        return this.isCommercialUse;
    }

    public final Boolean isRecommendMusic() {
        return this.isRecommendMusic;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setClipId(Long l) {
        this.clipId = l;
    }

    public final void setCmlClipId(Long l) {
        this.cmlClipId = l;
    }

    public final void setCmlMetaSongId(String str) {
        this.cmlMetaSongId = str;
    }

    public final void setCommercialUse(Integer num) {
        this.isCommercialUse = num;
    }

    public final void setFromBannerId(String str) {
        this.fromBannerId = str;
    }

    public final void setMetaSongId(String str) {
        this.metaSongId = str;
    }

    public final void setRecommendMusic(Boolean bool) {
        this.isRecommendMusic = bool;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShootEnterMethod(String str) {
        this.shootEnterMethod = str;
    }

    public final void setSuggestionId(Long l) {
        this.suggestionId = l;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.shootEnterFrom);
        out.writeString(this.fromBannerId);
        Integer num = this.isBundled;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.isRecommendMusic;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        out.writeString(this.shootEnterMethod);
        Integer num2 = this.isCommercialUse;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num2);
        }
        Long l = this.clipId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.metaSongId);
        Long l2 = this.cmlClipId;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
        out.writeString(this.cmlMetaSongId);
        out.writeString(this.version);
        Long l3 = this.suggestionId;
        if (l3 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l3);
        }
    }

    public ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Long l3) {
        this.shootEnterFrom = str;
        this.fromBannerId = str2;
        this.isBundled = num;
        this.isRecommendMusic = bool;
        this.shootEnterMethod = str3;
        this.isCommercialUse = num2;
        this.clipId = l;
        this.metaSongId = str4;
        this.cmlClipId = l2;
        this.cmlMetaSongId = str5;
        this.version = str6;
        this.suggestionId = l3;
    }

    public /* synthetic */ ShootExtraData(String str, String str2, Integer num, Boolean bool, String str3, Integer num2, Long l, String str4, Long l2, String str5, String str6, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0 : num, (i & 8) != 0 ? Boolean.FALSE : bool, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) == 0 ? l3 : null);
    }
}
