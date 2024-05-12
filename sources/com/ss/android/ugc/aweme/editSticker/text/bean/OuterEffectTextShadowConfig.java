package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.V11;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OuterEffectTextShadowConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextShadowConfig> CREATOR = new V11();

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("offsetX")
    public final float offsetX;

    @InterfaceC65349Pkn("offsetY")
    public final float offsetY;

    @InterfaceC65349Pkn("radius")
    public final float radius;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OuterEffectTextShadowConfig() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r3 = r1
            r6 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.OuterEffectTextShadowConfig.<init>():void");
    }

    public static /* synthetic */ OuterEffectTextShadowConfig copy$default(OuterEffectTextShadowConfig outerEffectTextShadowConfig, float f, float f2, float f3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            f = outerEffectTextShadowConfig.radius;
        }
        if ((i & 2) != 0) {
            f2 = outerEffectTextShadowConfig.offsetX;
        }
        if ((i & 4) != 0) {
            f3 = outerEffectTextShadowConfig.offsetY;
        }
        if ((i & 8) != 0) {
            str = outerEffectTextShadowConfig.color;
        }
        return outerEffectTextShadowConfig.copy(f, f2, f3, str);
    }

    public final OuterEffectTextShadowConfig copy(float f, float f2, float f3, String color) {
        o.LJIIIZ(color, "color");
        return new OuterEffectTextShadowConfig(f, f2, f3, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.radius), Float.valueOf(this.offsetX), Float.valueOf(this.offsetY), this.color};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.radius);
        out.writeFloat(this.offsetX);
        out.writeFloat(this.offsetY);
        out.writeString(this.color);
    }

    public final String getColor() {
        return this.color;
    }

    public final float getOffsetX() {
        return this.offsetX;
    }

    public final float getOffsetY() {
        return this.offsetY;
    }

    public final float getRadius() {
        return this.radius;
    }

    public OuterEffectTextShadowConfig(float f, float f2, float f3, String color) {
        o.LJIIIZ(color, "color");
        this.radius = f;
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = color;
    }

    public /* synthetic */ OuterEffectTextShadowConfig(float f, float f2, float f3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? "#FF888888" : str);
    }
}
