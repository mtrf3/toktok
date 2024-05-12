package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS54S0110000_12;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel$updateState$1", f = "DistributeStatusViewModel.kt", l = {129}, m = "invokeSuspend")
/* renamed from: X.SkK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72964SkK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ DistributeStatusViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72964SkK(DistributeStatusViewModel distributeStatusViewModel, boolean z, InterfaceC67352kd<? super C72964SkK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = distributeStatusViewModel;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72964SkK(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        int i;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                this.LJLILLLLZI.setStateImmediate(C72965SkL.LJLIL);
                DistributeStatusViewModel distributeStatusViewModel = this.LJLILLLLZI;
                boolean z = this.LJLJI;
                InterfaceC72966SkM interfaceC72966SkM = (InterfaceC72966SkM) distributeStatusViewModel.LJLILLLLZI.getValue().getOperator();
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                this.LJLIL = 1;
                obj = interfaceC72966SkM.LJJJJJL(i, this);
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
        DistributeStatusViewModel distributeStatusViewModel2 = this.LJLILLLLZI;
        boolean z2 = this.LJLJI;
        if (C3C5.m13isSuccessimpl(LIZ)) {
            C86793Y4n.LJJIIJZLJL((R2P) LIZ, new AqS54S0110000_12(distributeStatusViewModel2, z2, 9), null, 5);
        }
        DistributeStatusViewModel distributeStatusViewModel3 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            ((InterfaceC88472Yns) distributeStatusViewModel3.LJLJI.getValue()).invoke(m10exceptionOrNullimpl);
            distributeStatusViewModel3.setState(new AqS178S0100000_12(m10exceptionOrNullimpl, 420));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
