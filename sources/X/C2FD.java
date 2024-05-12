package X;

import Y.IDfS125S0100000;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel$handleAction$1", f = "ComposerFilterViewModel.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.2FD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2FD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ComposerFilterViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2FD(ComposerFilterViewModel composerFilterViewModel, InterfaceC67352kd<? super C2FD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = composerFilterViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2FD(this.LJLILLLLZI, interfaceC67352kd);
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
            InterfaceC65462ha LIZ = C79943Bu.LIZ(this.LJLILLLLZI.LJLILLLLZI);
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(this.LJLILLLLZI, 38);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS125S0100000, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
