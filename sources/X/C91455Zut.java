package X;

/* renamed from: X.Zut, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91455Zut implements InterfaceC91242ZrS {
    public final AbstractC91590Zx4 LIZ;
    public final InterfaceC65784Pro<Boolean> LIZIZ;

    @Override // X.InterfaceC91242ZrS
    public final void LIZ() {
    }

    @Override // X.InterfaceC91242ZrS
    public final void LIZJ() {
    }

    @Override // X.InterfaceC91242ZrS
    public final boolean LIZIZ() {
        if (this.LIZIZ.invoke().booleanValue()) {
            return false;
        }
        return this.LIZ.LJFF();
    }

    @Override // X.InterfaceC91242ZrS
    public final boolean LIZLLL() {
        if (this.LIZIZ.invoke().booleanValue() || this.LIZ.LJIIIIZZ() == null) {
            return false;
        }
        return true;
    }

    public C91455Zut(AbstractC91590Zx4 abstractC91590Zx4, InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        this.LIZ = abstractC91590Zx4;
        this.LIZIZ = interfaceC65784Pro;
    }
}
