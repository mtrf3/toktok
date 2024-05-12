package X;

import com.bytedance.im.core.proto.ModifyPropertyContent;

/* renamed from: X.4Gr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106694Gr {
    public final C63219OrX LIZ = new C63219OrX();

    public final void LIZIZ(C63120Opw c63120Opw) {
        this.LIZ.conversationId = c63120Opw.getConversationId();
        this.LIZ.conversationType = c63120Opw.getConversationType();
        this.LIZ.conversationShortId = c63120Opw.getConversationShortId();
        this.LIZ.inboxType = c63120Opw.getInboxType();
    }

    public final void LIZ(EnumC63258OsA enumC63258OsA, String str, String str2) {
        this.LIZ.addPropertyContent(new ModifyPropertyContent(enumC63258OsA, str, null, str2));
    }
}
