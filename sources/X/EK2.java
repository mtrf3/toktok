package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.broadcaster.beforelive.slot.preview.widget.ECProductBeforeLiveWidget", f = "ECProductBeforeLiveWidget.kt", l = {203}, m = "onLoseSelect")
/* loaded from: classes7.dex */
public final class EK2 extends C3CS {
    public C71226RxO LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C71226RxO LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EK2(C71226RxO c71226RxO, InterfaceC67352kd<? super EK2> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c71226RxO;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(this);
    }
}
