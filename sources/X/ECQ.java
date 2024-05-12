package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem", f = "EcVideoGuideAssem.kt", l = {394}, m = "requestInterest")
/* loaded from: classes7.dex */
public final class ECQ extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EcVideoGuideAssem LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECQ(EcVideoGuideAssem ecVideoGuideAssem, InterfaceC67352kd<? super ECQ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = ecVideoGuideAssem;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.u4(0, 0, 0, null, this);
    }
}
