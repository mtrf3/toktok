package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM", f = "TopicRecommendListVM.kt", l = {123, 152}, m = "onLoadMore")
/* renamed from: X.7PQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PQ extends C3CS {
    public TopicRecommendListVM LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ TopicRecommendListVM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7PQ(TopicRecommendListVM topicRecommendListVM, InterfaceC67352kd<? super C7PQ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = topicRecommendListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.onLoadMore(null, this);
    }
}
