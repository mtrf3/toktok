package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem.RecommendUserListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chatlist.feature.groupchat.recommend.assem.RecommendUserListViewModel", f = "RecommendUserListViewModel.kt", l = {37}, m = "onRefresh")
/* renamed from: X.3bH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87033bH extends C3CS {
    public RecommendUserListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RecommendUserListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87033bH(RecommendUserListViewModel recommendUserListViewModel, InterfaceC67352kd<? super C87033bH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = recommendUserListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
