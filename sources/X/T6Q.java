package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.question.ForumStruct;
import com.ss.android.ugc.aweme.question.QuestionDetailFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public final /* synthetic */ class T6Q extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public T6Q(QuestionDetailFragment questionDetailFragment) {
        super(0, questionDetailFragment, QuestionDetailFragment.class, "inviteButtonClick", "inviteButtonClick()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j;
        User creator;
        String uid;
        Long id;
        QuestionDetailFragment questionDetailFragment = (QuestionDetailFragment) this.receiver;
        questionDetailFragment.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            try {
                ActivityC45651qj mo49getActivity = questionDetailFragment.mo49getActivity();
                if (mo49getActivity != null) {
                    IQAInvitationService iQAInvitationService = questionDetailFragment.LLII;
                    EnumC90333gb enumC90333gb = EnumC90333gb.QUESTION_DETAIL;
                    ForumStruct forumStruct = questionDetailFragment.LJLLLLLL;
                    long j2 = 0;
                    if (forumStruct != null && (id = forumStruct.getId()) != null) {
                        j = id.longValue();
                    } else {
                        j = 0;
                    }
                    Long valueOf = Long.valueOf(j);
                    ForumStruct forumStruct2 = questionDetailFragment.LJLLLLLL;
                    if (forumStruct2 != null && (creator = forumStruct2.getCreator()) != null && (uid = creator.getUid()) != null) {
                        j2 = CastLongProtector.parseLong(uid);
                    }
                    C90323ga.LIZ(iQAInvitationService, mo49getActivity, "click_button", "qa_detail", enumC90333gb, valueOf, Long.valueOf(j2), null, questionDetailFragment.Ml(), null, 256);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return C76800UCe.LIZ;
        }
        C26045AKb c26045AKb = new C26045AKb(questionDetailFragment);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }
}
