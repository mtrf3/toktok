package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM", f = "SearchSeparateTabHorizontalVM.kt", l = {626, 649}, m = "getProxyData")
/* renamed from: X.Jpx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50381Jpx extends C3CS {
    public SearchSeparateTabHorizontalVM LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50381Jpx(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, InterfaceC67352kd<? super C50381Jpx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = searchSeparateTabHorizontalVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.zv0(this);
    }
}
