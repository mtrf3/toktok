package X;

/* renamed from: X.ZjF, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90733ZjF<T> implements InterfaceC90399Zdr<T> {
    public final InterfaceC90712Ziu LIZ;
    public final AbstractC90306ZcM<?, ?> LIZIZ;
    public final boolean LIZJ;
    public final AbstractC90234ZbC<?> LIZLLL;

    @Override // X.InterfaceC90399Zdr
    public final int LIZ(T t) {
        int hashCode = this.LIZIZ.LIZJ(t).hashCode();
        if (!this.LIZJ) {
            return hashCode;
        }
        this.LIZLLL.LIZ(t);
        throw null;
    }

    @Override // X.InterfaceC90399Zdr
    public final boolean LIZIZ(T t) {
        this.LIZLLL.LIZ(t);
        throw null;
    }

    @Override // X.InterfaceC90399Zdr
    public final int LIZJ(T t) {
        AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LIZIZ;
        int LIZIZ = abstractC90306ZcM.LIZIZ(abstractC90306ZcM.LIZJ(t));
        if (!this.LIZJ) {
            return LIZIZ;
        }
        this.LIZLLL.LIZ(t);
        throw null;
    }

    @Override // X.InterfaceC90399Zdr
    public final void LJ(T t) {
        this.LIZIZ.LJ(t);
        this.LIZLLL.LIZIZ(t);
    }

    @Override // X.InterfaceC90399Zdr
    public final void LIZLLL(T t, T t2) {
        AbstractC90306ZcM<?, ?> abstractC90306ZcM = this.LIZIZ;
        abstractC90306ZcM.LJFF(t, abstractC90306ZcM.LIZLLL(abstractC90306ZcM.LIZJ(t), abstractC90306ZcM.LIZJ(t2)));
        if (!this.LIZJ) {
            return;
        }
        this.LIZLLL.LIZ(t2);
        throw null;
    }

    @Override // X.InterfaceC90399Zdr
    public final boolean LJFF(T t, T t2) {
        if (!this.LIZIZ.LIZJ(t).equals(this.LIZIZ.LIZJ(t2))) {
            return false;
        }
        if (!this.LIZJ) {
            return true;
        }
        this.LIZLLL.LIZ(t);
        this.LIZLLL.LIZ(t2);
        throw null;
    }

    @Override // X.InterfaceC90399Zdr
    public final void LJI(T t, C90405Zdx c90405Zdx) {
        this.LIZLLL.LIZ(t);
        throw null;
    }

    public C90733ZjF(AbstractC90306ZcM<?, ?> abstractC90306ZcM, AbstractC90234ZbC<?> abstractC90234ZbC, InterfaceC90712Ziu interfaceC90712Ziu) {
        this.LIZIZ = abstractC90306ZcM;
        this.LIZJ = abstractC90234ZbC.LIZJ(interfaceC90712Ziu);
        this.LIZLLL = abstractC90234ZbC;
        this.LIZ = interfaceC90712Ziu;
    }
}
