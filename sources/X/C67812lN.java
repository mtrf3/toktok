package X;

import com.ss.android.ugc.aweme.legacy.select.SelectedCardVM;
import com.ss.android.ugc.aweme.profile.model.User;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.legacy.select.SelectedCardVM$onClickPrimaryBtn$1", f = "SelectedCardVM.kt", l = {82}, m = "invokeSuspend")
/* renamed from: X.2lN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67812lN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SelectedCardVM LJLILLLLZI;
    public final /* synthetic */ List<User> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C67812lN(SelectedCardVM selectedCardVM, List<? extends User> list, InterfaceC67352kd<? super C67812lN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = selectedCardVM;
        this.LJLJI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67812lN(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            SelectedCardVM selectedCardVM = this.LJLILLLLZI;
            List<User> list = this.LJLJI;
            this.LJLIL = 1;
            selectedCardVM.getClass();
            Object LJJIFFI = T2R.LJJIFFI(new C80633El(selectedCardVM, list, null), this);
            if (LJJIFFI != obj2) {
                LJJIFFI = C76800UCe.LIZ;
            }
            if (LJJIFFI == obj2) {
                return obj2;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
