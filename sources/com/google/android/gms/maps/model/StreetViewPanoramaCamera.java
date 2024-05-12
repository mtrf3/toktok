package com.google.android.gms.maps.model;

import X.C64362PNu;
import X.C68794QzG;
import X.C68796QzI;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new C68794QzG();
    public final float bearing;
    public final float tilt;
    public final float zoom;
    public final StreetViewPanoramaOrientation zza;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(Float.valueOf(this.zoom), "zoom");
        c64362PNu.LIZ(Float.valueOf(this.tilt), "tilt");
        c64362PNu.LIZ(Float.valueOf(this.bearing), "bearing");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.zoom) == Float.floatToIntBits(streetViewPanoramaCamera.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(streetViewPanoramaCamera.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaCamera.bearing)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJLIIIJJIZ(parcel, 2, this.zoom);
        C79057V0z.LJJLIIIJJIZ(parcel, 3, this.tilt);
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.bearing);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public StreetViewPanoramaCamera(float f, float f2, float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        QH7.LIZ("Tilt needs to be between -90 and 90 inclusive: " + f2, z);
        this.zoom = ((double) f) <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX ? 0.0f : f;
        this.tilt = 0.0f + f2;
        if (f3 <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.bearing = f4 % 360.0f;
        C68796QzI c68796QzI = new C68796QzI();
        c68796QzI.LIZIZ = f2;
        c68796QzI.LIZ = f3;
        this.zza = new StreetViewPanoramaOrientation(c68796QzI.LIZIZ, c68796QzI.LIZ);
    }
}
