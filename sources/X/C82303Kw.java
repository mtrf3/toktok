package X;

import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.refactor.datasource.MessageRequestDataSource$onQueryConversationWithCategory$1", f = "MessageRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Kw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82303Kw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C81913Jj LJLIL;
    public final /* synthetic */ C82283Ku LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82303Kw(C81913Jj c81913Jj, C82283Ku c82283Ku, InterfaceC67352kd<? super C82303Kw> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c81913Jj;
        this.LJLILLLLZI = c82283Ku;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82303Kw(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<C63120Opw> list = this.LJLIL.LJLILLLLZI;
        ArrayList arrayList = new ArrayList();
        for (C63120Opw c63120Opw : list) {
            if (c63120Opw.isFiltered()) {
                arrayList.add(c63120Opw);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onQueryConversation filtered size: ");
        LIZ.append(arrayList.size());
        C81843Jc.LIZJ("SessionRefactor-MessageRequestDataSource", X1D.LIZIZ(LIZ));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C63120Opw c63120Opw2 = (C63120Opw) it.next();
            java.util.Map<String, C63120Opw> map = this.LJLILLLLZI.LJLILLLLZI;
            String conversationId = c63120Opw2.getConversationId();
            o.LJIIIIZZ(conversationId, "filteredConversation.conversationId");
            ((ConcurrentHashMap) map).put(conversationId, c63120Opw2);
        }
        this.LJLILLLLZI.LJIIZILJ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
