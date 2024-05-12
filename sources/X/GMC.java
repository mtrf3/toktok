package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.tools.draft.DraftFragment;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.DraftFragment", f = "DraftFragment.kt", l = {850}, m = "getNewDraftId")
/* loaded from: classes8.dex */
public final class GMC extends C3CS {
    public AwemeDraft LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ DraftFragment LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMC(DraftFragment draftFragment, InterfaceC67352kd<? super GMC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = draftFragment;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.xl(null, this);
    }
}
