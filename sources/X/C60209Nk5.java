package X;

import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.content.Context;
import java.util.TimerTask;

/* renamed from: X.Nk5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60209Nk5 extends TimerTask {
    public final /* synthetic */ C60193Njp LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Activity LIZ2 = C43995HOl.LIZ((Context) this.LJLIL.getProviderFactory().LIZJ(Context.class));
            if (LIZ2 instanceof Activity) {
                LIZ2.runOnUiThread(new ARunnableS46S0100000_10(this, 18));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public C60209Nk5(C60193Njp c60193Njp, long j) {
        this.LJLIL = c60193Njp;
        this.LJLILLLLZI = j;
    }
}
