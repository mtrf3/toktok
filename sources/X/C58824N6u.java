package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.internal.o;

/* renamed from: X.N6u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58824N6u implements N6K {
    public final LifecycleOwner LIZ;
    public final XLL LIZIZ = C79853Bl.LIZ(0, 0, null, 7);
    public final XLM LIZJ;
    public final C79863Bm LIZLLL;

    @Override // X.N6K
    public final C79863Bm LIZIZ() {
        return this.LIZLLL;
    }

    public C58824N6u(ActivityC45651qj activityC45651qj) {
        this.LIZ = activityC45651qj;
        XLM LIZ = V8H.LIZ(new N6I(126));
        this.LIZJ = LIZ;
        this.LIZLLL = V1M.LIZLLL(LIZ);
    }

    @Override // X.N6K
    public final void LIZ(N6I n6i) {
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new NER(this, n6i, null), 3);
    }

    @Override // X.N6K
    public final void LIZJ(N6F event) {
        o.LJIIIZ(event, "event");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new NE4(event, this, null), 3);
    }

    @Override // X.N6K
    public final void LIZLLL(N6F state, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(state, "state");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new NEC(this, state, interfaceC65784Pro, null), 3);
    }
}
