package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel", f = "HighlightSelectListViewModel.kt", l = {76}, m = "sendRequest")
/* renamed from: X.9c9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240459c9 extends C3CS {
    public HighlightSelectListViewModel LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ HighlightSelectListViewModel LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C240459c9(HighlightSelectListViewModel highlightSelectListViewModel, InterfaceC67352kd<? super C240459c9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = highlightSelectListViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.hv0(this);
    }
}
