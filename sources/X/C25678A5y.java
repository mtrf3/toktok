package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.A5y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25678A5y {
    public static final void LIZ(Activity activity, String sceneName, Exception exc, C73305Spp c73305Spp) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sceneName, "sceneName");
        NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).triggerNetworkTips(activity, sceneName, exc, c73305Spp);
    }

    public static final void LIZIZ(Activity activity, MG5 sceneName, Exception exc, C73305Spp c73305Spp) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(sceneName, "sceneName");
        NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).triggerNetworkTips(activity, sceneName, exc, c73305Spp);
    }

    public static /* synthetic */ void LIZJ(Activity activity, String str, Exception exc, C73305Spp c73305Spp, int i) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            exc = null;
        }
        if ((i & 8) != 0) {
            c73305Spp = null;
        }
        LIZ(activity, str, exc, c73305Spp);
    }
}
