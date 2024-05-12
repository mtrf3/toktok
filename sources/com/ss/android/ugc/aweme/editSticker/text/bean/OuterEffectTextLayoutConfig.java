package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.C6D6;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.UC7;
import X.WHI;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class OuterEffectTextLayoutConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextLayoutConfig> CREATOR = new WHI();

    @InterfaceC65349Pkn("layout_type")
    public final int layoutType;

    @InterfaceC65349Pkn("orientation")
    public final int orientation;

    @InterfaceC65349Pkn("padding_bottom")
    public final int paddingBottom;

    @InterfaceC65349Pkn("padding_end")
    public final int paddingEnd;

    @InterfaceC65349Pkn("padding_start")
    public final int paddingStart;

    @InterfaceC65349Pkn("padding_top")
    public final int paddingTop;

    @InterfaceC65349Pkn("rotation")
    public final float rotation;

    @InterfaceC65349Pkn("text_configs")
    public final List<OuterEffectTextConfig> textConfigs;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OuterEffectTextLayoutConfig() {
        /*
            r11 = this;
            r1 = 0
            r3 = 0
            r8 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextLayoutConfig.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OuterEffectTextLayoutConfig copy$default(OuterEffectTextLayoutConfig outerEffectTextLayoutConfig, int i, int i2, float f, int i3, int i4, int i5, int i6, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = outerEffectTextLayoutConfig.layoutType;
        }
        if ((i7 & 2) != 0) {
            i2 = outerEffectTextLayoutConfig.orientation;
        }
        if ((i7 & 4) != 0) {
            f = outerEffectTextLayoutConfig.rotation;
        }
        if ((i7 & 8) != 0) {
            i3 = outerEffectTextLayoutConfig.paddingStart;
        }
        if ((i7 & 16) != 0) {
            i4 = outerEffectTextLayoutConfig.paddingEnd;
        }
        if ((i7 & 32) != 0) {
            i5 = outerEffectTextLayoutConfig.paddingTop;
        }
        if ((i7 & 64) != 0) {
            i6 = outerEffectTextLayoutConfig.paddingBottom;
        }
        if ((i7 & 128) != 0) {
            list = outerEffectTextLayoutConfig.textConfigs;
        }
        return outerEffectTextLayoutConfig.copy(i, i2, f, i3, i4, i5, i6, list);
    }

    public final OuterEffectTextLayoutConfig copy(int i, int i2, float f, int i3, int i4, int i5, int i6, List<OuterEffectTextConfig> textConfigs) {
        o.LJIIIZ(textConfigs, "textConfigs");
        return new OuterEffectTextLayoutConfig(i, i2, f, i3, i4, i5, i6, textConfigs);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.layoutType), Integer.valueOf(this.orientation), Float.valueOf(this.rotation), Integer.valueOf(this.paddingStart), Integer.valueOf(this.paddingEnd), Integer.valueOf(this.paddingTop), Integer.valueOf(this.paddingBottom), this.textConfigs};
    }

    public final int getLayoutType() {
        return this.layoutType;
    }

    public final int getOrientation() {
        return this.orientation;
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

    public final float getRotation() {
        return this.rotation;
    }

    public final List<OuterEffectTextConfig> getTextConfigs() {
        return this.textConfigs;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(this.layoutType);
        out.writeInt(this.orientation);
        out.writeFloat(this.rotation);
        out.writeInt(this.paddingStart);
        out.writeInt(this.paddingEnd);
        out.writeInt(this.paddingTop);
        out.writeInt(this.paddingBottom);
        Iterator LIZJ = UC7.LIZJ(this.textConfigs, out);
        while (LIZJ.hasNext()) {
            ((OuterEffectTextConfig) LIZJ.next()).writeToParcel(out, i);
        }
    }

    public OuterEffectTextLayoutConfig(int i, int i2, float f, int i3, int i4, int i5, int i6, List<OuterEffectTextConfig> textConfigs) {
        o.LJIIIZ(textConfigs, "textConfigs");
        this.layoutType = i;
        this.orientation = i2;
        this.rotation = f;
        this.paddingStart = i3;
        this.paddingEnd = i4;
        this.paddingTop = i5;
        this.paddingBottom = i6;
        this.textConfigs = textConfigs;
    }

    public /* synthetic */ OuterEffectTextLayoutConfig(int i, int i2, float f, int i3, int i4, int i5, int i6, List list, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? C6D6.LINEAR.getType() : i, (i7 & 2) != 0 ? 1 : i2, (i7 & 4) != 0 ? 0.0f : f, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) == 0 ? i6 : 0, (i7 & 128) != 0 ? new ArrayList() : list);
    }
}
