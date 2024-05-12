package X;

import fjb.a;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.SessionListDataSource$refresh$1", f = "SessionListDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3JR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3JR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C3JQ LJLIL;
    public final /* synthetic */ C81983Jq LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3JR(C3JQ c3jq, C81983Jq c81983Jq, InterfaceC67352kd<? super C3JR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c3jq;
        this.LJLILLLLZI = c81983Jq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3JR(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C81843Jc.LIZIZ("SessionRefactor-SessionListDataSource", "start refresh");
        C3JS c3js = (C3JS) ((ConcurrentHashMap) this.LJLIL.LJLILLLLZI).get(this.LJLILLLLZI);
        if (c3js == null) {
            return C76800UCe.LIZ;
        }
        C106674Gp.LJIIJJI("inbox_refresh", false);
        if (!c3js.LIZLLL.isEmpty()) {
            this.LJLIL.LJI(this.LJLILLLLZI);
        }
        C3K5 c3k5 = C3K5.LJLIL;
        boolean isEmpty = c3js.LIZLLL.isEmpty();
        synchronized (c3k5) {
            if (isEmpty) {
                C3K5.LJLILLLLZI.remove("refresh_start");
            } else {
                C3K5.LIZJ("refresh_end", null);
            }
        }
        c3js.LJII = false;
        C3JQ c3jq = this.LJLIL;
        C81983Jq c81983Jq = this.LJLILLLLZI;
        c3jq.getClass();
        C3JQ.LIZJ(c81983Jq).LIZIZ(EnumC81823Ja.DATA_SOURCE, C3JU.REFRESH);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
