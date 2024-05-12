package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Xok, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85978Xok<I, O> implements C14Q {
    public final /* synthetic */ TBW<InterfaceC28616BKy, Object> LJLIL;
    public final /* synthetic */ TBW<InterfaceC28616BKy, Object> LJLILLLLZI;

    public C85978Xok(C85981Xon c85981Xon, C62845OlV c62845OlV) {
        this.LJLIL = c85981Xon;
        this.LJLILLLLZI = c62845OlV;
    }

    @Override // X.C14Q
    public final Object apply(Object it) {
        TBW<InterfaceC28616BKy, Object> tbw = this.LJLIL;
        o.LJIIIIZZ(it, "it");
        return new C213208Yi(tbw.get(it), this.LJLILLLLZI.get(it));
    }
}
