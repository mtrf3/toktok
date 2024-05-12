package X;

import fjb.a;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.SessionListDataSource$pageListObserver$1$onQueryConversationWithCategory$2", f = "SessionListDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3JW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81913Jj LJLIL;
    public final /* synthetic */ C3JQ LJLILLLLZI;
    public final /* synthetic */ InterfaceC81623Ig LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JW(C81913Jj c81913Jj, C3JQ c3jq, InterfaceC81623Ig interfaceC81623Ig, InterfaceC67352kd<? super C3JW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81913Jj;
        this.LJLILLLLZI = c3jq;
        this.LJLJI = interfaceC81623Ig;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3JW(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C3JS c3js;
        Object obj2;
        C3JS c3js2;
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onQueryWithCategory: ");
        LIZ.append(this.LJLIL.LJLIL);
        LIZ.append(':');
        LIZ.append(this.LJLIL.LJLILLLLZI.size());
        LIZ.append(' ');
        LIZ.append(this.LJLIL.LJLJI);
        C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", X1D.LIZIZ(LIZ));
        java.util.Set keySet = ((ConcurrentHashMap) this.LJLILLLLZI.LJLILLLLZI).keySet();
        C81913Jj c81913Jj = this.LJLIL;
        Iterator it = keySet.iterator();
        while (true) {
            c3js = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (o.LJ(((C81983Jq) obj2).LIZ, c81913Jj.LJLIL.LJLIL)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C81983Jq c81983Jq = (C81983Jq) obj2;
        if (c81983Jq == null) {
            C34B.LIZJ("SessionRefactor-SessionListDataSource", "the target page is not registered, throw the query result");
            return C76800UCe.LIZ;
        }
        C3JS c3js3 = (C3JS) ((ConcurrentHashMap) this.LJLILLLLZI.LJLILLLLZI).get(c81983Jq);
        if (c3js3 == null) {
            c3js3 = new C3JS(c81983Jq);
        }
        this.LJLILLLLZI.getClass();
        C3JQ.LIZJ(c81983Jq).LIZLLL(EnumC81823Ja.DATA_SOURCE, C3JU.IN_PAGE);
        C81913Jj c81913Jj2 = this.LJLIL;
        InterfaceC81623Ig interfaceC81623Ig = this.LJLJI;
        if (C3KQ.LIZ().initNewPageWithMemorySession) {
            Iterator it2 = ((ConcurrentHashMap) this.LJLILLLLZI.LJLILLLLZI).entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (((C81983Jq) entry.getKey()).LIZIZ == c81983Jq.LIZIZ && ((C81983Jq) entry.getKey()).LIZJ == EnumC82403Lg.ALL && (c3js2 = (C3JS) entry.getValue()) != null) {
                    c3js = c3js2;
                    break;
                }
            }
        }
        c3js3.LIZIZ(c81913Jj2, interfaceC81623Ig, c3js);
        this.LJLILLLLZI.getClass();
        C81833Jb LIZJ = C3JQ.LIZJ(c81983Jq);
        EnumC81823Ja enumC81823Ja = EnumC81823Ja.DATA_SOURCE;
        LIZJ.LIZIZ(enumC81823Ja, C3JU.IN_PAGE);
        if (c3js3.LJFF.LJLILLLLZI < C3KQ.LIZ().minSizeToStopLoad && c3js3.LIZJ) {
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", c81983Jq + " need to load one more page");
            this.LJLILLLLZI.getClass();
            C81833Jb LIZJ2 = C3JQ.LIZJ(c81983Jq);
            java.util.Map<String, Long> map = LIZJ2.LIZIZ;
            C3JU c3ju = C3JU.ONE_MORE_PAGE;
            if (map.containsKey(C81843Jc.LIZ(enumC81823Ja, c3ju))) {
                LIZJ2.LIZIZ(enumC81823Ja, c3ju);
            }
            this.LJLILLLLZI.getClass();
            C3JQ.LIZJ(c81983Jq).LIZLLL(enumC81823Ja, c3ju);
            c3js3.LJI = false;
            if (!c3js3.LJIIIIZZ) {
                this.LJLILLLLZI.LIZIZ(c81983Jq);
            } else {
                c3js3.LJI = false;
                c3js3.LJFF.M();
            }
            if (c3js3.LJFF.LJLILLLLZI >= C3KQ.LIZ().minSizeToDisplay) {
                this.LJLILLLLZI.LJI(c81983Jq);
            }
        } else {
            C81843Jc.LIZJ("SessionRefactor-SessionListDataSource", c81983Jq + " finish load");
            c3js3.LJI = false;
            c3js3.LJFF.M();
            this.LJLILLLLZI.LJI(c81983Jq);
            this.LJLILLLLZI.getClass();
            C81833Jb LIZJ3 = C3JQ.LIZJ(c81983Jq);
            java.util.Map<String, Long> map2 = LIZJ3.LIZIZ;
            C3JU c3ju2 = C3JU.LOAD_MORE;
            if (map2.containsKey(C81843Jc.LIZ(enumC81823Ja, c3ju2))) {
                LIZJ3.LIZIZ(enumC81823Ja, c3ju2);
            }
        }
        ((ConcurrentHashMap) this.LJLILLLLZI.LJLILLLLZI).put(c81983Jq, c3js3);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
