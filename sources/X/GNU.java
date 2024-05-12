package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel", f = "DraftViewModel.kt", l = {491, 512}, m = "updateSticker")
/* loaded from: classes8.dex */
public final class GNU extends C3CS {
    public DraftViewModel LJLIL;
    public Object LJLILLLLZI;
    public C68322mC LJLJI;
    public C68322mC LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ DraftViewModel LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GNU(DraftViewModel draftViewModel, InterfaceC67352kd<? super GNU> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = draftViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.ov0(null, null, null, null, this);
    }
}
