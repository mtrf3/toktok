package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.42Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final /* synthetic */ class C42Z extends TAZ implements InterfaceC88472Yns<C109544Rq, Boolean> {
    public C42Z(SuggestedReplyViewModel suggestedReplyViewModel) {
        super(1, suggestedReplyViewModel, SuggestedReplyViewModel.class, "canGenerateSuggestedReply", "canGenerateSuggestedReply$im_base_release(Lcom/bytedance/im/core/model/Message;Lcom/ss/android/ugc/aweme/awemeservice/api/IAwemeService;)Z", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C109544Rq c109544Rq) {
        C109544Rq p0 = c109544Rq;
        o.LJIIIZ(p0, "p0");
        return Boolean.valueOf(SuggestedReplyViewModel.hv0((SuggestedReplyViewModel) this.receiver, p0));
    }
}
