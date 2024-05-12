package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.feed.vm.FollowStorySkylightVM", f = "FollowStorySkylightVM.kt", l = {97}, m = "onLoadMore")
/* renamed from: X.Lbo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54600Lbo extends C3CS {
    public FollowStorySkylightVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FollowStorySkylightVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54600Lbo(FollowStorySkylightVM followStorySkylightVM, InterfaceC67352kd<? super C54600Lbo> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = followStorySkylightVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.iv0(0L, this);
    }
}
