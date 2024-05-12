package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qji, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67830Qji<ResultT> extends AbstractC67893Qkj {
    public final AbstractC67886Qkc<Object, ResultT> LIZIZ;
    public final C67649Qgn<ResultT> LIZJ;
    public final InterfaceC68018Qmk LIZLLL;

    @Override // X.AbstractC67837Qjp
    public final void LIZ(Status status) {
        C67649Qgn<ResultT> c67649Qgn = this.LIZJ;
        this.LIZLLL.getClass();
        c67649Qgn.LIZJ(C1GE.LIZJ(status));
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZIZ(Exception exc) {
        this.LIZJ.LIZJ(exc);
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZJ(C67825Qjd<?> c67825Qjd) {
        try {
            this.LIZIZ.LIZ(c67825Qjd.LJLILLLLZI, this.LIZJ);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            LIZ(AbstractC67837Qjp.LJ(e2));
        } catch (RuntimeException e3) {
            this.LIZJ.LIZJ(e3);
        }
    }

    @Override // X.AbstractC67893Qkj
    public final boolean LJFF(C67825Qjd<?> c67825Qjd) {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.AbstractC67893Qkj
    public final Feature[] LJI(C67825Qjd<?> c67825Qjd) {
        return this.LIZIZ.LIZ;
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZLLL(C67834Qjm c67834Qjm, boolean z) {
        C67649Qgn<ResultT> c67649Qgn = this.LIZJ;
        c67834Qjm.LIZIZ.put(c67649Qgn, Boolean.valueOf(z));
        c67649Qgn.LIZ.LIZIZ(new C67915Ql5(c67834Qjm, c67649Qgn));
    }

    public C67830Qji(int i, AbstractC67886Qkc<Object, ResultT> abstractC67886Qkc, C67649Qgn<ResultT> c67649Qgn, InterfaceC68018Qmk interfaceC68018Qmk) {
        super(i);
        this.LIZJ = c67649Qgn;
        this.LIZIZ = abstractC67886Qkc;
        this.LIZLLL = interfaceC68018Qmk;
        if (i != 2 || !abstractC67886Qkc.LIZIZ) {
        } else {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
}
