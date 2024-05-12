package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultLiveViewModel", f = "EcSearchResultLiveViewModel.kt", l = {211, 215, 232}, m = "fetchLoadMoreData")
/* renamed from: X.EBr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36019EBr extends C3CS {
    public EcSearchResultLiveViewModel LJLIL;
    public Object LJLILLLLZI;
    public CompletionBlock LJLJI;
    public m LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ EcSearchResultLiveViewModel LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36019EBr(EcSearchResultLiveViewModel ecSearchResultLiveViewModel, InterfaceC67352kd<? super C36019EBr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = ecSearchResultLiveViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.rk0(null, null, null, this);
    }
}
