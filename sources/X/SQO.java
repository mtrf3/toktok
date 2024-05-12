package X;

import Y.IDfS132S0100000_12;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.dmfilter.DmFilterAddKeywordsBottomSheet$onStart$1$invokeSuspend$$inlined$collect$1", f = "DmFilterAddKeywordsBottomSheet.kt", l = {143}, m = "emit")
/* loaded from: classes13.dex */
public final class SQO extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ IDfS132S0100000_12 LJLJI;
    public IDfS132S0100000_12 LJLJJI;
    public AnonymousClass317 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQO(IDfS132S0100000_12 iDfS132S0100000_12, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iDfS132S0100000_12;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.emit(null, this);
    }
}
