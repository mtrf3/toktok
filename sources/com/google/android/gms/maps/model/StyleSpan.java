package com.google.android.gms.maps.model;

import X.C68779Qz1;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes12.dex */
public final class StyleSpan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StyleSpan> CREATOR = new C68779Qz1();
    public final StrokeStyle zza;
    public final double zzb;

    public StyleSpan(StrokeStyle strokeStyle, double d) {
        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            this.zza = strokeStyle;
            this.zzb = d;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.zza, i, false);
        C79057V0z.LJJLIIIJILLIZJL(parcel, 3, this.zzb);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
