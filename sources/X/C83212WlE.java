package X;

import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.impl.view.InternalBeautyListView$updateExclusiveData$1", f = "InternalBeautyListView.kt", l = {558}, m = "invokeSuspend")
/* renamed from: X.WlE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83212WlE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C83210WlC LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83212WlE(C83210WlC c83210WlC, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c83210WlC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        C83212WlE c83212WlE = new C83212WlE(this.LJLJI, completion);
        c83212WlE.LJLIL = obj;
        return c83212WlE;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C84661XKn LIZIZ = XKX.LIZIZ((InterfaceC70422pa) this.LJLIL, C78613UtF.LIZJ, null, new C83213WlF(this, null), 2);
            this.LJLILLLLZI = 1;
            if (LIZIZ.LJJIJ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C83210WlC c83210WlC = this.LJLJI;
        if (c83210WlC.LJIIJJI) {
            c83210WlC.LJIILL.notifyDataSetChanged();
        } else {
            c83210WlC.LJIILJJIL.notifyDataSetChanged();
        }
        return C76800UCe.LIZ;
    }
}
