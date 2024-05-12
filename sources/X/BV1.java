package X;

import Y.AfS20S1100000_5;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.qa.QuestionDialogVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.qa.AskQuestionDialog;
import com.bytedance.android.livesdk.qa.ConversationStartersDialog;
import com.bytedance.android.livesdk.qa.QAApi;
import com.bytedance.android.livesdk.qa.QADialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BV1 {
    public static int LIZ;

    public static final boolean LIZJ(DataChannel dataChannel) {
        InteractionQuestionInfo interactionQuestionInfo;
        Integer num;
        if (!C1DH.LJJIIJZLJL(dataChannel)) {
            return true;
        }
        Room LJIILL = C1DH.LJIILL(dataChannel);
        if (LJIILL != null && (interactionQuestionInfo = LJIILL.interactionQuestion) != null && (num = interactionQuestionInfo.qaEntryType) != null && num.intValue() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        Integer num;
        if (!C1DH.LJJIIJZLJL(dataChannel) || (LJIILL = C1DH.LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || (num = interactionQuestionInfo.qaEntryType) == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJ(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        if (C1DH.LJJIIJZLJL(dataChannel) && (LJIILL = C1DH.LJIILL(dataChannel)) != null && (interactionQuestionInfo = LJIILL.interactionQuestion) != null && interactionQuestionInfo.qaEntryType != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(DataChannel dataChannel) {
        Room LJIILL = C1DH.LJIILL(dataChannel);
        if (LJIILL == null || LJIILL.questionVersion != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJI(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        Integer num;
        if (!C1DH.LJJIIJZLJL(dataChannel) || (LJIILL = C1DH.LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || (num = interactionQuestionInfo.qaEntryType) == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        Integer num;
        if (!C1DH.LJJIIJZLJL(dataChannel) || (LJIILL = C1DH.LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || (num = interactionQuestionInfo.qaEntryType) == null || num.intValue() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        Integer num;
        if (!C1DH.LJJIIJZLJL(dataChannel) || (LJIILL = C1DH.LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || (num = interactionQuestionInfo.qaEntryType) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIZ(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        if (!C1DH.LJJIIJZLJL(dataChannel) || (LJIILL = C1DH.LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || !interactionQuestionInfo.hasRecommend) {
            return false;
        }
        return true;
    }

    public static final void LJIIJ(DataChannel dataChannel) {
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C28863BUl.class)).LIZ = "interaction_feature";
            FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
            if (fragmentManager != null) {
                new ConversationStartersDialog().show(fragmentManager, "ConversationStartersDialog");
            }
        }
    }

    public static final void LIZ(DataChannel dataChannel, String str) {
        long j;
        if (dataChannel == null) {
            return;
        }
        Room LJIILL = C1DH.LJIILL(dataChannel);
        if (LJIILL != null) {
            j = LJIILL.getId();
        } else {
            j = 0;
        }
        C1EW.LIZ(((QAApi) C1A.LIZJ(QAApi.class)).queryQuestion(j, 1L, 1L, 0L, 2)).LJJJLIIL(new AfS20S1100000_5(dataChannel, str, 9), new AfS20S1100000_5(dataChannel, str, 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.BUe, O] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.BUe, O] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.BUe, O] */
    public static final void LIZIZ(DataChannel dataChannel, String str) {
        boolean z;
        UserAttr userAttr;
        if (dataChannel == null) {
            return;
        }
        Object kv0 = dataChannel.kv0(UserIsAnchorChannel.class);
        o.LJI(kv0);
        boolean booleanValue = ((Boolean) kv0).booleanValue();
        User user = (User) dataChannel.kv0(RoomUserChannel.class);
        if (user != null && (userAttr = user.getUserAttr()) != null) {
            z = userAttr.isAdmin;
        } else {
            z = false;
        }
        if (!C1DH.LJJIIJZLJL(dataChannel) && !booleanValue) {
            return;
        }
        C28854BUc c28854BUc = (C28854BUc) dataChannel.kv0(C28876BUy.class);
        if (c28854BUc == null) {
            c28854BUc = new C28854BUc(false, true);
        }
        if (c28854BUc.LJLIL && !z && !booleanValue) {
            if (c28854BUc.LJLILLLLZI) {
                C30868C9o.LIZJ(R.string.ovy);
                return;
            } else {
                C30868C9o.LIZJ(R.string.ovx);
                return;
            }
        }
        FragmentManager fragmentManager = (FragmentManager) dataChannel.kv0(C29494Bhq.class);
        if (fragmentManager != null) {
            dataChannel.rv0(QuestionDialogVisibilityChannel.class, Boolean.TRUE);
            if (LJFF(dataChannel) && !booleanValue && !z) {
                ((C32537Cpp) dataChannel.gv0(C28858BUg.class)).LIZ = new C28856BUe(0, 0, str, false);
                new AskQuestionDialog().show(fragmentManager, str);
                return;
            }
            ((C32537Cpp) dataChannel.gv0(C28863BUl.class)).LIZ = str;
            if (LJ(dataChannel)) {
                if (!booleanValue && LIZLLL(dataChannel)) {
                    ((C32537Cpp) dataChannel.gv0(C28858BUg.class)).LIZ = new C28856BUe(0, 0, str, false);
                    LIZ(dataChannel, str);
                    return;
                } else if (LIZLLL(dataChannel)) {
                    new QADialog().show(fragmentManager, str);
                    return;
                } else {
                    if (LIZJ(dataChannel)) {
                        return;
                    }
                    LJIIJ(dataChannel);
                    return;
                }
            }
            if (!booleanValue && LJIIIZ(dataChannel)) {
                ((C32537Cpp) dataChannel.gv0(C28858BUg.class)).LIZ = new C28856BUe(0, 0, str, false);
                LIZ(dataChannel, str);
            } else {
                new QADialog().show(fragmentManager, str);
            }
        }
    }
}
