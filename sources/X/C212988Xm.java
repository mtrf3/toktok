package X;

import X.C3C8;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212988Xm<R extends C3C8, ITEM> {
    public final InterfaceC65350Pko<?> LIZ;
    public final InterfaceC212978Xl<R, ITEM> LIZIZ;
    public InterfaceC212998Xn<R, ITEM> LIZJ;

    public final void LIZIZ() {
        InterfaceC212998Xn<R, ITEM> interfaceC212998Xn = this.LIZJ;
        if (interfaceC212998Xn != null) {
            interfaceC212998Xn.setProxy(null);
        }
        this.LIZJ = null;
        InterfaceC212978Xl<R, ITEM> interfaceC212978Xl = this.LIZIZ;
        if (interfaceC212978Xl != null) {
            interfaceC212978Xl.LIZIZ();
        }
    }

    public C212988Xm(C65776Prg c65776Prg, InterfaceC212978Xl interfaceC212978Xl) {
        this.LIZ = c65776Prg;
        this.LIZIZ = interfaceC212978Xl;
    }

    public final void LIZ(int i, InterfaceC212998Xn<R, ITEM> newHolder, ITEM item, List<? extends Object> list, InterfaceC88472Yns<? super ITEM, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<Integer> interfaceC65784Pro) {
        o.LJIIIZ(newHolder, "newHolder");
        LIZIZ();
        newHolder.setProxy(this);
        this.LIZJ = newHolder;
        InterfaceC212978Xl<R, ITEM> interfaceC212978Xl = this.LIZIZ;
        if (interfaceC212978Xl != null) {
            interfaceC212978Xl.LIZJ(i, newHolder, item, list, interfaceC88472Yns, interfaceC65784Pro);
        }
    }
}
