package X;

import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qna.fragment.QnaAskQuestionFragment;
import kotlin.jvm.internal.AqS167S0100000_1;

/* renamed from: X.4lV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C118854lV extends TBS implements InterfaceC65784Pro<C76800UCe> {
    public C118854lV(QnaAskQuestionFragment qnaAskQuestionFragment) {
        super(0, qnaAskQuestionFragment, QnaAskQuestionFragment.class, "inviteUsers", "inviteUsers()V", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        QnaAskQuestionFragment qnaAskQuestionFragment = (QnaAskQuestionFragment) this.receiver;
        qnaAskQuestionFragment.wl();
        ActivityC45651qj mo49getActivity = qnaAskQuestionFragment.mo49getActivity();
        if (mo49getActivity != null) {
            IQAInvitationService iQAInvitationService = qnaAskQuestionFragment.LJLJJI;
            String enterFrom = qnaAskQuestionFragment.xl().getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            C90323ga.LIZ(iQAInvitationService, mo49getActivity, "ask_textual_question", enterFrom, EnumC90333gb.NEW_QUESTION, null, null, qnaAskQuestionFragment.LJLJJLL, null, new AqS167S0100000_1(qnaAskQuestionFragment, 27), 128);
        }
        return C76800UCe.LIZ;
    }
}
