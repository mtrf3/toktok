package X;

/* renamed from: X.OvB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63445OvB implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ C109544Rq LIZ;
    public final /* synthetic */ C63622Oy2 LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ C63536Owe LIZLLL;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        this.LIZLLL.LJIILL(this.LIZIZ, this.LIZ, this.LIZJ);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        C115284fk.LJIILIIL().LJIJI(14, c63120Opw2);
        this.LIZ.setConversationShortId(c63120Opw2.getConversationShortId());
        this.LIZLLL.LJ = true;
        this.LIZLLL.LJIILLIIL(this.LIZ);
    }

    public C63445OvB(C63536Owe c63536Owe, C63622Oy2 c63622Oy2, C109544Rq c109544Rq, boolean z) {
        this.LIZLLL = c63536Owe;
        this.LIZ = c109544Rq;
        this.LIZIZ = c63622Oy2;
        this.LIZJ = z;
    }
}
