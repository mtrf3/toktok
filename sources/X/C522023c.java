package X;

import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.23c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C522023c extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC07280Qi, C76800UCe> {
    public final /* synthetic */ C14870iB LJLIL;
    public final /* synthetic */ C14770i1 LJLILLLLZI;
    public final /* synthetic */ C15010iP LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ C18810oX LJLJJLL;
    public final /* synthetic */ InterfaceC14950iJ LJLJL;
    public final /* synthetic */ C20140qg LJLJLJ;
    public final /* synthetic */ C0ZJ LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C522023c(C14870iB c14870iB, C14770i1 c14770i1, C15010iP c15010iP, boolean z, boolean z2, C18810oX c18810oX, InterfaceC14950iJ interfaceC14950iJ, C20140qg c20140qg, C0ZJ c0zj) {
        super(1);
        this.LJLIL = c14870iB;
        this.LJLILLLLZI = c14770i1;
        this.LJLJI = c15010iP;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJJLL = c18810oX;
        this.LJLJL = interfaceC14950iJ;
        this.LJLJLJ = c20140qg;
        this.LJLJLLL = c0zj;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC07280Qi interfaceC07280Qi) {
        InterfaceC07280Qi semantics = interfaceC07280Qi;
        o.LJIIIZ(semantics, "$this$semantics");
        int i = this.LJLIL.LJ;
        C07270Qh c07270Qh = C07260Qg.LJIIIIZZ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C07260Qg.LIZ;
        c07270Qh.LIZ(semantics, interfaceC74236TBoArr[11], new C14850i9(i));
        C08440Uu c08440Uu = this.LJLILLLLZI.LIZ;
        o.LJIIIZ(c08440Uu, "<set-?>");
        C07260Qg.LJI.LIZ(semantics, interfaceC74236TBoArr[9], c08440Uu);
        C07260Qg.LJII.LIZ(semantics, interfaceC74236TBoArr[10], new C08350Ul(this.LJLJI.LIZIZ));
        if (!this.LJLJJI) {
            semantics.LIZJ(C07230Qd.LJIIIIZZ, C76800UCe.LIZ);
        }
        semantics.LIZJ(C0QY.LIZ, new C0QK(null, new IDqS416S0100000(this.LJLJJLL, 273)));
        semantics.LIZJ(C0QY.LJII, new C0QK(null, new IDqS416S0100000(this.LJLJJLL, 274)));
        semantics.LIZJ(C0QY.LJI, new C0QK(null, new C523623s(this.LJLJL, this.LJLJJI, this.LJLJI, this.LJLJLJ, this.LJLJJLL)));
        C07260Qg.LIZ(semantics, null, new C523823u(this.LJLJJLL, this.LJLJLLL, this.LJLJJL));
        semantics.LIZJ(C0QY.LIZJ, new C0QK(null, new IDqS420S0100000(this.LJLJLJ, 137)));
        if (!C08350Ul.LIZIZ(this.LJLJI.LIZIZ)) {
            semantics.LIZJ(C0QY.LJIIIIZZ, new C0QK(null, new IDqS420S0100000(this.LJLJLJ, 138)));
            if (this.LJLJJI && !this.LJLJJL) {
                semantics.LIZJ(C0QY.LJIIIZ, new C0QK(null, new IDqS420S0100000(this.LJLJLJ, 139)));
            }
        }
        if (this.LJLJJI && !this.LJLJJL) {
            semantics.LIZJ(C0QY.LJIIJ, new C0QK(null, new IDqS420S0100000(this.LJLJLJ, UserLevelGeckoUpdateSetting.DEFAULT)));
        }
        return C76800UCe.LIZ;
    }
}
