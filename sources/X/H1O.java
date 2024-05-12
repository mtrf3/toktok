package X;

import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1O implements InterfaceC65753PrJ<String> {
    public final /* synthetic */ H1N LIZ;

    public H1O(H1N h1n) {
        this.LIZ = h1n;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable t) {
        o.LJIIIZ(t, "t");
        this.LIZ.getClass();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(1, "status");
        FMX.LJIIL("pugc_template_binding_event", c145995oB.LIZ);
        H1N h1n = this.LIZ;
        H1P h1p = new H1P("template_bind_fail");
        C67996QmO c67996QmO = h1n.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(10106, h1p);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(String str) {
        this.LIZ.getClass();
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(0, "status");
        FMX.LJIIL("pugc_template_binding_event", c145995oB.LIZ);
        C67996QmO c67996QmO = this.LIZ.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LJ(null, true);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }
}
