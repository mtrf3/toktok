package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.gift.base.platform.business.send.result.SendGiftFailureReqHandler", f = "SendGiftFailureReqHandler.kt", l = {258, 265, 270, 273, 276, 297, 316, 334, 347, 352, 356, 361, 376, 380, 384, 388, 392, LiveChatShowDelayForHotLiveSetting.DEFAULT, 402, 404, 419, 430, 437}, m = "handleSendGiftFail")
/* renamed from: X.CuZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32831CuZ extends C3CS {
    public C32801Cu5 LJLIL;
    public C32804Cu8 LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C32801Cu5 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32831CuZ(C32801Cu5 c32801Cu5, InterfaceC67352kd<? super C32831CuZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c32801Cu5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIJ(null, null, null, this);
    }
}
