package com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net;

import X.C07670Rv;
import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.JBR;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class VideoTemplateInfoExt {

    @InterfaceC65349Pkn("aspect_ratio")
    public final String aspectRatio;

    @InterfaceC65349Pkn("author_info")
    public final TemplateAuthor authorInfo;

    @InterfaceC65349Pkn("challenge")
    public final List<Long> challenge;

    @InterfaceC65349Pkn("client_key")
    public final String clientKey;

    @InterfaceC65349Pkn("count")
    public final long count;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("dynamic_cover_info")
    public final VideoTemplateDynamicCoverInfo dynamicCoverInfo;

    @InterfaceC65349Pkn("feature_bits")
    public final List<Long> featureBits;

    @InterfaceC65349Pkn("fragment_count")
    public final int fragmentCount;

    @InterfaceC65349Pkn("has_commercial_music")
    public final boolean hasCommercialMusic;

    @InterfaceC65349Pkn("hint")
    public final String hint;

    @InterfaceC65349Pkn("is_business")
    public final boolean isBusiness;

    @InterfaceC65349Pkn("is_collect")
    public final boolean isCollect;

    @InterfaceC65349Pkn("lang")
    public final String lang;

    @InterfaceC65349Pkn("music")
    public final List<Long> music;

    @InterfaceC65349Pkn("mv_types")
    public final List<String> mvTypes;

    @InterfaceC65349Pkn("nle_summary")
    public final String nleSummary;

    @InterfaceC65349Pkn("provider")
    public final String provider;

    @InterfaceC65349Pkn("recommend_music")
    public final String recommendMusic;

    @InterfaceC65349Pkn("recommend_music2")
    public final List<Long> recommendMusic2;

    @InterfaceC65349Pkn("region")
    public final String region;

    @InterfaceC65349Pkn("related_words")
    public final List<String> relatedWords;

    @InterfaceC65349Pkn("requirements")
    public final List<String> requirements;

    @InterfaceC65349Pkn("sdk_extra")
    public final String sdkExtra;

    @InterfaceC65349Pkn("share_id")
    public final String shareId;

    @InterfaceC65349Pkn("source_from")
    public final String sourceFrom;

    @InterfaceC65349Pkn("url_prefix")
    public final List<String> urlPrefix;

    @InterfaceC65349Pkn("video_info")
    public final VideoTemplateVideoInfo videoInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoTemplateInfoExt() {
        /*
            r33 = this;
            r1 = 0
            r3 = 0
            r8 = 0
            r31 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r33
            r4 = r3
            r5 = r3
            r6 = r3
            r7 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r8
            r13 = r3
            r14 = r3
            r15 = r3
            r16 = r3
            r17 = r3
            r18 = r3
            r19 = r1
            r21 = r8
            r22 = r3
            r23 = r3
            r24 = r8
            r25 = r3
            r26 = r3
            r27 = r3
            r28 = r3
            r29 = r3
            r30 = r3
            r32 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.mvtemplate.cutsame.net.VideoTemplateInfoExt.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoTemplateInfoExt)) {
            return false;
        }
        VideoTemplateInfoExt videoTemplateInfoExt = (VideoTemplateInfoExt) obj;
        return this.duration == videoTemplateInfoExt.duration && o.LJ(this.provider, videoTemplateInfoExt.provider) && o.LJ(this.aspectRatio, videoTemplateInfoExt.aspectRatio) && o.LJ(this.nleSummary, videoTemplateInfoExt.nleSummary) && o.LJ(this.lang, videoTemplateInfoExt.lang) && o.LJ(this.region, videoTemplateInfoExt.region) && this.hasCommercialMusic == videoTemplateInfoExt.hasCommercialMusic && o.LJ(this.recommendMusic, videoTemplateInfoExt.recommendMusic) && o.LJ(this.videoInfo, videoTemplateInfoExt.videoInfo) && o.LJ(this.dynamicCoverInfo, videoTemplateInfoExt.dynamicCoverInfo) && this.isBusiness == videoTemplateInfoExt.isBusiness && o.LJ(this.challenge, videoTemplateInfoExt.challenge) && o.LJ(this.recommendMusic2, videoTemplateInfoExt.recommendMusic2) && o.LJ(this.hint, videoTemplateInfoExt.hint) && o.LJ(this.relatedWords, videoTemplateInfoExt.relatedWords) && o.LJ(this.sdkExtra, videoTemplateInfoExt.sdkExtra) && o.LJ(this.authorInfo, videoTemplateInfoExt.authorInfo) && this.count == videoTemplateInfoExt.count && this.isCollect == videoTemplateInfoExt.isCollect && o.LJ(this.shareId, videoTemplateInfoExt.shareId) && o.LJ(this.clientKey, videoTemplateInfoExt.clientKey) && this.fragmentCount == videoTemplateInfoExt.fragmentCount && o.LJ(this.music, videoTemplateInfoExt.music) && o.LJ(this.requirements, videoTemplateInfoExt.requirements) && o.LJ(this.featureBits, videoTemplateInfoExt.featureBits) && o.LJ(this.mvTypes, videoTemplateInfoExt.mvTypes) && o.LJ(this.urlPrefix, videoTemplateInfoExt.urlPrefix) && o.LJ(this.sourceFrom, videoTemplateInfoExt.sourceFrom);
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
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        int LLJIJIL = C16880lQ.LLJIJIL(this.duration) * 31;
        String str = this.provider;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LLJIJIL + hashCode) * 31;
        String str2 = this.aspectRatio;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.nleSummary;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.lang;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.region;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        boolean z = this.hasCommercialMusic;
        int i7 = 1;
        int i8 = z;
        if (z != 0) {
            i8 = 1;
        }
        int i9 = (i6 + i8) * 31;
        String str6 = this.recommendMusic;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i10 = (i9 + hashCode6) * 31;
        VideoTemplateVideoInfo videoTemplateVideoInfo = this.videoInfo;
        if (videoTemplateVideoInfo == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = videoTemplateVideoInfo.hashCode();
        }
        int i11 = (i10 + hashCode7) * 31;
        VideoTemplateDynamicCoverInfo videoTemplateDynamicCoverInfo = this.dynamicCoverInfo;
        if (videoTemplateDynamicCoverInfo == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = videoTemplateDynamicCoverInfo.hashCode();
        }
        int i12 = (i11 + hashCode8) * 31;
        boolean z2 = this.isBusiness;
        int i13 = z2;
        if (z2 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        List<Long> list = this.challenge;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int i15 = (i14 + hashCode9) * 31;
        List<Long> list2 = this.recommendMusic2;
        if (list2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list2.hashCode();
        }
        int i16 = (i15 + hashCode10) * 31;
        String str7 = this.hint;
        if (str7 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str7.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        List<String> list3 = this.relatedWords;
        if (list3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list3.hashCode();
        }
        int i18 = (i17 + hashCode12) * 31;
        String str8 = this.sdkExtra;
        if (str8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str8.hashCode();
        }
        int i19 = (i18 + hashCode13) * 31;
        TemplateAuthor templateAuthor = this.authorInfo;
        if (templateAuthor == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = templateAuthor.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.count, (i19 + hashCode14) * 31, 31);
        if (!this.isCollect) {
            i7 = 0;
        }
        int i20 = (LIZJ + i7) * 31;
        String str9 = this.shareId;
        if (str9 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str9.hashCode();
        }
        int i21 = (i20 + hashCode15) * 31;
        String str10 = this.clientKey;
        if (str10 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str10.hashCode();
        }
        int i22 = (((i21 + hashCode16) * 31) + this.fragmentCount) * 31;
        List<Long> list4 = this.music;
        if (list4 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = list4.hashCode();
        }
        int i23 = (i22 + hashCode17) * 31;
        List<String> list5 = this.requirements;
        if (list5 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = list5.hashCode();
        }
        int i24 = (i23 + hashCode18) * 31;
        List<Long> list6 = this.featureBits;
        if (list6 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = list6.hashCode();
        }
        int i25 = (i24 + hashCode19) * 31;
        List<String> list7 = this.mvTypes;
        if (list7 == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = list7.hashCode();
        }
        int i26 = (i25 + hashCode20) * 31;
        List<String> list8 = this.urlPrefix;
        if (list8 == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = list8.hashCode();
        }
        int i27 = (i26 + hashCode21) * 31;
        String str11 = this.sourceFrom;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i27 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoTemplateInfoExt(duration=");
        sb.append(this.duration);
        sb.append(", provider=");
        sb.append(this.provider);
        sb.append(", aspectRatio=");
        sb.append(this.aspectRatio);
        sb.append(", nleSummary=");
        sb.append(this.nleSummary);
        sb.append(", lang=");
        sb.append(this.lang);
        sb.append(", region=");
        sb.append(this.region);
        sb.append(", hasCommercialMusic=");
        sb.append(this.hasCommercialMusic);
        sb.append(", recommendMusic=");
        sb.append(this.recommendMusic);
        sb.append(", videoInfo=");
        sb.append(this.videoInfo);
        sb.append(", dynamicCoverInfo=");
        sb.append(this.dynamicCoverInfo);
        sb.append(", isBusiness=");
        sb.append(this.isBusiness);
        sb.append(", challenge=");
        sb.append(this.challenge);
        sb.append(", recommendMusic2=");
        sb.append(this.recommendMusic2);
        sb.append(", hint=");
        sb.append(this.hint);
        sb.append(", relatedWords=");
        sb.append(this.relatedWords);
        sb.append(", sdkExtra=");
        sb.append(this.sdkExtra);
        sb.append(", authorInfo=");
        sb.append(this.authorInfo);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", isCollect=");
        sb.append(this.isCollect);
        sb.append(", shareId=");
        sb.append(this.shareId);
        sb.append(", clientKey=");
        sb.append(this.clientKey);
        sb.append(", fragmentCount=");
        sb.append(this.fragmentCount);
        sb.append(", music=");
        sb.append(this.music);
        sb.append(", requirements=");
        sb.append(this.requirements);
        sb.append(", featureBits=");
        sb.append(this.featureBits);
        sb.append(", mvTypes=");
        sb.append(this.mvTypes);
        sb.append(", urlPrefix=");
        sb.append(this.urlPrefix);
        sb.append(", sourceFrom=");
        return C07670Rv.LIZIZ(sb, this.sourceFrom, ')');
    }

    public VideoTemplateInfoExt(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, VideoTemplateVideoInfo videoTemplateVideoInfo, VideoTemplateDynamicCoverInfo videoTemplateDynamicCoverInfo, boolean z2, List<Long> list, List<Long> list2, String str7, List<String> list3, String str8, TemplateAuthor templateAuthor, long j2, boolean z3, String str9, String str10, int i, List<Long> list4, List<String> list5, List<Long> list6, List<String> list7, List<String> list8, String str11) {
        this.duration = j;
        this.provider = str;
        this.aspectRatio = str2;
        this.nleSummary = str3;
        this.lang = str4;
        this.region = str5;
        this.hasCommercialMusic = z;
        this.recommendMusic = str6;
        this.videoInfo = videoTemplateVideoInfo;
        this.dynamicCoverInfo = videoTemplateDynamicCoverInfo;
        this.isBusiness = z2;
        this.challenge = list;
        this.recommendMusic2 = list2;
        this.hint = str7;
        this.relatedWords = list3;
        this.sdkExtra = str8;
        this.authorInfo = templateAuthor;
        this.count = j2;
        this.isCollect = z3;
        this.shareId = str9;
        this.clientKey = str10;
        this.fragmentCount = i;
        this.music = list4;
        this.requirements = list5;
        this.featureBits = list6;
        this.mvTypes = list7;
        this.urlPrefix = list8;
        this.sourceFrom = str11;
    }

    public /* synthetic */ VideoTemplateInfoExt(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, VideoTemplateVideoInfo videoTemplateVideoInfo, VideoTemplateDynamicCoverInfo videoTemplateDynamicCoverInfo, boolean z2, List list, List list2, String str7, List list3, String str8, TemplateAuthor templateAuthor, long j2, boolean z3, String str9, String str10, int i, List list4, List list5, List list6, List list7, List list8, String str11, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : videoTemplateVideoInfo, (i2 & 512) != 0 ? null : videoTemplateDynamicCoverInfo, (i2 & 1024) != 0 ? false : z2, (i2 & 2048) != 0 ? null : list, (i2 & 4096) != 0 ? null : list2, (i2 & FileUtils.BUFFER_SIZE) != 0 ? "" : str7, (i2 & 16384) != 0 ? null : list3, (32768 & i2) != 0 ? "" : str8, (65536 & i2) != 0 ? null : templateAuthor, (131072 & i2) != 0 ? 0L : j2, (262144 & i2) != 0 ? false : z3, (524288 & i2) != 0 ? "" : str9, (1048576 & i2) == 0 ? str10 : "", (2097152 & i2) != 0 ? 0 : i, (4194304 & i2) != 0 ? null : list4, (8388608 & i2) != 0 ? null : list5, (16777216 & i2) != 0 ? null : list6, (33554432 & i2) != 0 ? null : list7, (67108864 & i2) != 0 ? null : list8, (i2 & 134217728) != 0 ? null : str11);
    }
}
