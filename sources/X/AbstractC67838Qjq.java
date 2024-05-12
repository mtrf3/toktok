package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: X.Qjq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC67838Qjq<T> extends AbstractC67893Qkj {
    public final C67649Qgn<T> LIZIZ;

    public abstract void LJII(C67825Qjd<?> c67825Qjd);

    @Override // X.AbstractC67837Qjp
    public final void LIZ(Status status) {
        this.LIZIZ.LIZJ(new ETK(status));
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZIZ(Exception exc) {
        this.LIZIZ.LIZJ(exc);
    }

    @Override // X.AbstractC67837Qjp
    public final void LIZJ(C67825Qjd<?> c67825Qjd) {
        try {
            LJII(c67825Qjd);
        } catch (DeadObjectException e) {
            LIZ(AbstractC67837Qjp.LJ(e));
            throw e;
        } catch (RemoteException e2) {
            LIZ(AbstractC67837Qjp.LJ(e2));
        } catch (RuntimeException e3) {
            this.LIZIZ.LIZJ(e3);
        }
    }

    public AbstractC67838Qjq(int i, C67649Qgn<T> c67649Qgn) {
        super(i);
        this.LIZIZ = c67649Qgn;
    }
}
