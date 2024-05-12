package X;

import com.bytedance.im.core.proto.ReferenceInfo;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.ui.SuggestedReplyExtKt$markRefMsgAsRepliedOrReacted$1", f = "SuggestedReplyExt.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.30p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C770330p extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770330p(C109544Rq c109544Rq, InterfaceC67352kd<? super C770330p> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C770330p(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        C141335gf.LIZJ(obj);
        ReferenceInfo referenceInfo = this.LJLIL.getReferenceInfo();
        if (referenceInfo != null && (l = referenceInfo.referenced_message_id) != null) {
            C109544Rq LJIIIIZZ = C106674Gp.LJIIIIZZ(l.toString());
            if (LJIIIIZZ == null) {
                return C76800UCe.LIZ;
            }
            if (!o.LJ(LJIIIIZZ.getLocalExt().get("IS_REPLIED_OR_REACTED"), "1")) {
                java.util.Map<String, String> localExt = LJIIIIZZ.getLocalExt();
                o.LJIIIIZZ(localExt, "referencedMsg.localExt");
                localExt.put("IS_REPLIED_OR_REACTED", "1");
                C106674Gp.LJIILJJIL(LJIIIIZZ);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
