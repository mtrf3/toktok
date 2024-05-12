package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.music.MusicApplyAction$execute$3", f = "MusicApplyAction.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6bA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163406bA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public final /* synthetic */ C45323HqZ LJLIL;
    public final /* synthetic */ C145355n9 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163406bA(C45323HqZ c45323HqZ, C145355n9 c145355n9, InterfaceC67352kd<? super C163406bA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c45323HqZ;
        this.LJLILLLLZI = c145355n9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C163406bA(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC145495nN interfaceC145495nN = (InterfaceC145495nN) this.LJLIL.LJLJJI.getValue();
        if (interfaceC145495nN != null) {
            interfaceC145495nN.q3(this.LJLILLLLZI);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionAIMonitor ");
        this.LJLIL.getClass();
        LIZ.append("apply_music");
        LIZ.append(".musicSuccess cost: ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        return new Integer(android.util.Log.i("ActionAIMonitor", X1D.LIZIZ(LIZ)));
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
