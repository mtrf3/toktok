package X;

import fjb.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2$conversationListObserver$1$onCreateConversation$1", f = "SessionListManagerV2.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.37M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C37M extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82253Kr LJLIL;
    public final /* synthetic */ C63120Opw LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37M(C82253Kr c82253Kr, C63120Opw c63120Opw, InterfaceC67352kd<? super C37M> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82253Kr;
        this.LJLILLLLZI = c63120Opw;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C37M(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJLIL.LJLJI).entrySet()) {
            C81983Jq c81983Jq = (C81983Jq) entry.getKey();
            InterfaceC81953Jn interfaceC81953Jn = (InterfaceC81953Jn) entry.getValue();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCreateConversation, paginationData=");
            LIZ.append(interfaceC81953Jn);
            C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ));
            OSZ LJJ = C82253Kr.LJJ(this.LJLIL, C47261Igj.LJJIJ(this.LJLILLLLZI), interfaceC81953Jn, false, 60);
            LJJ.getFirst();
            if (((Boolean) LJJ.getSecond()).booleanValue()) {
                String str2 = c81983Jq.LIZ;
                C81983Jq c81983Jq2 = this.LJLIL.LJLJJI;
                if (c81983Jq2 != null) {
                    str = c81983Jq2.LIZ;
                } else {
                    str = null;
                }
                if (o.LJ(str2, str)) {
                    this.LJLIL.LJJIIZ(interfaceC81953Jn);
                }
            }
            this.LJLIL.LJIIJJI(this.LJLILLLLZI, c81983Jq);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
