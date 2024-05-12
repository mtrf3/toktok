package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Fvt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40557Fvt<StateT> {
    public final C13T LIZ;
    public final IntentFilter LIZIZ;
    public final Context LIZJ;
    public final java.util.Set<InterfaceC40559Fvv<StateT>> LIZLLL = new HashSet();
    public C40558Fvu LJ = null;
    public volatile boolean LJFF = false;

    public abstract void LIZ(Context context, Intent intent);

    public final void LIZIZ() {
        C40558Fvu c40558Fvu;
        if ((this.LJFF || !((HashSet) this.LIZLLL).isEmpty()) && this.LJ == null) {
            C40558Fvu c40558Fvu2 = new C40558Fvu(this);
            this.LJ = c40558Fvu2;
            C16880lQ.LJJLIIIJILLIZJL(c40558Fvu2, this.LIZJ, this.LIZIZ);
        }
        if (this.LJFF || !((HashSet) this.LIZLLL).isEmpty() || (c40558Fvu = this.LJ) == null) {
            return;
        }
        C16880lQ.LJJLIIIJL(this.LIZJ, c40558Fvu);
        this.LJ = null;
    }

    public final synchronized void LIZJ(boolean z) {
        this.LJFF = z;
        LIZIZ();
    }

    public final synchronized void LJFF(StateT statet) {
        Iterator it = new HashSet(this.LIZLLL).iterator();
        while (it.hasNext()) {
            ((InterfaceC40559Fvv) it.next()).LIZ(statet);
        }
    }

    public final synchronized void LIZLLL(InterfaceC40559Fvv<StateT> interfaceC40559Fvv) {
        this.LIZ.LIZJ("registerListener", 4, new Object[0]);
        ((HashSet) this.LIZLLL).add(interfaceC40559Fvv);
        LIZIZ();
    }

    public final synchronized void LJ(C40598FwY c40598FwY) {
        this.LIZ.LIZJ("unregisterListener", 4, new Object[0]);
        ((HashSet) this.LIZLLL).remove(c40598FwY);
        LIZIZ();
    }

    public AbstractC40557Fvt(C13T c13t, IntentFilter intentFilter, Context context) {
        this.LIZ = c13t;
        this.LIZIZ = intentFilter;
        Context LLLLL = C16880lQ.LLLLL(context);
        this.LIZJ = LLLLL != null ? LLLLL : context;
    }
}
