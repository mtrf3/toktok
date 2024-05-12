package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM", f = "SearchTabHorizontalVM.kt", l = {433}, m = "getDetailSearchData$suspendImpl")
/* renamed from: X.Jpy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50382Jpy extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ SearchTabHorizontalVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50382Jpy(SearchTabHorizontalVM searchTabHorizontalVM, InterfaceC67352kd<? super C50382Jpy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = searchTabHorizontalVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return SearchTabHorizontalVM.mv0(this.LJLILLLLZI, 0, null, this);
    }
}
