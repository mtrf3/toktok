package com.bytedance.bdlocation;

import X.X1D;
import android.location.Address;
import defpackage.q;
import java.util.Locale;

/* loaded from: classes2.dex */
public class BDAddress extends Address {
    public float accuracy;
    public float horizontalAccuracy;
    public float speed;
    public float verticalAccuracy;

    @Override // android.location.Address
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BDAddress{speed=");
        LIZ.append(this.speed);
        LIZ.append(", accuracy=");
        LIZ.append(this.accuracy);
        LIZ.append(", verticalAccuracy=");
        LIZ.append(this.verticalAccuracy);
        LIZ.append(", horizontalAccuracy=");
        LIZ.append(this.horizontalAccuracy);
        LIZ.append(", addr= ");
        return q.LIZIZ(LIZ, super.toString(), '}', LIZ);
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public float getHorizontalAccuracy() {
        return this.horizontalAccuracy;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getVerticalAccuracy() {
        return this.verticalAccuracy;
    }

    public BDAddress(Address address) {
        super(address.getLocale());
        setFeatureName(address.getFeatureName());
        for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
            setAddressLine(i, address.getAddressLine(i));
        }
        setAdminArea(address.getAdminArea());
        setSubAdminArea(address.getSubAdminArea());
        setLocality(address.getLocality());
        setSubLocality(address.getSubLocality());
        setThoroughfare(address.getThoroughfare());
        setSubThoroughfare(address.getSubThoroughfare());
        setPremises(address.getPremises());
        setPostalCode(address.getPostalCode());
        setCountryCode(address.getCountryCode());
        setCountryName(address.getCountryName());
        setLatitude(address.getLatitude());
        setLongitude(address.getLongitude());
        setUrl(address.getUrl());
        setExtras(address.getExtras());
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public void setHorizontalAccuracy(float f) {
        this.horizontalAccuracy = f;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setVerticalAccuracy(float f) {
        this.verticalAccuracy = f;
    }

    public BDAddress(Locale locale) {
        super(locale);
    }
}
