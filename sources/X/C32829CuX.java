package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftFailureReqHandler", f = "SendGiftFailureReqHandler.kt", l = {LiveTryModeCountDownThresholdSetting.DEFAULT, 134, 167}, m = "handleFailure")
/* renamed from: X.CuX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32829CuX extends C3CS {
    public C32801Cu5 LJLIL;
    public C32816CuK LJLILLLLZI;
    public C32804Cu8 LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C32801Cu5 LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32829CuX(C32801Cu5 c32801Cu5, InterfaceC67352kd<? super C32829CuX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c32801Cu5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZJ(null, null, this);
    }
}
