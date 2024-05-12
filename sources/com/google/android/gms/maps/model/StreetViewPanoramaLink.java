package com.google.android.gms.maps.model;

import X.C64362PNu;
import X.C68787Qz9;
import X.C79057V0z;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C68787Qz9();
    public final float bearing;
    public final String panoId;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.panoId, Float.valueOf(this.bearing)});
    }

    public final String toString() {
        C64362PNu c64362PNu = new C64362PNu(this);
        c64362PNu.LIZ(this.panoId, "panoId");
        c64362PNu.LIZ(Float.valueOf(this.bearing), "bearing");
        return c64362PNu.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing)) {
            return true;
        }
        return false;
    }

    public StreetViewPanoramaLink(String str, float f) {
        this.panoId = str;
        this.bearing = (((double) f) <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int LJLIL = C79057V0z.LJLIL(parcel, 20293);
        C79057V0z.LJJZZIII(parcel, 2, this.panoId, false);
        C79057V0z.LJJLIIIJJIZ(parcel, 3, this.bearing);
        C79057V0z.LJLILLLLZI(parcel, LJLIL);
    }
}
