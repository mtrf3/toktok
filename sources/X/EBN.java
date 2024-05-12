package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheck", f = "SmartCheck.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "init")
/* loaded from: classes7.dex */
public final class EBN extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EBL LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBN(EBL ebl, InterfaceC67352kd<? super EBN> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = ebl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZIZ(this);
    }
}
