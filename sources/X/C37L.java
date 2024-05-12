package X;

import fjb.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$conversationListObserver$1$onUpdateConversation$1", f = "SessionListManagerV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37L, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37L extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63120Opw LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C82253Kr LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37L(C63120Opw c63120Opw, int i, C82253Kr c82253Kr, InterfaceC67352kd<? super C37L> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63120Opw;
        this.LJLILLLLZI = i;
        this.LJLJI = c82253Kr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37L(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C76662ze c76662ze = C76662ze.LJLIL;
        C63120Opw c63120Opw = this.LJLIL;
        int i = this.LJLILLLLZI;
        c76662ze.getClass();
        C76662ze.LJIIJJI(i, c63120Opw);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLJI.LJLJI).entrySet()) {
            C81983Jq c81983Jq = (C81983Jq) entry.getKey();
            InterfaceC81953Jn interfaceC81953Jn = (InterfaceC81953Jn) entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUpdateConversation, paginationData=");
            LIZ.append(interfaceC81953Jn);
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
            if (((Boolean) C82253Kr.LJJ(this.LJLJI, C47261Igj.LJJIJ(this.LJLIL), interfaceC81953Jn, false, 60).getSecond()).booleanValue()) {
                String str2 = c81983Jq.LIZ;
                C81983Jq c81983Jq2 = this.LJLJI.LJLJJI;
                if (c81983Jq2 != null) {
                    str = c81983Jq2.LIZ;
                } else {
                    str = null;
                }
                if (o.LJ(str2, str)) {
                    this.LJLJI.LJJIIZ(interfaceC81953Jn);
                }
            }
            this.LJLJI.LJIIJJI(this.LJLIL, c81983Jq);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
