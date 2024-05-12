package X;

import com.google.gson.m;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment$onRestart$2$deferred$1", f = "TabStoreFragment.kt", l = {197}, m = "invokeSuspend")
/* renamed from: X.OPj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61855OPj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super TemplateData>, Object> {
    public TabStoreFragment LJLIL;
    public Object LJLILLLLZI;
    public Response LJLJI;
    public int LJLJJI;
    public final /* synthetic */ TabStoreFragment LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ Response<m> LJLJL;
    public final /* synthetic */ C68322mC<InterfaceC68342mE<Response<m>>> LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61855OPj(TabStoreFragment tabStoreFragment, String str, Response<m> response, C68322mC<InterfaceC68342mE<Response<m>>> c68322mC, InterfaceC67352kd<? super C61855OPj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = tabStoreFragment;
        this.LJLJJLL = str;
        this.LJLJL = response;
        this.LJLJLJ = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C61855OPj(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        TabStoreFragment tabStoreFragment;
        String str;
        Response<m> response;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                response = this.LJLJI;
                str = (String) this.LJLILLLLZI;
                tabStoreFragment = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            tabStoreFragment = this.LJLJJL;
            str = this.LJLJJLL;
            response = this.LJLJL;
            InterfaceC68342mE<Response<m>> interfaceC68342mE = this.LJLJLJ.element;
            this.LJLIL = tabStoreFragment;
            this.LJLILLLLZI = str;
            this.LJLJI = response;
            this.LJLJJI = 1;
            obj = interfaceC68342mE.LJI(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (obj == null) {
            obj = "{}";
        }
        return tabStoreFragment.Tl(str, response, obj);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super TemplateData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
