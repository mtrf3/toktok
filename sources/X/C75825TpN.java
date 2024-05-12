package X;

import fjb.a;
import kotlin.jvm.internal.AqS179S0100000_13;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.platform.statemanager.handler.IMStateHandler$updateState$1", f = "IMStateHandler.kt", l = {111}, m = "invokeSuspend")
/* renamed from: X.TpN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75825TpN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C75813TpB LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75825TpN(C75813TpB c75813TpB, InterfaceC67352kd<? super C75825TpN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c75813TpB;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75825TpN(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C75813TpB c75813TpB = this.LJLILLLLZI;
                InterfaceC75826TpO interfaceC75826TpO = (InterfaceC75826TpO) c75813TpB.LJLJJI.getValue();
                long j = c75813TpB.LJLILLLLZI.get();
                this.LJLIL = 1;
                obj = interfaceC75826TpO.LJJJJZI(j, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            LIZ = (R2P) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C75813TpB c75813TpB2 = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            C86793Y4n.LJJIIJZLJL((R2P) LIZ, new AqS179S0100000_13(c75813TpB2, 477), null, 5);
        }
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.LJLILLLLZI.LJLJJL.getValue();
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            interfaceC88472Yns.invoke(m10exceptionOrNullimpl);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
