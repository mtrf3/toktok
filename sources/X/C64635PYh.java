package X;

/* renamed from: X.PYh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64635PYh extends QNA {
    public final /* synthetic */ C64634PYg<T> LIZ;

    public C64635PYh(C64634PYg<T> c64634PYg) {
        this.LIZ = c64634PYg;
    }

    @Override // X.QNA
    public final void LIZIZ(int i, boolean z) {
        C64634PYg<T> c64634PYg = this.LIZ;
        c64634PYg.LIZIZ = z;
        c64634PYg.LIZJ = true;
        synchronized (c64634PYg.LIZLLL) {
            c64634PYg.LIZLLL.notifyAll();
        }
    }
}
