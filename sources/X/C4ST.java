package X;

import com.bytedance.forest.model.RequestParams;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.common.utils.SearchGeckoManager$fetchResource$2", f = "SearchGeckoManager.kt", l = {41, 58}, m = "invokeSuspend")
/* renamed from: X.4ST, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ST extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public InterfaceC88473Ynt LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public int LJLJJLL;
    public final /* synthetic */ InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ InterfaceC88471Ynr<Boolean, C61295O3v, C76800UCe> LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4ST(InterfaceC88473Ynt<? super String, ? super RequestParams, ? super InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt, String str, String str2, String str3, String str4, InterfaceC88471Ynr<? super Boolean, ? super C61295O3v, C76800UCe> interfaceC88471Ynr, InterfaceC67352kd<? super C4ST> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = interfaceC88473Ynt;
        this.LJLJLJ = str;
        this.LJLJLLL = str2;
        this.LJLL = str3;
        this.LJLLI = str4;
        this.LJLLILLLL = interfaceC88471Ynr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4ST(this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            InterfaceC88473Ynt<String, RequestParams, InterfaceC88472Yns<? super C61295O3v, C76800UCe>, C38515F9r> interfaceC88473Ynt = this.LJLJL;
            String str = this.LJLJLJ;
            String str2 = this.LJLJLLL;
            String str3 = this.LJLL;
            String str4 = this.LJLLI;
            this.LJLIL = interfaceC88473Ynt;
            this.LJLILLLLZI = str;
            this.LJLJI = str2;
            this.LJLJJI = str3;
            this.LJLJJL = str4;
            this.LJLJJLL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.setDisableBuiltin(true);
            requestParams.setResourceScene(EnumC61028NxI.OTHER);
            requestParams.setEnableRequestReuse(true);
            Boolean bool = Boolean.TRUE;
            requestParams.setEnableMemoryCache(bool);
            requestParams.setEnableCDNCache(bool);
            requestParams.setSessionId(str2);
            requestParams.setChannel(str3);
            requestParams.setBundle(str4);
            interfaceC88473Ynt.invoke(str, requestParams, new AqS167S0100000_1(c84654XKg, 334));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
        C4SU c4su = new C4SU((C61295O3v) obj, this.LJLLILLLL, null);
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = null;
        this.LJLJJI = null;
        this.LJLJJL = null;
        this.LJLJJLL = 2;
        if (XKX.LJI(abstractC78621UtN, c4su, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
