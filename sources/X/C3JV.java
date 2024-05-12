package X;

import fjb.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.SessionListDataSource$pageListObserver$1$onQueryConversationWithCategory$1", f = "SessionListDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3JV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81913Jj LJLIL;
    public final /* synthetic */ C3JQ LJLILLLLZI;
    public final /* synthetic */ InterfaceC81623Ig LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JV(C81913Jj c81913Jj, C3JQ c3jq, InterfaceC81623Ig interfaceC81623Ig, InterfaceC67352kd<? super C3JV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81913Jj;
        this.LJLILLLLZI = c3jq;
        this.LJLJI = interfaceC81623Ig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3JV(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPreload: ");
        LIZ.append(this.LJLIL.LJLIL);
        LIZ.append(':');
        LIZ.append(this.LJLIL.LJLILLLLZI.size());
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.getClass();
        C3JQ.LIZJ(null).LIZLLL(EnumC81823Ja.DATA_SOURCE, C3JU.PRELOAD);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLILLLLZI.LJLILLLLZI).entrySet()) {
            C81983Jq c81983Jq = (C81983Jq) entry.getKey();
            C3JS c3js = (C3JS) entry.getValue();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(c81983Jq);
            LIZ2.append(" start preload");
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ2));
            this.LJLILLLLZI.getClass();
            C81833Jb LIZJ = C3JQ.LIZJ(c81983Jq);
            EnumC81823Ja enumC81823Ja = EnumC81823Ja.DATA_SOURCE;
            C3JU c3ju = C3JU.IN_PAGE;
            LIZJ.LIZLLL(enumC81823Ja, c3ju);
            c3js.LIZIZ(this.LJLIL, this.LJLJI, null);
            this.LJLILLLLZI.getClass();
            C3JQ.LIZJ(c81983Jq).LIZIZ(enumC81823Ja, c3ju);
            c3js.LJI = false;
            c3js.LJFF.M();
            this.LJLILLLLZI.LJI(c81983Jq);
        }
        this.LJLILLLLZI.getClass();
        C3JQ.LIZJ(null).LIZIZ(EnumC81823Ja.DATA_SOURCE, C3JU.PRELOAD);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
