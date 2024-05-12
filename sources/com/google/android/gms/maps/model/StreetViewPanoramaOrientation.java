package com.google.android.gms.maps.model;

import X.C64362PNu;
import X.C68795QzH;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new C68795QzH();
    public final float bearing;
    public final float tilt;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(Float.valueOf(this.tilt), "tilt");
        c64362PNu.LIZ(Float.valueOf(this.bearing), "bearing");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaOrientation.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaOrientation.bearing)) {
            return true;
        }
        return false;
    }

    public StreetViewPanoramaOrientation(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        QH7.LIZ("Tilt needs to be between -90 and 90 inclusive: " + f, z);
        this.tilt = f + 0.0f;
        this.bearing = (((double) f2) <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJJIZ(parcel, 2, this.tilt);
        C79057V0z.LJJLIIIJJIZ(parcel, 3, this.bearing);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
