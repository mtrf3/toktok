package com.bytedance.bdlocation.client;

import X.Q89;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import defpackage.q;

/* loaded from: classes15.dex */
public class BDPoint {
    public String coordinateSystem;
    public double latitude;
    public double longitude;
    public String provider;

    public BDPoint() {
        this("Android");
    }

    public int hashCode() {
        return Double.valueOf((this.latitude + this.longitude) * 1000000.0d).intValue();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDPoint{provider='");
        Q89.LIZIZ(LIZ, this.provider, '\'', ", longitude=");
        LIZ.append(this.longitude);
        LIZ.append(", latitude=");
        LIZ.append(this.latitude);
        LIZ.append(", coordinateSystem=");
        return q.LIZIZ(LIZ, this.coordinateSystem, '}', LIZ);
    }

    public String getCoordinateSystem() {
        return this.coordinateSystem;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getProvider() {
        return this.provider;
    }

    public BDPoint(String str) {
        this.provider = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BDPoint)) {
            return false;
        }
        BDPoint bDPoint = (BDPoint) obj;
        if (this.latitude != bDPoint.latitude || this.longitude != bDPoint.longitude) {
            return false;
        }
        return true;
    }

    public void setCoordinateSystem(String str) {
        this.coordinateSystem = str;
    }

    public void setLatitude(double d) {
        if (d > 90.0d) {
            d = 90.0d;
        } else if (d < -90.0d) {
            d = -90.0d;
        }
        this.latitude = d;
    }

    public void setLongitude(double d) {
        if (d > 180.0d) {
            d = 180.0d;
        } else if (d < -180.0d) {
            d = -180.0d;
        }
        this.longitude = d;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public BDPoint(double d, double d2) {
        this(d, d2, LiveGiftNewGifterBadgeSetting.DEFAULT);
    }

    public BDPoint(double d, double d2, String str) {
        if (d2 > 180.0d) {
            d2 = 180.0d;
        } else if (d2 < -180.0d) {
            d2 = -180.0d;
        }
        if (d > 90.0d) {
            d = 90.0d;
        } else if (d < -90.0d) {
            d = -90.0d;
        }
        this.longitude = d2;
        this.latitude = d;
        this.provider = str;
    }

    public BDPoint(double d, double d2, String str, String str2) {
        this(d, d2, str);
        this.coordinateSystem = str2;
    }
}
