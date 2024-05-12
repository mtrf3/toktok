package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.vm.MovieVideoListVM", f = "MovieVideoListVM.kt", l = {108}, m = "onLoadMore")
/* renamed from: X.7Rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185947Rm extends C3CS {
    public MovieVideoListVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MovieVideoListVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185947Rm(MovieVideoListVM movieVideoListVM, InterfaceC67352kd<? super C185947Rm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = movieVideoListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onLoadMore(null, this);
    }
}
