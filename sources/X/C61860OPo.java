package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.ECommerceShowcaseService;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.IECommerceShowcaseService;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$onRestart$2$creatorInfo$1", f = "TabStoreFragment.kt", l = {188, 190}, m = "invokeSuspend")
/* renamed from: X.OPo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61860OPo extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super Response<m>>, Object> {
    public C68322mC LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C68322mC<InterfaceC68342mE<Response<m>>> LJLJI;
    public final /* synthetic */ TabStoreFragment LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61860OPo(C68322mC<InterfaceC68342mE<Response<m>>> c68322mC, TabStoreFragment tabStoreFragment, String str, String str2, InterfaceC67352kd<? super C61860OPo> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLJI = c68322mC;
        this.LJLJJI = tabStoreFragment;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61860OPo(this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super Response<m>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC<InterfaceC68342mE<Response<m>>> c68322mC;
        T t;
        Object obj2;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    obj2 = obj;
                    return obj2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c68322mC = this.LJLIL;
            C141335gf.LIZJ(obj);
            t = obj;
        } else {
            C141335gf.LIZJ(obj);
            c68322mC = this.LJLJI;
            TabStoreFragment tabStoreFragment = this.LJLJJI;
            String str = this.LJLJJL;
            String str2 = this.LJLJJLL;
            InterfaceC68342mE<Response<m>> interfaceC68342mE = c68322mC.element;
            this.LJLIL = c68322mC;
            this.LJLILLLLZI = 1;
            Object Rl = tabStoreFragment.Rl(str, str2, interfaceC68342mE, this);
            t = Rl;
            if (Rl == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        c68322mC.element = t;
        IECommerceShowcaseService LJIIIZ = ECommerceShowcaseService.LJIIIZ();
        String str3 = this.LJLJJI.Jl().id;
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ("current_page", "profile"));
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        Object LJFF = LJIIIZ.LJFF(LJJLIIIIJ, str3, this);
        obj2 = LJFF;
        if (LJFF != enumC58928NAu) {
            return obj2;
        }
        return enumC58928NAu;
    }
}
