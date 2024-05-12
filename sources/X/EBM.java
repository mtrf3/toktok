package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheck", f = "SmartCheck.kt", l = {74, LiveAnchorEnableInnerBeautyMaxValue.DEFAULT}, m = "check")
/* loaded from: classes7.dex */
public final class EBM extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public ISmartCheckService LJLJJI;
    public boolean LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ EBL LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBM(EBL ebl, InterfaceC67352kd<? super EBM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = ebl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(null, false, this);
    }
}
