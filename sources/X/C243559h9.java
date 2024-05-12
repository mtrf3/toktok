package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeaturedVideoAwemeListViewModel", f = "FeaturedVideoAwemeListViewModel.kt", l = {82}, m = "requestFeatureVideoAwemeList")
/* renamed from: X.9h9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C243559h9 extends C3CS {
    public FeaturedVideoAwemeListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ FeaturedVideoAwemeListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C243559h9(FeaturedVideoAwemeListViewModel featuredVideoAwemeListViewModel, InterfaceC67352kd<? super C243559h9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = featuredVideoAwemeListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.gv0(this);
    }
}
