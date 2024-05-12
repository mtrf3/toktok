package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* renamed from: X.40p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1025140p extends TBS implements InterfaceC65784Pro<IMUser> {
    public C1025140p(Object obj) {
        super(0, obj, BaseChatPanel.class, "getMafUser", "getMafUser()Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final IMUser invoke() {
        BaseChatPanel baseChatPanel = (BaseChatPanel) this.receiver;
        IMUser iMUser = baseChatPanel.LLIIIJ;
        if (iMUser != null) {
            return iMUser;
        }
        ChatNoticeViewModel chatNoticeViewModel = (ChatNoticeViewModel) baseChatPanel.LLJJIJI.getValue();
        if (chatNoticeViewModel != null) {
            return chatNoticeViewModel.LJLJLLL;
        }
        return null;
    }
}
