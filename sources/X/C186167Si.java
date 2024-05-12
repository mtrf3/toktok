package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM", f = "TopicReviewListVM.kt", l = {68}, m = "onLoadMore")
/* renamed from: X.7Si, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186167Si extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ TopicReviewListVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186167Si(TopicReviewListVM topicReviewListVM, InterfaceC67352kd<? super C186167Si> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = topicReviewListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0L, this);
    }
}
