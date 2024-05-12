package X;

import com.bytedance.pia.core.bridge.methods.CacheGetHeadersMethod;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.google.gson.m;

/* renamed from: X.ElZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37369ElZ implements Runnable {
    public final /* synthetic */ BQ6 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ BQ6 LJLJI;

    public RunnableC37369ElZ(C37399Em3 c37399Em3, C37400Em4 c37400Em4, String str) {
        this.LJLIL = c37399Em3;
        this.LJLILLLLZI = str;
        this.LJLJI = c37400Em4;
    }

    public final void LIZ() {
        try {
            if (!C37376Elg.LJ.get()) {
                this.LJLIL.accept(new CacheGetHeadersMethod.Result(new m()));
                return;
            }
            m mVar = null;
            IPiaCacheProvider.CacheConfig LJIIIZ = C37376Elg.LJIIIZ(null, this.LJLILLLLZI);
            if (LJIIIZ != null) {
                mVar = LJIIIZ.LIZ();
            }
            BQ6 bq6 = this.LJLIL;
            if (mVar == null) {
                mVar = new m();
            }
            bq6.accept(new CacheGetHeadersMethod.Result(mVar));
        } catch (Exception e) {
            BQ6 bq62 = this.LJLJI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[Cache] PIA Cache Get Headers Failed, reason: (");
            LIZ.append(e.getMessage());
            LIZ.append(')');
            bq62.accept(new C37394Ely(X1D.LIZIZ(LIZ)));
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
