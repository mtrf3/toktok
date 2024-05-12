package com.ss.android.ugc.aweme.experiment;

import X.C18950ol;
import X.C58096Mr6;
import X.DTM;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import dmt.viewpager.servie.ViewPagerSlideTransitionService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ViewPagerSlideTransitionServiceImpl implements ViewPagerSlideTransitionService {
    @Override // dmt.viewpager.servie.ViewPagerSlideTransitionService
    public final Interpolator LIZ() {
        PathInterpolator LIZIZ = C18950ol.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f);
        o.LJIIIIZZ(LIZIZ, "create(\n        0.33f, 0.86f, 0.2f, 1f\n    )");
        return LIZIZ;
    }

    public static ViewPagerSlideTransitionService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(ViewPagerSlideTransitionService.class, false);
        if (LIZ != null) {
            return (ViewPagerSlideTransitionService) LIZ;
        }
        if (C58096Mr6.t0 == null) {
            synchronized (ViewPagerSlideTransitionService.class) {
                if (C58096Mr6.t0 == null) {
                    C58096Mr6.t0 = new ViewPagerSlideTransitionServiceImpl();
                }
            }
        }
        return C58096Mr6.t0;
    }

    @Override // dmt.viewpager.servie.ViewPagerSlideTransitionService
    public final int getDuration() {
        return ((Number) DTM.LIZIZ.getValue()).intValue();
    }

    @Override // dmt.viewpager.servie.ViewPagerSlideTransitionService
    public final boolean isEnable() {
        return ((Boolean) DTM.LIZJ.getValue()).booleanValue();
    }
}
