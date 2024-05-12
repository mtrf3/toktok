package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aAU, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92422aAU extends AbstractC65781Prl implements InterfaceC88473Ynt<InterfaceC10180ac, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92422aAU(float f) {
        super(3);
        this.LJLIL = f;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(InterfaceC10180ac item, InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(item, "$this$item");
        if (((intValue & 81) ^ 16) != 0 || !interfaceC24520xk2.LIZ()) {
            C79057V0z.LJ(C09290Yb.LJIIIIZZ(InterfaceC07790Sh.LJJJI, this.LJLIL), interfaceC24520xk2, 0);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
