package X;

/* renamed from: X.BZp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28997BZp implements C0NH {
    public XKQ LIZ;
    public boolean LIZIZ = true;
    public final /* synthetic */ C28998BZq LIZJ;

    @Override // X.C0NH
    public final void start() {
        this.LIZ = XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new C28995BZn(this, this.LIZJ, null), 2);
    }

    @Override // X.C0NH
    public final void stop() {
        XKQ xkq = this.LIZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LIZIZ = false;
        this.LIZJ.LIZ = null;
    }

    public C28997BZp(C28998BZq c28998BZq) {
        this.LIZJ = c28998BZq;
    }
}
