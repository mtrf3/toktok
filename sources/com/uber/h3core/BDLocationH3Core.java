package com.uber.h3core;

import android.content.Context;
import android.util.Pair;
import com.bytedance.bdlocation.api.ILocationH3Core;
import com.uber.h3core.util.GeoCoord;
import java.util.List;

/* loaded from: classes24.dex */
public class BDLocationH3Core implements ILocationH3Core {
    public H3Core h3 = H3Core.newSystemInstance();

    public BDLocationH3Core(Context context) {
    }

    @Override // com.bytedance.bdlocation.api.ILocationH3Core
    public Pair<Double, Double> h3ToGeo(long j) {
        GeoCoord h3ToGeo = this.h3.h3ToGeo(j);
        if (h3ToGeo != null) {
            return new Pair<>(Double.valueOf(h3ToGeo.lat), Double.valueOf(h3ToGeo.lng));
        }
        return null;
    }

    @Override // com.bytedance.bdlocation.api.ILocationH3Core
    public List<Long> kRing(long j, int i) {
        return this.h3.kRing(j, i);
    }

    @Override // com.bytedance.bdlocation.api.ILocationH3Core
    public long geoToH3(double d, double d2, int i) {
        return this.h3.geoToH3(d, d2, i);
    }
}
