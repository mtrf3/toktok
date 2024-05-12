package X;

import Y.IDBReceiverS4S0100000;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: X.1V6, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1V6<T> extends AbstractC16850lN<T> {
    public final IDBReceiverS4S0100000 LJFF;

    public abstract IntentFilter LJFF();

    public abstract void LJI(Intent intent);

    static {
        C0VW.LIZIZ("BrdcstRcvrCnstrntTrckr");
    }

    @Override // X.AbstractC16850lN
    public final void LIZLLL() {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("%s: registering receiver", new Object[]{C16880lQ.LJLLJ(getClass())});
        LIZ.getClass();
        C16880lQ.LJJLIIIJILLIZJL(this.LJFF, this.LIZIZ, LJFF());
    }

    @Override // X.AbstractC16850lN
    public final void LJ() {
        C0VW LIZ = C0VW.LIZ();
        C16880lQ.LLLZ("%s: unregistering receiver", new Object[]{C16880lQ.LJLLJ(getClass())});
        LIZ.getClass();
        C16880lQ.LJJLIIIJL(this.LIZIZ, this.LJFF);
    }

    public C1V6(Context context, InterfaceC23750wV interfaceC23750wV) {
        super(context, interfaceC23750wV);
        this.LJFF = new IDBReceiverS4S0100000(this, 2);
    }
}
