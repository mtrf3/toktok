package X;

import Y.IDhS71S0200000_12;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.TMe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC74512TMe<DATA, CURSOR, EXTRA> extends AbstractC73941T0f<OSZ<? extends Integer, ? extends CURSOR>, OSZ<? extends CURSOR, ? extends OSZ<? extends List<? extends DATA>, ? extends EXTRA>>> {
    public final AtomicReference<CURSOR> LIZJ;
    public final Object LIZLLL = new Object();

    public abstract boolean LJIIIIZZ(CURSOR cursor, CURSOR cursor2);

    public AbstractC74512TMe(CURSOR cursor) {
        this.LIZJ = new AtomicReference<>(cursor);
    }

    public final C73634Sv8 LJIIIZ(int i) {
        CURSOR cursor;
        synchronized (this.LIZLLL) {
            cursor = this.LIZJ.get();
        }
        AbstractC73672Svk<OSZ<? extends CURSOR, ? extends OSZ<? extends List<? extends DATA>, ? extends EXTRA>>> LJII = LJII(new OSZ(Integer.valueOf(i), cursor));
        LJII.getClass();
        return new C73487Ssl(LJII).LJIJI(new IDhS71S0200000_12(this, cursor, 7));
    }
}
