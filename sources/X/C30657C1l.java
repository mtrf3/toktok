package X;

/* renamed from: X.C1l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C30657C1l extends TBS implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public C30657C1l(Object obj) {
        super(1, obj, C3G.class, "onPauseLive", "onPauseLive(Z)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C3G c3g = (C3G) this.receiver;
        if (booleanValue) {
            c3g.getClass();
            c3g.LIZIZ(C78857UxB.LJJIIJ(1476788483, "bpea-782"), true, null);
            C11000bw c11000bw = c3g.LIZJ;
            if (c11000bw != null) {
                c11000bw.LIZ(1);
            }
        } else {
            InterfaceC21020s6 interfaceC21020s6 = c3g.LIZIZ;
            if (interfaceC21020s6 != null) {
                interfaceC21020s6.LJJIIJ(C78857UxB.LJJIIJ(1476788233, "bpea-781"));
            }
            C11000bw c11000bw2 = c3g.LIZJ;
            if (c11000bw2 != null) {
                c11000bw2.LIZIZ(1);
            }
        }
        return C76800UCe.LIZ;
    }
}
