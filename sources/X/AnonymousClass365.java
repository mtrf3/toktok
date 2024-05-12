package X;

/* renamed from: X.365, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class AnonymousClass365 extends TBS implements InterfaceC88472Yns<C63120Opw, String> {
    public AnonymousClass365(C83543Pq c83543Pq) {
        super(1, c83543Pq, C83543Pq.class, "getConversationLogString", "getConversationLogString$im_base_release(Lcom/bytedance/im/core/model/Conversation;)Ljava/lang/String;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(C63120Opw c63120Opw) {
        String str;
        C63120Opw c63120Opw2 = c63120Opw;
        this.receiver.getClass();
        if (c63120Opw2 == null) {
            return "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c63120Opw2.getConversationId());
        LIZ.append('#');
        C63088OpQ coreInfo = c63120Opw2.getCoreInfo();
        if (coreInfo != null) {
            str = coreInfo.getName();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('#');
        LIZ.append(c63120Opw2.getUpdatedTime());
        return X1D.LIZIZ(LIZ);
    }
}
