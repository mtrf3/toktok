package com.google.android.gms.maps.model;

import X.C16880lQ;
import X.C64362PNu;
import X.C68791QzD;
import X.C79057V0z;
import X.QH7;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new C68791QzD();
    public final float bearing;
    public final LatLng target;
    public final float tilt;
    public final float zoom;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.target, Float.valueOf(this.zoom), Float.valueOf(this.tilt), Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.target, "target");
        c64362PNu.LIZ(Float.valueOf(this.zoom), "zoom");
        c64362PNu.LIZ(Float.valueOf(this.tilt), "tilt");
        c64362PNu.LIZ(Float.valueOf(this.bearing), "bearing");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.target.equals(cameraPosition.target) && Float.floatToIntBits(this.zoom) == Float.floatToIntBits(cameraPosition.zoom) && Float.floatToIntBits(this.tilt) == Float.floatToIntBits(cameraPosition.tilt) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(cameraPosition.bearing)) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZI(parcel, 2, this.target, i, false);
        C79057V0z.LJJLIIIJJIZ(parcel, 3, this.zoom);
        C79057V0z.LJJLIIIJJIZ(parcel, 4, this.tilt);
        C79057V0z.LJJLIIIJJIZ(parcel, 5, this.bearing);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        boolean z;
        QH7.LJIIIZ(latLng, "camera target must not be null.");
        if (f2 >= 0.0f && f2 <= 90.0f) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {Float.valueOf(f2)};
        if (z) {
            this.target = latLng;
            this.zoom = f;
            this.tilt = f2 + 0.0f;
            this.bearing = (((double) f3) <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Tilt needs to be between 0 and 90 inclusive: %s", objArr));
    }
}
