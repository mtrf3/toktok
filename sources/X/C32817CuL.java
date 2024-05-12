package X;

import com.bytedance.android.livesdk.gift.model.CalmDownInfo;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftFailureInterceptorBizHandler", f = "SendGiftFailureInterceptorBizHandler.kt", l = {LiveTryModeCountDownThresholdSetting.DEFAULT, 139, 146, 183, 202, 225, 244, 253, 260, 266, 272, 281, 314, 320, 330, 334, 360}, m = "handleFailure")
/* renamed from: X.CuL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32817CuL extends C3CS {
    public C32802Cu6 LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public CalmDownInfo LJLJJLL;
    public SendGiftResult LJLJL;
    public DataChannel LJLJLJ;
    public long LJLJLLL;
    public /* synthetic */ Object LJLL;
    public final /* synthetic */ C32802Cu6 LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32817CuL(C32802Cu6 c32802Cu6, InterfaceC67352kd<? super C32817CuL> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLI = c32802Cu6;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLL = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLI.LIZJ(null, null, this);
    }
}
