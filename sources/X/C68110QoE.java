package X;

/* renamed from: X.QoE, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68110QoE extends AbstractC68050QnG {
    public HandlerC68138Qog LIZJ;
    public final C68035Qn1 LIZLLL;
    public final C68088Qns LJ;
    public final C51367KDz LJFF;

    @Override // X.AbstractC68050QnG
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final void LJIIIZ() {
        LJFF();
        if (this.LIZJ == null) {
            this.LIZJ = new HandlerC68138Qog(C16880lQ.LLJJJJ());
        }
    }

    public C68110QoE(C68033Qmz c68033Qmz) {
        super(c68033Qmz);
        this.LIZLLL = new C68035Qn1(this);
        this.LJ = new C68088Qns(this);
        this.LJFF = new C51367KDz(this);
    }
}
