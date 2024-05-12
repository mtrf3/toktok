package com.ss.android.ugc.aweme.cutsame;

import X.C45119HnH;
import X.C45122HnK;
import X.C63081OpJ;
import X.C79062V1e;
import X.EnumC43998HOo;
import X.InterfaceC65349Pkn;
import X.InterfaceC82548WaW;
import X.JBR;
import X.Q8U;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CutsameDataItem implements Parcelable, InterfaceC82548WaW {

    @InterfaceC65349Pkn("author")
    public final AuthorInfo author;

    @InterfaceC65349Pkn("challenge")
    public final ArrayList<String> challengeIds;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("extra")
    public final String extra;

    @InterfaceC65349Pkn("fragment_count")
    public final int fragmentCount;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("is_commercial_music")
    public final boolean isCommerceMusic;
    public int isMvAnchor;

    @InterfaceC65349Pkn("max_media_size")
    public final int maxMediaSize;

    @InterfaceC65349Pkn("md5")
    public final String md5;

    @InterfaceC65349Pkn("music_model")
    public final Music music;

    @InterfaceC65349Pkn("music")
    public final ArrayList<String> musicIds;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("sdk_version")
    public final String sdkVersion;

    @InterfaceC65349Pkn("template_json")
    public final String templateData;

    @InterfaceC65349Pkn("template_group_id")
    public final String templateGroupId;

    @InterfaceC65349Pkn("template_id")
    public final String templateId;

    @InterfaceC65349Pkn("template_type")
    public final int templateType;

    @InterfaceC65349Pkn("template_url")
    public final String templateUrl;

    @InterfaceC65349Pkn("title")
    public final String title;

    @InterfaceC65349Pkn("urs")
    public final ArrayList<String> ursList;

    @InterfaceC65349Pkn("usage_amount")
    public final long usageAmount;

    @InterfaceC65349Pkn("video")
    public final CutSameVideo video;

    @InterfaceC65349Pkn("aspect_ratio")
    public final String videoRatio;
    public static final C45122HnK Companion = new C45122HnK();
    public static final Parcelable.Creator<CutsameDataItem> CREATOR = new C45119HnH();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CutsameDataItem() {
        /*
            r28 = this;
            r1 = 0
            r2 = 0
            r9 = 0
            r26 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r28
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r2
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r2
            r18 = r2
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r2
            r24 = r1
            r25 = r1
            r27 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cutsame.CutsameDataItem.<init>():void");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutsameDataItem)) {
            return false;
        }
        CutsameDataItem cutsameDataItem = (CutsameDataItem) obj;
        return o.LJ(this.templateId, cutsameDataItem.templateId) && this.templateType == cutsameDataItem.templateType && o.LJ(this.title, cutsameDataItem.title) && o.LJ(this.description, cutsameDataItem.description) && o.LJ(this.templateUrl, cutsameDataItem.templateUrl) && o.LJ(this.templateData, cutsameDataItem.templateData) && o.LJ(this.video, cutsameDataItem.video) && this.fragmentCount == cutsameDataItem.fragmentCount && this.usageAmount == cutsameDataItem.usageAmount && o.LJ(this.extra, cutsameDataItem.extra) && o.LJ(this.sdkVersion, cutsameDataItem.sdkVersion) && o.LJ(this.md5, cutsameDataItem.md5) && o.LJ(this.iconUrl, cutsameDataItem.iconUrl) && o.LJ(this.musicIds, cutsameDataItem.musicIds) && o.LJ(this.challengeIds, cutsameDataItem.challengeIds) && this.isCommerceMusic == cutsameDataItem.isCommerceMusic && this.maxMediaSize == cutsameDataItem.maxMediaSize && o.LJ(this.region, cutsameDataItem.region) && o.LJ(this.videoRatio, cutsameDataItem.videoRatio) && o.LJ(this.author, cutsameDataItem.author) && o.LJ(this.music, cutsameDataItem.music) && this.isMvAnchor == cutsameDataItem.isMvAnchor && o.LJ(this.templateGroupId, cutsameDataItem.templateGroupId) && o.LJ(this.ursList, cutsameDataItem.ursList);
    }

    public final String toString() {
        return "CutsameDataItem(templateId=" + this.templateId + ", templateType=" + this.templateType + ", title=" + this.title + ", description=" + this.description + ", templateUrl=" + this.templateUrl + ", templateData=" + this.templateData + ", video=" + this.video + ", fragmentCount=" + this.fragmentCount + ", usageAmount=" + this.usageAmount + ", extra=" + this.extra + ", sdkVersion=" + this.sdkVersion + ", md5=" + this.md5 + ", iconUrl=" + this.iconUrl + ", musicIds=" + this.musicIds + ", challengeIds=" + this.challengeIds + ", isCommerceMusic=" + this.isCommerceMusic + ", maxMediaSize=" + this.maxMediaSize + ", region=" + this.region + ", videoRatio=" + this.videoRatio + ", author=" + this.author + ", music=" + this.music + ", isMvAnchor=" + this.isMvAnchor + ", templateGroupId=" + this.templateGroupId + ", ursList=" + this.ursList + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.templateId);
        out.writeInt(this.templateType);
        out.writeString(this.title);
        out.writeString(this.description);
        out.writeString(this.templateUrl);
        out.writeString(this.templateData);
        CutSameVideo cutSameVideo = this.video;
        if (cutSameVideo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cutSameVideo.writeToParcel(out, i);
        }
        out.writeInt(this.fragmentCount);
        out.writeLong(this.usageAmount);
        out.writeString(this.extra);
        out.writeString(this.sdkVersion);
        out.writeString(this.md5);
        out.writeString(this.iconUrl);
        out.writeStringList(this.musicIds);
        out.writeStringList(this.challengeIds);
        out.writeInt(this.isCommerceMusic ? 1 : 0);
        out.writeInt(this.maxMediaSize);
        out.writeString(this.region);
        out.writeString(this.videoRatio);
        AuthorInfo authorInfo = this.author;
        if (authorInfo == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            authorInfo.writeToParcel(out, i);
        }
        out.writeSerializable(this.music);
        out.writeInt(this.isMvAnchor);
        out.writeString(this.templateGroupId);
        out.writeStringList(this.ursList);
    }

    @Override // X.InterfaceC82548WaW
    public final String LIZ() {
        CutSameVideo cutSameVideo = this.video;
        if (cutSameVideo != null) {
            return cutSameVideo.coverUrl;
        }
        return null;
    }

    @Override // X.InterfaceC82548WaW
    public final VideoUrlModel LJ() {
        CutSameVideo cutSameVideo = this.video;
        if (cutSameVideo == null || cutSameVideo.videoUri == null || cutSameVideo.videoUrl == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setBytevc1(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.video.videoUrl);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlKey(this.video.videoUri);
        videoUrlModel.setUri(this.video.videoUri);
        return videoUrlModel;
    }

    @Override // X.InterfaceC82548WaW
    public final EnumC43998HOo LJII() {
        EnumC43998HOo LLJZIJLIL = C63081OpJ.LLJZIJLIL(this.templateType);
        if (LLJZIJLIL == null) {
            return EnumC43998HOo.CUT_SAME;
        }
        return LLJZIJLIL;
    }

    public final String LJIIIZ() {
        SimpleImage simpleImage;
        List<String> list;
        String str;
        AuthorInfo authorInfo = this.author;
        if (authorInfo == null || (simpleImage = authorInfo.avatar) == null || (list = simpleImage.urlList) == null || (str = (String) ListProtector.get(list, 0)) == null) {
            return "";
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int LJ = C79062V1e.LJ(this.templateUrl, C79062V1e.LJ(this.description, C79062V1e.LJ(this.title, ((this.templateId.hashCode() * 31) + this.templateType) * 31, 31), 31), 31);
        String str = this.templateData;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        CutSameVideo cutSameVideo = this.video;
        if (cutSameVideo == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cutSameVideo.hashCode();
        }
        int LJ2 = C79062V1e.LJ(this.sdkVersion, C79062V1e.LJ(this.extra, JBR.LIZJ(this.usageAmount, (((i2 + hashCode2) * 31) + this.fragmentCount) * 31, 31), 31), 31);
        String str2 = this.md5;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (LJ2 + hashCode3) * 31;
        String str3 = this.iconUrl;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        ArrayList<String> arrayList = this.musicIds;
        if (arrayList == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = arrayList.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        ArrayList<String> arrayList2 = this.challengeIds;
        if (arrayList2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = arrayList2.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        boolean z = this.isCommerceMusic;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        int LJ3 = C79062V1e.LJ(this.videoRatio, C79062V1e.LJ(this.region, (((i6 + i7) * 31) + this.maxMediaSize) * 31, 31), 31);
        AuthorInfo authorInfo = this.author;
        if (authorInfo == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = authorInfo.hashCode();
        }
        int i8 = (LJ3 + hashCode7) * 31;
        Music music = this.music;
        if (music == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = music.hashCode();
        }
        int i9 = (((i8 + hashCode8) * 31) + this.isMvAnchor) * 31;
        String str4 = this.templateGroupId;
        if (str4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str4.hashCode();
        }
        int i10 = (i9 + hashCode9) * 31;
        ArrayList<String> arrayList3 = this.ursList;
        if (arrayList3 != null) {
            i = arrayList3.hashCode();
        }
        return i10 + i;
    }

    @Override // X.InterfaceC82548WaW
    public final boolean isValid() {
        if (!TextUtils.isEmpty(this.templateUrl) && !TextUtils.isEmpty(this.extra) && !TextUtils.isEmpty(this.md5)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC82548WaW
    public final String LIZIZ() {
        return this.templateId;
    }

    @Override // X.InterfaceC82548WaW
    public final boolean LJI() {
        return this.isCommerceMusic;
    }

    @Override // X.InterfaceC82548WaW
    public final String LJIIIIZZ() {
        return this.title;
    }

    @Override // X.InterfaceC82548WaW
    public final String LIZLLL(Context context) {
        o.LJIIIZ(context, "context");
        String string = context.getString(R.string.e8n);
        o.LJIIIIZZ(string, "context.getString(R.string.creation_upload_limit)");
        return Q8U.LIZIZ(new Object[]{Integer.valueOf(this.maxMediaSize)}, 1, string, "format(format, *args)");
    }

    public CutsameDataItem(String templateId, int i, String title, String description, String templateUrl, String str, CutSameVideo cutSameVideo, int i2, long j, String extra, String sdkVersion, String str2, String str3, ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z, int i3, String region, String videoRatio, AuthorInfo authorInfo, Music music, int i4, String str4, ArrayList<String> arrayList3) {
        o.LJIIIZ(templateId, "templateId");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        o.LJIIIZ(templateUrl, "templateUrl");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(sdkVersion, "sdkVersion");
        o.LJIIIZ(region, "region");
        o.LJIIIZ(videoRatio, "videoRatio");
        this.templateId = templateId;
        this.templateType = i;
        this.title = title;
        this.description = description;
        this.templateUrl = templateUrl;
        this.templateData = str;
        this.video = cutSameVideo;
        this.fragmentCount = i2;
        this.usageAmount = j;
        this.extra = extra;
        this.sdkVersion = sdkVersion;
        this.md5 = str2;
        this.iconUrl = str3;
        this.musicIds = arrayList;
        this.challengeIds = arrayList2;
        this.isCommerceMusic = z;
        this.maxMediaSize = i3;
        this.region = region;
        this.videoRatio = videoRatio;
        this.author = authorInfo;
        this.music = music;
        this.isMvAnchor = i4;
        this.templateGroupId = str4;
        this.ursList = arrayList3;
    }

    public /* synthetic */ CutsameDataItem(String str, int i, String str2, String str3, String str4, String str5, CutSameVideo cutSameVideo, int i2, long j, String str6, String str7, String str8, String str9, ArrayList arrayList, ArrayList arrayList2, boolean z, int i3, String str10, String str11, AuthorInfo authorInfo, Music music, int i4, String str12, ArrayList arrayList3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? EnumC43998HOo.CUT_SAME.getValue() : i, (i5 & 4) != 0 ? "not_set" : str2, (i5 & 8) != 0 ? "not_set" : str3, (i5 & 16) != 0 ? "not_set" : str4, (i5 & 32) != 0 ? null : str5, (i5 & 64) != 0 ? null : cutSameVideo, (i5 & 128) != 0 ? 0 : i2, (i5 & 256) != 0 ? 0L : j, (i5 & 512) != 0 ? "not_set" : str6, (i5 & 1024) != 0 ? "not_set" : str7, (i5 & 2048) == 0 ? str8 : "not_set", (i5 & 4096) != 0 ? null : str9, (i5 & FileUtils.BUFFER_SIZE) != 0 ? new ArrayList() : arrayList, (i5 & 16384) != 0 ? new ArrayList() : arrayList2, (32768 & i5) != 0 ? false : z, (65536 & i5) != 0 ? 0 : i3, (131072 & i5) != 0 ? "" : str10, (262144 & i5) == 0 ? str11 : "", (524288 & i5) != 0 ? null : authorInfo, (1048576 & i5) != 0 ? null : music, (2097152 & i5) != 0 ? 0 : i4, (4194304 & i5) != 0 ? null : str12, (i5 & 8388608) != 0 ? new ArrayList() : arrayList3);
    }
}
