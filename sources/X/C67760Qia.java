package X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Qia, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67760Qia implements InterfaceC67770Qik {
    public final C67759QiZ LIZ;

    public C67760Qia(C67759QiZ c67759QiZ) {
        this.LIZ = c67759QiZ;
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZ(Bundle bundle) {
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZIZ(ConnectionResult connectionResult, C67718Qhu<?> c67718Qhu, boolean z) {
    }

    @Override // X.InterfaceC67770Qik
    public final void LJ(int i) {
    }

    @Override // X.InterfaceC67770Qik
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZJ() {
        Iterator<InterfaceC67836Qjo> it = this.LIZ.LJLJJLL.values().iterator();
        while (it.hasNext()) {
            it.next().LIZLLL();
        }
        this.LIZ.LJLLJ.LJLLLLLL = Collections.emptySet();
    }

    @Override // X.InterfaceC67770Qik
    public final void LIZLLL() {
        C67759QiZ c67759QiZ = this.LIZ;
        c67759QiZ.LJLIL.lock();
        try {
            c67759QiZ.LJLLI = new C67761Qib(c67759QiZ, c67759QiZ.LJLJLJ, c67759QiZ.LJLJLLL, c67759QiZ.LJLJJI, c67759QiZ.LJLL, c67759QiZ.LJLIL, c67759QiZ.LJLJI);
            c67759QiZ.LJLLI.LIZJ();
            c67759QiZ.LJLILLLLZI.signalAll();
        } finally {
            c67759QiZ.LJLIL.unlock();
        }
    }

    @Override // X.InterfaceC67770Qik
    public final <A, T extends AbstractC67748QiO<? extends InterfaceC67754QiU, A>> T LJI(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
