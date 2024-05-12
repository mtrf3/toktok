package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.AnonymousClass391;
import X.C47959Irz;
import X.C79062V1e;
import X.C79159V4x;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.WH9;
import X.WHB;
import X.WHK;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class OuterEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextConfig> CREATOR = new C79159V4x();

    @InterfaceC65349Pkn("bg_configs")
    public final List<OuterEffectTextBgConfig> bgConfigs;

    @InterfaceC65349Pkn("cover_configs")
    public final List<OuterEffectTextCoverConfig> coverConfigs;

    @InterfaceC65349Pkn("cursor_color")
    public final String cursorColor;

    @InterfaceC65349Pkn("font_style")
    public final int fontStyle;

    @InterfaceC65349Pkn("gradient_orientation")
    public final int gradientOrientation;

    @InterfaceC65349Pkn("gradient_type")
    public final int gradientType;

    @InterfaceC65349Pkn("gravity")
    public final int gravity;

    @InterfaceC65349Pkn("layer_weight")
    public final int layerWeight;

    @InterfaceC65349Pkn("margin_bottom")
    public final int marginBottom;

    @InterfaceC65349Pkn("margin_end")
    public final int marginEnd;

    @InterfaceC65349Pkn("margin_start")
    public final int marginStart;

    @InterfaceC65349Pkn("margin_top")
    public final int marginTop;

    @InterfaceC65349Pkn("max_line")
    public final int maxLine;

    @InterfaceC65349Pkn("min_height")
    public final int minHeight;

    @InterfaceC65349Pkn("min_width")
    public final int minWidth;

    @InterfaceC65349Pkn("padding_bottom")
    public final int paddingBottom;

    @InterfaceC65349Pkn("padding_end")
    public final int paddingEnd;

    @InterfaceC65349Pkn("padding_start")
    public final int paddingStart;

    @InterfaceC65349Pkn("padding_top")
    public final int paddingTop;

    @InterfaceC65349Pkn("paint_style")
    public final int paintStyle;

    @InterfaceC65349Pkn("placeholder_string_color")
    public final String placeholderStringColor;

    @InterfaceC65349Pkn("shadow_config")
    public final OuterEffectTextShadowConfig shadowConfig;

    @InterfaceC65349Pkn("spacing_add")
    public final float spacingAdd;

    @InterfaceC65349Pkn("spacing_letter")
    public final float spacingLetter;

    @InterfaceC65349Pkn("spacing_mult")
    public final float spacingMult;

    @InterfaceC65349Pkn("stroke_configs")
    public final List<OuterEffectTextStrokeConfig> strokeConfigs;

    @InterfaceC65349Pkn("text_color_end")
    public final String textColorEnd;

    @InterfaceC65349Pkn("text_color_start")
    public final String textColorStart;

    @InterfaceC65349Pkn("text_size")
    public final int textSize;

    @InterfaceC65349Pkn("typeface_id")
    public final String typefaceId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OuterEffectTextConfig() {
        /*
            r33 = this;
            r1 = 0
            r14 = 0
            r23 = 0
            r31 = 1073741823(0x3fffffff, float:1.9999999)
            r0 = r33
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
            r15 = r14
            r16 = r1
            r17 = r1
            r18 = r14
            r19 = r14
            r20 = r1
            r21 = r1
            r22 = r1
            r24 = r23
            r25 = r23
            r26 = r14
            r27 = r14
            r28 = r14
            r29 = r14
            r30 = r14
            r32 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextConfig.<init>():void");
    }

    public static /* synthetic */ OuterEffectTextConfig copy$default(OuterEffectTextConfig outerEffectTextConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List list, List list2, List list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i19, Object obj) {
        int i20 = i13;
        int i21 = i12;
        int i22 = i11;
        int i23 = i10;
        String str6 = str;
        int i24 = i9;
        int i25 = i8;
        int i26 = i7;
        int i27 = i2;
        int i28 = i;
        int i29 = i3;
        int i30 = i4;
        int i31 = i5;
        int i32 = i6;
        int i33 = i16;
        String str7 = str4;
        String str8 = str3;
        int i34 = i15;
        String str9 = str2;
        OuterEffectTextShadowConfig outerEffectTextShadowConfig2 = outerEffectTextShadowConfig;
        int i35 = i14;
        int i36 = i17;
        int i37 = i18;
        float f4 = f;
        float f5 = f2;
        List list4 = list3;
        float f6 = f3;
        String str10 = str5;
        List list5 = list;
        List list6 = list2;
        if ((i19 & 1) != 0) {
            i28 = outerEffectTextConfig.paddingStart;
        }
        if ((i19 & 2) != 0) {
            i27 = outerEffectTextConfig.paddingEnd;
        }
        if ((i19 & 4) != 0) {
            i29 = outerEffectTextConfig.paddingTop;
        }
        if ((i19 & 8) != 0) {
            i30 = outerEffectTextConfig.paddingBottom;
        }
        if ((i19 & 16) != 0) {
            i31 = outerEffectTextConfig.layerWeight;
        }
        if ((i19 & 32) != 0) {
            i32 = outerEffectTextConfig.marginStart;
        }
        if ((i19 & 64) != 0) {
            i26 = outerEffectTextConfig.marginEnd;
        }
        if ((i19 & 128) != 0) {
            i25 = outerEffectTextConfig.marginTop;
        }
        if ((i19 & 256) != 0) {
            i24 = outerEffectTextConfig.marginBottom;
        }
        if ((i19 & 512) != 0) {
            i23 = outerEffectTextConfig.textSize;
        }
        if ((i19 & 1024) != 0) {
            i22 = outerEffectTextConfig.maxLine;
        }
        if ((i19 & 2048) != 0) {
            i21 = outerEffectTextConfig.minWidth;
        }
        if ((i19 & 4096) != 0) {
            i20 = outerEffectTextConfig.minHeight;
        }
        if ((i19 & FileUtils.BUFFER_SIZE) != 0) {
            str6 = outerEffectTextConfig.placeholderStringColor;
        }
        if ((i19 & 16384) != 0) {
            str9 = outerEffectTextConfig.typefaceId;
        }
        if ((32768 & i19) != 0) {
            i35 = outerEffectTextConfig.fontStyle;
        }
        if ((65536 & i19) != 0) {
            i34 = outerEffectTextConfig.paintStyle;
        }
        if ((131072 & i19) != 0) {
            str8 = outerEffectTextConfig.textColorStart;
        }
        if ((262144 & i19) != 0) {
            str7 = outerEffectTextConfig.textColorEnd;
        }
        if ((524288 & i19) != 0) {
            i33 = outerEffectTextConfig.gradientType;
        }
        if ((1048576 & i19) != 0) {
            i36 = outerEffectTextConfig.gradientOrientation;
        }
        if ((2097152 & i19) != 0) {
            i37 = outerEffectTextConfig.gravity;
        }
        if ((4194304 & i19) != 0) {
            f4 = outerEffectTextConfig.spacingMult;
        }
        if ((8388608 & i19) != 0) {
            f5 = outerEffectTextConfig.spacingAdd;
        }
        if ((16777216 & i19) != 0) {
            f6 = outerEffectTextConfig.spacingLetter;
        }
        if ((33554432 & i19) != 0) {
            str10 = outerEffectTextConfig.cursorColor;
        }
        if ((67108864 & i19) != 0) {
            list5 = outerEffectTextConfig.strokeConfigs;
        }
        if ((134217728 & i19) != 0) {
            list6 = outerEffectTextConfig.coverConfigs;
        }
        if ((268435456 & i19) != 0) {
            list4 = outerEffectTextConfig.bgConfigs;
        }
        if ((i19 & 536870912) != 0) {
            outerEffectTextShadowConfig2 = outerEffectTextConfig.shadowConfig;
        }
        return outerEffectTextConfig.copy(i28, i27, i29, i30, i31, i32, i26, i25, i24, i23, i22, i21, i20, str6, str9, i35, i34, str8, str7, i33, i36, i37, f4, f5, f6, str10, list5, list6, list4, outerEffectTextShadowConfig2);
    }

    public final OuterEffectTextConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String placeholderStringColor, String typefaceId, int i14, int i15, String textColorStart, String textColorEnd, int i16, int i17, int i18, float f, float f2, float f3, String cursorColor, List<OuterEffectTextStrokeConfig> strokeConfigs, List<OuterEffectTextCoverConfig> coverConfigs, List<OuterEffectTextBgConfig> bgConfigs, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        o.LJIIIZ(placeholderStringColor, "placeholderStringColor");
        o.LJIIIZ(typefaceId, "typefaceId");
        o.LJIIIZ(textColorStart, "textColorStart");
        o.LJIIIZ(textColorEnd, "textColorEnd");
        o.LJIIIZ(cursorColor, "cursorColor");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        o.LJIIIZ(coverConfigs, "coverConfigs");
        o.LJIIIZ(bgConfigs, "bgConfigs");
        return new OuterEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, placeholderStringColor, typefaceId, i14, i15, textColorStart, textColorEnd, i16, i17, i18, f, f2, f3, cursorColor, strokeConfigs, coverConfigs, bgConfigs, outerEffectTextShadowConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextConfig)) {
            return false;
        }
        OuterEffectTextConfig outerEffectTextConfig = (OuterEffectTextConfig) obj;
        return this.paddingStart == outerEffectTextConfig.paddingStart && this.paddingEnd == outerEffectTextConfig.paddingEnd && this.paddingTop == outerEffectTextConfig.paddingTop && this.paddingBottom == outerEffectTextConfig.paddingBottom && this.layerWeight == outerEffectTextConfig.layerWeight && this.marginStart == outerEffectTextConfig.marginStart && this.marginEnd == outerEffectTextConfig.marginEnd && this.marginTop == outerEffectTextConfig.marginTop && this.marginBottom == outerEffectTextConfig.marginBottom && this.textSize == outerEffectTextConfig.textSize && this.maxLine == outerEffectTextConfig.maxLine && this.minWidth == outerEffectTextConfig.minWidth && this.minHeight == outerEffectTextConfig.minHeight && o.LJ(this.placeholderStringColor, outerEffectTextConfig.placeholderStringColor) && o.LJ(this.typefaceId, outerEffectTextConfig.typefaceId) && this.fontStyle == outerEffectTextConfig.fontStyle && this.paintStyle == outerEffectTextConfig.paintStyle && o.LJ(this.textColorStart, outerEffectTextConfig.textColorStart) && o.LJ(this.textColorEnd, outerEffectTextConfig.textColorEnd) && this.gradientType == outerEffectTextConfig.gradientType && this.gradientOrientation == outerEffectTextConfig.gradientOrientation && this.gravity == outerEffectTextConfig.gravity && Float.compare(this.spacingMult, outerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, outerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, outerEffectTextConfig.spacingLetter) == 0 && o.LJ(this.cursorColor, outerEffectTextConfig.cursorColor) && o.LJ(this.strokeConfigs, outerEffectTextConfig.strokeConfigs) && o.LJ(this.coverConfigs, outerEffectTextConfig.coverConfigs) && o.LJ(this.bgConfigs, outerEffectTextConfig.bgConfigs) && o.LJ(this.shadowConfig, outerEffectTextConfig.shadowConfig);
    }

    public String toString() {
        return "OuterEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", placeholderStringColor=" + this.placeholderStringColor + ", typefaceId=" + this.typefaceId + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ')';
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.bgConfigs, AnonymousClass391.LIZIZ(this.coverConfigs, AnonymousClass391.LIZIZ(this.strokeConfigs, C79062V1e.LJ(this.cursorColor, C47959Irz.LIZIZ(this.spacingLetter, C47959Irz.LIZIZ(this.spacingAdd, C47959Irz.LIZIZ(this.spacingMult, (((((C79062V1e.LJ(this.textColorEnd, C79062V1e.LJ(this.textColorStart, (((C79062V1e.LJ(this.typefaceId, C79062V1e.LJ(this.placeholderStringColor, ((((((((((((((((((((((((this.paddingStart * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.layerWeight) * 31) + this.marginStart) * 31) + this.marginEnd) * 31) + this.marginTop) * 31) + this.marginBottom) * 31) + this.textSize) * 31) + this.maxLine) * 31) + this.minWidth) * 31) + this.minHeight) * 31, 31), 31) + this.fontStyle) * 31) + this.paintStyle) * 31, 31), 31) + this.gradientType) * 31) + this.gradientOrientation) * 31) + this.gravity) * 31, 31), 31), 31), 31), 31), 31), 31);
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig == null) {
            hashCode = 0;
        } else {
            hashCode = outerEffectTextShadowConfig.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final List<OuterEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<OuterEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getLayerWeight() {
        return this.layerWeight;
    }

    public final int getMarginBottom() {
        return this.marginBottom;
    }

    public final int getMarginEnd() {
        return this.marginEnd;
    }

    public final int getMarginStart() {
        return this.marginStart;
    }

    public final int getMarginTop() {
        return this.marginTop;
    }

    public final int getMaxLine() {
        return this.maxLine;
    }

    public final int getMinHeight() {
        return this.minHeight;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final int getPaddingEnd() {
        return this.paddingEnd;
    }

    public final int getPaddingStart() {
        return this.paddingStart;
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final String getPlaceholderStringColor() {
        return this.placeholderStringColor;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
    }

    public final float getSpacingAdd() {
        return this.spacingAdd;
    }

    public final float getSpacingLetter() {
        return this.spacingLetter;
    }

    public final float getSpacingMult() {
        return this.spacingMult;
    }

    public final List<OuterEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final String getTextColorEnd() {
        return this.textColorEnd;
    }

    public final String getTextColorStart() {
        return this.textColorStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final String getTypefaceId() {
        return this.typefaceId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.paddingStart);
        out.writeInt(this.paddingEnd);
        out.writeInt(this.paddingTop);
        out.writeInt(this.paddingBottom);
        out.writeInt(this.layerWeight);
        out.writeInt(this.marginStart);
        out.writeInt(this.marginEnd);
        out.writeInt(this.marginTop);
        out.writeInt(this.marginBottom);
        out.writeInt(this.textSize);
        out.writeInt(this.maxLine);
        out.writeInt(this.minWidth);
        out.writeInt(this.minHeight);
        out.writeString(this.placeholderStringColor);
        out.writeString(this.typefaceId);
        out.writeInt(this.fontStyle);
        out.writeInt(this.paintStyle);
        out.writeString(this.textColorStart);
        out.writeString(this.textColorEnd);
        out.writeInt(this.gradientType);
        out.writeInt(this.gradientOrientation);
        out.writeInt(this.gravity);
        out.writeFloat(this.spacingMult);
        out.writeFloat(this.spacingAdd);
        out.writeFloat(this.spacingLetter);
        out.writeString(this.cursorColor);
        Iterator LIZJ = UC7.LIZJ(this.strokeConfigs, out);
        while (LIZJ.hasNext()) {
            ((OuterEffectTextStrokeConfig) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.coverConfigs, out);
        while (LIZJ2.hasNext()) {
            ((OuterEffectTextCoverConfig) LIZJ2.next()).writeToParcel(out, i);
        }
        Iterator LIZJ3 = UC7.LIZJ(this.bgConfigs, out);
        while (LIZJ3.hasNext()) {
            ((OuterEffectTextBgConfig) LIZJ3.next()).writeToParcel(out, i);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(out, i);
        }
    }

    public OuterEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String placeholderStringColor, String typefaceId, int i14, int i15, String textColorStart, String textColorEnd, int i16, int i17, int i18, float f, float f2, float f3, String cursorColor, List<OuterEffectTextStrokeConfig> strokeConfigs, List<OuterEffectTextCoverConfig> coverConfigs, List<OuterEffectTextBgConfig> bgConfigs, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        o.LJIIIZ(placeholderStringColor, "placeholderStringColor");
        o.LJIIIZ(typefaceId, "typefaceId");
        o.LJIIIZ(textColorStart, "textColorStart");
        o.LJIIIZ(textColorEnd, "textColorEnd");
        o.LJIIIZ(cursorColor, "cursorColor");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        o.LJIIIZ(coverConfigs, "coverConfigs");
        o.LJIIIZ(bgConfigs, "bgConfigs");
        this.paddingStart = i;
        this.paddingEnd = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
        this.layerWeight = i5;
        this.marginStart = i6;
        this.marginEnd = i7;
        this.marginTop = i8;
        this.marginBottom = i9;
        this.textSize = i10;
        this.maxLine = i11;
        this.minWidth = i12;
        this.minHeight = i13;
        this.placeholderStringColor = placeholderStringColor;
        this.typefaceId = typefaceId;
        this.fontStyle = i14;
        this.paintStyle = i15;
        this.textColorStart = textColorStart;
        this.textColorEnd = textColorEnd;
        this.gradientType = i16;
        this.gradientOrientation = i17;
        this.gravity = i18;
        this.spacingMult = f;
        this.spacingAdd = f2;
        this.spacingLetter = f3;
        this.cursorColor = cursorColor;
        this.strokeConfigs = strokeConfigs;
        this.coverConfigs = coverConfigs;
        this.bgConfigs = bgConfigs;
        this.shadowConfig = outerEffectTextShadowConfig;
    }

    public /* synthetic */ OuterEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, String str, String str2, int i14, int i15, String str3, String str4, int i16, int i17, int i18, float f, float f2, float f3, String str5, List list, List list2, List list3, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? 0 : i, (i19 & 2) != 0 ? 0 : i2, (i19 & 4) != 0 ? 0 : i3, (i19 & 8) != 0 ? 0 : i4, (i19 & 16) != 0 ? 0 : i5, (i19 & 32) != 0 ? 0 : i6, (i19 & 64) != 0 ? 0 : i7, (i19 & 128) != 0 ? 0 : i8, (i19 & 256) != 0 ? 0 : i9, (i19 & 512) != 0 ? 44 : i10, (i19 & 1024) != 0 ? 3 : i11, (i19 & 2048) != 0 ? 0 : i12, (i19 & 4096) != 0 ? 0 : i13, (i19 & FileUtils.BUFFER_SIZE) != 0 ? "#FF888888" : str, (i19 & 16384) != 0 ? "" : str2, (32768 & i19) != 0 ? 0 : i14, (65536 & i19) != 0 ? Paint.Style.FILL.ordinal() : i15, (131072 & i19) != 0 ? "#ffffffff" : str3, (262144 & i19) == 0 ? str4 : "#ffffffff", (524288 & i19) != 0 ? WHB.NONE.getType() : i16, (1048576 & i19) != 0 ? WH9.VERTICAL.getOrientation() : i17, (2097152 & i19) != 0 ? WHK.CENTER.getGravity() : i18, (4194304 & i19) != 0 ? 1.0f : f, (8388608 & i19) != 0 ? 0.0f : f2, (16777216 & i19) == 0 ? f3 : 0.0f, (33554432 & i19) == 0 ? str5 : "", (67108864 & i19) != 0 ? new ArrayList() : list, (134217728 & i19) != 0 ? new ArrayList() : list2, (268435456 & i19) != 0 ? new ArrayList() : list3, (i19 & 536870912) != 0 ? null : outerEffectTextShadowConfig);
    }
}
