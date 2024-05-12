package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MGl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56527MGl extends C51031K1b<C56563MHv> {
    public final /* synthetic */ C56528MGm LJLJJL;
    public final /* synthetic */ ActivityC45651qj LJLJJLL;

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        ForumStruct question;
        String str;
        String str2;
        C56563MHv c56563MHv;
        List<Aweme> LJIIJ;
        Aweme aweme;
        Aweme video;
        List<Aweme> LJIIJ2;
        Aweme aweme2;
        T t = this.LJLIL;
        if (t == 0 || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        int i = ((AbstractC51036K1g) t).mListQueryType;
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return;
                }
                InterfaceC223218pR interfaceC223218pR = (InterfaceC223218pR) k;
                List<Aweme> LJIIJ3 = ((C56563MHv) t).LJIIJ();
                if (((AbstractC51036K1g) this.LJLIL).isHasMore() && !((AbstractC51036K1g) this.LJLIL).isNewDataEmpty()) {
                    z = true;
                }
                interfaceC223218pR.j0(LJIIJ3, z);
                return;
            }
            ((InterfaceC223218pR) k).jh(((C56563MHv) t).LJIIJ(), !((AbstractC51036K1g) this.LJLIL).isNewDataEmpty());
            return;
        }
        if (((AbstractC51036K1g) t).isDataEmpty()) {
            ((InterfaceC223218pR) this.LJLILLLLZI).J5(((C56563MHv) this.LJLIL).LJIIJ(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
            ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
            return;
        }
        ForumStruct question2 = this.LJLJJL.getQuestion();
        String str3 = null;
        if (question2 != null && question2.getVideo() != null && (question = this.LJLJJL.getQuestion()) != null && question.getCreator() != null) {
            C56563MHv c56563MHv2 = (C56563MHv) this.LJLIL;
            if (c56563MHv2 != null && (LJIIJ2 = c56563MHv2.LJIIJ()) != null && (aweme2 = (Aweme) ListProtector.get(LJIIJ2, 0)) != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            ForumStruct question3 = this.LJLJJL.getQuestion();
            if (question3 != null && (video = question3.getVideo()) != null) {
                str2 = video.getAid();
            } else {
                str2 = null;
            }
            if (o.LJ(str, str2) && (c56563MHv = (C56563MHv) this.LJLIL) != null && (LJIIJ = c56563MHv.LJIIJ()) != null && (aweme = (Aweme) ListProtector.get(LJIIJ, 0)) != null) {
                ActivityC45651qj activityC45651qj = this.LJLJJLL;
                if (activityC45651qj != null) {
                    str3 = activityC45651qj.getString(R.string.jdm);
                }
                aweme.setLabelMusicStarterText(str3);
            }
        }
        ((InterfaceC223218pR) this.LJLILLLLZI).J5(((C56563MHv) this.LJLIL).LJIIJ(), ((AbstractC51036K1g) this.LJLIL).isHasMore());
    }

    public C56527MGl(C56528MGm c56528MGm, ActivityC45651qj activityC45651qj) {
        this.LJLJJL = c56528MGm;
        this.LJLJJLL = activityC45651qj;
    }
}
