package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel", f = "TopicSearchViewModel.kt", l = {50, 51, 74}, m = "onLoadMore")
/* renamed from: X.7PM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7PM extends C3CS {
    public TopicSearchViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ TopicSearchViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7PM(TopicSearchViewModel topicSearchViewModel, InterfaceC67352kd<? super C7PM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = topicSearchViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(0L, this);
    }
}
