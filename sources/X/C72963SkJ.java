package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel$requestState$1", f = "DistributeStatusViewModel.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.SkJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72963SkJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DistributeStatusViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72963SkJ(DistributeStatusViewModel distributeStatusViewModel, InterfaceC67352kd<? super C72963SkJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = distributeStatusViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72963SkJ(this.LJLILLLLZI, interfaceC67352kd);
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
                this.LJLILLLLZI.setStateImmediate(C72962SkI.LJLIL);
                InterfaceC72966SkM interfaceC72966SkM = (InterfaceC72966SkM) this.LJLILLLLZI.LJLILLLLZI.getValue().getOperator();
                this.LJLIL = 1;
                obj = interfaceC72966SkM.getState(this);
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
        DistributeStatusViewModel distributeStatusViewModel = this.LJLILLLLZI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            C86793Y4n.LJJIIJZLJL((R2P) LIZ, new AqS178S0100000_12(distributeStatusViewModel, 417), null, 5);
        }
        DistributeStatusViewModel distributeStatusViewModel2 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            ((InterfaceC88472Yns) distributeStatusViewModel2.LJLJI.getValue()).invoke(m10exceptionOrNullimpl);
            distributeStatusViewModel2.setState(new AqS178S0100000_12(m10exceptionOrNullimpl, 418));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
