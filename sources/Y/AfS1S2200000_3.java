package Y;

import X.C174076sN;
import X.C176996x5;
import X.C183067Gk;
import X.C224748ru;
import X.C72O;
import X.C76082yi;
import X.C7H1;
import X.C7HV;
import X.InterfaceC64592gB;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.ui.BottomBarFragment;
import com.ss.android.ugc.aweme.comment.detailpage.ui.CommentInputFragment;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import kotlin.jvm.internal.AqS57S1100000_3;

/* loaded from: classes4.dex */
public class AfS1S2200000_3 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S2200000_3 afS1S2200000_3, Object obj) {
        C176996x5 c176996x5 = (C176996x5) afS1S2200000_3.l2;
        C224748ru c224748ru = (C224748ru) afS1S2200000_3.l3;
        String str = afS1S2200000_3.s0;
        String str2 = afS1S2200000_3.s1;
        if (!c176996x5.LJJIJIIJI() || c176996x5.LJJLIIIJJI(str, str2, "click_comment_emotion")) {
            return;
        }
        c176996x5.LJJIJIIJIL();
        if (C72O.LIZ()) {
            Fragment fragment = c176996x5.LJLJI;
            if ((fragment instanceof CommentInputFragment) || (fragment instanceof BottomBarFragment)) {
                C174076sN.LIZ();
            } else if (C7HV.LIZIZ.LJIL().LIZJ(c176996x5.LJIIZILJ())) {
                C174076sN.LIZIZ(Boolean.TRUE);
            }
        }
        c176996x5.LJJLI(c224748ru.getHint(), true);
    }

    public static final void accept$1(AfS1S2200000_3 afS1S2200000_3, Object obj) {
        String str;
        String str2;
        UpvotePublishResponse upvotePublishResponse = (UpvotePublishResponse) obj;
        UpvoteStruct upvoteStruct = upvotePublishResponse.upvote;
        if (upvoteStruct == null || (str = upvoteStruct.getCommentId()) == null) {
            str = "";
        }
        C183067Gk.LIZ(str, afS1S2200000_3.s0, (UpvotePublishMobParam) afS1S2200000_3.l2);
        C76082yi.LIZ(afS1S2200000_3.s1);
        UpvoteStruct upvoteStruct2 = upvotePublishResponse.upvote;
        if (upvoteStruct2 != null) {
            String str3 = afS1S2200000_3.s1;
            upvoteStruct2.setMyNewUpvote(true);
            C7H1.LJII(str3, upvoteStruct2);
        }
        ((UpvotePublishVM) afS1S2200000_3.l3).setState(new AqS57S1100000_3(upvotePublishResponse, afS1S2200000_3.s1, 15));
        UpvotePublishVM upvotePublishVM = (UpvotePublishVM) afS1S2200000_3.l3;
        UpvotePublishMobParam upvotePublishMobParam = (UpvotePublishMobParam) afS1S2200000_3.l2;
        if (upvotePublishMobParam != null) {
            str2 = upvotePublishMobParam.enterFrom;
        } else {
            str2 = null;
        }
        String str4 = afS1S2200000_3.s1;
        upvotePublishVM.getClass();
        UpvotePublishVM.lv0(str2, str4);
        UpvotePublishVM upvotePublishVM2 = (UpvotePublishVM) afS1S2200000_3.l3;
        upvotePublishVM2.LJLIL.LIZ();
        upvotePublishVM2.LJLIL.LIZLLL(upvotePublishResponse);
        upvotePublishVM2.LJLIL.LJFF();
    }

    public AfS1S2200000_3(Object obj, Object obj2, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.l3 = obj2;
        this.s0 = str;
        this.s1 = str2;
    }
}
