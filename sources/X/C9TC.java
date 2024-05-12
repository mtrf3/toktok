package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.recuser.popup.RecUserAfterAuthPopupVM", f = "RecUserAfterAuthPopupVM.kt", l = {102, 105}, m = "isAuthSyncSuccess")
/* renamed from: X.9TC, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9TC extends C3CS {
    public InterfaceC68342mE LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ RecUserAfterAuthPopupVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9TC(RecUserAfterAuthPopupVM recUserAfterAuthPopupVM, InterfaceC67352kd<? super C9TC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = recUserAfterAuthPopupVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, null, this);
    }
}
