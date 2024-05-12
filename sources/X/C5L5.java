package X;

import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel$previewVideo$1", f = "EditCapCutViewModel.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.5L5, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ EditCapCutViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5L5(boolean z, EditCapCutViewModel editCapCutViewModel, InterfaceC67352kd<? super C5L5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = z;
        this.LJLJI = editCapCutViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5L5(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            if (C1JD.LIZJ(300L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        boolean z = this.LJLILLLLZI;
        EditCapCutViewModel editCapCutViewModel = this.LJLJI;
        if (z) {
            editCapCutViewModel.getClass();
        } else {
            editCapCutViewModel.getClass();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
