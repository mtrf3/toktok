package com.ss.android.ugc.aweme.geofencing.api;

import X.AbstractC73635Sv9;
import X.C41492GQe;
import X.E4Q;
import com.ss.android.ugc.aweme.geofencing.model.Translations;

/* loaded from: classes8.dex */
public interface TranslatedRegionApi {
    public static final C41492GQe LIZ = C41492GQe.LIZ;

    @E4Q("/aweme/v1/translations/regions/")
    AbstractC73635Sv9<Translations> getTranslatedRegions();
}
