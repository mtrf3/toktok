package com.ss.android.ugc.aweme.services;

import X.C16880lQ;
import X.C41090GAs;
import X.C60903NvH;
import X.G79;
import X.HQ7;
import Y.AObserverS75S0100000_7;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.IGeofencingService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GeoFencingServiceImpl implements IGeofencingService {
    public static final GeoFencingServiceImpl INSTANCE = new GeoFencingServiceImpl();

    @Override // com.ss.android.ugc.aweme.services.external.IGeofencingService
    public void injectGeoFencingSettingItem(Aweme aweme, FrameLayout container, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(container, "container");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        List<String> geofencingRegions = aweme.getGeofencingRegions();
        if (geofencingRegions == null || geofencingRegions.isEmpty()) {
            container.setVisibility(8);
            return;
        }
        container.setVisibility(0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(container.getContext()), R.layout.bk3, container, false);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem");
        G79 g79 = (G79) LLLLIILL;
        container.addView(g79);
        HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
        if (accountService.isLogin() && accountService.LJ()) {
            g79.LJLJL.observe(lifecycleOwner, new AObserverS75S0100000_7(g79, 122));
            C41090GAs.LIZIZ(new AqS154S0200000_7(g79, (G79) geofencingRegions, (List<String>) 131));
        }
        g79.setReadOnly(true);
    }
}
