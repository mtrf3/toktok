package X;

/* renamed from: X.Itm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48070Itm implements InterfaceC48093Iu9 {
    public final /* synthetic */ C48072Ito LIZ;

    @Override // X.InterfaceC48093Iu9
    public final void LIZIZ(C48071Itn c48071Itn) {
    }

    public C48070Itm(C48072Ito c48072Ito) {
        this.LIZ = c48072Ito;
    }

    @Override // X.InterfaceC48093Iu9
    public final void LIZ(C48071Itn c48071Itn) {
        this.LIZ.LJLJI.addAndGet(c48071Itn.LJLJI.get());
        C47480IkG.LIZ.LIZLLL(this.LIZ.LJLJI.get(), this.LIZ.LJLJL);
        this.LIZ.LJLJJI.addAndGet(c48071Itn.LJLJJI.get());
        synchronized (c48071Itn.LJZ) {
            c48071Itn.LJZ.notifyAll();
        }
    }
}
