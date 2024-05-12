package X;

import Y.ARunnableS34S0200000_15;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XIF extends XID {
    public final Handler LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final XIF LJLJJI;
    public volatile XIF _immediate;

    public XIF() {
        throw null;
    }

    @Override // X.AbstractC78621UtN, X.XKW
    public final String toString() {
        String str;
        AbstractC78621UtN abstractC78621UtN;
        AbstractC78621UtN abstractC78621UtN2 = C36636EZk.LIZ;
        if (this == abstractC78621UtN2) {
            str = "Dispatchers.Main";
        } else {
            str = null;
            try {
                abstractC78621UtN = abstractC78621UtN2.LJJIJIL();
            } catch (UnsupportedOperationException unused) {
                abstractC78621UtN = null;
            }
            if (this == abstractC78621UtN) {
                str = "Dispatchers.Main.immediate";
            }
        }
        if (str == null) {
            String str2 = this.LJLILLLLZI;
            if (str2 == null) {
                str2 = this.LJLIL.toString();
            }
            if (this.LJLJI) {
                return o.LJIILLIIL(".immediate", str2);
            }
            return str2;
        }
        return str;
    }

    public final int hashCode() {
        return System.identityHashCode(this.LJLIL);
    }

    @Override // X.AbstractC78621UtN
    public final /* bridge */ /* synthetic */ AbstractC78621UtN LJJIJIL() {
        return this.LJLJJI;
    }

    public XIF(Handler handler) {
        this(handler, null, false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof XIF) && ((XIF) obj).LJLIL == this.LJLIL) {
            return true;
        }
        return false;
    }

    @Override // X.XKW
    public final boolean isDispatchNeeded(MBA mba) {
        if (!this.LJLJI || !o.LJ(Looper.myLooper(), this.LJLIL.getLooper())) {
            return true;
        }
        return false;
    }

    public final void LJJIZ(MBA mba, Runnable runnable) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("The task was rejected, the handler underlying the dispatcher '");
        LIZ.append(this);
        LIZ.append("' was closed");
        C79146V4k.LJIJ(mba, new CancellationException(X1D.LIZIZ(LIZ)));
        C78613UtF.LIZJ.LJJIJIL(runnable, false);
    }

    @Override // X.XKW
    public final void dispatch(MBA mba, Runnable runnable) {
        if (!this.LJLIL.post(runnable)) {
            LJJIZ(mba, runnable);
        }
    }

    @Override // X.InterfaceC74210TAo
    public final void scheduleResumeAfterDelay(long j, XJL<? super C76800UCe> xjl) {
        XKS xks = (XKS) xjl;
        ARunnableS34S0200000_15 aRunnableS34S0200000_15 = new ARunnableS34S0200000_15(xks, this, 72);
        Handler handler = this.LJLIL;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(aRunnableS34S0200000_15, j)) {
            xks.LJIILIIL(new AqS146S0200000_15(this, aRunnableS34S0200000_15, 89));
        } else {
            LJJIZ(xks.LJLJJL, aRunnableS34S0200000_15);
        }
    }

    public XIF(Handler handler, String str, boolean z) {
        XIF xif;
        this.LJLIL = handler;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        if (z) {
            xif = this;
        } else {
            xif = null;
        }
        this._immediate = xif;
        XIF xif2 = this._immediate;
        if (xif2 == null) {
            xif2 = new XIF(handler, str, true);
            this._immediate = xif2;
        }
        this.LJLJJI = xif2;
    }

    @Override // X.XID, X.InterfaceC74210TAo
    public final T2N invokeOnTimeout(long j, Runnable runnable, MBA mba) {
        Handler handler = this.LJLIL;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new XIG(this, runnable);
        }
        LJJIZ(mba, runnable);
        return C77433UaD.LJLIL;
    }
}
