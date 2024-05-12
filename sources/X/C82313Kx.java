package X;

import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.MessageRequestDataSource$onCreateConversation$1", f = "MessageRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82313Kx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C63120Opw LJLIL;
    public final /* synthetic */ C82283Ku LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82313Kx(C63120Opw c63120Opw, C82283Ku c82283Ku, InterfaceC67352kd<? super C82313Kx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c63120Opw;
        this.LJLILLLLZI = c82283Ku;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82313Kx(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C141335gf.LIZJ(obj);
        C63120Opw c63120Opw = this.LJLIL;
        if (c63120Opw == null) {
            return C76800UCe.LIZ;
        }
        if (!c63120Opw.isFiltered()) {
            return C76800UCe.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCreateConversation: ");
        C63088OpQ coreInfo = this.LJLIL.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        C81843Jc.LIZJ("SessionRefactor-MessageRequestDataSource", X1D.LIZIZ(LIZ));
        java.util.Map<String, C63120Opw> map = this.LJLILLLLZI.LJLILLLLZI;
        String conversationId = this.LJLIL.getConversationId();
        o.LJIIIIZZ(conversationId, "conversation.conversationId");
        ((ConcurrentHashMap) map).put(conversationId, this.LJLIL);
        this.LJLILLLLZI.LJIIZILJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
