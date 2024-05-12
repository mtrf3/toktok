package X;

/* renamed from: X.UQt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77179UQt<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ActivityC45651qj LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ URA LJLJJLL;
    public final /* synthetic */ UR7 LJLJL;
    public final /* synthetic */ C34K LJLJLJ;

    public C77179UQt(int i, String str, String str2, ActivityC45651qj activityC45651qj, boolean z, URA ura, UR7 ur7, C34K c34k) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = activityC45651qj;
        this.LJLJJL = z;
        this.LJLJJLL = ura;
        this.LJLJL = ur7;
        this.LJLJLJ = c34k;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C77157UPx c77157UPx = (C77157UPx) obj;
        if (c77157UPx.LJLILLLLZI.LJLIL && c77157UPx.LJLIL == EnumC77154UPu.SYNC_STATUS) {
            if (this.LJLIL == 2) {
                URB urb = C77177UQr.LJFF;
                if (urb != null) {
                    urb.UQ();
                }
                C77177UQr c77177UQr = C77177UQr.LIZ;
                String str = this.LJLILLLLZI;
                String str2 = this.LJLJI;
                ActivityC45651qj activityC45651qj = this.LJLJJI;
                boolean z = this.LJLJJL;
                URA ura = this.LJLJJLL;
                java.util.Map LIZJ = E2C.LIZJ("is_followed_pop_up", "1");
                UR7 ur7 = this.LJLJL;
                c77177UQr.getClass();
                C77177UQr.LJFF(str, str2, activityC45651qj, z, ura, LIZJ, ur7);
                C77177UQr.LJIIIIZZ().storeBoolean("finish_facebook_permission_process", true);
            } else {
                URB urb2 = C77177UQr.LJFF;
                if (urb2 != null) {
                    urb2.ex();
                }
                C77177UQr c77177UQr2 = C77177UQr.LIZ;
                String str3 = this.LJLILLLLZI;
                String str4 = this.LJLJI;
                ActivityC45651qj activityC45651qj2 = this.LJLJJI;
                boolean z2 = this.LJLJJL;
                URA ura2 = this.LJLJJLL;
                java.util.Map LIZJ2 = E2C.LIZJ("is_followed_pop_up", "1");
                UR7 ur72 = this.LJLJL;
                c77177UQr2.getClass();
                C77177UQr.LJI(str3, str4, activityC45651qj2, z2, ura2, LIZJ2, ur72);
                C77177UQr.LJIIIIZZ().storeBoolean("finish_contact_permission_process", true);
            }
            this.LJLJLJ.element = true;
        }
        EnumC77154UPu enumC77154UPu = c77157UPx.LJLIL;
        if ((enumC77154UPu == EnumC77154UPu.REQUEST_ACTUAL_PERMISSION || enumC77154UPu == EnumC77154UPu.REQUEST_UID_PERMISSION) && !c77157UPx.LJLILLLLZI.LJLIL) {
            C77177UQr c77177UQr3 = C77177UQr.LIZ;
            String str5 = this.LJLILLLLZI;
            int i = this.LJLIL;
            boolean z3 = this.LJLJJL;
            URA ura3 = this.LJLJJLL;
            UR7 ur73 = this.LJLJL;
            c77177UQr3.getClass();
            C77177UQr.LJIIZILJ(str5, i, z3, ura3, ur73, false);
        }
    }
}
