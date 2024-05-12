package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.V1J;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InnerEffectTextStrokeConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<InnerEffectTextStrokeConfig> CREATOR = new V1J();
    public final int strokeColor;
    public final Paint.Join strokeJoin;
    public final float strokeWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public InnerEffectTextStrokeConfig() {
        this(0.0f, 0, null, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ InnerEffectTextStrokeConfig copy$default(InnerEffectTextStrokeConfig innerEffectTextStrokeConfig, float f, int i, Paint.Join join, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = innerEffectTextStrokeConfig.strokeWidth;
        }
        if ((i2 & 2) != 0) {
            i = innerEffectTextStrokeConfig.strokeColor;
        }
        if ((i2 & 4) != 0) {
            join = innerEffectTextStrokeConfig.strokeJoin;
        }
        return innerEffectTextStrokeConfig.copy(f, i, join);
    }

    public final InnerEffectTextStrokeConfig copy(float f, int i, Paint.Join strokeJoin) {
        o.LJIIIZ(strokeJoin, "strokeJoin");
        return new InnerEffectTextStrokeConfig(f, i, strokeJoin);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.strokeWidth), Integer.valueOf(this.strokeColor), this.strokeJoin};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.strokeWidth);
        out.writeInt(this.strokeColor);
        out.writeString(this.strokeJoin.name());
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    public final Paint.Join getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public InnerEffectTextStrokeConfig(float f, int i, Paint.Join strokeJoin) {
        o.LJIIIZ(strokeJoin, "strokeJoin");
        this.strokeWidth = f;
        this.strokeColor = i;
        this.strokeJoin = strokeJoin;
    }

    public /* synthetic */ InnerEffectTextStrokeConfig(float f, int i, Paint.Join join, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? -16777216 : i, (i2 & 4) != 0 ? Paint.Join.ROUND : join);
    }
}
