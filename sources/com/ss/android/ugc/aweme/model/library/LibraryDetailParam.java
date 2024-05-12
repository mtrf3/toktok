package com.ss.android.ugc.aweme.model.library;

import X.C05040Hs;
import X.C1FJ;
import X.C221108m2;
import X.C5H3;
import X.GHE;
import X.JBR;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.music.model.Music;
import java.io.Serializable;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class LibraryDetailParam implements Serializable, IRouteArg {
    public static final Parcelable.Creator<LibraryDetailParam> CREATOR = new GHE();
    public String awemeId;
    public Long endTime;
    public final C5H3 enterFrom$delegate;
    public String enterMethod;
    public String from;
    public final C5H3 id$delegate;
    public String libraryId;
    public Music musicModel;
    public String processId;
    public Long startTime;
    public String stickerIDs;
    public Integer videoLength;

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str) {
        this(str, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1022, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2) {
        this(str, str2, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1020, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3) {
        this(str, str2, str3, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1016, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1008, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 992, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3, String str4, String str5, Music music) {
        this(str, str2, str3, str4, str5, music, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 960, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3, String str4, String str5, Music music, String str6) {
        this(str, str2, str3, str4, str5, music, str6, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 896, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3, String str4, String str5, Music music, String str6, Integer num) {
        this(str, str2, str3, str4, str5, music, str6, num, null, 0 == true ? 1 : 0, 768, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LibraryDetailParam(String str, String str2, String str3, String str4, String str5, Music music, String str6, Integer num, Long l) {
        this(str, str2, str3, str4, str5, music, str6, num, l, null, 512, 0 == true ? 1 : 0);
    }

    public static LibraryDetailParam __fromBundle(Bundle bundle) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Music music;
        String str6;
        Integer num;
        Long l;
        Long l2 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("id"), String.class);
            i = 0;
        } else {
            i = 1;
            str = null;
        }
        if (bundle.containsKey("aweme_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("aweme_id"), String.class);
        } else {
            i += 2;
            str2 = null;
        }
        if (bundle.containsKey("enter_from")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_from"), String.class);
        } else {
            i += 4;
            str3 = null;
        }
        if (bundle.containsKey("enter_method")) {
            str4 = (String) RouteParser.INSTANCE.parse(bundle.get("enter_method"), String.class);
        } else {
            i += 8;
            str4 = null;
        }
        if (bundle.containsKey("process_id")) {
            str5 = (String) RouteParser.INSTANCE.parse(bundle.get("process_id"), String.class);
        } else {
            i += 16;
            str5 = null;
        }
        if (bundle.containsKey("music_model")) {
            music = (Music) RouteParser.INSTANCE.parse(bundle.get("music_model"), Music.class);
        } else {
            i += 32;
            music = null;
        }
        if (bundle.containsKey("sticker_id")) {
            str6 = (String) RouteParser.INSTANCE.parse(bundle.get("sticker_id"), String.class);
        } else {
            i += 64;
            str6 = null;
        }
        if (bundle.containsKey("video_length")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("video_length"), Integer.class);
        } else {
            i += 128;
            num = null;
        }
        if (bundle.containsKey("start_time")) {
            l = (Long) RouteParser.INSTANCE.parse(bundle.get("start_time"), Long.class);
        } else {
            i += 256;
            l = null;
        }
        if (bundle.containsKey("end_time")) {
            l2 = (Long) RouteParser.INSTANCE.parse(bundle.get("end_time"), Long.class);
        } else {
            i += 512;
        }
        return new LibraryDetailParam(str, str2, str3, str4, str5, music, str6, num, l, l2, i, null);
    }

    public static /* synthetic */ LibraryDetailParam copy$default(LibraryDetailParam libraryDetailParam, String str, String str2, String str3, String str4, String str5, Music music, String str6, Integer num, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryDetailParam.libraryId;
        }
        if ((i & 2) != 0) {
            str2 = libraryDetailParam.awemeId;
        }
        if ((i & 4) != 0) {
            str3 = libraryDetailParam.from;
        }
        if ((i & 8) != 0) {
            str4 = libraryDetailParam.enterMethod;
        }
        if ((i & 16) != 0) {
            str5 = libraryDetailParam.processId;
        }
        if ((i & 32) != 0) {
            music = libraryDetailParam.musicModel;
        }
        if ((i & 64) != 0) {
            str6 = libraryDetailParam.stickerIDs;
        }
        if ((i & 128) != 0) {
            num = libraryDetailParam.videoLength;
        }
        if ((i & 256) != 0) {
            l = libraryDetailParam.startTime;
        }
        if ((i & 512) != 0) {
            l2 = libraryDetailParam.endTime;
        }
        return libraryDetailParam.copy(str, str2, str3, str4, str5, music, str6, num, l, l2);
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public final LibraryDetailParam copy(String str, String str2, String str3, String str4, String str5, Music music, String str6, Integer num, Long l, Long l2) {
        return new LibraryDetailParam(str, str2, str3, str4, str5, music, str6, num, l, l2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryDetailParam)) {
            return false;
        }
        LibraryDetailParam libraryDetailParam = (LibraryDetailParam) obj;
        return o.LJ(this.libraryId, libraryDetailParam.libraryId) && o.LJ(this.awemeId, libraryDetailParam.awemeId) && o.LJ(this.from, libraryDetailParam.from) && o.LJ(this.enterMethod, libraryDetailParam.enterMethod) && o.LJ(this.processId, libraryDetailParam.processId) && o.LJ(this.musicModel, libraryDetailParam.musicModel) && o.LJ(this.stickerIDs, libraryDetailParam.stickerIDs) && o.LJ(this.videoLength, libraryDetailParam.videoLength) && o.LJ(this.startTime, libraryDetailParam.startTime) && o.LJ(this.endTime, libraryDetailParam.endTime);
    }

    public int hashCode() {
        String str = this.libraryId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.from;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterMethod;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.processId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Music music = this.musicModel;
        int hashCode6 = (hashCode5 + (music == null ? 0 : music.hashCode())) * 31;
        String str6 = this.stickerIDs;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.videoLength;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.startTime;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.endTime;
        return hashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String getEnterFrom() {
        return (String) this.enterFrom$delegate.getValue();
    }

    public final String getId() {
        return (String) this.id$delegate.getValue();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LibraryDetailParam(libraryId=");
        LIZ.append(this.libraryId);
        LIZ.append(", awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", from=");
        LIZ.append(this.from);
        LIZ.append(", enterMethod=");
        LIZ.append(this.enterMethod);
        LIZ.append(", processId=");
        LIZ.append(this.processId);
        LIZ.append(", musicModel=");
        LIZ.append(this.musicModel);
        LIZ.append(", stickerIDs=");
        LIZ.append(this.stickerIDs);
        LIZ.append(", videoLength=");
        LIZ.append(this.videoLength);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        return JBR.LJ(LIZ, this.endTime, ')', LIZ);
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getLibraryId() {
        return this.libraryId;
    }

    public final Music getMusicModel() {
        return this.musicModel;
    }

    public final String getProcessId() {
        return this.processId;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getStickerIDs() {
        return this.stickerIDs;
    }

    public final Integer getVideoLength() {
        return this.videoLength;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    public final void setEnterMethod(String str) {
        this.enterMethod = str;
    }

    public final void setFrom(String str) {
        this.from = str;
    }

    public final void setLibraryId(String str) {
        this.libraryId = str;
    }

    public final void setMusicModel(Music music) {
        this.musicModel = music;
    }

    public final void setProcessId(String str) {
        this.processId = str;
    }

    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    public final void setStickerIDs(String str) {
        this.stickerIDs = str;
    }

    public final void setVideoLength(Integer num) {
        this.videoLength = num;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.libraryId);
        out.writeString(this.awemeId);
        out.writeString(this.from);
        out.writeString(this.enterMethod);
        out.writeString(this.processId);
        out.writeSerializable(this.musicModel);
        out.writeString(this.stickerIDs);
        Integer num = this.videoLength;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Long l = this.startTime;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        Long l2 = this.endTime;
        if (l2 == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l2);
        }
    }

    public LibraryDetailParam(String str, String str2, String str3, String str4, String str5, Music music, String str6, Integer num, Long l, Long l2) {
        this.libraryId = str;
        this.awemeId = str2;
        this.from = str3;
        this.enterMethod = str4;
        this.processId = str5;
        this.musicModel = music;
        this.stickerIDs = str6;
        this.videoLength = num;
        this.startTime = l;
        this.endTime = l2;
        this.id$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 141));
        this.enterFrom$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, UserLevelGeckoUpdateSetting.DEFAULT));
    }

    public /* synthetic */ LibraryDetailParam(String str, String str2, String str3, String str4, String str5, Music music, String str6, Integer num, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : music, (i & 64) == 0 ? str6 : "", (i & 128) == 0 ? num : null, (i & 256) != 0 ? 0L : l, (i & 512) != 0 ? 0L : l2);
    }
}
