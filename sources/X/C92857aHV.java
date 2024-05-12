package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aHV, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92857aHV extends AbstractC65781Prl implements InterfaceC88473Ynt<C0YY, InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ InterfaceC91771Zzz LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92857aHV(String str, InterfaceC91771Zzz interfaceC91771Zzz, int i) {
        super(3);
        this.LJLIL = str;
        this.LJLILLLLZI = interfaceC91771Zzz;
        this.LJLJI = i;
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(C0YY TextButton, InterfaceC24520xk interfaceC24520xk, Integer num) {
        C08370Un c08370Un;
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        int intValue = num.intValue();
        o.LJIIIZ(TextButton, "$this$TextButton");
        if (((intValue & 81) ^ 16) != 0 || !interfaceC24520xk2.LIZ()) {
            String str = this.LJLIL;
            InterfaceC91771Zzz interfaceC91771Zzz = this.LJLILLLLZI;
            interfaceC24520xk2.LJJIIJ(49788594);
            if (o.LJ(interfaceC91771Zzz, C92370a9e.LIZJ)) {
                c08370Un = C91676ZyS.LIZ(C21350sd.LIZJ(interfaceC24520xk2), interfaceC24520xk2);
            } else if (o.LJ(interfaceC91771Zzz, C92369a9d.LIZJ)) {
                c08370Un = C08370Un.LIZLLL;
            } else {
                c08370Un = C08370Un.LIZLLL;
            }
            interfaceC24520xk2.LJJIJIIJIL();
            C21430sl.LIZIZ(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, c08370Un, interfaceC24520xk2, this.LJLJI & 14, 0, 32766);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
