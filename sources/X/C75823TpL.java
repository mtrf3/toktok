package X;

import fjb.a;
import kotlin.jvm.internal.AqS17S0500000_13;
import kotlin.jvm.internal.AqS58S0400000_13;
import tikcast.linkmic.controller.ChangeStateReq;
import tikcast.linkmic.controller.ChangeStateResp;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.platform.statemanager.handler.IMStateHandler$changeState$1", f = "IMStateHandler.kt", l = {134}, m = "invokeSuspend")
/* renamed from: X.TpL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75823TpL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C75813TpB LJLILLLLZI;
    public final /* synthetic */ ChangeStateReq LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJJI;
    public final /* synthetic */ C75814TpC LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C75823TpL(C75813TpB c75813TpB, ChangeStateReq changeStateReq, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, C75814TpC c75814TpC, InterfaceC67352kd<? super C75823TpL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c75813TpB;
        this.LJLJI = changeStateReq;
        this.LJLJJI = interfaceC88472Yns;
        this.LJLJJL = c75814TpC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75823TpL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj2);
            } else {
                C141335gf.LIZJ(obj2);
                this.LJLILLLLZI.LJLIL.hT();
                C75813TpB c75813TpB = this.LJLILLLLZI;
                ChangeStateReq changeStateReq = this.LJLJI;
                InterfaceC75826TpO interfaceC75826TpO = (InterfaceC75826TpO) c75813TpB.LJLJJI.getValue();
                this.LJLIL = 1;
                obj2 = interfaceC75826TpO.changeState(changeStateReq, this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (R2P) obj2;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C75813TpB c75813TpB2 = this.LJLILLLLZI;
        ChangeStateReq changeStateReq2 = this.LJLJI;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        C75814TpC c75814TpC = this.LJLJJL;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            R2P r2p = (R2P) LIZ;
            C86793Y4n.LJJIIJZLJL(r2p, new AqS58S0400000_13(c75813TpB2, (C75813TpB) changeStateReq2, (ChangeStateReq) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) r2p, (R2P<ChangeStateResp>) 7), new AqS17S0500000_13(c75813TpB2, (C75813TpB) interfaceC88472Yns, (InterfaceC88472Yns<? super Boolean, C76800UCe>) changeStateReq2, (ChangeStateReq) r2p, (R2P<ChangeStateResp>) c75814TpC, (C75814TpC) 2), 1);
        }
        C75813TpB c75813TpB3 = this.LJLILLLLZI;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns2 = this.LJLJJI;
        ChangeStateReq changeStateReq3 = this.LJLJI;
        C75814TpC c75814TpC2 = this.LJLJJL;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            c75813TpB3.LJLIL.hn(3, new AqS58S0400000_13(c75813TpB3, changeStateReq3, c75814TpC2, m10exceptionOrNullimpl, 8));
            if (interfaceC88472Yns2 != null) {
                interfaceC88472Yns2.invoke(Boolean.FALSE);
            }
            ((InterfaceC88472Yns) c75813TpB3.LJLJJL.getValue()).invoke(m10exceptionOrNullimpl);
            C75808Tp6.LIZIZ(changeStateReq3.stateType, 0, -1, m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
