package X;

import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* renamed from: X.ZYi, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90116ZYi extends TimerTask {
    public final /* synthetic */ C90120ZYm LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.QiK] */
    public final void LIZ() {
        C90926ZmM c90926ZmM;
        final C90120ZYm c90120ZYm = this.LJLIL;
        if (((ArrayDeque) c90120ZYm.LJII).isEmpty() || c90120ZYm.LJIIJ != null || c90120ZYm.LIZIZ == 0) {
            return;
        }
        C90639Zhj c90639Zhj = c90120ZYm.LIZJ;
        int[] LJI = C90468Zey.LJI(c90120ZYm.LJII);
        c90639Zhj.getClass();
        QH7.LJ("Must be called from the main thread.");
        if (!c90639Zhj.LJJIII()) {
            c90926ZmM = C90639Zhj.LJIJJLI();
        } else {
            C90926ZmM c90926ZmM2 = new C90926ZmM(c90639Zhj, LJI);
            C90639Zhj.LJJIIJ(c90926ZmM2);
            c90926ZmM = c90926ZmM2;
        }
        c90120ZYm.LJIIJ = c90926ZmM;
        c90926ZmM.LIZIZ(new InterfaceC67740QiG() { // from class: X.Zhq
            @Override // X.InterfaceC67740QiG
            public final void LIZ(InterfaceC67754QiU interfaceC67754QiU) {
                C90120ZYm c90120ZYm2 = C90120ZYm.this;
                c90120ZYm2.getClass();
                Status status = interfaceC67754QiU.getStatus();
                int i = status.zzc;
                if (i != 0) {
                    C90469Zez c90469Zez = c90120ZYm2.LIZ;
                    C16880lQ.LLLZ("Error fetching queue items, statusCode=%s, statusMessage=%s", new Object[]{Integer.valueOf(i), status.zzd});
                    c90469Zez.getClass();
                }
                c90120ZYm2.LJIIJ = null;
                if (!((ArrayDeque) c90120ZYm2.LJII).isEmpty()) {
                    c90120ZYm2.LJIIIIZZ.removeCallbacks(c90120ZYm2.LJIIIZ);
                    c90120ZYm2.LJIIIIZZ.postDelayed(c90120ZYm2.LJIIIZ, 500L);
                }
            }
        });
        ((ArrayDeque) c90120ZYm.LJII).clear();
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C90116ZYi(C90120ZYm c90120ZYm) {
        this.LJLIL = c90120ZYm;
    }
}
