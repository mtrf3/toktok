package X;

import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MKE implements FTD {
    public final /* synthetic */ MKI LIZ;
    public final /* synthetic */ int LIZIZ = 3000;
    public final /* synthetic */ int LIZJ = 800;

    @Override // X.FTD
    public final void LIZ() {
    }

    @Override // X.FTD
    public final void LIZIZ() {
        MKI mki = this.LIZ;
        mki.LJLL = this.LIZIZ;
        mki.LJLJLLL = this.LIZJ;
        Handler handler = mki.LJLLI;
        o.LJI(handler);
        handler.removeCallbacksAndMessages(null);
        mki.LJLLI.postDelayed(mki.LJLLILLLL, mki.LJLJJL.nextInt(4) * 100);
    }

    public MKE(MKI mki) {
        this.LIZ = mki;
    }
}
