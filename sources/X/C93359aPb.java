package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.aPb, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93359aPb {
    public final double LIZ;

    public C93359aPb(double d) {
        this.LIZ = d;
    }

    public final LatLng LIZ(C93358aPa c93358aPa) {
        double d = c93358aPa.LIZ;
        double d2 = this.LIZ;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (c93358aPa.LIZIZ / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    public final C93394aQA LIZIZ(LatLng latLng) {
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.latitude));
        double log = ((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d2 = this.LIZ;
        return new C93394aQA(d * d2, log * d2);
    }
}
