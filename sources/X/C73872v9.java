package X;

import com.google.gson.m;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.api.RouteStatusApi;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.TEARouterInterceptor$getUserStatus$2", f = "TEARouterInterceptor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2v9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73872v9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super m>, Object> {
    public C73872v9(InterfaceC67352kd<? super C73872v9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C73872v9(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            m data = ((RouteStatusApi) C74662wQ.LIZ(RouteStatusApi.class)).getStatus().execute().LIZIZ.getData();
            if (data == null) {
                return new m();
            }
            return data;
        } catch (Throwable unused) {
            return new m();
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super m> interfaceC67352kd) {
        return new C73872v9(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
