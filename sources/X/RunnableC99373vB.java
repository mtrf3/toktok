package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.InputView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;

/* renamed from: X.3vB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC99373vB implements Runnable {
    public boolean LJLIL;
    public volatile boolean LJLILLLLZI;
    public volatile boolean LJLJI;
    public final /* synthetic */ BaseQuickChatRoomFragment LJLJJI;

    public final void LIZ() {
        ChatRoomEditTextAbility chatRoomEditTextAbility;
        InputView inputView;
        if (this.LJLIL) {
            return;
        }
        if ((C99423vG.LIZ() && !this.LJLJI) || this.LJLILLLLZI) {
            return;
        }
        this.LJLIL = true;
        BaseChatPanel baseChatPanel = this.LJLJJI.LJLJJLL;
        if (baseChatPanel != null && (inputView = baseChatPanel.LLILLL) != null) {
            inputView.LJJIJLIJ(false);
        }
        if (BaseQuickChatRoomFragment.LLF && (chatRoomEditTextAbility = (ChatRoomEditTextAbility) C55096Ljo.LIZ(C55230Lly.LIZJ(this.LJLJJI, null), ChatRoomEditTextAbility.class, null)) != null) {
            chatRoomEditTextAbility.tr(EnumC105154At.KEYBOARD);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC99373vB(BaseQuickChatRoomFragment baseQuickChatRoomFragment) {
        this.LJLJJI = baseQuickChatRoomFragment;
    }
}
