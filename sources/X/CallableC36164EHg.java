package X;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: X.EHg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36164EHg<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public CallableC36164EHg(Context context, int i, String str) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("errorDesc", this.LJLIL);
                c198517qh.LIZ.put("requestCount", Integer.valueOf(this.LJLILLLLZI));
                C09900aA.LJIIJJI("combine_settings_monitor_service", 1, c198517qh.LJ());
            }
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
