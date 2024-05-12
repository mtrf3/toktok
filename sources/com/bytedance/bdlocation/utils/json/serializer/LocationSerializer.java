package com.bytedance.bdlocation.utils.json.serializer;

import android.location.Location;
import android.os.Build;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;

/* loaded from: classes17.dex */
public class LocationSerializer implements r<Location> {
    @Override // com.google.gson.r
    public j serialize(Location location, Type type, q qVar) {
        m mVar = new m();
        mVar.LJJIIZ("mProvider", location.getProvider());
        mVar.LJJIIJ("mAccuracy", Float.valueOf(location.getAccuracy()));
        mVar.LJJIIJ("mBearing", Float.valueOf(location.getBearing()));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            mVar.LJJIIJ("mBearingAccuracyDegrees", Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        mVar.LJJIIJ("mElapsedRealtimeNanos", Long.valueOf(location.getElapsedRealtimeNanos()));
        mVar.LJJIIJ("mLatitude", Double.valueOf(location.getLatitude()));
        mVar.LJJIIJ("mLongitude", Double.valueOf(location.getLongitude()));
        mVar.LJJIIZ("mProvider", location.getProvider());
        mVar.LJJIIJ("mSpeed", Float.valueOf(location.getSpeed()));
        if (i >= 26) {
            mVar.LJJIIJ("mSpeedAccuracyMetersPerSecond", Float.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        mVar.LJJIIJ("mTime", Long.valueOf(location.getTime()));
        if (i >= 26) {
            mVar.LJJIIJ("mVerticalAccuracyMeters", Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        return mVar;
    }
}
