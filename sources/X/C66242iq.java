package X;

import fjb.a;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.analytics.AppLogDualReporter$reportAppLogToSlardar$4", f = "AppLogDualReporter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66242iq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ JSONObject LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C66242iq(String str, InterfaceC67352kd interfaceC67352kd, JSONObject jSONObject) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = jSONObject;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C66242iq(this.LJLIL, interfaceC67352kd, this.LJLILLLLZI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C40501Fuz.LIZIZ(this.LJLIL, this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
