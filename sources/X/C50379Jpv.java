package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM", f = "SearchSeparateTabHorizontalVM.kt", l = {608, 612}, m = "getDetailSearchData")
/* renamed from: X.Jpv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50379Jpv extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50379Jpv(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, InterfaceC67352kd<? super C50379Jpv> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = searchSeparateTabHorizontalVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.lv0(0, null, this);
    }
}
