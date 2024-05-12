package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.automessage.controller.LandAutoMsgReceiverToChatNode", f = "LandAutoMsgReceiverToChatNode.kt", l = {144, 145}, m = "startTimeoutTimer$im_base_release")
/* renamed from: X.2p9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70152p9 extends C3CS {
    public C70172pB LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C70172pB LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70152p9(C70172pB c70172pB, InterfaceC67352kd<? super C70152p9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c70172pB;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZLLL(this);
    }
}
