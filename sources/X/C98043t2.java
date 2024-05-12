package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98043t2 extends TBS implements InterfaceC88471Ynr<C105044Ai, C93053kz, C76800UCe> {
    public C98043t2(ChatRoomPanelAssem chatRoomPanelAssem) {
        super(2, chatRoomPanelAssem, ChatRoomPanelAssem.class, "logKeyboardShowEvent", "logKeyboardShowEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/ChatRoomInputVMState;Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/reply/MessageReplyState;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C105044Ai c105044Ai, C93053kz c93053kz) {
        boolean z;
        C105044Ai p0 = c105044Ai;
        C93053kz p1 = c93053kz;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        ChatRoomPanelAssem chatRoomPanelAssem = (ChatRoomPanelAssem) this.receiver;
        chatRoomPanelAssem.getClass();
        if (C78685UuP.LJJJZ(p0.LJLILLLLZI) || p1.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        if (chatRoomPanelAssem.v3().LJLILLLLZI) {
            C98063t4.LIZJ("chat", "chat_panel", Boolean.valueOf(z), 8);
        } else {
            C98063t4.LIZJ("chat", null, Boolean.valueOf(z), 10);
        }
        return C76800UCe.LIZ;
    }
}
