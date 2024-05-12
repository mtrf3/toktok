package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wvp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83869Wvp implements HJ0 {
    public final CopyOnWriteArrayList<HJ0> LJLIL;
    public final InterfaceC83867Wvn LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC65784Pro<Boolean> LJLJJI;

    public C83869Wvp(C83866Wvm recorder, boolean z, AqS164S0100000_14 interceptCallback) {
        o.LJIIIZ(recorder, "recorder");
        o.LJIIIZ(interceptCallback, "interceptCallback");
        this.LJLILLLLZI = recorder;
        this.LJLJI = z;
        this.LJLJJI = interceptCallback;
        this.LJLIL = new CopyOnWriteArrayList<>();
    }

    @Override // X.InterfaceC133905Ni
    public final void LIZ(int i, int i2, float f, String str) {
        if (this.LJLJJI.invoke().booleanValue()) {
            return;
        }
        Iterator<HJ0> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            it.next().LIZ(i, i2, f, str);
        }
    }
}
