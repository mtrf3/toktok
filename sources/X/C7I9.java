package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.favorite.MovieFavoriteListVM", f = "MovieFavoriteListVM.kt", l = {35}, m = "onLoadMore")
/* renamed from: X.7I9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7I9 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ MovieFavoriteListVM LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7I9(MovieFavoriteListVM movieFavoriteListVM, InterfaceC67352kd<? super C7I9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = movieFavoriteListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0L, this);
    }
}
