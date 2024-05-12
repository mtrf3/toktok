package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.WH5;
import X.WH6;
import X.WHC;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class InnerEffectTextBgConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextBgConfig> CREATOR = new WH6();
    public final String bgName;
    public final WHC dimensionModeHeight;
    public final WHC dimensionModeWidth;
    public final int gravity;
    public final int height;
    public final boolean isNinePatch;
    public final int marginBottom;
    public final int marginEnd;
    public final int marginStart;
    public final int marginTop;
    public final EffectTextBgNinePatch ninePatchInfo;
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerEffectTextBgConfig() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r1
            r4 = r2
            r5 = r1
            r6 = r1
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r14 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextBgConfig.<init>():void");
    }

    public static /* synthetic */ InnerEffectTextBgConfig copy$default(InnerEffectTextBgConfig innerEffectTextBgConfig, String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, WHC whc, WHC whc2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = innerEffectTextBgConfig.bgName;
        }
        if ((i8 & 2) != 0) {
            z = innerEffectTextBgConfig.isNinePatch;
        }
        if ((i8 & 4) != 0) {
            effectTextBgNinePatch = innerEffectTextBgConfig.ninePatchInfo;
        }
        if ((i8 & 8) != 0) {
            i = innerEffectTextBgConfig.gravity;
        }
        if ((i8 & 16) != 0) {
            whc = innerEffectTextBgConfig.dimensionModeWidth;
        }
        if ((i8 & 32) != 0) {
            whc2 = innerEffectTextBgConfig.dimensionModeHeight;
        }
        if ((i8 & 64) != 0) {
            i2 = innerEffectTextBgConfig.width;
        }
        if ((i8 & 128) != 0) {
            i3 = innerEffectTextBgConfig.height;
        }
        if ((i8 & 256) != 0) {
            i4 = innerEffectTextBgConfig.marginStart;
        }
        if ((i8 & 512) != 0) {
            i5 = innerEffectTextBgConfig.marginEnd;
        }
        if ((i8 & 1024) != 0) {
            i6 = innerEffectTextBgConfig.marginTop;
        }
        if ((i8 & 2048) != 0) {
            i7 = innerEffectTextBgConfig.marginBottom;
        }
        return innerEffectTextBgConfig.copy(str, z, effectTextBgNinePatch, i, whc, whc2, i2, i3, i4, i5, i6, i7);
    }

    public final InnerEffectTextBgConfig copy(String bgName, boolean z, EffectTextBgNinePatch ninePatchInfo, int i, WHC dimensionModeWidth, WHC dimensionModeHeight, int i2, int i3, int i4, int i5, int i6, int i7) {
        o.LJIIIZ(bgName, "bgName");
        o.LJIIIZ(ninePatchInfo, "ninePatchInfo");
        o.LJIIIZ(dimensionModeWidth, "dimensionModeWidth");
        o.LJIIIZ(dimensionModeHeight, "dimensionModeHeight");
        return new InnerEffectTextBgConfig(bgName, z, ninePatchInfo, i, dimensionModeWidth, dimensionModeHeight, i2, i3, i4, i5, i6, i7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.bgName, Boolean.valueOf(this.isNinePatch), this.ninePatchInfo, Integer.valueOf(this.gravity), this.dimensionModeWidth, this.dimensionModeHeight, Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.marginStart), Integer.valueOf(this.marginEnd), Integer.valueOf(this.marginTop), Integer.valueOf(this.marginBottom)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.bgName);
        out.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(out, i);
        out.writeInt(this.gravity);
        out.writeString(this.dimensionModeWidth.name());
        out.writeString(this.dimensionModeHeight.name());
        out.writeInt(this.width);
        out.writeInt(this.height);
        out.writeInt(this.marginStart);
        out.writeInt(this.marginEnd);
        out.writeInt(this.marginTop);
        out.writeInt(this.marginBottom);
    }

    public final String getBgName() {
        return this.bgName;
    }

    public final WHC getDimensionModeHeight() {
        return this.dimensionModeHeight;
    }

    public final WHC getDimensionModeWidth() {
        return this.dimensionModeWidth;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
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

    public final EffectTextBgNinePatch getNinePatchInfo() {
        return this.ninePatchInfo;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isNinePatch() {
        return this.isNinePatch;
    }

    public InnerEffectTextBgConfig(String bgName, boolean z, EffectTextBgNinePatch ninePatchInfo, int i, WHC dimensionModeWidth, WHC dimensionModeHeight, int i2, int i3, int i4, int i5, int i6, int i7) {
        o.LJIIIZ(bgName, "bgName");
        o.LJIIIZ(ninePatchInfo, "ninePatchInfo");
        o.LJIIIZ(dimensionModeWidth, "dimensionModeWidth");
        o.LJIIIZ(dimensionModeHeight, "dimensionModeHeight");
        this.bgName = bgName;
        this.isNinePatch = z;
        this.ninePatchInfo = ninePatchInfo;
        this.gravity = i;
        this.dimensionModeWidth = dimensionModeWidth;
        this.dimensionModeHeight = dimensionModeHeight;
        this.width = i2;
        this.height = i3;
        this.marginStart = i4;
        this.marginEnd = i5;
        this.marginTop = i6;
        this.marginBottom = i7;
    }

    public /* synthetic */ InnerEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, WHC whc, WHC whc2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? false : z, (i8 & 4) != 0 ? new EffectTextBgNinePatch(null, null, 0, 0, 0, 0, 63, null) : effectTextBgNinePatch, (i8 & 8) != 0 ? WH5.LEFT.getGravity() | WH5.TOP.getGravity() : i, (i8 & 16) != 0 ? WHC.MATCH_PARENT : whc, (i8 & 32) != 0 ? WHC.MATCH_PARENT : whc2, (i8 & 64) != 0 ? 0 : i2, (i8 & 128) != 0 ? 0 : i3, (i8 & 256) != 0 ? 0 : i4, (i8 & 512) != 0 ? 0 : i5, (i8 & 1024) != 0 ? 0 : i6, (i8 & 2048) == 0 ? i7 : 0);
    }
}
