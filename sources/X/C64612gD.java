package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.ordercenter.OrderCenterPreview", f = "OrderCenterPreview.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "prefectch")
/* renamed from: X.2gD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64612gD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C67282kW LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64612gD(C67282kW c67282kW, InterfaceC67352kd<? super C64612gD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c67282kW;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
