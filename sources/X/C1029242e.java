package X;

/* renamed from: X.42e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1029242e implements C43O {
    public final /* synthetic */ C43O LIZ;
    public final /* synthetic */ C43O LIZIZ;
    public final /* synthetic */ AbstractC1038245q LIZJ;

    @Override // X.C43O
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.C43O
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    @Override // X.C43O
    public final void onShow() {
        this.LIZ.onShow();
    }

    @Override // X.C43O
    public final void onDismiss() {
        this.LIZJ.LJZL.LJIIIIZZ = false;
        this.LIZIZ.onDismiss();
        AbstractC1038245q abstractC1038245q = this.LIZJ;
        if (abstractC1038245q.LLFFF) {
            abstractC1038245q.LLFFF = false;
            AbstractC1038245q.LLF(abstractC1038245q, new C89463fC(C61878OQg.INSTANCE, -1, new C107074Id()));
        }
    }

    public C1029242e(C43O c43o, AbstractC1038245q abstractC1038245q) {
        this.LIZIZ = c43o;
        this.LIZJ = abstractC1038245q;
        this.LIZ = c43o;
    }
}
