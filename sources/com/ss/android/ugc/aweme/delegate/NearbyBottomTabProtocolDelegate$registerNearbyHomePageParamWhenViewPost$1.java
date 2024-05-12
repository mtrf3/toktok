package com.ss.android.ugc.aweme.delegate;

import X.ActivityC45651qj;
import X.C1DG;
import X.C47261Igj;
import X.C54044LIy;
import X.C55230Lly;
import X.C62814Ol0;
import android.view.View;
import com.ss.android.ugc.aweme.mob.event.IHomePageMobProvider;
import com.ss.android.ugc.aweme.mob.event.NearbyHomePageMobProvider;

/* loaded from: classes10.dex */
public final class NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1 implements Runnable {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C54044LIy LJLILLLLZI;

    public NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1(View view, C54044LIy c54044LIy) {
        this.LJLIL = view;
        this.LJLILLLLZI = c54044LIy;
    }

    public final void LIZ() {
        ActivityC45651qj LJ;
        if (this.LJLIL.getParent() != null && (LJ = C1DG.LJ(this.LJLIL, "view.context")) != null) {
            C54044LIy c54044LIy = this.LJLILLLLZI;
            NearbyHomePageMobProvider nearbyHomePageMobProvider = new NearbyHomePageMobProvider(C55230Lly.LIZLLL(LJ, null));
            c54044LIy.LIZ = nearbyHomePageMobProvider;
            C62814Ol0.LJJIIJZLJL(C55230Lly.LIZLLL(LJ, null), IHomePageMobProvider.class, C47261Igj.LJJIJIL(nearbyHomePageMobProvider));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
