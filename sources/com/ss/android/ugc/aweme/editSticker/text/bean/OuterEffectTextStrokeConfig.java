package com.ss.android.ugc.aweme.editSticker.text.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.V12;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class OuterEffectTextStrokeConfig extends F9E implements Parcelable {
    public static final Parcelable.Creator<OuterEffectTextStrokeConfig> CREATOR = new V12();

    @InterfaceC65349Pkn("stroke_color")
    public final String strokeColor;

    @InterfaceC65349Pkn("stroke_join")
    public final int strokeJoin;

    @InterfaceC65349Pkn("stroke_width")
    public final float strokeWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public OuterEffectTextStrokeConfig() {
        this(0.0f, null, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ OuterEffectTextStrokeConfig copy$default(OuterEffectTextStrokeConfig outerEffectTextStrokeConfig, float f, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = outerEffectTextStrokeConfig.strokeWidth;
        }
        if ((i2 & 2) != 0) {
            str = outerEffectTextStrokeConfig.strokeColor;
        }
        if ((i2 & 4) != 0) {
            i = outerEffectTextStrokeConfig.strokeJoin;
        }
        return outerEffectTextStrokeConfig.copy(f, str, i);
    }

    public final OuterEffectTextStrokeConfig copy(float f, String strokeColor, int i) {
        o.LJIIIZ(strokeColor, "strokeColor");
        return new OuterEffectTextStrokeConfig(f, strokeColor, i);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Float.valueOf(this.strokeWidth), this.strokeColor, Integer.valueOf(this.strokeJoin)};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeFloat(this.strokeWidth);
        out.writeString(this.strokeColor);
        out.writeInt(this.strokeJoin);
    }

    public final String getStrokeColor() {
        return this.strokeColor;
    }

    public final int getStrokeJoin() {
        return this.strokeJoin;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    public OuterEffectTextStrokeConfig(float f, String strokeColor, int i) {
        o.LJIIIZ(strokeColor, "strokeColor");
        this.strokeWidth = f;
        this.strokeColor = strokeColor;
        this.strokeJoin = i;
    }

    public /* synthetic */ OuterEffectTextStrokeConfig(float f, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? "#ff000000" : str, (i2 & 4) != 0 ? Paint.Join.ROUND.ordinal() : i);
    }
}
