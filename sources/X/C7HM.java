package X;

import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7HM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7HM implements InterfaceC175156u7 {
    public static final C7HM LIZ = new C7HM();

    @Override // X.InterfaceC175156u7
    public final void LIZ() {
        C7IK.LIZJ().storeBoolean(C7IK.LIZ("comment_input_also_upvote_tool_tip_shown_"), true);
    }

    @Override // X.InterfaceC175156u7
    public final boolean LJFF() {
        return C7IK.LIZJ().getBoolean(C7IK.LIZ("comment_input_also_upvote_check_state_"), false);
    }

    @Override // X.InterfaceC175156u7
    public final boolean LJI() {
        boolean z = C7IK.LIZJ().getBoolean(C7IK.LIZ("comment_input_also_upvote_checkbox_first_show_"), true);
        if (z) {
            C7IK.LIZJ().storeBoolean(C7IK.LIZ("comment_input_also_upvote_checkbox_first_show_"), false);
        }
        return z;
    }

    @Override // X.InterfaceC175156u7
    public final boolean LJIIIIZZ() {
        return C7IK.LIZJ().getBoolean(C7IK.LIZ("comment_input_also_upvote_tool_tip_shown_"), false);
    }

    public static void LJIIIZ(ActivityC45651qj activityC45651qj) {
        if (C7IK.LIZJ().getBoolean(C7IK.LIZ("comment_input_also_upvote_public_toast_"), false) || C7IK.LIZJ().getBoolean(C7IK.LIZ("has_displayed_new_guide_panel_"), false)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
        c26045AKb.LJIIIIZZ(R.string.q48);
        c26045AKb.LJIIJ();
        C7IK.LIZJ().storeBoolean(C7IK.LIZ("comment_input_also_upvote_public_toast_"), true);
    }

    @Override // X.InterfaceC175156u7
    public final boolean LIZJ(Aweme aweme) {
        UpvoteStruct upvoteStruct;
        boolean z;
        if (C7HP.LIZ() && aweme != null && aweme.getAid() != null) {
            String aid = aweme.getAid();
            C7HV c7hv = C7HV.LIZIZ;
            o.LJIIIIZZ(aid, "aid");
            UpvoteList LJIIIZ = c7hv.LJIIIZ(aid);
            if (LJIIIZ != null) {
                upvoteStruct = C1FP.LJIIIIZZ(LJIIIZ);
            } else {
                upvoteStruct = null;
            }
            if (upvoteStruct != null && C1FP.LJII(upvoteStruct)) {
                z = true;
            } else {
                z = false;
            }
            CommentService.LIZ.getClass();
            boolean z2 = !CommentServiceImpl.LJJL().LJIILLIIL(aweme);
            if (z && !((ArrayList) C7H2.LIZIZ.getValue()).contains(aid) && z2) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC175156u7
    public final void LIZLLL(String str) {
        if (str == null) {
            return;
        }
        ((ArrayList) C7H2.LIZIZ.getValue()).add(str);
    }

    @Override // X.InterfaceC175156u7
    public final void LJ(String str) {
        if (str == null) {
            return;
        }
        ((ArrayList) C7H2.LIZIZ.getValue()).remove(str);
    }

    @Override // X.InterfaceC175156u7
    public final boolean LJII(Aweme aweme) {
        String aid;
        List<UpvoteStruct> upvotes;
        boolean z = false;
        if (!C7HO.LIZIZ(aweme)) {
            return false;
        }
        CommentService.LIZ.getClass();
        if (!CommentServiceImpl.LJJL().LJJIJIIJI(aweme)) {
            return false;
        }
        Boolean bool = null;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return false;
        }
        UpvoteList LJIIIZ = C7HV.LIZIZ.LJIIIZ(aid);
        if (LJIIIZ != null && (upvotes = LJIIIZ.getUpvotes()) != null) {
            if (!upvotes.isEmpty()) {
                Iterator<UpvoteStruct> it = upvotes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (AV1.LJIJ(it.next().getUser())) {
                        z = true;
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z);
        }
        return !o.LJ(bool, Boolean.TRUE);
    }

    @Override // X.InterfaceC175156u7
    public final void LIZIZ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        C7IK.LIZJ().storeBoolean(C7IK.LIZ("comment_input_also_upvote_check_state_"), z);
        OSZ[] oszArr = new OSZ[3];
        oszArr[0] = new OSZ(str, "enter_from");
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        oszArr[1] = new OSZ(str2, "is_first");
        if (z) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        oszArr[2] = new OSZ(str3, "to_status");
        FMX.LJIILL("click_comment_to_repost", oszArr);
    }
}
