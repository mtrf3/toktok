package X;

/* renamed from: X.UQz, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77185UQz implements InterfaceC64672gJ<C77216USe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ URA LJLJI;
    public final /* synthetic */ UR7 LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    @Override // X.InterfaceC64672gJ
    public final Object emit(C77216USe c77216USe, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        C77216USe c77216USe2 = c77216USe;
        int i = UR5.LIZ[c77216USe2.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C77177UQr.LIZ.getClass();
                C77177UQr.LJIILJJIL();
            }
        } else if (c77216USe2.LJLIL.LJLJI) {
            C77177UQr c77177UQr = C77177UQr.LIZ;
            String str = this.LJLIL;
            boolean z = this.LJLILLLLZI;
            URA ura = this.LJLJI;
            UR7 ur7 = this.LJLJJI;
            c77177UQr.getClass();
            C77177UQr.LJIIZILJ(str, 2, z, ura, ur7, true);
            C77177UQr.LJIIIIZZ().storeBoolean("finish_facebook_permission_process", true);
            URB urb = C77177UQr.LJFF;
            if (urb != null) {
                urb.ex();
            }
        } else {
            C77177UQr c77177UQr2 = C77177UQr.LIZ;
            String str2 = this.LJLIL;
            boolean z2 = this.LJLILLLLZI;
            URA ura2 = this.LJLJI;
            UR7 ur72 = this.LJLJJI;
            boolean z3 = this.LJLJJL;
            c77177UQr2.getClass();
            C77177UQr.LJIIZILJ(str2, 2, z2, ura2, ur72, z3);
        }
        return C76800UCe.LIZ;
    }

    public C77185UQz(String str, boolean z, URA ura, UR7 ur7, boolean z2) {
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = ura;
        this.LJLJJI = ur7;
        this.LJLJJL = z2;
    }
}
