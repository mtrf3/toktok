package X;

import Y.IDcS364S0100000_1;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCardManager$queryQuotedMsg$1", f = "AwemeCardManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.48e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1044848e extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1044848e(String str, C109544Rq c109544Rq, InterfaceC67352kd<? super C1044848e> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C1044848e c1044848e = new C1044848e(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c1044848e.LJLIL = obj;
        return c1044848e;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C109544Rq LJIIIIZZ = C106674Gp.LJIIIIZZ(this.LJLILLLLZI);
        if (LJIIIIZZ != null) {
            C109544Rq c109544Rq = this.LJLJI;
            AnonymousClass489 anonymousClass489 = AnonymousClass489.LIZ;
            List LJJIJ = C47261Igj.LJJIJ(c109544Rq);
            anonymousClass489.getClass();
            AnonymousClass489.LIZIZ(LJIIIIZZ, LJJIJ);
        } else {
            C109544Rq c109544Rq2 = this.LJLJI;
            String str = this.LJLILLLLZI;
            C109544Rq c109544Rq3 = new C109544Rq();
            c109544Rq3.setMsgId(CastLongProtector.parseLong(str));
            C31F.LIZ.getClass();
            C31G.LIZ();
            C63164Oqe c63164Oqe = C63164Oqe.LIZIZ;
            String conversationId = c109544Rq2.getConversationId();
            o.LJIIIIZZ(conversationId, "replyMsg.conversationId");
            c63164Oqe.LIZLLL(new IDcS364S0100000_1(c109544Rq2, 15), conversationId, C47261Igj.LJJIJ(c109544Rq3));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
