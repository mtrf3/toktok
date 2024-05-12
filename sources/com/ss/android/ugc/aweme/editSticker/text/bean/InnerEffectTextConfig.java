package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.AnonymousClass391;
import X.C47959Irz;
import X.C79062V1e;
import X.OSZ;
import X.UC7;
import X.WH7;
import X.WH9;
import X.WHB;
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
public final class InnerEffectTextConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextConfig> CREATOR = new WH7();
    public final List<InnerEffectTextBgConfig> bgConfigs;
    public final List<InnerEffectTextCoverConfig> coverConfigs;
    public final String cursorColor;
    public final InnerEffectExtraConfig extraConfig;
    public final int fontStyle;
    public final WH9 gradientOrientation;
    public final WHB gradientType;
    public final int gravity;
    public final int layerWeight;
    public final int marginBottom;
    public final int marginEnd;
    public final int marginStart;
    public final int marginTop;
    public final int maxLine;
    public final int minHeight;
    public final int minWidth;
    public final int paddingBottom;
    public final int paddingEnd;
    public final int paddingStart;
    public final int paddingTop;
    public final Paint.Style paintStyle;
    public final int replaceStringColor;
    public final InnerEffectTextShadowConfig shadowConfig;
    public final float spacingAdd;
    public final float spacingLetter;
    public final float spacingMult;
    public final List<InnerEffectTextStrokeConfig> strokeConfigs;
    public final int textColorEnd;
    public final int textColorStart;
    public final int textSize;
    public final OSZ<String, String> typefacePath;

    public InnerEffectTextConfig() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, 0, 0, null, null, 0, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public static /* synthetic */ InnerEffectTextConfig copy$default(InnerEffectTextConfig innerEffectTextConfig, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, OSZ osz, int i15, Paint.Style style, int i16, int i17, WHB whb, WH9 wh9, int i18, float f, float f2, float f3, String str, List list, List list2, List list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig, int i19, Object obj) {
        int i20 = i13;
        int i21 = i12;
        int i22 = i11;
        int i23 = i14;
        int i24 = i10;
        int i25 = i9;
        int i26 = i8;
        int i27 = i7;
        int i28 = i2;
        int i29 = i;
        int i30 = i3;
        int i31 = i4;
        int i32 = i5;
        int i33 = i6;
        WHB whb2 = whb;
        int i34 = i17;
        int i35 = i16;
        Paint.Style style2 = style;
        OSZ osz2 = osz;
        InnerEffectExtraConfig innerEffectExtraConfig2 = innerEffectExtraConfig;
        int i36 = i15;
        WH9 wh92 = wh9;
        int i37 = i18;
        float f4 = f;
        float f5 = f2;
        InnerEffectTextShadowConfig innerEffectTextShadowConfig2 = innerEffectTextShadowConfig;
        float f6 = f3;
        String str2 = str;
        List list4 = list;
        List list5 = list2;
        List list6 = list3;
        if ((i19 & 1) != 0) {
            i29 = innerEffectTextConfig.paddingStart;
        }
        if ((i19 & 2) != 0) {
            i28 = innerEffectTextConfig.paddingEnd;
        }
        if ((i19 & 4) != 0) {
            i30 = innerEffectTextConfig.paddingTop;
        }
        if ((i19 & 8) != 0) {
            i31 = innerEffectTextConfig.paddingBottom;
        }
        if ((i19 & 16) != 0) {
            i32 = innerEffectTextConfig.layerWeight;
        }
        if ((i19 & 32) != 0) {
            i33 = innerEffectTextConfig.marginStart;
        }
        if ((i19 & 64) != 0) {
            i27 = innerEffectTextConfig.marginEnd;
        }
        if ((i19 & 128) != 0) {
            i26 = innerEffectTextConfig.marginTop;
        }
        if ((i19 & 256) != 0) {
            i25 = innerEffectTextConfig.marginBottom;
        }
        if ((i19 & 512) != 0) {
            i24 = innerEffectTextConfig.textSize;
        }
        if ((i19 & 1024) != 0) {
            i22 = innerEffectTextConfig.maxLine;
        }
        if ((i19 & 2048) != 0) {
            i21 = innerEffectTextConfig.minWidth;
        }
        if ((i19 & 4096) != 0) {
            i20 = innerEffectTextConfig.minHeight;
        }
        if ((i19 & FileUtils.BUFFER_SIZE) != 0) {
            i23 = innerEffectTextConfig.replaceStringColor;
        }
        if ((i19 & 16384) != 0) {
            osz2 = innerEffectTextConfig.typefacePath;
        }
        if ((32768 & i19) != 0) {
            i36 = innerEffectTextConfig.fontStyle;
        }
        if ((65536 & i19) != 0) {
            style2 = innerEffectTextConfig.paintStyle;
        }
        if ((131072 & i19) != 0) {
            i35 = innerEffectTextConfig.textColorStart;
        }
        if ((262144 & i19) != 0) {
            i34 = innerEffectTextConfig.textColorEnd;
        }
        if ((524288 & i19) != 0) {
            whb2 = innerEffectTextConfig.gradientType;
        }
        if ((1048576 & i19) != 0) {
            wh92 = innerEffectTextConfig.gradientOrientation;
        }
        if ((2097152 & i19) != 0) {
            i37 = innerEffectTextConfig.gravity;
        }
        if ((4194304 & i19) != 0) {
            f4 = innerEffectTextConfig.spacingMult;
        }
        if ((8388608 & i19) != 0) {
            f5 = innerEffectTextConfig.spacingAdd;
        }
        if ((16777216 & i19) != 0) {
            f6 = innerEffectTextConfig.spacingLetter;
        }
        if ((33554432 & i19) != 0) {
            str2 = innerEffectTextConfig.cursorColor;
        }
        if ((67108864 & i19) != 0) {
            list4 = innerEffectTextConfig.strokeConfigs;
        }
        if ((134217728 & i19) != 0) {
            list5 = innerEffectTextConfig.coverConfigs;
        }
        if ((268435456 & i19) != 0) {
            list6 = innerEffectTextConfig.bgConfigs;
        }
        if ((536870912 & i19) != 0) {
            innerEffectTextShadowConfig2 = innerEffectTextConfig.shadowConfig;
        }
        if ((i19 & 1073741824) != 0) {
            innerEffectExtraConfig2 = innerEffectTextConfig.extraConfig;
        }
        return innerEffectTextConfig.copy(i29, i28, i30, i31, i32, i33, i27, i26, i25, i24, i22, i21, i20, i23, osz2, i36, style2, i35, i34, whb2, wh92, i37, f4, f5, f6, str2, list4, list5, list6, innerEffectTextShadowConfig2, innerEffectExtraConfig2);
    }

    public static /* synthetic */ void getFontStyle$annotations() {
    }

    public final InnerEffectTextConfig copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, OSZ<String, String> osz, int i15, Paint.Style paintStyle, int i16, int i17, WHB gradientType, WH9 gradientOrientation, int i18, float f, float f2, float f3, String cursorColor, List<InnerEffectTextStrokeConfig> strokeConfigs, List<InnerEffectTextCoverConfig> coverConfigs, List<InnerEffectTextBgConfig> bgConfigs, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig extraConfig) {
        o.LJIIIZ(paintStyle, "paintStyle");
        o.LJIIIZ(gradientType, "gradientType");
        o.LJIIIZ(gradientOrientation, "gradientOrientation");
        o.LJIIIZ(cursorColor, "cursorColor");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        o.LJIIIZ(coverConfigs, "coverConfigs");
        o.LJIIIZ(bgConfigs, "bgConfigs");
        o.LJIIIZ(extraConfig, "extraConfig");
        return new InnerEffectTextConfig(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, osz, i15, paintStyle, i16, i17, gradientType, gradientOrientation, i18, f, f2, f3, cursorColor, strokeConfigs, coverConfigs, bgConfigs, innerEffectTextShadowConfig, extraConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextConfig)) {
            return false;
        }
        InnerEffectTextConfig innerEffectTextConfig = (InnerEffectTextConfig) obj;
        return this.paddingStart == innerEffectTextConfig.paddingStart && this.paddingEnd == innerEffectTextConfig.paddingEnd && this.paddingTop == innerEffectTextConfig.paddingTop && this.paddingBottom == innerEffectTextConfig.paddingBottom && this.layerWeight == innerEffectTextConfig.layerWeight && this.marginStart == innerEffectTextConfig.marginStart && this.marginEnd == innerEffectTextConfig.marginEnd && this.marginTop == innerEffectTextConfig.marginTop && this.marginBottom == innerEffectTextConfig.marginBottom && this.textSize == innerEffectTextConfig.textSize && this.maxLine == innerEffectTextConfig.maxLine && this.minWidth == innerEffectTextConfig.minWidth && this.minHeight == innerEffectTextConfig.minHeight && this.replaceStringColor == innerEffectTextConfig.replaceStringColor && o.LJ(this.typefacePath, innerEffectTextConfig.typefacePath) && this.fontStyle == innerEffectTextConfig.fontStyle && this.paintStyle == innerEffectTextConfig.paintStyle && this.textColorStart == innerEffectTextConfig.textColorStart && this.textColorEnd == innerEffectTextConfig.textColorEnd && this.gradientType == innerEffectTextConfig.gradientType && this.gradientOrientation == innerEffectTextConfig.gradientOrientation && this.gravity == innerEffectTextConfig.gravity && Float.compare(this.spacingMult, innerEffectTextConfig.spacingMult) == 0 && Float.compare(this.spacingAdd, innerEffectTextConfig.spacingAdd) == 0 && Float.compare(this.spacingLetter, innerEffectTextConfig.spacingLetter) == 0 && o.LJ(this.cursorColor, innerEffectTextConfig.cursorColor) && o.LJ(this.strokeConfigs, innerEffectTextConfig.strokeConfigs) && o.LJ(this.coverConfigs, innerEffectTextConfig.coverConfigs) && o.LJ(this.bgConfigs, innerEffectTextConfig.bgConfigs) && o.LJ(this.shadowConfig, innerEffectTextConfig.shadowConfig) && o.LJ(this.extraConfig, innerEffectTextConfig.extraConfig);
    }

    public String toString() {
        return "InnerEffectTextConfig(paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ", paddingTop=" + this.paddingTop + ", paddingBottom=" + this.paddingBottom + ", layerWeight=" + this.layerWeight + ", marginStart=" + this.marginStart + ", marginEnd=" + this.marginEnd + ", marginTop=" + this.marginTop + ", marginBottom=" + this.marginBottom + ", textSize=" + this.textSize + ", maxLine=" + this.maxLine + ", minWidth=" + this.minWidth + ", minHeight=" + this.minHeight + ", replaceStringColor=" + this.replaceStringColor + ", typefacePath=" + this.typefacePath + ", fontStyle=" + this.fontStyle + ", paintStyle=" + this.paintStyle + ", textColorStart=" + this.textColorStart + ", textColorEnd=" + this.textColorEnd + ", gradientType=" + this.gradientType + ", gradientOrientation=" + this.gradientOrientation + ", gravity=" + this.gravity + ", spacingMult=" + this.spacingMult + ", spacingAdd=" + this.spacingAdd + ", spacingLetter=" + this.spacingLetter + ", cursorColor=" + this.cursorColor + ", strokeConfigs=" + this.strokeConfigs + ", coverConfigs=" + this.coverConfigs + ", bgConfigs=" + this.bgConfigs + ", shadowConfig=" + this.shadowConfig + ", extraConfig=" + this.extraConfig + ')';
    }

    public int hashCode() {
        int hashCode;
        int i = ((((((((((((((((((((((((((this.paddingStart * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.layerWeight) * 31) + this.marginStart) * 31) + this.marginEnd) * 31) + this.marginTop) * 31) + this.marginBottom) * 31) + this.textSize) * 31) + this.maxLine) * 31) + this.minWidth) * 31) + this.minHeight) * 31) + this.replaceStringColor) * 31;
        OSZ<String, String> osz = this.typefacePath;
        int i2 = 0;
        if (osz == null) {
            hashCode = 0;
        } else {
            hashCode = osz.hashCode();
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.bgConfigs, AnonymousClass391.LIZIZ(this.coverConfigs, AnonymousClass391.LIZIZ(this.strokeConfigs, C79062V1e.LJ(this.cursorColor, C47959Irz.LIZIZ(this.spacingLetter, C47959Irz.LIZIZ(this.spacingAdd, C47959Irz.LIZIZ(this.spacingMult, (((this.gradientOrientation.hashCode() + ((this.gradientType.hashCode() + ((((((this.paintStyle.hashCode() + ((((i + hashCode) * 31) + this.fontStyle) * 31)) * 31) + this.textColorStart) * 31) + this.textColorEnd) * 31)) * 31)) * 31) + this.gravity) * 31, 31), 31), 31), 31), 31), 31), 31);
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig != null) {
            i2 = innerEffectTextShadowConfig.hashCode();
        }
        return this.extraConfig.hashCode() + ((LIZIZ + i2) * 31);
    }

    public final List<InnerEffectTextBgConfig> getBgConfigs() {
        return this.bgConfigs;
    }

    public final List<InnerEffectTextCoverConfig> getCoverConfigs() {
        return this.coverConfigs;
    }

    public final String getCursorColor() {
        return this.cursorColor;
    }

    public final InnerEffectExtraConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final WH9 getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final WHB getGradientType() {
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

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final int getReplaceStringColor() {
        return this.replaceStringColor;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
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

    public final List<InnerEffectTextStrokeConfig> getStrokeConfigs() {
        return this.strokeConfigs;
    }

    public final int getTextColorEnd() {
        return this.textColorEnd;
    }

    public final int getTextColorStart() {
        return this.textColorStart;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final OSZ<String, String> getTypefacePath() {
        return this.typefacePath;
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
        out.writeInt(this.replaceStringColor);
        out.writeSerializable(this.typefacePath);
        out.writeInt(this.fontStyle);
        out.writeString(this.paintStyle.name());
        out.writeInt(this.textColorStart);
        out.writeInt(this.textColorEnd);
        out.writeString(this.gradientType.name());
        out.writeString(this.gradientOrientation.name());
        out.writeInt(this.gravity);
        out.writeFloat(this.spacingMult);
        out.writeFloat(this.spacingAdd);
        out.writeFloat(this.spacingLetter);
        out.writeString(this.cursorColor);
        Iterator LIZJ = UC7.LIZJ(this.strokeConfigs, out);
        while (LIZJ.hasNext()) {
            ((InnerEffectTextStrokeConfig) LIZJ.next()).writeToParcel(out, i);
        }
        Iterator LIZJ2 = UC7.LIZJ(this.coverConfigs, out);
        while (LIZJ2.hasNext()) {
            ((InnerEffectTextCoverConfig) LIZJ2.next()).writeToParcel(out, i);
        }
        Iterator LIZJ3 = UC7.LIZJ(this.bgConfigs, out);
        while (LIZJ3.hasNext()) {
            ((InnerEffectTextBgConfig) LIZJ3.next()).writeToParcel(out, i);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(out, i);
        }
        this.extraConfig.writeToParcel(out, i);
    }

    public InnerEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, OSZ<String, String> osz, int i15, Paint.Style paintStyle, int i16, int i17, WHB gradientType, WH9 gradientOrientation, int i18, float f, float f2, float f3, String cursorColor, List<InnerEffectTextStrokeConfig> strokeConfigs, List<InnerEffectTextCoverConfig> coverConfigs, List<InnerEffectTextBgConfig> bgConfigs, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig extraConfig) {
        o.LJIIIZ(paintStyle, "paintStyle");
        o.LJIIIZ(gradientType, "gradientType");
        o.LJIIIZ(gradientOrientation, "gradientOrientation");
        o.LJIIIZ(cursorColor, "cursorColor");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        o.LJIIIZ(coverConfigs, "coverConfigs");
        o.LJIIIZ(bgConfigs, "bgConfigs");
        o.LJIIIZ(extraConfig, "extraConfig");
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
        this.replaceStringColor = i14;
        this.typefacePath = osz;
        this.fontStyle = i15;
        this.paintStyle = paintStyle;
        this.textColorStart = i16;
        this.textColorEnd = i17;
        this.gradientType = gradientType;
        this.gradientOrientation = gradientOrientation;
        this.gravity = i18;
        this.spacingMult = f;
        this.spacingAdd = f2;
        this.spacingLetter = f3;
        this.cursorColor = cursorColor;
        this.strokeConfigs = strokeConfigs;
        this.coverConfigs = coverConfigs;
        this.bgConfigs = bgConfigs;
        this.shadowConfig = innerEffectTextShadowConfig;
        this.extraConfig = extraConfig;
    }

    public /* synthetic */ InnerEffectTextConfig(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, OSZ osz, int i15, Paint.Style style, int i16, int i17, WHB whb, WH9 wh9, int i18, float f, float f2, float f3, String str, List list, List list2, List list3, InnerEffectTextShadowConfig innerEffectTextShadowConfig, InnerEffectExtraConfig innerEffectExtraConfig, int i19, DefaultConstructorMarker defaultConstructorMarker) {
        this((i19 & 1) != 0 ? 0 : i, (i19 & 2) != 0 ? 0 : i2, (i19 & 4) != 0 ? 0 : i3, (i19 & 8) != 0 ? 0 : i4, (i19 & 16) != 0 ? 0 : i5, (i19 & 32) != 0 ? 0 : i6, (i19 & 64) != 0 ? 0 : i7, (i19 & 128) != 0 ? 0 : i8, (i19 & 256) != 0 ? 0 : i9, (i19 & 512) != 0 ? 44 : i10, (i19 & 1024) != 0 ? 3 : i11, (i19 & 2048) != 0 ? 0 : i12, (i19 & 4096) != 0 ? 0 : i13, (i19 & FileUtils.BUFFER_SIZE) != 0 ? -7829368 : i14, (i19 & 16384) != 0 ? null : osz, (32768 & i19) != 0 ? 0 : i15, (65536 & i19) != 0 ? Paint.Style.FILL : style, (131072 & i19) != 0 ? -1 : i16, (262144 & i19) == 0 ? i17 : -1, (524288 & i19) != 0 ? WHB.NONE : whb, (1048576 & i19) != 0 ? WH9.VERTICAL : wh9, (2097152 & i19) != 0 ? 17 : i18, (4194304 & i19) != 0 ? 1.0f : f, (8388608 & i19) != 0 ? 0.0f : f2, (16777216 & i19) == 0 ? f3 : 0.0f, (33554432 & i19) != 0 ? "" : str, (67108864 & i19) != 0 ? new ArrayList() : list, (134217728 & i19) != 0 ? new ArrayList() : list2, (268435456 & i19) != 0 ? new ArrayList() : list3, (536870912 & i19) != 0 ? null : innerEffectTextShadowConfig, (i19 & 1073741824) != 0 ? new InnerEffectExtraConfig(false, 1, null) : innerEffectExtraConfig);
    }
}
