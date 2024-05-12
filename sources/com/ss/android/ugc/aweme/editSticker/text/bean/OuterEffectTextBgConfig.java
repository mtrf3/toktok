package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WH5;
import X.WHC;
import X.WHJ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class OuterEffectTextBgConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextBgConfig> CREATOR = new WHJ();

    @InterfaceC65349Pkn("bg_name")
    public final String bgName;

    @InterfaceC65349Pkn("dimen_mode_height")
    public final int dimenModeHeight;

    @InterfaceC65349Pkn("dimen_mode_width")
    public final int dimenModeWidth;

    @InterfaceC65349Pkn("gravity")
    public final int gravity;

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("is_nine_patch")
    public final boolean isNinePatch;

    @InterfaceC65349Pkn("margin_bottom")
    public final int marginBottom;

    @InterfaceC65349Pkn("margin_end")
    public final int marginEnd;

    @InterfaceC65349Pkn("margin_start")
    public final int marginStart;

    @InterfaceC65349Pkn("margin_top")
    public final int marginTop;

    @InterfaceC65349Pkn("nine_patch_info")
    public final EffectTextBgNinePatch ninePatchInfo;

    @InterfaceC65349Pkn("width")
    public final int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OuterEffectTextBgConfig() {
        /*
            r15 = this;
            r1 = 0
            r2 = 0
            r13 = 4095(0xfff, float:5.738E-42)
            r0 = r15
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextBgConfig.<init>():void");
    }

    public static /* synthetic */ OuterEffectTextBgConfig copy$default(OuterEffectTextBgConfig outerEffectTextBgConfig, String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = outerEffectTextBgConfig.bgName;
        }
        if ((i10 & 2) != 0) {
            z = outerEffectTextBgConfig.isNinePatch;
        }
        if ((i10 & 4) != 0) {
            effectTextBgNinePatch = outerEffectTextBgConfig.ninePatchInfo;
        }
        if ((i10 & 8) != 0) {
            i = outerEffectTextBgConfig.gravity;
        }
        if ((i10 & 16) != 0) {
            i2 = outerEffectTextBgConfig.dimenModeWidth;
        }
        if ((i10 & 32) != 0) {
            i3 = outerEffectTextBgConfig.dimenModeHeight;
        }
        if ((i10 & 64) != 0) {
            i4 = outerEffectTextBgConfig.width;
        }
        if ((i10 & 128) != 0) {
            i5 = outerEffectTextBgConfig.height;
        }
        if ((i10 & 256) != 0) {
            i6 = outerEffectTextBgConfig.marginStart;
        }
        if ((i10 & 512) != 0) {
            i7 = outerEffectTextBgConfig.marginEnd;
        }
        if ((i10 & 1024) != 0) {
            i8 = outerEffectTextBgConfig.marginTop;
        }
        if ((i10 & 2048) != 0) {
            i9 = outerEffectTextBgConfig.marginBottom;
        }
        return outerEffectTextBgConfig.copy(str, z, effectTextBgNinePatch, i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    public final OuterEffectTextBgConfig copy(String bgName, boolean z, EffectTextBgNinePatch ninePatchInfo, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        o.LJIIIZ(bgName, "bgName");
        o.LJIIIZ(ninePatchInfo, "ninePatchInfo");
        return new OuterEffectTextBgConfig(bgName, z, ninePatchInfo, i, i2, i3, i4, i5, i6, i7, i8, i9);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.bgName, Boolean.valueOf(this.isNinePatch), this.ninePatchInfo, Integer.valueOf(this.gravity), Integer.valueOf(this.dimenModeWidth), Integer.valueOf(this.dimenModeHeight), Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.marginStart), Integer.valueOf(this.marginEnd), Integer.valueOf(this.marginTop), Integer.valueOf(this.marginBottom)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.bgName);
        out.writeInt(this.isNinePatch ? 1 : 0);
        this.ninePatchInfo.writeToParcel(out, i);
        out.writeInt(this.gravity);
        out.writeInt(this.dimenModeWidth);
        out.writeInt(this.dimenModeHeight);
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

    public final int getDimenModeHeight() {
        return this.dimenModeHeight;
    }

    public final int getDimenModeWidth() {
        return this.dimenModeWidth;
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

    public OuterEffectTextBgConfig(String bgName, boolean z, EffectTextBgNinePatch ninePatchInfo, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        o.LJIIIZ(bgName, "bgName");
        o.LJIIIZ(ninePatchInfo, "ninePatchInfo");
        this.bgName = bgName;
        this.isNinePatch = z;
        this.ninePatchInfo = ninePatchInfo;
        this.gravity = i;
        this.dimenModeWidth = i2;
        this.dimenModeHeight = i3;
        this.width = i4;
        this.height = i5;
        this.marginStart = i6;
        this.marginEnd = i7;
        this.marginTop = i8;
        this.marginBottom = i9;
    }

    public /* synthetic */ OuterEffectTextBgConfig(String str, boolean z, EffectTextBgNinePatch effectTextBgNinePatch, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? false : z, (i10 & 4) != 0 ? new EffectTextBgNinePatch(null, null, 0, 0, 0, 0, 63, null) : effectTextBgNinePatch, (i10 & 8) != 0 ? WH5.LEFT.getGravity() | WH5.TOP.getGravity() : i, (i10 & 16) != 0 ? WHC.MATCH_PARENT.getMode() : i2, (i10 & 32) != 0 ? WHC.MATCH_PARENT.getMode() : i3, (i10 & 64) != 0 ? 0 : i4, (i10 & 128) != 0 ? 0 : i5, (i10 & 256) != 0 ? 0 : i6, (i10 & 512) != 0 ? 0 : i7, (i10 & 1024) != 0 ? 0 : i8, (i10 & 2048) == 0 ? i9 : 0);
    }
}
