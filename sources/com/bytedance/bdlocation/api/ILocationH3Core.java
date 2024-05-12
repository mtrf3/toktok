package com.bytedance.bdlocation.api;

import android.util.Pair;
import java.util.List;

/* loaded from: classes16.dex */
public interface ILocationH3Core extends IManager {
    long geoToH3(double d, double d2, int i);

    Pair<Double, Double> h3ToGeo(long j);

    List<Long> kRing(long j, int i);
}
