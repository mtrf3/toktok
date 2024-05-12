package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.recommendedchats.helper.RecommendedChatManager$removeConversationRecFlag$1", f = "RecommendedChatManager.kt", l = {213}, m = "invokeSuspend")
/* renamed from: X.2zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76632zb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63120Opw LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76632zb(int i, C63120Opw c63120Opw, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63120Opw;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C76632zb(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C76662ze c76662ze = C76662ze.LJLIL;
            String conversationId = this.LJLILLLLZI.getConversationId();
            o.LJIIIIZZ(conversationId, "conv.conversationId");
            int i2 = this.LJLJI;
            this.LJLIL = 1;
            c76662ze.getClass();
            if (C76662ze.LJIILIIL(i2, conversationId, null, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C76662ze c76662ze2 = C76662ze.LJLIL;
        String conversationId2 = this.LJLILLLLZI.getConversationId();
        c76662ze2.getClass();
        if (conversationId2 != null) {
            Iterator it = ((ArrayList) C76662ze.LJII()).iterator();
            String str = "";
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!o.LJ(str2, String.valueOf(C81273Gx.LIZLLL(conversationId2)))) {
                    str = C0F0.LIZLLL(str, str2, '_');
                }
            }
            C76582zW.LJ(str);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
