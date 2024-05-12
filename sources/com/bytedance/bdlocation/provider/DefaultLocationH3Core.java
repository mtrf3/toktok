package com.bytedance.bdlocation.provider;

import android.util.Pair;
import com.bytedance.bdlocation.api.ILocationH3Core;
import java.util.List;

/* loaded from: classes16.dex */
public class DefaultLocationH3Core implements ILocationH3Core {
    @Override // com.bytedance.bdlocation.api.ILocationH3Core
    public long geoToH3(double d, double d2, int i) {
        return 0L;
    }

    @Override // com.bytedance.bdlocation.api.ILocationH3Core
    public Pair<Double, Double> h3ToGeo(long j) {
        return null;
    }

    @Override // com.bytedance.bdlocation.api.ILocationH3Core
    public List<Long> kRing(long j, int i) {
        return null;
    }
}
