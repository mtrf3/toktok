package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.titlebar.QuickTitleBarAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.BaseQuickChatRoomViewModel;

/* renamed from: X.4LQ, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4LQ extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C4LQ(QuickTitleBarAssem quickTitleBarAssem) {
        super(0, quickTitleBarAssem, QuickTitleBarAssem.class, "onLeftClick", "onLeftClick()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        BaseQuickChatRoomViewModel baseQuickChatRoomViewModel = (BaseQuickChatRoomViewModel) ((QuickTitleBarAssem) this.receiver).LJLL.getValue();
        if (baseQuickChatRoomViewModel != null) {
            baseQuickChatRoomViewModel.kv0();
        }
        return C76800UCe.LIZ;
    }
}
