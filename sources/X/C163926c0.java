package X;

import com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.sticker.nature.viewmodel.NatureViewModel$1", f = "NatureViewModel.kt", l = {57}, m = "invokeSuspend")
/* renamed from: X.6c0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163926c0 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ NatureViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C163926c0(NatureViewModel natureViewModel, InterfaceC67352kd<? super C163926c0> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = natureViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C163926c0(this.LJLILLLLZI, interfaceC67352kd);
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
            C164546d0 c164546d0 = this.LJLILLLLZI.LJLIL;
            this.LJLIL = 1;
            if (c164546d0.LIZJ(this) == enumC58928NAu) {
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
