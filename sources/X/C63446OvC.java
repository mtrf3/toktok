package X;

/* renamed from: X.OvC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63446OvC implements InterfaceC86963bA<C63120Opw> {
    public final /* synthetic */ C109544Rq LIZ;
    public final /* synthetic */ C63537Owf LIZIZ;
    public final /* synthetic */ InterfaceC67352kd<C109544Rq> LIZJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        int value;
        if (c63623Oy3 != null) {
            value = c63623Oy3.LIZ;
        } else {
            value = EnumC63552Owu.CONV_NOT_FOUND.getValue();
        }
        InterfaceC67352kd<C109544Rq> interfaceC67352kd = this.LIZJ;
        C3C4 LIZ = C141335gf.LIZ(new C63443Ov9(value, "recreate conv failed"));
        C3C5.m7constructorimpl(LIZ);
        interfaceC67352kd.resumeWith(LIZ);
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(C63120Opw c63120Opw) {
        C63120Opw c63120Opw2 = c63120Opw;
        if (c63120Opw2 != null) {
            C115284fk.LJIILIIL().LJIJI(14, c63120Opw2);
            this.LIZ.setConversationShortId(c63120Opw2.getConversationShortId());
        }
        this.LIZIZ.LIZLLL = true;
        InterfaceC67352kd<C109544Rq> interfaceC67352kd = this.LIZJ;
        C109544Rq c109544Rq = this.LIZ;
        C3C5.m7constructorimpl(c109544Rq);
        interfaceC67352kd.resumeWith(c109544Rq);
    }

    public C63446OvC(C109544Rq c109544Rq, C63537Owf c63537Owf, C84654XKg c84654XKg) {
        this.LIZ = c109544Rq;
        this.LIZIZ = c63537Owf;
        this.LIZJ = c84654XKg;
    }
}
