package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import java.util.Stack;

/* renamed from: X.3vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99813vt {
    public C99033ud LIZ;
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C99823vu.LJLIL);
    public boolean LIZJ;

    public final Stack<C99033ud> LIZ() {
        return (Stack) this.LIZIZ.getValue();
    }

    public final void LIZIZ() {
        C99003ua c99003ua;
        C96963rI.LIZIZ().getClass();
        if (!C97273rn.LIZ()) {
            C89163ei LIZ = C96963rI.LIZ();
            C99033ud c99033ud = this.LIZ;
            if (c99033ud == null) {
                c99003ua = null;
            } else {
                String conversationId = c99033ud.getConversationId();
                java.util.Map<String, String> botSendParams = c99033ud.getBotSendParams();
                java.util.Map<String, String> autoSendMessageExtra = c99033ud.getAutoSendMessageExtra();
                List<String> autoSendMessageContent = c99033ud.getAutoSendMessageContent();
                IMUser singleChatFromUser = c99033ud.getSingleChatFromUser();
                String enterFromForMob = c99033ud.getEnterFromForMob();
                String enterMethod = c99033ud.getEnterMethod();
                int chatType = c99033ud.getChatType();
                java.util.Map<String, String> botQueryRequestExtra = c99033ud.getBotQueryRequestExtra();
                String searchId = c99033ud.getSearchId();
                if (searchId == null) {
                    searchId = "";
                }
                c99003ua = new C99003ua(enterFromForMob, enterMethod, null, null, searchId, autoSendMessageContent, autoSendMessageExtra, null, botQueryRequestExtra, botSendParams, chatType, conversationId, null, singleChatFromUser, null, false, 0, 118924, null);
            }
            LIZ.getClass();
            C89163ei.LIZIZ(c99003ua);
        }
    }
}
