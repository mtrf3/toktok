package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM", f = "SearchSeparateTabHorizontalVM.kt", l = {167, 213, 213, 213}, m = "getMoreTabHorizontalData")
/* renamed from: X.Jpu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50378Jpu extends C3CS {
    public Object LJLIL;
    public C50062Jko LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50378Jpu(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, InterfaceC67352kd<? super C50378Jpu> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = searchSeparateTabHorizontalVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.nv0(null, this);
    }
}
