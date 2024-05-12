package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.AnonymousClass391;
import X.C47959Irz;
import X.UC7;
import X.WH8;
import X.WH9;
import X.WHB;
import X.X1D;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class InnerEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextCoverConfig> CREATOR = new WH8();
    public final WH9 gradientOrientation;
    public final WHB gradientType;
    public final float offsetX;
    public final float offsetY;
    public final Paint.Style paintStyle;
    public final InnerEffectTextShadowConfig shadowConfig;
    public final List<InnerEffectTextStrokeConfig> strokeConfigs;
    public final int textColorEnd;
    public final int textColorStart;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerEffectTextCoverConfig() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r6 = 0
            r10 = 511(0x1ff, float:7.16E-43)
            r0 = r12
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r6
            r8 = r3
            r9 = r3
            r11 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextCoverConfig.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerEffectTextCoverConfig copy$default(InnerEffectTextCoverConfig innerEffectTextCoverConfig, int i, int i2, WHB whb, WH9 wh9, Paint.Style style, float f, float f2, List list, InnerEffectTextShadowConfig innerEffectTextShadowConfig, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = innerEffectTextCoverConfig.textColorStart;
        }
        if ((i3 & 2) != 0) {
            i2 = innerEffectTextCoverConfig.textColorEnd;
        }
        if ((i3 & 4) != 0) {
            whb = innerEffectTextCoverConfig.gradientType;
        }
        if ((i3 & 8) != 0) {
            wh9 = innerEffectTextCoverConfig.gradientOrientation;
        }
        if ((i3 & 16) != 0) {
            style = innerEffectTextCoverConfig.paintStyle;
        }
        if ((i3 & 32) != 0) {
            f = innerEffectTextCoverConfig.offsetX;
        }
        if ((i3 & 64) != 0) {
            f2 = innerEffectTextCoverConfig.offsetY;
        }
        if ((i3 & 128) != 0) {
            list = innerEffectTextCoverConfig.strokeConfigs;
        }
        if ((i3 & 256) != 0) {
            innerEffectTextShadowConfig = innerEffectTextCoverConfig.shadowConfig;
        }
        return innerEffectTextCoverConfig.copy(i, i2, whb, wh9, style, f, f2, list, innerEffectTextShadowConfig);
    }

    public final InnerEffectTextCoverConfig copy(int i, int i2, WHB gradientType, WH9 gradientOrientation, Paint.Style paintStyle, float f, float f2, List<InnerEffectTextStrokeConfig> strokeConfigs, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        o.LJIIIZ(gradientType, "gradientType");
        o.LJIIIZ(gradientOrientation, "gradientOrientation");
        o.LJIIIZ(paintStyle, "paintStyle");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        return new InnerEffectTextCoverConfig(i, i2, gradientType, gradientOrientation, paintStyle, f, f2, strokeConfigs, innerEffectTextShadowConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerEffectTextCoverConfig)) {
            return false;
        }
        InnerEffectTextCoverConfig innerEffectTextCoverConfig = (InnerEffectTextCoverConfig) obj;
        return this.textColorStart == innerEffectTextCoverConfig.textColorStart && this.textColorEnd == innerEffectTextCoverConfig.textColorEnd && this.gradientType == innerEffectTextCoverConfig.gradientType && this.gradientOrientation == innerEffectTextCoverConfig.gradientOrientation && this.paintStyle == innerEffectTextCoverConfig.paintStyle && Float.compare(this.offsetX, innerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, innerEffectTextCoverConfig.offsetY) == 0 && o.LJ(this.strokeConfigs, innerEffectTextCoverConfig.strokeConfigs) && o.LJ(this.shadowConfig, innerEffectTextCoverConfig.shadowConfig);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerEffectTextCoverConfig(textColorStart=");
        LIZ.append(this.textColorStart);
        LIZ.append(", textColorEnd=");
        LIZ.append(this.textColorEnd);
        LIZ.append(", gradientType=");
        LIZ.append(this.gradientType);
        LIZ.append(", gradientOrientation=");
        LIZ.append(this.gradientOrientation);
        LIZ.append(", paintStyle=");
        LIZ.append(this.paintStyle);
        LIZ.append(", offsetX=");
        LIZ.append(this.offsetX);
        LIZ.append(", offsetY=");
        LIZ.append(this.offsetY);
        LIZ.append(", strokeConfigs=");
        LIZ.append(this.strokeConfigs);
        LIZ.append(", shadowConfig=");
        LIZ.append(this.shadowConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = AnonymousClass391.LIZIZ(this.strokeConfigs, C47959Irz.LIZIZ(this.offsetY, C47959Irz.LIZIZ(this.offsetX, (this.paintStyle.hashCode() + ((this.gradientOrientation.hashCode() + ((this.gradientType.hashCode() + (((this.textColorStart * 31) + this.textColorEnd) * 31)) * 31)) * 31)) * 31, 31), 31), 31);
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig == null) {
            hashCode = 0;
        } else {
            hashCode = innerEffectTextShadowConfig.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final WH9 getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final WHB getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final Paint.Style getPaintStyle() {
        return this.paintStyle;
    }

    public final InnerEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.textColorStart);
        out.writeInt(this.textColorEnd);
        out.writeString(this.gradientType.name());
        out.writeString(this.gradientOrientation.name());
        out.writeString(this.paintStyle.name());
        out.writeFloat(this.offsetX);
        out.writeFloat(this.offsetY);
        Iterator LIZJ = UC7.LIZJ(this.strokeConfigs, out);
        while (LIZJ.hasNext()) {
            ((InnerEffectTextStrokeConfig) LIZJ.next()).writeToParcel(out, i);
        }
        InnerEffectTextShadowConfig innerEffectTextShadowConfig = this.shadowConfig;
        if (innerEffectTextShadowConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            innerEffectTextShadowConfig.writeToParcel(out, i);
        }
    }

    public InnerEffectTextCoverConfig(int i, int i2, WHB gradientType, WH9 gradientOrientation, Paint.Style paintStyle, float f, float f2, List<InnerEffectTextStrokeConfig> strokeConfigs, InnerEffectTextShadowConfig innerEffectTextShadowConfig) {
        o.LJIIIZ(gradientType, "gradientType");
        o.LJIIIZ(gradientOrientation, "gradientOrientation");
        o.LJIIIZ(paintStyle, "paintStyle");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        this.textColorStart = i;
        this.textColorEnd = i2;
        this.gradientType = gradientType;
        this.gradientOrientation = gradientOrientation;
        this.paintStyle = paintStyle;
        this.offsetX = f;
        this.offsetY = f2;
        this.strokeConfigs = strokeConfigs;
        this.shadowConfig = innerEffectTextShadowConfig;
    }

    public /* synthetic */ InnerEffectTextCoverConfig(int i, int i2, WHB whb, WH9 wh9, Paint.Style style, float f, float f2, List list, InnerEffectTextShadowConfig innerEffectTextShadowConfig, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -65536 : i, (i3 & 2) != 0 ? -16776961 : i2, (i3 & 4) != 0 ? WHB.NONE : whb, (i3 & 8) != 0 ? WH9.VERTICAL : wh9, (i3 & 16) != 0 ? Paint.Style.STROKE : style, (i3 & 32) != 0 ? 0.0f : f, (i3 & 64) == 0 ? f2 : 0.0f, (i3 & 128) != 0 ? new ArrayList() : list, (i3 & 256) != 0 ? null : innerEffectTextShadowConfig);
    }
}
