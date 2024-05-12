package com.ss.android.ugc.aweme.ad.experiment;

import X.FFL;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public final class AdLandPageResourceOptimizeExperiment {
    public static final AdLandPageResourceOptimizeExperiment LIZ = new AdLandPageResourceOptimizeExperiment();
    public static final ResourceOptimizeModel LIZIZ;

    /* loaded from: classes11.dex */
    public static final class ResourceOptimizeModel {

        @InterfaceC65349Pkn("enable_preconnect")
        public boolean enablePreConnect;

        @InterfaceC65349Pkn("enable_prefetch")
        public boolean enablePrefetch;

        @InterfaceC65349Pkn("enable_TTNet_agency")
        public boolean enableTTNetAgency;
    }

    static {
        ResourceOptimizeModel resourceOptimizeModel = new ResourceOptimizeModel();
        FFL.LJIIIZ().getClass();
        ResourceOptimizeModel resourceOptimizeModel2 = (ResourceOptimizeModel) FFL.LJIJ(true, "ad_land_page_resource_optimize", 31744, ResourceOptimizeModel.class, resourceOptimizeModel);
        if (resourceOptimizeModel2 != null) {
            resourceOptimizeModel = resourceOptimizeModel2;
        }
        LIZIZ = resourceOptimizeModel;
    }
}
