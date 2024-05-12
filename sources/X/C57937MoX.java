package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$updateRequestParams$1", f = "UserCardListViewModel.kt", l = {435}, m = "invokeSuspend")
/* renamed from: X.MoX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57937MoX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public XJO LJLIL;
    public UserCardListViewModel LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ UserCardListViewModel LJLJL;
    public final /* synthetic */ List<EnumC58046MqI> LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C57937MoX(UserCardListViewModel userCardListViewModel, List<? extends EnumC58046MqI> list, String str, String str2, InterfaceC67352kd<? super C57937MoX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = userCardListViewModel;
        this.LJLJLJ = list;
        this.LJLJLLL = str;
        this.LJLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C57937MoX(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        UserCardListViewModel userCardListViewModel;
        XJO xjo;
        List<EnumC58046MqI> list;
        String str;
        String str2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJLL;
        if (i != 0) {
            if (i == 1) {
                str2 = (String) this.LJLJJL;
                str = (String) this.LJLJJI;
                list = (List) this.LJLJI;
                userCardListViewModel = this.LJLILLLLZI;
                xjo = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            userCardListViewModel = this.LJLJL;
            xjo = userCardListViewModel.LJLLJ;
            list = this.LJLJLJ;
            str = this.LJLJLLL;
            str2 = this.LJLL;
            this.LJLIL = xjo;
            this.LJLILLLLZI = userCardListViewModel;
            this.LJLJI = list;
            this.LJLJJI = str;
            this.LJLJJL = str2;
            this.LJLJJLL = 1;
            if (xjo.LIZ(null, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        try {
            userCardListViewModel.jv0().LJJII(str, str2, list);
            xjo.LIZIZ(null);
            return C76800UCe.LIZ;
        } catch (Throwable th) {
            xjo.LIZIZ(null);
            throw th;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
