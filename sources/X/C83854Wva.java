package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wva, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83854Wva implements IAF {
    public final CopyOnWriteArrayList<IAF> LJLIL;
    public final InterfaceC83867Wvn LJLILLLLZI;
    public final InterfaceC65784Pro<Boolean> LJLJI;

    public C83854Wva(C83866Wvm recorder, AqS164S0100000_14 interceptCallback) {
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLILLLLZI = recorder;
        this.LJLJI = interceptCallback;
        this.LJLIL = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (this.LJLJI.invoke().booleanValue()) {
            return;
        }
        Iterator<IAF> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, i2, f, str);
        }
    }
}
