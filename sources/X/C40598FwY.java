package X;

import android.app.Activity;
import com.google.android.play.core.appupdate.b;
import com.google.android.play.core.install.InstallState;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.FwY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40598FwY implements InterfaceC40559Fvv {
    public static final C40598FwY LIZ = new C40598FwY();

    @Override // X.InterfaceC40559Fvv
    public final void LIZ(Object obj) {
        Activity activity;
        InstallState state = (InstallState) obj;
        o.LJIIIZ(state, "state");
        if (state.LIZJ() == 11) {
            C38776FJs.LJIIL().LJI(EF7.LIZIZ(), "KEY_DOWNLOADED_FOR_UPDATE", true);
            C38776FJs.LJIIL().LJI(EF7.LIZIZ(), "KEY_UPDATE_IN_PROGRESS", false);
            C40599FwZ.LIZJ("app_update_download_finish");
            if (C84763XOl.LJIIJJI) {
                b bVar = C40599FwZ.LIZIZ;
                if (bVar != null) {
                    bVar.LJ();
                    return;
                }
                return;
            }
            if (C40599FwZ.LIZLLL) {
                return;
            }
            C40599FwZ.LIZLLL = true;
            WeakReference<Activity> weakReference = C40599FwZ.LJ;
            if (weakReference == null || (activity = weakReference.get()) == null) {
                return;
            }
            if (activity.isFinishing()) {
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ == null) {
                    return;
                }
                C26231ARf LIZIZ = C40599FwZ.LIZIZ(LJIIIIZZ);
                if (LIZIZ.LJII()) {
                    return;
                }
                LIZIZ.LIZLLL();
                return;
            }
            C26231ARf LIZIZ2 = C40599FwZ.LIZIZ(activity);
            if (LIZIZ2.LJII()) {
                return;
            }
            LIZIZ2.LIZLLL();
        }
    }
}
