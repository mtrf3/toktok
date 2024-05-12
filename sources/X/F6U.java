package X;

import Y.ARunnableS25S0200000_6;
import Y.ARunnableS42S0100000_6;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public final class F6U implements F6T {
    public final /* synthetic */ EnumC38440F6u LIZ;
    public final /* synthetic */ WeakReference<F6T> LIZIZ;

    @Override // X.F6T
    public final void onFailed() {
        LiveAppBundleUtils.mainHandler.post(new ARunnableS42S0100000_6(this.LIZIZ, 8));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onPluginLoadFailed is called ,from requestBuilder ");
        LIZ.append(this.LIZ);
        C0NB.LJIIIZ("FindCrashLog#LiveAppBundleUtils", X1D.LIZIZ(LIZ));
    }

    @Override // X.F6T
    public final void onSuccess() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" onPluginLoadSuccess is called ,from requestBuilder ");
        LIZ.append(this.LIZ);
        C0NB.LJIIIZ("FindCrashLog#LiveAppBundleUtils", X1D.LIZIZ(LIZ));
        LiveAppBundleUtils liveAppBundleUtils = LiveAppBundleUtils.INSTANCE;
        liveAppBundleUtils.splitInstall();
        LiveAppBundleUtils.mainHandler.post(new ARunnableS25S0200000_6(this.LIZ, this.LIZIZ, 3));
        liveAppBundleUtils.logInstalledIfNeed(this.LIZ);
    }

    public F6U(EnumC38440F6u enumC38440F6u, WeakReference<F6T> weakReference) {
        this.LIZ = enumC38440F6u;
        this.LIZIZ = weakReference;
    }

    @Override // X.F6T
    public final void LIZ(int i, String str, boolean z) {
        LiveAppBundleUtils.mainHandler.post(new F6V(this.LIZIZ, str, z, i));
    }
}
