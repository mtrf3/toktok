package X;

import Y.ARunnableS34S0200000_15;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X85 extends X8P<X88> {
    public final C62822Ol8 LJLJLJ;
    public X81<Object> LJLJLLL;

    @Override // X.X8P
    public final Object LIZLLL() {
        T t = this.LJLJJI;
        if (t instanceof X87) {
            ((Handler) this.LJLJLJ.getValue()).post(new ARunnableS34S0200000_15(this, (X87) t, 49));
        } else if (t instanceof X84) {
            X84 x84 = (X84) t;
            X8N x8n = X8G.LIZ;
            if (x8n != null) {
                x8n.LIZLLL.invoke().execute(new ARunnableS34S0200000_15(this, x84, 50));
            } else {
                o.LJIJI("config");
                throw null;
            }
        } else if (t instanceof X83) {
            try {
                XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new X82(this, (X83) t, null), 2);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // X.X8P
    public final void onDetach() {
        super.onDetach();
        ((X88) this.LJLJJI).onDetach();
        this.LJLJLLL = null;
    }

    @Override // X.X8P
    public final void LIZ(Bundle bundle) {
        ((X88) this.LJLJJI).LIZ(bundle);
    }

    public X85(X88 x88, X8X x8x, Bundle bundle) {
        super(x88, x8x, bundle);
        this.LJLJLJ = C221108m2.LIZIZ(X86.INSTANCE);
        this.LJLJLLL = new X81<>(new C1UE(1));
    }
}
