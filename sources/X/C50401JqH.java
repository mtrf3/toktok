package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM", f = "SearchEDMVideoDetailSharedVM.kt", l = {104, 121, 124}, m = "onRefresh")
/* renamed from: X.JqH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50401JqH extends C3CS {
    public SearchEDMVideoDetailSharedVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ SearchEDMVideoDetailSharedVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50401JqH(SearchEDMVideoDetailSharedVM searchEDMVideoDetailSharedVM, InterfaceC67352kd<? super C50401JqH> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = searchEDMVideoDetailSharedVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onRefresh(this);
    }
}
