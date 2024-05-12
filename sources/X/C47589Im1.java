package X;

/* renamed from: X.Im1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47589Im1 {
    public C47587Ilz LIZJ;
    public final AbstractC47819Ipj LIZLLL;
    public String LIZIZ = "";
    public final HandlerC47588Im0 LIZ = new HandlerC47588Im0(this, C47756Ioi.LJII());

    public C47589Im1(AbstractC47819Ipj abstractC47819Ipj) {
        if (abstractC47819Ipj == null) {
            this.LIZLLL = new C47985IsP();
        } else {
            this.LIZLLL = abstractC47819Ipj;
        }
    }

    public final void LIZ(C47789IpF c47789IpF) {
        this.LIZ.sendMessage(this.LIZ.obtainMessage(1, c47789IpF));
    }
}
