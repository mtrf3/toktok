package X;

import Y.IDfS26S0200000_13;
import com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS117S0300000_13;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel$newAuthPipeline$1", f = "SocialRecRequestViewModel.kt", l = {312}, m = "invokeSuspend")
/* renamed from: X.UQl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77171UQl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;
    public final /* synthetic */ EnumC77147UPn LJLJJI;
    public final /* synthetic */ SocialRecRequestViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77171UQl(ActivityC45651qj activityC45651qj, EnumC77147UPn enumC77147UPn, SocialRecRequestViewModel socialRecRequestViewModel, InterfaceC67352kd<? super C77171UQl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = activityC45651qj;
        this.LJLJJI = enumC77147UPn;
        this.LJLJJL = socialRecRequestViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C77171UQl c77171UQl = new C77171UQl(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c77171UQl.LJLILLLLZI = obj;
        return c77171UQl;
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
            C3C3 LIZ = ((USE) C77125UOr.LJII(this.LJLJI, new AqS117S0300000_13((InterfaceC70422pa) this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, 8))).LIZ();
            IDfS26S0200000_13 iDfS26S0200000_13 = new IDfS26S0200000_13(this.LJLJJL, this.LJLJJI, 0);
            this.LJLIL = 1;
            if (LIZ.collect(iDfS26S0200000_13, this) == enumC58928NAu) {
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
