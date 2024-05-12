package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import com.zhiliaoapp.musically.R;

/* renamed from: X.BjB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29577BjB extends CQO<LinkMicBattleNoticeMessage> {
    @Override // X.CQL, X.InterfaceC29967BpT
    public final int LJJJ() {
        return R.drawable.d1l;
    }

    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        MESSAGE message = this.LJIJJLI;
        if (((LinkMicBattleNoticeMessage) message).noticeType == 3 && ((LinkMicBattleNoticeMessage) message).anchorGiftGuide != null && ((LinkMicBattleNoticeMessage) message).anchorGiftGuide.content != null) {
            return ((LinkMicBattleNoticeMessage) message).anchorGiftGuide.content.text;
        }
        if (((LinkMicBattleNoticeMessage) message).noticeType != 6 || ((LinkMicBattleNoticeMessage) message).commonGuide == null) {
            return "";
        }
        return CXJ.LJFF(((LinkMicBattleNoticeMessage) message).commonGuide.displayText, "");
    }

    public C29577BjB(LinkMicBattleNoticeMessage linkMicBattleNoticeMessage) {
        super(linkMicBattleNoticeMessage);
    }
}
