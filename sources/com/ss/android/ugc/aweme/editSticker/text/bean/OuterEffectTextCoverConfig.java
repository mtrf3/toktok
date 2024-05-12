package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.AnonymousClass391;
import X.C47959Irz;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.V39;
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
public final class OuterEffectTextCoverConfig implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextCoverConfig> CREATOR = new V39();

    @InterfaceC65349Pkn("gradient_orientation")
    public final int gradientOrientation;

    @InterfaceC65349Pkn("gradient_type")
    public final int gradientType;

    @InterfaceC65349Pkn("offsetX")
    public final float offsetX;

    @InterfaceC65349Pkn("offsetY")
    public final float offsetY;

    @InterfaceC65349Pkn("paint_style")
    public final int paintStyle;

    @InterfaceC65349Pkn("shadow_config")
    public final OuterEffectTextShadowConfig shadowConfig;

    @InterfaceC65349Pkn("stroke_configs")
    public final List<OuterEffectTextStrokeConfig> strokeConfigs;

    @InterfaceC65349Pkn("text_color_end")
    public final String textColorEnd;

    @InterfaceC65349Pkn("text_color_start")
    public final String textColorStart;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OuterEffectTextCoverConfig() {
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
            r8 = r1
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextCoverConfig.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OuterEffectTextCoverConfig copy$default(OuterEffectTextCoverConfig outerEffectTextCoverConfig, String str, String str2, int i, int i2, int i3, float f, float f2, List list, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = outerEffectTextCoverConfig.textColorStart;
        }
        if ((i4 & 2) != 0) {
            str2 = outerEffectTextCoverConfig.textColorEnd;
        }
        if ((i4 & 4) != 0) {
            i = outerEffectTextCoverConfig.gradientType;
        }
        if ((i4 & 8) != 0) {
            i2 = outerEffectTextCoverConfig.gradientOrientation;
        }
        if ((i4 & 16) != 0) {
            i3 = outerEffectTextCoverConfig.paintStyle;
        }
        if ((i4 & 32) != 0) {
            f = outerEffectTextCoverConfig.offsetX;
        }
        if ((i4 & 64) != 0) {
            f2 = outerEffectTextCoverConfig.offsetY;
        }
        if ((i4 & 128) != 0) {
            list = outerEffectTextCoverConfig.strokeConfigs;
        }
        if ((i4 & 256) != 0) {
            outerEffectTextShadowConfig = outerEffectTextCoverConfig.shadowConfig;
        }
        return outerEffectTextCoverConfig.copy(str, str2, i, i2, i3, f, f2, list, outerEffectTextShadowConfig);
    }

    public final OuterEffectTextCoverConfig copy(String textColorStart, String textColorEnd, int i, int i2, int i3, float f, float f2, List<OuterEffectTextStrokeConfig> strokeConfigs, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        o.LJIIIZ(textColorStart, "textColorStart");
        o.LJIIIZ(textColorEnd, "textColorEnd");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        return new OuterEffectTextCoverConfig(textColorStart, textColorEnd, i, i2, i3, f, f2, strokeConfigs, outerEffectTextShadowConfig);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OuterEffectTextCoverConfig)) {
            return false;
        }
        OuterEffectTextCoverConfig outerEffectTextCoverConfig = (OuterEffectTextCoverConfig) obj;
        return o.LJ(this.textColorStart, outerEffectTextCoverConfig.textColorStart) && o.LJ(this.textColorEnd, outerEffectTextCoverConfig.textColorEnd) && this.gradientType == outerEffectTextCoverConfig.gradientType && this.gradientOrientation == outerEffectTextCoverConfig.gradientOrientation && this.paintStyle == outerEffectTextCoverConfig.paintStyle && Float.compare(this.offsetX, outerEffectTextCoverConfig.offsetX) == 0 && Float.compare(this.offsetY, outerEffectTextCoverConfig.offsetY) == 0 && o.LJ(this.strokeConfigs, outerEffectTextCoverConfig.strokeConfigs) && o.LJ(this.shadowConfig, outerEffectTextCoverConfig.shadowConfig);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OuterEffectTextCoverConfig(textColorStart=");
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
        int LIZIZ = AnonymousClass391.LIZIZ(this.strokeConfigs, C47959Irz.LIZIZ(this.offsetY, C47959Irz.LIZIZ(this.offsetX, (((((C79062V1e.LJ(this.textColorEnd, this.textColorStart.hashCode() * 31, 31) + this.gradientType) * 31) + this.gradientOrientation) * 31) + this.paintStyle) * 31, 31), 31), 31);
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig == null) {
            hashCode = 0;
        } else {
            hashCode = outerEffectTextShadowConfig.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final int getGradientOrientation() {
        return this.gradientOrientation;
    }

    public final int getGradientType() {
        return this.gradientType;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final int getPaintStyle() {
        return this.paintStyle;
    }

    public final OuterEffectTextShadowConfig getShadowConfig() {
        return this.shadowConfig;
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

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.textColorStart);
        out.writeString(this.textColorEnd);
        out.writeInt(this.gradientType);
        out.writeInt(this.gradientOrientation);
        out.writeInt(this.paintStyle);
        out.writeFloat(this.offsetX);
        out.writeFloat(this.offsetY);
        Iterator LIZJ = UC7.LIZJ(this.strokeConfigs, out);
        while (LIZJ.hasNext()) {
            ((OuterEffectTextStrokeConfig) LIZJ.next()).writeToParcel(out, i);
        }
        OuterEffectTextShadowConfig outerEffectTextShadowConfig = this.shadowConfig;
        if (outerEffectTextShadowConfig == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            outerEffectTextShadowConfig.writeToParcel(out, i);
        }
    }

    public OuterEffectTextCoverConfig(String textColorStart, String textColorEnd, int i, int i2, int i3, float f, float f2, List<OuterEffectTextStrokeConfig> strokeConfigs, OuterEffectTextShadowConfig outerEffectTextShadowConfig) {
        o.LJIIIZ(textColorStart, "textColorStart");
        o.LJIIIZ(textColorEnd, "textColorEnd");
        o.LJIIIZ(strokeConfigs, "strokeConfigs");
        this.textColorStart = textColorStart;
        this.textColorEnd = textColorEnd;
        this.gradientType = i;
        this.gradientOrientation = i2;
        this.paintStyle = i3;
        this.offsetX = f;
        this.offsetY = f2;
        this.strokeConfigs = strokeConfigs;
        this.shadowConfig = outerEffectTextShadowConfig;
    }

    public /* synthetic */ OuterEffectTextCoverConfig(String str, String str2, int i, int i2, int i3, float f, float f2, List list, OuterEffectTextShadowConfig outerEffectTextShadowConfig, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "#ffff0000" : str, (i4 & 2) != 0 ? "#ff0000ff" : str2, (i4 & 4) != 0 ? WHB.NONE.getType() : i, (i4 & 8) != 0 ? WH9.VERTICAL.getOrientation() : i2, (i4 & 16) != 0 ? Paint.Style.STROKE.ordinal() : i3, (i4 & 32) != 0 ? 0.0f : f, (i4 & 64) == 0 ? f2 : 0.0f, (i4 & 128) != 0 ? new ArrayList() : list, (i4 & 256) != 0 ? null : outerEffectTextShadowConfig);
    }
}
