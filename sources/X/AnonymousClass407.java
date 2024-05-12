package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.GroupChatPanel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;

/* renamed from: X.407, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class AnonymousClass407 extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public AnonymousClass407(Object obj) {
        super(0, obj, GroupChatPanel.class, "showPermanentBanUi", "showPermanentBanUi()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        RecyclerView recyclerView = ((BaseChatPanel) this.receiver).LLIIIILZ;
        if (recyclerView.getVisibility() == 0) {
            recyclerView.setVisibility(8);
        }
        return C76800UCe.LIZ;
    }
}
