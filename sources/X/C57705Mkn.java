package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM", f = "RecUserVideoListSharedVM.kt", l = {235}, m = "onLoadMore")
/* renamed from: X.Mkn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57705Mkn extends C3CS {
    public RecUserVideoListSharedVM LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ RecUserVideoListSharedVM LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57705Mkn(RecUserVideoListSharedVM recUserVideoListSharedVM, InterfaceC67352kd<? super C57705Mkn> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = recUserVideoListSharedVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.onLoadMore(null, this);
    }
}
