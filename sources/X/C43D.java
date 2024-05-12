package X;

import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.43D, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C43D extends TBS implements InterfaceC88472Yns<C109544Rq, C76800UCe> {
    public C43D(SuggestedReplyViewModel suggestedReplyViewModel) {
        super(1, suggestedReplyViewModel, SuggestedReplyViewModel.class, "tryLoadForLastVisibleAweme", "tryLoadForLastVisibleAweme$im_base_release(Lcom/bytedance/im/core/model/Message;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C109544Rq c109544Rq) {
        C109544Rq p0 = c109544Rq;
        o.LJIIIZ(p0, "p0");
        SuggestedReplyViewModel suggestedReplyViewModel = (SuggestedReplyViewModel) this.receiver;
        suggestedReplyViewModel.getClass();
        if (SuggestedReplyExperiment.LIZIZ()) {
            suggestedReplyViewModel.lv0(p0);
        } else if (SuggestedReplyExperiment.LIZJ()) {
            suggestedReplyViewModel.qv0(p0);
        }
        return C76800UCe.LIZ;
    }
}
