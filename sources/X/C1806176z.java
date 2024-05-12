package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.now.interaction.assem.LikeListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.now.interaction.assem.LikeListVM", f = "LikeListVM.kt", l = {117}, m = "fetchLikeList")
/* renamed from: X.76z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806176z extends C3CS {
    public LikeListVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ LikeListVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806176z(LikeListVM likeListVM, InterfaceC67352kd<? super C1806176z> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = likeListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, null, null, this);
    }
}
