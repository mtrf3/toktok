package X;

import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1uY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48021uY extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC06520Nk, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ C1IC<Object> LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ InterfaceC88474Ynu<InterfaceC06520Nk, Object, InterfaceC24520xk, Integer, C76800UCe> LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ C48211ur<Object> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C48021uY(C1IC<Object> c1ic, Object obj, InterfaceC88474Ynu<? super InterfaceC06520Nk, Object, ? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88474Ynu, int i, C48211ur<Object> c48211ur) {
        super(3);
        this.LJLIL = c1ic;
        this.LJLILLLLZI = obj;
        this.LJLJI = interfaceC88474Ynu;
        this.LJLJJI = i;
        this.LJLJJL = c48211ur;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC06520Nk interfaceC06520Nk, InterfaceC24520xk interfaceC24520xk, Integer num) {
        int i;
        InterfaceC06520Nk AnimatedVisibility = interfaceC06520Nk;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(AnimatedVisibility, "$this$AnimatedVisibility");
        if ((intValue & 14) == 0) {
            if (interfaceC24520xk2.LJIJJ(AnimatedVisibility)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        if (((intValue & 91) ^ 18) != 0 || !interfaceC24520xk2.LIZ()) {
            C24610xt.LIZIZ(AnimatedVisibility, new IDqS28S0300000(this.LJLJJL, (C48211ur<Object>) this.LJLILLLLZI, this.LJLIL, (C1IC<Object>) 9), interfaceC24520xk2);
            this.LJLIL.LJ.put(this.LJLILLLLZI, ((C1I6) AnimatedVisibility).LIZ);
            this.LJLJI.invoke(AnimatedVisibility, this.LJLILLLLZI, interfaceC24520xk2, Integer.valueOf((intValue & 14) | ((this.LJLJJI >> 9) & 896)));
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
