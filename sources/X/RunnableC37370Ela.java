package X;

import com.bytedance.keva.Keva;
import com.bytedance.pia.core.bridge.methods.CacheRemoveMethod;

/* renamed from: X.Ela, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37370Ela implements Runnable {
    public final /* synthetic */ BQ6 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ BQ6 LJLJJI;

    public RunnableC37370Ela(C37399Em3 c37399Em3, String str, String str2, C37400Em4 c37400Em4) {
        this.LJLIL = c37399Em3;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = c37400Em4;
    }

    public final void LIZ() {
        try {
            boolean z = false;
            if (!C37376Elg.LJ.get()) {
                this.LJLIL.accept(new CacheRemoveMethod.Result(false));
                return;
            }
            Keva LIZJ = C37376Elg.LIZJ(this.LJLILLLLZI);
            if (LIZJ != null) {
                z = C37376Elg.LIZ(LIZJ, this.LJLJI);
            }
            this.LJLIL.accept(new CacheRemoveMethod.Result(z));
        } catch (Exception e) {
            BQ6 bq6 = this.LJLJJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Cache] PIA Cache Remove Failed, reason: (");
            LIZ.append(e.getMessage());
            LIZ.append(')');
            bq6.accept(new C37394Ely(X1D.LIZIZ(LIZ)));
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
