package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailSharedVM", f = "TrendingDetailSharedVM.kt", l = {142, 153}, m = "onLoadMore$suspendImpl")
/* renamed from: X.MBq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56402MBq extends C3CS {
    public TrendingDetailSharedVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ TrendingDetailSharedVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56402MBq(TrendingDetailSharedVM trendingDetailSharedVM, InterfaceC67352kd<? super C56402MBq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = trendingDetailSharedVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return TrendingDetailSharedVM.lv0(this.LJLJJI, 0L, this);
    }
}
