package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.LandAutoMsgReceiverToChatNode", f = "LandAutoMsgReceiverToChatNode.kt", l = {119, LiveTryModeCountDownThresholdSetting.DEFAULT}, m = "fetchAweme$im_base_release")
/* renamed from: X.2pA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70162pA extends C3CS {
    public C70172pB LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C70172pB LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70162pA(C70172pB c70172pB, InterfaceC67352kd<? super C70162pA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c70172pB;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(null, this);
    }
}
