package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.SubscriptionGuideMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CBD extends CQO<SubscriptionGuideMessage> {
    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        return ((SubscriptionGuideMessage) this.LJIJJLI).LJLIL;
    }

    @Override // X.CQL
    public final CharSequence LJLLLL() {
        return LLFF(((SubscriptionGuideMessage) this.LJIJJLI).description);
    }

    public final CBE LLFFF() {
        if (o.LJ("notice_viewer_new_goal", ((SubscriptionGuideMessage) this.LJIJJLI).capsuleScene) || o.LJ("notice_anchor_reset_goal", ((SubscriptionGuideMessage) this.LJIJJLI).capsuleScene)) {
            return CBE.SUPPORT;
        }
        return ((SubscriptionGuideMessage) this.LJIJJLI).LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBD(SubscriptionGuideMessage message) {
        super(message);
        o.LJIIIZ(message, "message");
    }

    public static CharSequence LLFF(Text text) {
        String LIZ;
        if (text == null) {
            return null;
        }
        String str = text.defaultPattern;
        String str2 = text.key;
        if (str2 != null && str2.length() != 0 && (LIZ = C86881Y7x.LIZIZ().LIZ(text.key)) != null && LIZ.length() != 0) {
            str = LIZ;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return CXJ.LJI(str, text, null);
    }
}
