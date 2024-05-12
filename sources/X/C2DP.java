package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.speeddetector.core.impl.NetworkSpeedDetectorManager$receiveReportMessage$1", f = "NetworkSpeedDetectorManager.kt", l = {466}, m = "invokeSuspend")
/* renamed from: X.2DP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C42111l1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DP(C42111l1 c42111l1, InterfaceC67352kd<? super C2DP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c42111l1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2DP(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            long j = this.LJLILLLLZI.LJ.get();
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C42111l1 c42111l1 = this.LJLILLLLZI;
        C0W0 c0w0 = C0W0.DisconnectTypeNormalExit;
        c42111l1.LJFF(c0w0.getCode(), c0w0.getMessage());
        this.LJLILLLLZI.LIZLLL(c0w0.getCode(), c0w0.getMessage());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
