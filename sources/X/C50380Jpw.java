package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchTabHorizontalVM", f = "SearchTabHorizontalVM.kt", l = {132}, m = "getMoreTabHorizontalData$suspendImpl")
/* renamed from: X.Jpw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50380Jpw extends C3CS {
    public SearchTabHorizontalVM LJLIL;
    public C50062Jko LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ SearchTabHorizontalVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50380Jpw(SearchTabHorizontalVM searchTabHorizontalVM, InterfaceC67352kd<? super C50380Jpw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = searchTabHorizontalVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return SearchTabHorizontalVM.ov0(this.LJLJJI, null, this);
    }
}
