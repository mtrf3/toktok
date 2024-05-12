package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.V5l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79173V5l extends AbstractC65781Prl implements InterfaceC88473Ynt<C0YY, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C79187V5z LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ V63 LJLJJLL;
    public final /* synthetic */ Integer LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ long LJLJLLL;
    public final /* synthetic */ Integer LJLL;
    public final /* synthetic */ InterfaceC09420Yo LJLLI;
    public final /* synthetic */ InterfaceC23370vt LJLLILLLL;
    public final /* synthetic */ InterfaceC35811ar<C23360vs> LJLLJ;
    public final /* synthetic */ boolean LJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79173V5l(String str, boolean z, C79187V5z c79187V5z, boolean z2, Integer num, V63 v63, Integer num2, int i, long j, Integer num3, InterfaceC09420Yo interfaceC09420Yo, InterfaceC23370vt interfaceC23370vt, InterfaceC35811ar<C23360vs> interfaceC35811ar, boolean z3) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = z;
        this.LJLJI = c79187V5z;
        this.LJLJJI = z2;
        this.LJLJJL = num;
        this.LJLJJLL = v63;
        this.LJLJL = num2;
        this.LJLJLJ = i;
        this.LJLJLLL = j;
        this.LJLL = num3;
        this.LJLLI = interfaceC09420Yo;
        this.LJLLILLLL = interfaceC23370vt;
        this.LJLLJ = interfaceC35811ar;
        this.LJLLL = z3;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(C0YY TuxInternalButton, InterfaceC24520xk interfaceC24520xk, Integer num) {
        float f;
        long j;
        boolean z;
        int intValue;
        float f2;
        float f3;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue2 = num.intValue();
        o.LJIIIZ(TuxInternalButton, "$this$TuxInternalButton");
        if ((intValue2 & 81) != 16 || !interfaceC24520xk2.LIZ()) {
            if (TextUtils.isEmpty(this.LJLIL)) {
                f = 0;
            } else {
                f = 4;
            }
            boolean z2 = this.LJLILLLLZI;
            C79187V5z c79187V5z = this.LJLJI;
            if (z2) {
                j = c79187V5z.LJFF;
            } else {
                j = c79187V5z.LJI;
            }
            if (this.LJLJJI && z2) {
                z = true;
            } else {
                z = false;
            }
            Integer num2 = this.LJLJJL;
            interfaceC24520xk2.LJJIIJ(728713957);
            if (num2 == null) {
                intValue = ((V7N) interfaceC24520xk2.LJIILLIIL(C79223V7j.LIZ)).LJLLILLLL;
            } else {
                intValue = num2.intValue();
            }
            interfaceC24520xk2.LJJIJIIJIL();
            if (z) {
                interfaceC24520xk2.LJJIIJ(728714030);
                V63 v63 = this.LJLJJLL;
                V2K.LIZ(intValue, "", null, j, v63.LJ, v63.LJFF, false, interfaceC24520xk2, 48, 68);
                interfaceC24520xk2.LJJIJIIJIL();
            } else {
                interfaceC24520xk2.LJJIIJ(728714417);
                interfaceC24520xk2.LJJIIJ(728714435);
                if (this.LJLJL != null) {
                    InterfaceC07790Sh LJIL = C70657RoD.LJIL(InterfaceC07790Sh.LJJJI, 0.0f, 0.0f, f, 0.0f, 11);
                    V63 v632 = this.LJLJJLL;
                    V2K.LIZJ(this.LJLJL.intValue(), "", LJIL, j, v632.LJ, v632.LJFF, false, interfaceC24520xk2, ((this.LJLJLJ >> 24) & 14) | 48, 64);
                }
                interfaceC24520xk2.LJJIJIIJIL();
                long j2 = this.LJLJLLL;
                long j3 = C23520w8.LIZJ;
                if (!C23520w8.LIZ(j2, j3)) {
                    if (C23520w8.LIZJ(this.LJLJLLL) < 0.0f) {
                        j3 = C79043V0l.LJIIIIZZ(10);
                    } else {
                        j3 = this.LJLJLLL;
                    }
                }
                if (this.LJLJL != null) {
                    f2 = this.LJLJJLL.LJ + f;
                } else {
                    f2 = 0;
                }
                if (this.LJLL != null) {
                    f3 = this.LJLJJLL.LJ + f;
                } else {
                    f3 = 0;
                }
                InterfaceC09420Yo interfaceC09420Yo = this.LJLLI;
                EnumC23500w6 enumC23500w6 = EnumC23500w6.Ltr;
                float LJJJJIZL = this.LJLLILLLL.LJJJJIZL(this.LJLLI.LIZ(enumC23500w6) + interfaceC09420Yo.LIZJ(enumC23500w6) + f2 + f3);
                C24620xu[] c24620xuArr = new C24620xu[1];
                C44021o6 c44021o6 = C79169V5h.LIZ;
                long j4 = this.LJLLJ.getValue().LIZ;
                int LJIIIZ = (int) (C23360vs.LJIIIZ(this.LJLLJ.getValue().LIZ) - LJJJJIZL);
                if (LJIIIZ <= 0) {
                    LJIIIZ = 0;
                }
                int LJII = (int) (C23360vs.LJII(this.LJLLJ.getValue().LIZ) - LJJJJIZL);
                if (LJII <= 0) {
                    LJII = 0;
                }
                c24620xuArr[0] = c44021o6.LIZIZ(new C23360vs(C23360vs.LIZ(j4, LJIIIZ, LJII, 0, 0, 12)));
                C24410xZ.LIZ(c24620xuArr, C1DJ.LJ(interfaceC24520xk2, -1371236550, new V61(this.LJLJL, this.LJLJJLL, this.LJLL, this.LJLLL, this.LJLJI, this.LJLILLLLZI, this.LJLIL, j3, this.LJLJLJ)), interfaceC24520xk2, 56);
                if (this.LJLL != null) {
                    InterfaceC07790Sh LJIL2 = C70657RoD.LJIL(InterfaceC07790Sh.LJJJI, f, 0.0f, 0.0f, 0.0f, 14);
                    V63 v633 = this.LJLJJLL;
                    V2K.LIZJ(this.LJLL.intValue(), "", LJIL2, j, v633.LJ, v633.LJFF, false, interfaceC24520xk2, ((this.LJLJLJ >> 27) & 14) | 48, 64);
                }
                interfaceC24520xk2.LJJIJIIJIL();
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
