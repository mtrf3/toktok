package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {520, 527}, m = "queryPostedDraftEntrance")
/* loaded from: classes8.dex */
public final class GNX extends C3CS {
    public DraftViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ DraftViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNX(DraftViewModel draftViewModel, InterfaceC67352kd<? super GNX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = draftViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.lv0(this);
    }
}
