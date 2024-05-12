package X;

/* renamed from: X.Pi5, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65181Pi5 implements InterfaceC65076PgO {
    public boolean LIZ = true;
    public final /* synthetic */ StringBuilder LIZIZ;

    public C65181Pi5(StringBuilder sb) {
        this.LIZIZ = sb;
    }

    @Override // X.InterfaceC65076PgO
    public final void LIZ(C65183Pi7 c65183Pi7, int i) {
        if (this.LIZ) {
            this.LIZ = false;
        } else {
            this.LIZIZ.append(", ");
        }
        this.LIZIZ.append(i);
    }
}
