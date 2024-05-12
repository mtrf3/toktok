package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;

/* renamed from: X.Qmp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68023Qmp implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    public final void LIZ() {
        AbstractC68050QnG abstractC68050QnG = (AbstractC68050QnG) this.LJLJI;
        Bundle bundle = (Bundle) this.LJLILLLLZI;
        abstractC68050QnG.LJFF();
        abstractC68050QnG.LJI();
        QH7.LJIIIIZZ(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        QH7.LJI(string);
        QH7.LJI(string2);
        QH7.LJIIIIZZ(C16880lQ.LLJJIII(bundle, "value"));
        if (!abstractC68050QnG.LIZ.LJII()) {
            abstractC68050QnG.LIZ.LIZJ().LJIILIIL.LIZ("Conditional property not set since app measurement is disabled");
            return;
        }
        zzlo zzloVar = new zzlo(bundle.getLong("triggered_timestamp"), C16880lQ.LLJJIII(bundle, "value"), string, string2);
        try {
            zzaw LJJLIIIJL = abstractC68050QnG.LIZ.LJIL().LJJLIIIJL(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true);
            abstractC68050QnG.LIZ.LJIJJ().LJIIJ(new zzac(bundle.getString("app_id"), string2, zzloVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), abstractC68050QnG.LIZ.LJIL().LJJLIIIJL(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true), bundle.getLong("trigger_timeout"), LJJLIIIJL, bundle.getLong("time_to_live"), abstractC68050QnG.LIZ.LJIL().LJJLIIIJL(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void LIZIZ() {
        try {
            AbstractC67638Qgc abstractC67638Qgc = (AbstractC67638Qgc) ((C67648Qgm) this.LJLJI).LJLILLLLZI.LIZJ((AbstractC67638Qgc) this.LJLILLLLZI);
            if (abstractC67638Qgc == null) {
                ((C67648Qgm) this.LJLJI).onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            ExecutorC67642Qgg executorC67642Qgg = C67641Qgf.LIZIZ;
            abstractC67638Qgc.LJFF(executorC67642Qgg, (C67648Qgm) this.LJLJI);
            abstractC67638Qgc.LIZLLL(executorC67642Qgg, (C67648Qgm) this.LJLJI);
            abstractC67638Qgc.LIZ(executorC67642Qgg, (C67648Qgm) this.LJLJI);
        } catch (C67645Qgj e) {
            if (e.getCause() instanceof Exception) {
                ((C67648Qgm) this.LJLJI).LJLJI.LJIIZILJ((Exception) e.getCause());
            } else {
                ((C67648Qgm) this.LJLJI).LJLJI.LJIIZILJ(e);
            }
        } catch (Exception e2) {
            ((C67648Qgm) this.LJLJI).LJLJI.LJIIZILJ(e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        switch (this.LJLIL) {
            case 0:
                try {
                    LIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
            default:
                try {
                    LIZIZ();
                    return;
                } finally {
                    if (LIZ) {
                    }
                }
        }
    }

    public /* synthetic */ RunnableC68023Qmp(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLJI = obj;
        this.LJLILLLLZI = obj2;
    }
}
