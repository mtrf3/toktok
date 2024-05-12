package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM", f = "OfflineModeListVM.kt", l = {59}, m = "onLoadMore")
/* renamed from: X.9bU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240049bU extends C3CS {
    public OfflineModeListVM LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ OfflineModeListVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C240049bU(OfflineModeListVM offlineModeListVM, InterfaceC67352kd<? super C240049bU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = offlineModeListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(0, this);
    }
}
