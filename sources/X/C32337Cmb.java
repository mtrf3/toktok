package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftLowFpsResourceSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftResourceDowngradeStrategy;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Cmb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32337Cmb implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        o.LJIIIZ(activity, "activity");
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isAppBackground()) {
            InterfaceC30442Bx8.LJIIIIZZ.LIZ(null);
            InterfaceC30442Bx8.LJFF.LIZ(null);
            InterfaceC30442Bx8.LJI.LIZ(null);
            InterfaceC30442Bx8.LJII.LIZ(null);
            C32366Cn4.LIZ("expired");
            if (PU0.LJI().LIZIZ.LIZ instanceof C32286Clm) {
                InterfaceC32418Cnu interfaceC32418Cnu = PU0.LJI().LIZIZ.LIZ;
                o.LJII(interfaceC32418Cnu, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.core.assets.AssetsFileCacheFactory");
                new C32338Cmc(((C32286Clm) interfaceC32418Cnu).LIZIZ).LIZ();
            }
            if (LiveGiftLowFpsResourceSetting.INSTANCE.markNonTargeted()) {
                new C32336Cma(!r1.alwaysUseTarget(), "lowfps").LIZ();
                return;
            }
            LiveGiftResourceDowngradeStrategy liveGiftResourceDowngradeStrategy = LiveGiftResourceDowngradeStrategy.INSTANCE;
            if (liveGiftResourceDowngradeStrategy.enableJustDeleteOldResource()) {
                new C32336Cma(false, "480p").LIZ();
            } else {
                if (!liveGiftResourceDowngradeStrategy.enableDeleteOldResourceDownloadDemotion()) {
                    return;
                }
                new C32336Cma(true, "480p").LIZ();
            }
        }
    }
}
