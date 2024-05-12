package X;

import com.bytedance.pitaya.api.bean.PTYError;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv$ensurePitayaEnv$5", f = "LivePitayaEnv.kt", l = {132}, m = "invokeSuspend")
/* renamed from: X.2A2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2A2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, PTYError, C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2A2(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super Integer, ? super PTYError, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C2A2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2A2(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(2000L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C0IT.LIZIZ(this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
