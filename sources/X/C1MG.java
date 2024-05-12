package X;

/* renamed from: X.1MG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1MG implements C0TD {
    public C30371Hd LIZ;

    public abstract C0R9 LIZIZ(C0R9 c0r9);

    public C0RA LIZJ(C0RA c0ra) {
        return c0ra;
    }

    public C1MG(C30371Hd c30371Hd) {
        this.LIZ = c30371Hd;
    }

    @Override // X.C0TD
    public C0RA LIZ(C0TC c0tc) {
        C0RA LIZIZ = c0tc.LIZIZ(LIZIZ(c0tc.LIZ()));
        LIZJ(LIZIZ);
        return LIZIZ;
    }
}
