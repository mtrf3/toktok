package X;

import android.content.pm.PackageInstaller;
import com.google.ar.core.v;
import java.util.HashMap;

/* renamed from: X.aSd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93547aSd extends PackageInstaller.SessionCallback {
    public final java.util.Map<Integer, PackageInstaller.SessionInfo> LIZ = new HashMap();
    public final /* synthetic */ C93538aSU LIZIZ;
    public final /* synthetic */ v LIZJ;

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        PackageInstaller packageInstaller;
        packageInstaller = this.LIZJ.g;
        PackageInstaller.SessionInfo sessionInfo = packageInstaller.getSessionInfo(i);
        ((HashMap) this.LIZ).put(Integer.valueOf(i), sessionInfo);
    }

    public C93547aSd(v vVar, C93538aSU c93538aSU) {
        this.LIZJ = vVar;
        this.LIZIZ = c93538aSU;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) ((HashMap) this.LIZ).remove(Integer.valueOf(i));
        if (sessionInfo != null && "com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            this.LIZIZ.LIZ(EnumC93540aSW.COMPLETED);
        }
    }
}
