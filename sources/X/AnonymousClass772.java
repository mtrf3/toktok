package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.now.interaction.assem.ViewerListVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.now.interaction.assem.ViewerListVM", f = "ViewerListVM.kt", l = {90}, m = "fetchViewerList")
/* renamed from: X.772, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass772 extends C3CS {
    public ViewerListVM LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ ViewerListVM LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass772(ViewerListVM viewerListVM, InterfaceC67352kd<? super AnonymousClass772> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = viewerListVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.gv0(null, null, null, this);
    }
}
