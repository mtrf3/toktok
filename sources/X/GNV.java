package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {182, 187}, m = "updateDraftViewInfo")
/* loaded from: classes8.dex */
public final class GNV extends C3CS {
    public DraftViewModel LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ DraftViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNV(DraftViewModel draftViewModel, InterfaceC67352kd<? super GNV> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = draftViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.mv0(null, null, this);
    }
}
