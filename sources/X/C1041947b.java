package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.nudge.ChatPageNudgeViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.47b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1041947b {
    public static ChatPageNudgeViewModel LIZ(Fragment fragment, C99033ud sessionInfo) {
        String str;
        long j;
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(sessionInfo, "sessionInfo");
        ChatPageNudgeViewModel chatPageNudgeViewModel = (ChatPageNudgeViewModel) ViewModelProviders.of(fragment).get(ChatPageNudgeViewModel.class);
        chatPageNudgeViewModel.getClass();
        if (!chatPageNudgeViewModel.LJLJLJ) {
            chatPageNudgeViewModel.LJLIL = sessionInfo;
            chatPageNudgeViewModel.LJLJLLL = sessionInfo.getSingleChatFromUser();
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(sessionInfo.getConversationId());
            chatPageNudgeViewModel.LJLILLLLZI = LIZ;
            C109544Rq c109544Rq = null;
            if (LIZ != null) {
                c109544Rq = LIZ.getLastShowMessage();
            }
            chatPageNudgeViewModel.LJLJI = c109544Rq;
            C63120Opw c63120Opw = chatPageNudgeViewModel.LJLILLLLZI;
            if (c63120Opw == null || (str = c63120Opw.getConversationId()) == null) {
                str = "";
            }
            chatPageNudgeViewModel.LJLJJI = str;
            C63120Opw c63120Opw2 = chatPageNudgeViewModel.LJLILLLLZI;
            if (c63120Opw2 != null) {
                j = c63120Opw2.getReadIndex();
            } else {
                j = -1;
            }
            chatPageNudgeViewModel.LJLJJL = j;
            chatPageNudgeViewModel.hv0(chatPageNudgeViewModel.LJLJI);
            chatPageNudgeViewModel.LJLJLJ = true;
        }
        return chatPageNudgeViewModel;
    }
}
