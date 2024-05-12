package com.bytedance.bdlocation.utils.json.deserializer;

import android.location.Location;
import android.os.Build;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.m;
import java.lang.reflect.Type;

/* loaded from: classes17.dex */
public class LocationDeserializer implements i<Location> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.i
    public Location deserialize(j jVar, Type type, h hVar) {
        m LJIIZILJ = jVar.LJIIZILJ();
        Location location = new Location(LJIIZILJ.LJJIJL("mProvider").LJJIFFI());
        location.setAccuracy(LJIIZILJ.LJJIJL("mAccuracy").LJIIJ());
        location.setBearing(LJIIZILJ.LJJIJL("mBearing").LJIIJ());
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            location.setBearingAccuracyDegrees(LJIIZILJ.LJJIJL("mBearingAccuracyDegrees").LJIIJ());
        }
        location.setElapsedRealtimeNanos(LJIIZILJ.LJJIJL("mElapsedRealtimeNanos").LJIJJLI());
        location.setLatitude(LJIIZILJ.LJJIJL("mLatitude").LJIIIZ());
        location.setLongitude(LJIIZILJ.LJJIJL("mLongitude").LJIIIZ());
        location.setProvider(LJIIZILJ.LJJIJL("mProvider").LJJIFFI());
        location.setSpeed(LJIIZILJ.LJJIJL("mSpeed").LJIIJ());
        if (i >= 26) {
            location.setSpeedAccuracyMetersPerSecond(LJIIZILJ.LJJIJL("mSpeedAccuracyMetersPerSecond").LJIIJ());
        }
        location.setTime(LJIIZILJ.LJJIJL("mTime").LJIJJLI());
        if (i >= 26) {
            location.setVerticalAccuracyMeters(LJIIZILJ.LJJIJL("mVerticalAccuracyMeters").LJIIJ());
        }
        return location;
    }
}
