package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Q4, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3Q4 extends TBS implements InterfaceC88472Yns<C63120Opw, C3QL> {
    public C3Q4(C3QE c3qe) {
        super(1, c3qe, C3QE.class, "convertConversationIntoSearchContent", "convertConversationIntoSearchContent(Lcom/bytedance/im/core/model/Conversation;)Lcom/bytedance/im/core/search/model/IMSearchContent;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C3QL invoke(C63120Opw c63120Opw) {
        String name;
        C63120Opw p0 = c63120Opw;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        C63088OpQ coreInfo = p0.getCoreInfo();
        if (coreInfo != null && (name = coreInfo.getName()) != null) {
            String conversationId = p0.getConversationId();
            o.LJIIIIZZ(conversationId, "conversation.conversationId");
            C3QE.LIZ.getClass();
            return new C3QL(1, p0.getUpdatedTime(), conversationId, 2, C3QE.LIZLLL(C3QE.LIZJ(name)));
        }
        return null;
    }
}
