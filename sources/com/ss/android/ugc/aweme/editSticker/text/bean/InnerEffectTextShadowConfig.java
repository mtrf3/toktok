package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.V8G;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InnerEffectTextShadowConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextShadowConfig> CREATOR = new V8G();
    public final int color;
    public final float offsetX;
    public final float offsetY;
    public final float radius;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InnerEffectTextShadowConfig() {
        /*
            r7 = this;
            r1 = 0
            r4 = 0
            r5 = 15
            r6 = 0
            r0 = r7
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextShadowConfig.<init>():void");
    }

    public static /* synthetic */ InnerEffectTextShadowConfig copy$default(InnerEffectTextShadowConfig innerEffectTextShadowConfig, float f, float f2, float f3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = innerEffectTextShadowConfig.radius;
        }
        if ((i2 & 2) != 0) {
            f2 = innerEffectTextShadowConfig.offsetX;
        }
        if ((i2 & 4) != 0) {
            f3 = innerEffectTextShadowConfig.offsetY;
        }
        if ((i2 & 8) != 0) {
            i = innerEffectTextShadowConfig.color;
        }
        return innerEffectTextShadowConfig.copy(f, f2, f3, i);
    }

    public final InnerEffectTextShadowConfig copy(float f, float f2, float f3, int i) {
        return new InnerEffectTextShadowConfig(f, f2, f3, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.radius), Float.valueOf(this.offsetX), Float.valueOf(this.offsetY), Integer.valueOf(this.color)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.radius);
        out.writeFloat(this.offsetX);
        out.writeFloat(this.offsetY);
        out.writeInt(this.color);
    }

    public final int getColor() {
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

    public final InnerEffectTextShadowConfig genInstance(float f) {
        return new InnerEffectTextShadowConfig(this.radius * f, this.offsetX * f, this.offsetY * f, this.color);
    }

    public InnerEffectTextShadowConfig(float f, float f2, float f3, int i) {
        this.radius = f;
        this.offsetX = f2;
        this.offsetY = f3;
        this.color = i;
    }

    public /* synthetic */ InnerEffectTextShadowConfig(float f, float f2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? -7829368 : i);
    }
}
