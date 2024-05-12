package X;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Executor;

/* renamed from: X.QXv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class BinderC67171QXv extends Binder {
    public final QY3 LJLIL;

    public BinderC67171QXv(C67172QXw c67172QXw) {
        this.LJLIL = c67172QXw;
    }

    public final void LIZ(final C67168QXs c67168QXs) {
        AbstractC67638Qgc processIntent;
        if (Binder.getCallingUid() == Process.myUid()) {
            QY3 qy3 = this.LJLIL;
            processIntent = ((C67172QXw) qy3).LIZ.processIntent(c67168QXs.LIZ);
            processIntent.LIZJ(new Executor() { // from class: X.QY2
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new InterfaceC67661Qgz() { // from class: X.QXu
                @Override // X.InterfaceC67661Qgz
                public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                    C67168QXs.this.LIZIZ.LIZLLL(null);
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
