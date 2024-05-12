package X;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzlo;

/* renamed from: X.Qmq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC68024Qmq implements Runnable {
    public final /* synthetic */ Bundle LJLIL;
    public final /* synthetic */ C68082Qnm LJLILLLLZI;

    public RunnableC68024Qmq(C68082Qnm c68082Qnm, Bundle bundle) {
        this.LJLILLLLZI = c68082Qnm;
        this.LJLIL = bundle;
    }

    public final void LIZ() {
        C68082Qnm c68082Qnm = this.LJLILLLLZI;
        Bundle bundle = this.LJLIL;
        c68082Qnm.LJFF();
        c68082Qnm.LJI();
        QH7.LJIIIIZZ(bundle);
        String string = bundle.getString("name");
        QH7.LJI(string);
        if (!c68082Qnm.LIZ.LJII()) {
            c68082Qnm.LIZ.LIZJ().LJIILIIL.LIZ("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c68082Qnm.LIZ.LJIJJ().LJIIJ(new zzac(bundle.getString("app_id"), "", new zzlo(0L, null, string, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c68082Qnm.LIZ.LJIL().LJJLIIIJL(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true)));
        } catch (IllegalArgumentException unused) {
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
