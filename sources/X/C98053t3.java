package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3t3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C98053t3 extends TBS implements InterfaceC88471Ynr<C105044Ai, C93053kz, C76800UCe> {
    public C98053t3(ChatRoomPanelAssem chatRoomPanelAssem) {
        super(2, chatRoomPanelAssem, ChatRoomPanelAssem.class, "logKeyboardHideEvent", "logKeyboardHideEvent(Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/ChatRoomInputVMState;Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/input/reply/MessageReplyState;)V", 0);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C105044Ai c105044Ai, C93053kz c93053kz) {
        boolean z;
        C105044Ai p0 = c105044Ai;
        C93053kz p1 = c93053kz;
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        this.receiver.getClass();
        if (C78685UuP.LJJJZ(p0.LJLILLLLZI) || p1.LJLIL != null) {
            z = true;
        } else {
            z = false;
        }
        C98063t4.LIZ(Boolean.valueOf(z));
        return C76800UCe.LIZ;
    }
}
