package X;

import kotlin.jvm.internal.o;

/* renamed from: X.23u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C523823u extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ C18810oX LJLIL;
    public final /* synthetic */ C0ZJ LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C523823u(C18810oX c18810oX, C0ZJ c0zj, boolean z) {
        super(0);
        this.LJLIL = c18810oX;
        this.LJLILLLLZI = c0zj;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        C14760i0 c14760i0;
        C18810oX c18810oX = this.LJLIL;
        C0ZJ c0zj = this.LJLILLLLZI;
        boolean z = !this.LJLJI;
        if (!c18810oX.LIZIZ()) {
            c0zj.LIZIZ();
        } else if (z && (c14760i0 = c18810oX.LIZLLL) != null && o.LJ(c14760i0.LIZ.LIZIZ.get(), c14760i0)) {
            c14760i0.LIZIZ.LJ();
        }
        return Boolean.TRUE;
    }
}
