package X;

import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS6S0400000;
import kotlin.jvm.internal.o;

/* renamed from: X.20x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C516320x extends AbstractC65781Prl implements InterfaceC88473Ynt<C0MC, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C13140fO LJLIL;
    public final /* synthetic */ InterfaceC07790Sh LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<InterfaceC516520z, C23360vs, InterfaceC273515n> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ InterfaceC24760y8<InterfaceC13090fJ> LJLJJL;
    public final /* synthetic */ InterfaceC13090fJ LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C516320x(C13140fO c13140fO, InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr interfaceC88471Ynr, int i, InterfaceC35811ar interfaceC35811ar, InterfaceC13090fJ interfaceC13090fJ) {
        super(3);
        this.LJLIL = c13140fO;
        this.LJLILLLLZI = interfaceC07790Sh;
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = i;
        this.LJLJJL = interfaceC35811ar;
        this.LJLJJLL = interfaceC13090fJ;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(C0MC c0mc, InterfaceC24520xk interfaceC24520xk, Integer num) {
        C0MC saveableStateHolder = c0mc;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        num.intValue();
        o.LJIIIZ(saveableStateHolder, "saveableStateHolder");
        InterfaceC24760y8<InterfaceC13090fJ> interfaceC24760y8 = this.LJLJJL;
        interfaceC24520xk2.LJJIIJ(-492369756);
        Object LJIILL = interfaceC24520xk2.LJIILL();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJIILL == c24490xh) {
            LJIILL = new C13060fG(saveableStateHolder, new IDqS420S0100000(interfaceC24760y8, (InterfaceC24760y8<C10370av>) 123));
            interfaceC24520xk2.LJJIII(LJIILL);
        }
        interfaceC24520xk2.LJJIJIIJIL();
        final C13060fG c13060fG = (C13060fG) LJIILL;
        interfaceC24520xk2.LJJIIJ(-492369756);
        Object LJIILL2 = interfaceC24520xk2.LJIILL();
        if (LJIILL2 == c24490xh) {
            LJIILL2 = new AnonymousClass167(new InterfaceC272515d(c13060fG) { // from class: X.1RK
                public final C13060fG LIZ;
                public final java.util.Map<Object, Integer> LIZIZ;

                {
                    o.LJIIIZ(c13060fG, "factory");
                    this.LIZ = c13060fG;
                    this.LIZIZ = new LinkedHashMap();
                }

                @Override // X.InterfaceC272515d
                public final void LIZ(C39051g5 slotIds) {
                    int i;
                    o.LJIIIZ(slotIds, "slotIds");
                    ((LinkedHashMap) this.LIZIZ).clear();
                    Iterator<Object> it = slotIds.iterator();
                    while (it.hasNext()) {
                        Object LIZIZ = this.LIZ.LIZIZ(it.next());
                        Integer num2 = (Integer) ((LinkedHashMap) this.LIZIZ).get(LIZIZ);
                        if (num2 != null) {
                            i = num2.intValue();
                            if (i == 7) {
                                it.remove();
                            }
                        } else {
                            i = 0;
                        }
                        this.LIZIZ.put(LIZIZ, Integer.valueOf(i + 1));
                    }
                }

                @Override // X.InterfaceC272515d
                public final boolean LIZIZ(Object obj, Object obj2) {
                    return o.LJ(this.LIZ.LIZIZ(obj), this.LIZ.LIZIZ(obj2));
                }
            });
            interfaceC24520xk2.LJJIII(LJIILL2);
        }
        interfaceC24520xk2.LJJIJIIJIL();
        AnonymousClass167 anonymousClass167 = (AnonymousClass167) LJIILL2;
        C13140fO c13140fO = this.LJLIL;
        if (c13140fO != null) {
            C13160fQ.LIZ(c13140fO, c13060fG, anonymousClass167, interfaceC24520xk2, ((this.LJLJJI >> 6) & 14) | 64 | 512);
        }
        InterfaceC07790Sh interfaceC07790Sh = this.LJLILLLLZI;
        InterfaceC88471Ynr<InterfaceC516520z, C23360vs, InterfaceC273515n> interfaceC88471Ynr = this.LJLJI;
        interfaceC24520xk2.LJJIIJ(511388516);
        boolean LJIJJ = interfaceC24520xk2.LJIJJ(c13060fG) | interfaceC24520xk2.LJIJJ(interfaceC88471Ynr);
        Object LJIILL3 = interfaceC24520xk2.LJIILL();
        if (LJIJJ || LJIILL3 == c24490xh) {
            LJIILL3 = new IDqS189S0200000(c13060fG, (C13060fG) interfaceC88471Ynr, (InterfaceC88471Ynr<? super InterfaceC516520z, ? super C23360vs, ? extends InterfaceC273515n>) 5);
            interfaceC24520xk2.LJJIII(LJIILL3);
        }
        interfaceC24520xk2.LJJIJIIJIL();
        AnonymousClass165.LIZIZ(anonymousClass167, interfaceC07790Sh, (InterfaceC88471Ynr) LJIILL3, interfaceC24520xk2, (this.LJLJJI & 112) | 8, 0);
        ViewParent parent = ((View) interfaceC24520xk2.LJIILLIIL(C04Q.LJI)).getParent();
        C76732zl c76732zl = new C76732zl();
        int intValue = ((Number) interfaceC24520xk2.LJIILLIIL(C04Q.LIZIZ)).intValue();
        c76732zl.element = intValue;
        if (intValue > 0 && (parent instanceof AbstractC282819c)) {
            ((AbstractC282819c) parent).setBlock(new IDqS6S0400000(c76732zl, this.LJLJJLL, c13060fG, anonymousClass167, 1));
        }
        return C76800UCe.LIZ;
    }
}
