package X;

import fjb.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.SessionListDataSource$conversationListObserver$1$onDeleteConversation$1", f = "SessionListDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Ii, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81643Ii extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63120Opw LJLIL;
    public final /* synthetic */ C3JQ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81643Ii(C63120Opw c63120Opw, C3JQ c3jq, InterfaceC67352kd<? super C81643Ii> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63120Opw;
        this.LJLILLLLZI = c3jq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C81643Ii(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C3L5 LIZ = C81633Ih.LIZ(this.LJLIL, null);
        if (LIZ == null) {
            return C76800UCe.LIZ;
        }
        C76662ze c76662ze = C76662ze.LJLIL;
        C63120Opw c63120Opw = this.LJLIL;
        int value = EnumC76652zd.REMOVE_RECOMMENDED_FLAG.getValue();
        c76662ze.getClass();
        C76662ze.LJIIJJI(value, c63120Opw);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLILLLLZI.LJLILLLLZI).entrySet()) {
            C81983Jq c81983Jq = (C81983Jq) entry.getKey();
            C3JS c3js = (C3JS) entry.getValue();
            if (c81983Jq.LIZLLL.invoke(LIZ).booleanValue() || c3js.LIZLLL.containsKey(LIZ.LJFF())) {
                c3js.LIZLLL.remove(LIZ.LJFF());
            }
        }
        InterfaceC88472Yns<? super C3JI, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI.LJLIL.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(new C3JC(LIZ, C3JF.DELETE));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
