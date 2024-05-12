package com.ss.android.ugc.aweme.poi.map.service;

import X.C00F;
import X.C58096Mr6;
import X.C62848OlY;
import X.EnumC217558gJ;
import X.F6B;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiDynamicMapSettings;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class GoogleMapServiceImpl implements IGoogleMapService {
    public static IGoogleMapService LJFF() {
        Object LIZ = C58096Mr6.LIZ(IGoogleMapService.class, false);
        if (LIZ != null) {
            return (IGoogleMapService) LIZ;
        }
        if (C58096Mr6.X3 == null) {
            synchronized (IGoogleMapService.class) {
                if (C58096Mr6.X3 == null) {
                    C58096Mr6.X3 = new GoogleMapServiceImpl();
                }
            }
        }
        return C58096Mr6.X3;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService
    public final boolean LIZIZ() {
        if (!PoiEnableExperiment.LIZIZ() || C00F.LIZ(31744, 0, "poi_use_dynamic_map", true) != 1 || !PoiDynamicMapSettings.LIZ() || !C62848OlY.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService
    public final boolean LIZJ() {
        return F6B.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService
    public final boolean LIZLLL() {
        if (!PoiDynamicMapSettings.LIZ() || !C62848OlY.LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService
    public final boolean LJ() {
        if (!PoiEnableExperiment.LIZIZ() || !PoiDynamicMapSettings.LIZ()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi_api.service.IGoogleMapService
    public final void LIZ(EnumC217558gJ downloadPolicy, String str, String str2, String str3) {
        o.LJIIIZ(downloadPolicy, "downloadPolicy");
        F6B.LIZJ(true, downloadPolicy, str, str2, str3);
    }
}
