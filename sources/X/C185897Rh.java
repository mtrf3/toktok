package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM", f = "BookVideoListVM.kt", l = {97}, m = "onLoadMore")
/* renamed from: X.7Rh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185897Rh extends C3CS {
    public BookVideoListVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BookVideoListVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185897Rh(BookVideoListVM bookVideoListVM, InterfaceC67352kd<? super C185897Rh> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = bookVideoListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onLoadMore(null, this);
    }
}
