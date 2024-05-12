package X;

import kotlin.jvm.internal.o;

/* renamed from: X.FJp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38773FJp implements InterfaceC55102Lju {
    public final /* synthetic */ Class<? extends C2K0> LJLIL;
    public final /* synthetic */ C2K0 LJLILLLLZI;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String className) {
        o.LJIIIZ(className, "className");
        if (o.LJ(C16880lQ.LJLLILLLL(this.LJLIL), className)) {
            return this.LJLILLLLZI;
        }
        throw new UnsupportedOperationException();
    }

    public C38773FJp(Class<? extends C2K0> cls, C2K0 c2k0) {
        this.LJLIL = cls;
        this.LJLILLLLZI = c2k0;
    }
}
