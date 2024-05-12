package X;

import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.SessionListDataSource$loadMore$1", f = "SessionListDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3JX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3JQ LJLIL;
    public final /* synthetic */ C81983Jq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JX(C3JQ c3jq, C81983Jq c81983Jq, InterfaceC67352kd<? super C3JX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3jq;
        this.LJLILLLLZI = c81983Jq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3JX(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3JS c3js = (C3JS) ((ConcurrentHashMap) this.LJLIL.LJLILLLLZI).get(this.LJLILLLLZI);
        if (c3js == null) {
            return C76800UCe.LIZ;
        }
        if (!c3js.LIZJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("load more not trigger: ");
            LIZ.append(c3js);
            C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
            return C76800UCe.LIZ;
        }
        EnumC82403Lg filter = this.LJLILLLLZI.LIZJ;
        o.LJIIIZ(filter, "filter");
        int L = c3js.LJFF.L(filter);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("begin loadMore: ");
        LIZ2.append(this.LJLILLLLZI);
        LIZ2.append(' ');
        C06510Nj.LIZIZ(LIZ2, c3js.LIZIZ, "  pageSize: ", L);
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ2));
        try {
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            long j = c3js.LIZIZ;
            EnumC82403Lg filter2 = this.LJLILLLLZI.LIZJ;
            o.LJIIIZ(filter2, "filter");
            int L2 = c3js.LJFF.L(filter2);
            C81983Jq c81983Jq = this.LJLILLLLZI;
            C4WC.LJIJJLI(j, L2, new C81963Jo(c81983Jq.LIZ, c81983Jq.LIZIZ.getValue()));
        } catch (Exception e) {
            c3js.LJI = false;
            C34B.LJ("SessionRefactor-SessionListDataSource", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
