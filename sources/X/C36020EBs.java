package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.viewmodel.LiveVerticalViewModel", f = "LiveVerticalViewModel.kt", l = {293, 297, 314}, m = "fetchLoadMoreData")
/* renamed from: X.EBs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36020EBs extends C3CS {
    public LiveVerticalViewModel LJLIL;
    public SearchResultParam LJLILLLLZI;
    public Object LJLJI;
    public CompletionBlock LJLJJI;
    public m LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ LiveVerticalViewModel LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36020EBs(LiveVerticalViewModel liveVerticalViewModel, InterfaceC67352kd<? super C36020EBs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = liveVerticalViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.iv0(null, null, null, null, this);
    }
}
