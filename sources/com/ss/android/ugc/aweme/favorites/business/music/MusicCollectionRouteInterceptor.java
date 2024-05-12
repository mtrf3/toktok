package com.ss.android.ugc.aweme.favorites.business.music;

import X.C188727au;
import X.C40925G4j;
import X.C40929G4n;
import X.C45804HyK;
import X.C62712d9;
import X.C78450Uqc;
import X.FMX;
import X.HG3;
import X.InterfaceC65895Ptb;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.interceptor.IInterceptor;
import ujb.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class MusicCollectionRouteInterceptor implements IInterceptor {
    public static final int $stable = 0;
    public static final C40929G4n Companion = new C40929G4n();

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
        return C62712d9.LIZ(this, routeIntent);
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean matchInterceptRules(RouteIntent routeIntent) {
        Uri uri;
        String uri2;
        if (routeIntent == null || (uri = routeIntent.getUri()) == null || (uri2 = uri.toString()) == null || !o.LJJJLIIL(uri2, "aweme://lynxview", false) || !s.LJJJLZIJ(uri2, "discovery_music_collection_privacy_setting", false)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        Activity LJIJJ;
        Keva.getRepo("music_collection_privacy").storeBoolean("force_enable", true);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "capcut");
        FMX.LJIIL("enter_favorite_sound_permission", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://privacy/setting/page?target=music_collection");
        buildRoute.withParam("enter_from", "capcut");
        buildRoute.open();
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc = new C78450Uqc();
            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                c78450Uqc.LIZ = LJIJJ;
                c78450Uqc.LIZIZ = "discovery_music_collection_privacy_setting";
                c78450Uqc.LIZJ = "capcut";
                C40925G4j.LIZ(c78450Uqc, LJIIIIZZ);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return true;
    }
}
