package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.google.gson.m;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptorConfig;
import com.zhiliaoapp.musically.R;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptor$onInterceptRouteRedirect$3", f = "TEARouterInterceptor.kt", l = {168}, m = "invokeSuspend")
/* renamed from: X.2vA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73882vA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C8IC LJLILLLLZI;
    public final /* synthetic */ TEARouterInterceptor LJLJI;
    public final /* synthetic */ C68322mC<ViewGroup> LJLJJI;
    public final /* synthetic */ List<TEARouterInterceptorConfig.Interceptor> LJLJJL;
    public final /* synthetic */ android.net.Uri LJLJJLL;
    public final /* synthetic */ Context LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73882vA(C8IC c8ic, TEARouterInterceptor tEARouterInterceptor, C68322mC<ViewGroup> c68322mC, List<TEARouterInterceptorConfig.Interceptor> list, android.net.Uri uri, Context context, InterfaceC67352kd<? super C73882vA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c8ic;
        this.LJLJI = tEARouterInterceptor;
        this.LJLJJI = c68322mC;
        this.LJLJJL = list;
        this.LJLJJLL = uri;
        this.LJLJL = context;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73882vA(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            this.LJLILLLLZI.setMessage(R.string.rjz);
            this.LJLILLLLZI.setVisibility(0);
            TEARouterInterceptor tEARouterInterceptor = this.LJLJI;
            this.LJLIL = 1;
            tEARouterInterceptor.getClass();
            obj = XKX.LJI(C78613UtF.LIZJ, new C73872v9(null), this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        m mVar = (m) obj;
        ViewGroup viewGroup = this.LJLJJI.element;
        if (viewGroup != null) {
            C16880lQ.LJLLL(this.LJLILLLLZI, viewGroup);
        }
        TEARouterInterceptor tEARouterInterceptor2 = this.LJLJI;
        List<TEARouterInterceptorConfig.Interceptor> list = this.LJLJJL;
        android.net.Uri uri = this.LJLJJLL;
        tEARouterInterceptor2.getClass();
        String LJI = TEARouterInterceptor.LJI(list, uri, mVar);
        Context context = this.LJLJL;
        TEARouterInterceptor tEARouterInterceptor3 = this.LJLJI;
        android.net.Uri parse = UriProtector.parse(LJI);
        o.LJIIIIZZ(parse, "parse(url)");
        tEARouterInterceptor3.getClass();
        SmartRouter.buildRoute(context, TEARouterInterceptor.LJFF(parse).toString()).open();
        return C76800UCe.LIZ;
    }
}
