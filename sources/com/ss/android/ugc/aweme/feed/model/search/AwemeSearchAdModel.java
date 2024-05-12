package com.ss.android.ugc.aweme.feed.model.search;

import X.C47959Irz;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AwemeSearchAdModel implements Serializable {

    @InterfaceC65349Pkn("learn_more_bg_color")
    public final String SearchAdTransformButtonColor;

    @InterfaceC65349Pkn("button_text")
    public final String SearchAdTransformButtonText;

    @InterfaceC65349Pkn("animation_type")
    public final Integer animationType;

    @InterfaceC65349Pkn("button_color_show_seconds")
    public final float buttonColorShowSeconds;

    @InterfaceC65349Pkn("enable_follow_button")
    public final Boolean enableSearchFollowBtn;

    @InterfaceC65349Pkn("auto_play")
    public final Boolean isAutoPlayEnable;

    @InterfaceC65349Pkn("is_ci_ad")
    public final Boolean isCiAd;

    @InterfaceC65349Pkn("is_horizontal")
    public final Boolean isHorizontal;

    @InterfaceC65349Pkn("is_precise_ad")
    public final Boolean isPreciseAd;

    @InterfaceC65349Pkn("mask_button_color")
    public final String maskBtnColor;

    @InterfaceC65349Pkn("out_anchor")
    public final SearchAdOutAnchor outAnchor;

    @InterfaceC65349Pkn("cta_position")
    public final Integer preciseAdCTAPosition;

    @InterfaceC65349Pkn("search_delivery_type")
    public final Integer searchDeliveryType;

    @InterfaceC65349Pkn("show_button_seconds")
    public final float showButtonSeconds;

    @InterfaceC65349Pkn("show_mask_times")
    public final Integer showMaskTimes;

    @InterfaceC65349Pkn("button_color_show_seconds_single")
    public final Float singleBtnColorShowSeconds;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AwemeSearchAdModel() {
        /*
            r19 = this;
            r1 = 0
            r3 = 0
            r17 = 65535(0xffff, float:9.1834E-41)
            r0 = r19
            r2 = r1
            r4 = r3
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
            r18 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel.<init>():void");
    }

    public static /* synthetic */ AwemeSearchAdModel copy$default(AwemeSearchAdModel awemeSearchAdModel, Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, Boolean bool2, Boolean bool3, Integer num3, Integer num4, Boolean bool4, Boolean bool5, String str3, Float f3, SearchAdOutAnchor searchAdOutAnchor, int i, Object obj) {
        Boolean bool6 = bool;
        Integer num5 = num;
        String str4 = str;
        float f4 = f;
        float f5 = f2;
        Boolean bool7 = bool2;
        Integer num6 = num2;
        String str5 = str2;
        Integer num7 = num4;
        Boolean bool8 = bool3;
        Integer num8 = num3;
        String str6 = str3;
        Boolean bool9 = bool4;
        Boolean bool10 = bool5;
        SearchAdOutAnchor searchAdOutAnchor2 = searchAdOutAnchor;
        Float f6 = f3;
        if ((i & 1) != 0) {
            bool6 = awemeSearchAdModel.isAutoPlayEnable;
        }
        if ((i & 2) != 0) {
            num5 = awemeSearchAdModel.animationType;
        }
        if ((i & 4) != 0) {
            f4 = awemeSearchAdModel.showButtonSeconds;
        }
        if ((i & 8) != 0) {
            f5 = awemeSearchAdModel.buttonColorShowSeconds;
        }
        if ((i & 16) != 0) {
            str4 = awemeSearchAdModel.SearchAdTransformButtonColor;
        }
        if ((i & 32) != 0) {
            num6 = awemeSearchAdModel.showMaskTimes;
        }
        if ((i & 64) != 0) {
            str5 = awemeSearchAdModel.SearchAdTransformButtonText;
        }
        if ((i & 128) != 0) {
            bool7 = awemeSearchAdModel.isPreciseAd;
        }
        if ((i & 256) != 0) {
            bool8 = awemeSearchAdModel.isHorizontal;
        }
        if ((i & 512) != 0) {
            num8 = awemeSearchAdModel.preciseAdCTAPosition;
        }
        if ((i & 1024) != 0) {
            num7 = awemeSearchAdModel.searchDeliveryType;
        }
        if ((i & 2048) != 0) {
            bool9 = awemeSearchAdModel.isCiAd;
        }
        if ((i & 4096) != 0) {
            bool10 = awemeSearchAdModel.enableSearchFollowBtn;
        }
        if ((i & FileUtils.BUFFER_SIZE) != 0) {
            str6 = awemeSearchAdModel.maskBtnColor;
        }
        if ((i & 16384) != 0) {
            f6 = awemeSearchAdModel.singleBtnColorShowSeconds;
        }
        if ((i & 32768) != 0) {
            searchAdOutAnchor2 = awemeSearchAdModel.outAnchor;
        }
        float f7 = f5;
        return awemeSearchAdModel.copy(bool6, num5, f4, f7, str4, num6, str5, bool7, bool8, num8, num7, bool9, bool10, str6, f6, searchAdOutAnchor2);
    }

    public final AwemeSearchAdModel copy(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, Boolean bool2, Boolean bool3, Integer num3, Integer num4, Boolean bool4, Boolean bool5, String str3, Float f3, SearchAdOutAnchor searchAdOutAnchor) {
        return new AwemeSearchAdModel(bool, num, f, f2, str, num2, str2, bool2, bool3, num3, num4, bool4, bool5, str3, f3, searchAdOutAnchor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeSearchAdModel)) {
            return false;
        }
        AwemeSearchAdModel awemeSearchAdModel = (AwemeSearchAdModel) obj;
        return o.LJ(this.isAutoPlayEnable, awemeSearchAdModel.isAutoPlayEnable) && o.LJ(this.animationType, awemeSearchAdModel.animationType) && Float.compare(this.showButtonSeconds, awemeSearchAdModel.showButtonSeconds) == 0 && Float.compare(this.buttonColorShowSeconds, awemeSearchAdModel.buttonColorShowSeconds) == 0 && o.LJ(this.SearchAdTransformButtonColor, awemeSearchAdModel.SearchAdTransformButtonColor) && o.LJ(this.showMaskTimes, awemeSearchAdModel.showMaskTimes) && o.LJ(this.SearchAdTransformButtonText, awemeSearchAdModel.SearchAdTransformButtonText) && o.LJ(this.isPreciseAd, awemeSearchAdModel.isPreciseAd) && o.LJ(this.isHorizontal, awemeSearchAdModel.isHorizontal) && o.LJ(this.preciseAdCTAPosition, awemeSearchAdModel.preciseAdCTAPosition) && o.LJ(this.searchDeliveryType, awemeSearchAdModel.searchDeliveryType) && o.LJ(this.isCiAd, awemeSearchAdModel.isCiAd) && o.LJ(this.enableSearchFollowBtn, awemeSearchAdModel.enableSearchFollowBtn) && o.LJ(this.maskBtnColor, awemeSearchAdModel.maskBtnColor) && o.LJ(this.singleBtnColorShowSeconds, awemeSearchAdModel.singleBtnColorShowSeconds) && o.LJ(this.outAnchor, awemeSearchAdModel.outAnchor);
    }

    public String toString() {
        return "AwemeSearchAdModel(isAutoPlayEnable=" + this.isAutoPlayEnable + ", animationType=" + this.animationType + ", showButtonSeconds=" + this.showButtonSeconds + ", buttonColorShowSeconds=" + this.buttonColorShowSeconds + ", SearchAdTransformButtonColor=" + this.SearchAdTransformButtonColor + ", showMaskTimes=" + this.showMaskTimes + ", SearchAdTransformButtonText=" + this.SearchAdTransformButtonText + ", isPreciseAd=" + this.isPreciseAd + ", isHorizontal=" + this.isHorizontal + ", preciseAdCTAPosition=" + this.preciseAdCTAPosition + ", searchDeliveryType=" + this.searchDeliveryType + ", isCiAd=" + this.isCiAd + ", enableSearchFollowBtn=" + this.enableSearchFollowBtn + ", maskBtnColor=" + this.maskBtnColor + ", singleBtnColorShowSeconds=" + this.singleBtnColorShowSeconds + ", outAnchor=" + this.outAnchor + ')';
    }

    public int hashCode() {
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
        Boolean bool = this.isAutoPlayEnable;
        int i = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.animationType;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int LIZIZ = C47959Irz.LIZIZ(this.buttonColorShowSeconds, C47959Irz.LIZIZ(this.showButtonSeconds, (i2 + hashCode2) * 31, 31), 31);
        String str = this.SearchAdTransformButtonColor;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i3 = (LIZIZ + hashCode3) * 31;
        Integer num2 = this.showMaskTimes;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str2 = this.SearchAdTransformButtonText;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Boolean bool2 = this.isPreciseAd;
        if (bool2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Boolean bool3 = this.isHorizontal;
        if (bool3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool3.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        Integer num3 = this.preciseAdCTAPosition;
        if (num3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num3.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        Integer num4 = this.searchDeliveryType;
        if (num4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num4.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        Boolean bool4 = this.isCiAd;
        if (bool4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = bool4.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        Boolean bool5 = this.enableSearchFollowBtn;
        if (bool5 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = bool5.hashCode();
        }
        int i11 = (i10 + hashCode11) * 31;
        String str3 = this.maskBtnColor;
        if (str3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str3.hashCode();
        }
        int i12 = (i11 + hashCode12) * 31;
        Float f = this.singleBtnColorShowSeconds;
        if (f == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = f.hashCode();
        }
        int i13 = (i12 + hashCode13) * 31;
        SearchAdOutAnchor searchAdOutAnchor = this.outAnchor;
        if (searchAdOutAnchor != null) {
            i = searchAdOutAnchor.hashCode();
        }
        return i13 + i;
    }

    public final Integer getAnimationType() {
        return this.animationType;
    }

    public final float getButtonColorShowSeconds() {
        return this.buttonColorShowSeconds;
    }

    public final Boolean getEnableSearchFollowBtn() {
        return this.enableSearchFollowBtn;
    }

    public final String getMaskBtnColor() {
        return this.maskBtnColor;
    }

    public final SearchAdOutAnchor getOutAnchor() {
        return this.outAnchor;
    }

    public final Integer getPreciseAdCTAPosition() {
        return this.preciseAdCTAPosition;
    }

    public final String getSearchAdTransformButtonColor() {
        return this.SearchAdTransformButtonColor;
    }

    public final String getSearchAdTransformButtonText() {
        return this.SearchAdTransformButtonText;
    }

    public final Integer getSearchDeliveryType() {
        return this.searchDeliveryType;
    }

    public final float getShowButtonSeconds() {
        return this.showButtonSeconds;
    }

    public final Integer getShowMaskTimes() {
        return this.showMaskTimes;
    }

    public final Float getSingleBtnColorShowSeconds() {
        return this.singleBtnColorShowSeconds;
    }

    public final Boolean isAutoPlayEnable() {
        return this.isAutoPlayEnable;
    }

    public final Boolean isCiAd() {
        return this.isCiAd;
    }

    public final Boolean isHorizontal() {
        return this.isHorizontal;
    }

    public final Boolean isPreciseAd() {
        return this.isPreciseAd;
    }

    public AwemeSearchAdModel(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, Boolean bool2, Boolean bool3, Integer num3, Integer num4, Boolean bool4, Boolean bool5, String str3, Float f3, SearchAdOutAnchor searchAdOutAnchor) {
        this.isAutoPlayEnable = bool;
        this.animationType = num;
        this.showButtonSeconds = f;
        this.buttonColorShowSeconds = f2;
        this.SearchAdTransformButtonColor = str;
        this.showMaskTimes = num2;
        this.SearchAdTransformButtonText = str2;
        this.isPreciseAd = bool2;
        this.isHorizontal = bool3;
        this.preciseAdCTAPosition = num3;
        this.searchDeliveryType = num4;
        this.isCiAd = bool4;
        this.enableSearchFollowBtn = bool5;
        this.maskBtnColor = str3;
        this.singleBtnColorShowSeconds = f3;
        this.outAnchor = searchAdOutAnchor;
    }

    public /* synthetic */ AwemeSearchAdModel(Boolean bool, Integer num, float f, float f2, String str, Integer num2, String str2, Boolean bool2, Boolean bool3, Integer num3, Integer num4, Boolean bool4, Boolean bool5, String str3, Float f3, SearchAdOutAnchor searchAdOutAnchor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? 0.0f : f2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? 2 : num2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? Boolean.FALSE : bool2, (i & 256) != 0 ? Boolean.FALSE : bool3, (i & 512) != 0 ? 1 : num3, (i & 1024) != 0 ? 1 : num4, (i & 2048) != 0 ? Boolean.FALSE : bool4, (i & 4096) != 0 ? Boolean.FALSE : bool5, (i & FileUtils.BUFFER_SIZE) != 0 ? null : str3, (i & 16384) != 0 ? Float.valueOf(0.0f) : f3, (i & 32768) != 0 ? null : searchAdOutAnchor);
    }
}
