package com.ss.android.ugc.aweme.now;

import X.C197717pP;
import X.InterfaceC65349Pkn;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostInfo implements Serializable {
    public static final C197717pP Companion = new Object() { // from class: X.7pP
    };

    @InterfaceC65349Pkn("attributes")
    public NowPostAttributes attributes;
    public transient Bitmap backBitmap;

    @InterfaceC65349Pkn("back_image")
    public UrlModel backImage;

    @InterfaceC65349Pkn("back_image_thumbnail")
    public UrlModel backImageThumbnail;

    @InterfaceC65349Pkn("background_music")
    public Music backgroundMusic;

    @InterfaceC65349Pkn("composite_image_ltr")
    public UrlModel compositeImageLTR;

    @InterfaceC65349Pkn("composite_image_ltr_without_watermark")
    public UrlModel compositeImageLtrWithoutWatermark;

    @InterfaceC65349Pkn("composite_image_rtl")
    public UrlModel compositeImageRTL;

    @InterfaceC65349Pkn("composite_image_rtl_without_watermark")
    public UrlModel compositeImageRtlWithoutWatermark;

    @InterfaceC65349Pkn("create_time_in_author_timezone")
    public String createTimeInAuthorTimeZone;
    public transient Bitmap frontBitmap;

    @InterfaceC65349Pkn("front_image")
    public UrlModel frontImage;

    @InterfaceC65349Pkn("front_image_thumbnail")
    public UrlModel frontImageThumbnail;

    @InterfaceC65349Pkn("fuzzy_front_image_thumbnail")
    public UrlModel fuzzyFrontImageThumbnail;

    @InterfaceC65349Pkn("fuzzy_front_image_thumbnail_with_logo")
    public UrlModel fuzzyFrontImageThumbnailWithLogo;

    @InterfaceC65349Pkn("fuzzy_image")
    public UrlModel fuzzyImage;

    @InterfaceC65349Pkn("fuzzy_image_rtl_with_watermark")
    public UrlModel fuzzyImageRtlWithWatermark;

    @InterfaceC65349Pkn("fuzzy_image_with_watermark")
    public UrlModel fuzzyImageWithWatermark;

    @InterfaceC65349Pkn("has_now_collection")
    public boolean hasNowCollection;

    @InterfaceC65349Pkn("image_for_dm_share_ltr")
    public UrlModel imageForDmShareLtr;

    @InterfaceC65349Pkn("image_for_dm_share_rtl")
    public UrlModel imageForDmShareRtl;

    @InterfaceC65349Pkn("incompatibility_info")
    public NowIncompatibilityInfo incompatibilityInfo;

    @InterfaceC65349Pkn("last_pushed_at_sec")
    public Long lastPushedAtSec;

    @InterfaceC65349Pkn("now_interaction_control")
    public NowInteractionControl nowInteractionControl;

    @InterfaceC65349Pkn("now_media_type")
    public String nowMediaType;

    @InterfaceC65349Pkn("consumption_info")
    public NowPostConsumptionInfo nowPostConsumptionInfo;

    @InterfaceC65349Pkn("now_post_source")
    public int nowPostSource;

    @InterfaceC65349Pkn("now_status")
    public Integer nowStatus;

    @InterfaceC65349Pkn("view_state")
    public int nowViewState;

    @InterfaceC65349Pkn("watermark_image_ltr")
    public UrlModel watermarkImageLTR;

    @InterfaceC65349Pkn("watermark_image_rtl")
    public UrlModel watermarkImageRTL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NowPostInfo() {
        /*
            r34 = this;
            r1 = 0
            r24 = 0
            r32 = 2147483647(0x7fffffff, float:NaN)
            r0 = r34
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r10 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            r18 = r1
            r19 = r1
            r20 = r1
            r21 = r1
            r22 = r1
            r23 = r1
            r25 = r24
            r26 = r1
            r27 = r24
            r28 = r1
            r29 = r1
            r30 = r1
            r31 = r1
            r33 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.now.NowPostInfo.<init>():void");
    }

    public static /* synthetic */ NowPostInfo copy$default(NowPostInfo nowPostInfo, UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, UrlModel urlModel7, UrlModel urlModel8, UrlModel urlModel9, UrlModel urlModel10, UrlModel urlModel11, UrlModel urlModel12, UrlModel urlModel13, UrlModel urlModel14, UrlModel urlModel15, UrlModel urlModel16, UrlModel urlModel17, Long l, NowIncompatibilityInfo nowIncompatibilityInfo, String str, Integer num, String str2, NowInteractionControl nowInteractionControl, int i, int i2, Music music, boolean z, NowPostConsumptionInfo nowPostConsumptionInfo, NowPostAttributes nowPostAttributes, Bitmap bitmap, Bitmap bitmap2, int i3, Object obj) {
        UrlModel urlModel18 = urlModel13;
        UrlModel urlModel19 = urlModel12;
        UrlModel urlModel20 = urlModel11;
        UrlModel urlModel21 = urlModel14;
        UrlModel urlModel22 = urlModel10;
        UrlModel urlModel23 = urlModel9;
        UrlModel urlModel24 = urlModel8;
        UrlModel urlModel25 = urlModel7;
        UrlModel urlModel26 = urlModel2;
        UrlModel urlModel27 = urlModel;
        UrlModel urlModel28 = urlModel3;
        UrlModel urlModel29 = urlModel4;
        UrlModel urlModel30 = urlModel5;
        UrlModel urlModel31 = urlModel6;
        String str3 = str;
        NowIncompatibilityInfo nowIncompatibilityInfo2 = nowIncompatibilityInfo;
        Long l2 = l;
        UrlModel urlModel32 = urlModel17;
        UrlModel urlModel33 = urlModel15;
        Bitmap bitmap3 = bitmap2;
        UrlModel urlModel34 = urlModel16;
        Integer num2 = num;
        String str4 = str2;
        NowInteractionControl nowInteractionControl2 = nowInteractionControl;
        int i4 = i;
        Bitmap bitmap4 = bitmap;
        int i5 = i2;
        Music music2 = music;
        boolean z2 = z;
        NowPostConsumptionInfo nowPostConsumptionInfo2 = nowPostConsumptionInfo;
        NowPostAttributes nowPostAttributes2 = nowPostAttributes;
        if ((i3 & 1) != 0) {
            urlModel27 = nowPostInfo.backImage;
        }
        if ((i3 & 2) != 0) {
            urlModel26 = nowPostInfo.backImageThumbnail;
        }
        if ((i3 & 4) != 0) {
            urlModel28 = nowPostInfo.frontImage;
        }
        if ((i3 & 8) != 0) {
            urlModel29 = nowPostInfo.frontImageThumbnail;
        }
        if ((i3 & 16) != 0) {
            urlModel30 = nowPostInfo.fuzzyFrontImageThumbnail;
        }
        if ((i3 & 32) != 0) {
            urlModel31 = nowPostInfo.fuzzyFrontImageThumbnailWithLogo;
        }
        if ((i3 & 64) != 0) {
            urlModel25 = nowPostInfo.fuzzyImageWithWatermark;
        }
        if ((i3 & 128) != 0) {
            urlModel24 = nowPostInfo.fuzzyImageRtlWithWatermark;
        }
        if ((i3 & 256) != 0) {
            urlModel23 = nowPostInfo.imageForDmShareLtr;
        }
        if ((i3 & 512) != 0) {
            urlModel22 = nowPostInfo.imageForDmShareRtl;
        }
        if ((i3 & 1024) != 0) {
            urlModel20 = nowPostInfo.watermarkImageLTR;
        }
        if ((i3 & 2048) != 0) {
            urlModel19 = nowPostInfo.watermarkImageRTL;
        }
        if ((i3 & 4096) != 0) {
            urlModel18 = nowPostInfo.compositeImageLtrWithoutWatermark;
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            urlModel21 = nowPostInfo.compositeImageRtlWithoutWatermark;
        }
        if ((i3 & 16384) != 0) {
            urlModel33 = nowPostInfo.fuzzyImage;
        }
        if ((32768 & i3) != 0) {
            urlModel34 = nowPostInfo.compositeImageLTR;
        }
        if ((65536 & i3) != 0) {
            urlModel32 = nowPostInfo.compositeImageRTL;
        }
        if ((131072 & i3) != 0) {
            l2 = nowPostInfo.lastPushedAtSec;
        }
        if ((262144 & i3) != 0) {
            nowIncompatibilityInfo2 = nowPostInfo.incompatibilityInfo;
        }
        if ((524288 & i3) != 0) {
            str3 = nowPostInfo.nowMediaType;
        }
        if ((1048576 & i3) != 0) {
            num2 = nowPostInfo.nowStatus;
        }
        if ((2097152 & i3) != 0) {
            str4 = nowPostInfo.createTimeInAuthorTimeZone;
        }
        if ((4194304 & i3) != 0) {
            nowInteractionControl2 = nowPostInfo.nowInteractionControl;
        }
        if ((8388608 & i3) != 0) {
            i4 = nowPostInfo.nowPostSource;
        }
        if ((16777216 & i3) != 0) {
            i5 = nowPostInfo.nowViewState;
        }
        if ((33554432 & i3) != 0) {
            music2 = nowPostInfo.backgroundMusic;
        }
        if ((67108864 & i3) != 0) {
            z2 = nowPostInfo.hasNowCollection;
        }
        if ((134217728 & i3) != 0) {
            nowPostConsumptionInfo2 = nowPostInfo.nowPostConsumptionInfo;
        }
        if ((268435456 & i3) != 0) {
            nowPostAttributes2 = nowPostInfo.attributes;
        }
        if ((536870912 & i3) != 0) {
            bitmap4 = nowPostInfo.frontBitmap;
        }
        if ((i3 & 1073741824) != 0) {
            bitmap3 = nowPostInfo.backBitmap;
        }
        return nowPostInfo.copy(urlModel27, urlModel26, urlModel28, urlModel29, urlModel30, urlModel31, urlModel25, urlModel24, urlModel23, urlModel22, urlModel20, urlModel19, urlModel18, urlModel21, urlModel33, urlModel34, urlModel32, l2, nowIncompatibilityInfo2, str3, num2, str4, nowInteractionControl2, i4, i5, music2, z2, nowPostConsumptionInfo2, nowPostAttributes2, bitmap4, bitmap3);
    }

    public final NowPostInfo copy(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, UrlModel urlModel7, UrlModel urlModel8, UrlModel urlModel9, UrlModel urlModel10, UrlModel urlModel11, UrlModel urlModel12, UrlModel urlModel13, UrlModel urlModel14, UrlModel urlModel15, UrlModel urlModel16, UrlModel urlModel17, Long l, NowIncompatibilityInfo nowIncompatibilityInfo, String str, Integer num, String str2, NowInteractionControl nowInteractionControl, int i, int i2, Music music, boolean z, NowPostConsumptionInfo nowPostConsumptionInfo, NowPostAttributes nowPostAttributes, Bitmap bitmap, Bitmap bitmap2) {
        return new NowPostInfo(urlModel, urlModel2, urlModel3, urlModel4, urlModel5, urlModel6, urlModel7, urlModel8, urlModel9, urlModel10, urlModel11, urlModel12, urlModel13, urlModel14, urlModel15, urlModel16, urlModel17, l, nowIncompatibilityInfo, str, num, str2, nowInteractionControl, i, i2, music, z, nowPostConsumptionInfo, nowPostAttributes, bitmap, bitmap2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowPostInfo)) {
            return false;
        }
        NowPostInfo nowPostInfo = (NowPostInfo) obj;
        return o.LJ(this.backImage, nowPostInfo.backImage) && o.LJ(this.backImageThumbnail, nowPostInfo.backImageThumbnail) && o.LJ(this.frontImage, nowPostInfo.frontImage) && o.LJ(this.frontImageThumbnail, nowPostInfo.frontImageThumbnail) && o.LJ(this.fuzzyFrontImageThumbnail, nowPostInfo.fuzzyFrontImageThumbnail) && o.LJ(this.fuzzyFrontImageThumbnailWithLogo, nowPostInfo.fuzzyFrontImageThumbnailWithLogo) && o.LJ(this.fuzzyImageWithWatermark, nowPostInfo.fuzzyImageWithWatermark) && o.LJ(this.fuzzyImageRtlWithWatermark, nowPostInfo.fuzzyImageRtlWithWatermark) && o.LJ(this.imageForDmShareLtr, nowPostInfo.imageForDmShareLtr) && o.LJ(this.imageForDmShareRtl, nowPostInfo.imageForDmShareRtl) && o.LJ(this.watermarkImageLTR, nowPostInfo.watermarkImageLTR) && o.LJ(this.watermarkImageRTL, nowPostInfo.watermarkImageRTL) && o.LJ(this.compositeImageLtrWithoutWatermark, nowPostInfo.compositeImageLtrWithoutWatermark) && o.LJ(this.compositeImageRtlWithoutWatermark, nowPostInfo.compositeImageRtlWithoutWatermark) && o.LJ(this.fuzzyImage, nowPostInfo.fuzzyImage) && o.LJ(this.compositeImageLTR, nowPostInfo.compositeImageLTR) && o.LJ(this.compositeImageRTL, nowPostInfo.compositeImageRTL) && o.LJ(this.lastPushedAtSec, nowPostInfo.lastPushedAtSec) && o.LJ(this.incompatibilityInfo, nowPostInfo.incompatibilityInfo) && o.LJ(this.nowMediaType, nowPostInfo.nowMediaType) && o.LJ(this.nowStatus, nowPostInfo.nowStatus) && o.LJ(this.createTimeInAuthorTimeZone, nowPostInfo.createTimeInAuthorTimeZone) && o.LJ(this.nowInteractionControl, nowPostInfo.nowInteractionControl) && this.nowPostSource == nowPostInfo.nowPostSource && this.nowViewState == nowPostInfo.nowViewState && o.LJ(this.backgroundMusic, nowPostInfo.backgroundMusic) && this.hasNowCollection == nowPostInfo.hasNowCollection && o.LJ(this.nowPostConsumptionInfo, nowPostInfo.nowPostConsumptionInfo) && o.LJ(this.attributes, nowPostInfo.attributes) && o.LJ(this.frontBitmap, nowPostInfo.frontBitmap) && o.LJ(this.backBitmap, nowPostInfo.backBitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        UrlModel urlModel = this.backImage;
        int hashCode = (urlModel == null ? 0 : urlModel.hashCode()) * 31;
        UrlModel urlModel2 = this.backImageThumbnail;
        int hashCode2 = (hashCode + (urlModel2 == null ? 0 : urlModel2.hashCode())) * 31;
        UrlModel urlModel3 = this.frontImage;
        int hashCode3 = (hashCode2 + (urlModel3 == null ? 0 : urlModel3.hashCode())) * 31;
        UrlModel urlModel4 = this.frontImageThumbnail;
        int hashCode4 = (hashCode3 + (urlModel4 == null ? 0 : urlModel4.hashCode())) * 31;
        UrlModel urlModel5 = this.fuzzyFrontImageThumbnail;
        int hashCode5 = (hashCode4 + (urlModel5 == null ? 0 : urlModel5.hashCode())) * 31;
        UrlModel urlModel6 = this.fuzzyFrontImageThumbnailWithLogo;
        int hashCode6 = (hashCode5 + (urlModel6 == null ? 0 : urlModel6.hashCode())) * 31;
        UrlModel urlModel7 = this.fuzzyImageWithWatermark;
        int hashCode7 = (hashCode6 + (urlModel7 == null ? 0 : urlModel7.hashCode())) * 31;
        UrlModel urlModel8 = this.fuzzyImageRtlWithWatermark;
        int hashCode8 = (hashCode7 + (urlModel8 == null ? 0 : urlModel8.hashCode())) * 31;
        UrlModel urlModel9 = this.imageForDmShareLtr;
        int hashCode9 = (hashCode8 + (urlModel9 == null ? 0 : urlModel9.hashCode())) * 31;
        UrlModel urlModel10 = this.imageForDmShareRtl;
        int hashCode10 = (hashCode9 + (urlModel10 == null ? 0 : urlModel10.hashCode())) * 31;
        UrlModel urlModel11 = this.watermarkImageLTR;
        int hashCode11 = (hashCode10 + (urlModel11 == null ? 0 : urlModel11.hashCode())) * 31;
        UrlModel urlModel12 = this.watermarkImageRTL;
        int hashCode12 = (hashCode11 + (urlModel12 == null ? 0 : urlModel12.hashCode())) * 31;
        UrlModel urlModel13 = this.compositeImageLtrWithoutWatermark;
        int hashCode13 = (hashCode12 + (urlModel13 == null ? 0 : urlModel13.hashCode())) * 31;
        UrlModel urlModel14 = this.compositeImageRtlWithoutWatermark;
        int hashCode14 = (hashCode13 + (urlModel14 == null ? 0 : urlModel14.hashCode())) * 31;
        UrlModel urlModel15 = this.fuzzyImage;
        int hashCode15 = (hashCode14 + (urlModel15 == null ? 0 : urlModel15.hashCode())) * 31;
        UrlModel urlModel16 = this.compositeImageLTR;
        int hashCode16 = (hashCode15 + (urlModel16 == null ? 0 : urlModel16.hashCode())) * 31;
        UrlModel urlModel17 = this.compositeImageRTL;
        int hashCode17 = (hashCode16 + (urlModel17 == null ? 0 : urlModel17.hashCode())) * 31;
        Long l = this.lastPushedAtSec;
        int hashCode18 = (hashCode17 + (l == null ? 0 : l.hashCode())) * 31;
        NowIncompatibilityInfo nowIncompatibilityInfo = this.incompatibilityInfo;
        int hashCode19 = (hashCode18 + (nowIncompatibilityInfo == null ? 0 : nowIncompatibilityInfo.hashCode())) * 31;
        String str = this.nowMediaType;
        int hashCode20 = (hashCode19 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.nowStatus;
        int hashCode21 = (hashCode20 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.createTimeInAuthorTimeZone;
        int hashCode22 = (hashCode21 + (str2 == null ? 0 : str2.hashCode())) * 31;
        NowInteractionControl nowInteractionControl = this.nowInteractionControl;
        int hashCode23 = (((((hashCode22 + (nowInteractionControl == null ? 0 : nowInteractionControl.hashCode())) * 31) + this.nowPostSource) * 31) + this.nowViewState) * 31;
        Music music = this.backgroundMusic;
        int hashCode24 = (hashCode23 + (music == null ? 0 : music.hashCode())) * 31;
        boolean z = this.hasNowCollection;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode24 + i) * 31;
        NowPostConsumptionInfo nowPostConsumptionInfo = this.nowPostConsumptionInfo;
        int hashCode25 = (i2 + (nowPostConsumptionInfo == null ? 0 : nowPostConsumptionInfo.hashCode())) * 31;
        NowPostAttributes nowPostAttributes = this.attributes;
        int hashCode26 = (hashCode25 + (nowPostAttributes == null ? 0 : nowPostAttributes.hashCode())) * 31;
        Bitmap bitmap = this.frontBitmap;
        int hashCode27 = (hashCode26 + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Bitmap bitmap2 = this.backBitmap;
        return hashCode27 + (bitmap2 != null ? bitmap2.hashCode() : 0);
    }

    public String toString() {
        return "NowPostInfo(backImage=" + this.backImage + ", backImageThumbnail=" + this.backImageThumbnail + ", frontImage=" + this.frontImage + ", frontImageThumbnail=" + this.frontImageThumbnail + ", fuzzyFrontImageThumbnail=" + this.fuzzyFrontImageThumbnail + ", fuzzyFrontImageThumbnailWithLogo=" + this.fuzzyFrontImageThumbnailWithLogo + ", fuzzyImageWithWatermark=" + this.fuzzyImageWithWatermark + ", fuzzyImageRtlWithWatermark=" + this.fuzzyImageRtlWithWatermark + ", imageForDmShareLtr=" + this.imageForDmShareLtr + ", imageForDmShareRtl=" + this.imageForDmShareRtl + ", watermarkImageLTR=" + this.watermarkImageLTR + ", watermarkImageRTL=" + this.watermarkImageRTL + ", compositeImageLtrWithoutWatermark=" + this.compositeImageLtrWithoutWatermark + ", compositeImageRtlWithoutWatermark=" + this.compositeImageRtlWithoutWatermark + ", fuzzyImage=" + this.fuzzyImage + ", compositeImageLTR=" + this.compositeImageLTR + ", compositeImageRTL=" + this.compositeImageRTL + ", lastPushedAtSec=" + this.lastPushedAtSec + ", incompatibilityInfo=" + this.incompatibilityInfo + ", nowMediaType=" + this.nowMediaType + ", nowStatus=" + this.nowStatus + ", createTimeInAuthorTimeZone=" + this.createTimeInAuthorTimeZone + ", nowInteractionControl=" + this.nowInteractionControl + ", nowPostSource=" + this.nowPostSource + ", nowViewState=" + this.nowViewState + ", backgroundMusic=" + this.backgroundMusic + ", hasNowCollection=" + this.hasNowCollection + ", nowPostConsumptionInfo=" + this.nowPostConsumptionInfo + ", attributes=" + this.attributes + ", frontBitmap=" + this.frontBitmap + ", backBitmap=" + this.backBitmap + ')';
    }

    public final int getPrivateStatus() {
        Integer num = this.nowStatus;
        if (num == null || num.intValue() != 0) {
            return 0;
        }
        return 2;
    }

    public final NowPostAttributes getAttributes() {
        return this.attributes;
    }

    public final Bitmap getBackBitmap() {
        return this.backBitmap;
    }

    public final UrlModel getBackImage() {
        return this.backImage;
    }

    public final UrlModel getBackImageThumbnail() {
        return this.backImageThumbnail;
    }

    public final Music getBackgroundMusic() {
        return this.backgroundMusic;
    }

    public final UrlModel getCompositeImageLTR() {
        return this.compositeImageLTR;
    }

    public final UrlModel getCompositeImageLtrWithoutWatermark() {
        return this.compositeImageLtrWithoutWatermark;
    }

    public final UrlModel getCompositeImageRTL() {
        return this.compositeImageRTL;
    }

    public final UrlModel getCompositeImageRtlWithoutWatermark() {
        return this.compositeImageRtlWithoutWatermark;
    }

    public final String getCreateTimeInAuthorTimeZone() {
        return this.createTimeInAuthorTimeZone;
    }

    public final Bitmap getFrontBitmap() {
        return this.frontBitmap;
    }

    public final UrlModel getFrontImage() {
        return this.frontImage;
    }

    public final UrlModel getFrontImageThumbnail() {
        return this.frontImageThumbnail;
    }

    public final UrlModel getFuzzyFrontImageThumbnail() {
        return this.fuzzyFrontImageThumbnail;
    }

    public final UrlModel getFuzzyFrontImageThumbnailWithLogo() {
        return this.fuzzyFrontImageThumbnailWithLogo;
    }

    public final UrlModel getFuzzyImage() {
        return this.fuzzyImage;
    }

    public final UrlModel getFuzzyImageRtlWithWatermark() {
        return this.fuzzyImageRtlWithWatermark;
    }

    public final UrlModel getFuzzyImageWithWatermark() {
        return this.fuzzyImageWithWatermark;
    }

    public final boolean getHasNowCollection() {
        return this.hasNowCollection;
    }

    public final UrlModel getImageForDmShareLtr() {
        return this.imageForDmShareLtr;
    }

    public final UrlModel getImageForDmShareRtl() {
        return this.imageForDmShareRtl;
    }

    public final NowIncompatibilityInfo getIncompatibilityInfo() {
        return this.incompatibilityInfo;
    }

    public final Long getLastPushedAtSec() {
        return this.lastPushedAtSec;
    }

    public final NowInteractionControl getNowInteractionControl() {
        return this.nowInteractionControl;
    }

    public final String getNowMediaType() {
        return this.nowMediaType;
    }

    public final NowPostConsumptionInfo getNowPostConsumptionInfo() {
        return this.nowPostConsumptionInfo;
    }

    public final int getNowPostSource() {
        return this.nowPostSource;
    }

    public final Integer getNowStatus() {
        return this.nowStatus;
    }

    public final int getNowViewState() {
        return this.nowViewState;
    }

    public final UrlModel getWatermarkImageLTR() {
        return this.watermarkImageLTR;
    }

    public final UrlModel getWatermarkImageRTL() {
        return this.watermarkImageRTL;
    }

    public NowPostInfo(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, UrlModel urlModel7, UrlModel urlModel8, UrlModel urlModel9, UrlModel urlModel10, UrlModel urlModel11, UrlModel urlModel12, UrlModel urlModel13, UrlModel urlModel14, UrlModel urlModel15, UrlModel urlModel16, UrlModel urlModel17, Long l, NowIncompatibilityInfo nowIncompatibilityInfo, String str, Integer num, String str2, NowInteractionControl nowInteractionControl, int i, int i2, Music music, boolean z, NowPostConsumptionInfo nowPostConsumptionInfo, NowPostAttributes nowPostAttributes, Bitmap bitmap, Bitmap bitmap2) {
        this.backImage = urlModel;
        this.backImageThumbnail = urlModel2;
        this.frontImage = urlModel3;
        this.frontImageThumbnail = urlModel4;
        this.fuzzyFrontImageThumbnail = urlModel5;
        this.fuzzyFrontImageThumbnailWithLogo = urlModel6;
        this.fuzzyImageWithWatermark = urlModel7;
        this.fuzzyImageRtlWithWatermark = urlModel8;
        this.imageForDmShareLtr = urlModel9;
        this.imageForDmShareRtl = urlModel10;
        this.watermarkImageLTR = urlModel11;
        this.watermarkImageRTL = urlModel12;
        this.compositeImageLtrWithoutWatermark = urlModel13;
        this.compositeImageRtlWithoutWatermark = urlModel14;
        this.fuzzyImage = urlModel15;
        this.compositeImageLTR = urlModel16;
        this.compositeImageRTL = urlModel17;
        this.lastPushedAtSec = l;
        this.incompatibilityInfo = nowIncompatibilityInfo;
        this.nowMediaType = str;
        this.nowStatus = num;
        this.createTimeInAuthorTimeZone = str2;
        this.nowInteractionControl = nowInteractionControl;
        this.nowPostSource = i;
        this.nowViewState = i2;
        this.backgroundMusic = music;
        this.hasNowCollection = z;
        this.nowPostConsumptionInfo = nowPostConsumptionInfo;
        this.attributes = nowPostAttributes;
        this.frontBitmap = bitmap;
        this.backBitmap = bitmap2;
    }

    public /* synthetic */ NowPostInfo(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3, UrlModel urlModel4, UrlModel urlModel5, UrlModel urlModel6, UrlModel urlModel7, UrlModel urlModel8, UrlModel urlModel9, UrlModel urlModel10, UrlModel urlModel11, UrlModel urlModel12, UrlModel urlModel13, UrlModel urlModel14, UrlModel urlModel15, UrlModel urlModel16, UrlModel urlModel17, Long l, NowIncompatibilityInfo nowIncompatibilityInfo, String str, Integer num, String str2, NowInteractionControl nowInteractionControl, int i, int i2, Music music, boolean z, NowPostConsumptionInfo nowPostConsumptionInfo, NowPostAttributes nowPostAttributes, Bitmap bitmap, Bitmap bitmap2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : urlModel, (i3 & 2) != 0 ? null : urlModel2, (i3 & 4) != 0 ? null : urlModel3, (i3 & 8) != 0 ? null : urlModel4, (i3 & 16) != 0 ? null : urlModel5, (i3 & 32) != 0 ? null : urlModel6, (i3 & 64) != 0 ? null : urlModel7, (i3 & 128) != 0 ? null : urlModel8, (i3 & 256) != 0 ? null : urlModel9, (i3 & 512) != 0 ? null : urlModel10, (i3 & 1024) != 0 ? null : urlModel11, (i3 & 2048) != 0 ? null : urlModel12, (i3 & 4096) != 0 ? null : urlModel13, (i3 & FileUtils.BUFFER_SIZE) != 0 ? null : urlModel14, (i3 & 16384) != 0 ? null : urlModel15, (32768 & i3) != 0 ? null : urlModel16, (65536 & i3) != 0 ? null : urlModel17, (131072 & i3) != 0 ? null : l, (262144 & i3) != 0 ? null : nowIncompatibilityInfo, (524288 & i3) != 0 ? null : str, (1048576 & i3) != 0 ? null : num, (2097152 & i3) != 0 ? null : str2, (4194304 & i3) != 0 ? null : nowInteractionControl, (8388608 & i3) != 0 ? 0 : i, (16777216 & i3) != 0 ? 0 : i2, (33554432 & i3) != 0 ? null : music, (67108864 & i3) == 0 ? z : false, (134217728 & i3) != 0 ? null : nowPostConsumptionInfo, (268435456 & i3) != 0 ? null : nowPostAttributes, (536870912 & i3) != 0 ? null : bitmap, (i3 & 1073741824) != 0 ? null : bitmap2);
    }
}
