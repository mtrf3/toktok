package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.favorite.viewmodel.BookCollectionListViewModel", f = "BookCollectionListViewModel.kt", l = {34}, m = "onLoadMore")
/* renamed from: X.7I3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7I3 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ BookCollectionListViewModel LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7I3(BookCollectionListViewModel bookCollectionListViewModel, InterfaceC67352kd<? super C7I3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = bookCollectionListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.gv0(0L, this);
    }
}
