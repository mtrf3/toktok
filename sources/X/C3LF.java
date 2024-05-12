package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.core.SessionListManagerV2", f = "SessionListManagerV2.kt", l = {1326}, m = "handleNormalInboxUnreadCount")
/* renamed from: X.3LF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C82253Kr LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3LF(C82253Kr c82253Kr, InterfaceC67352kd<? super C3LF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c82253Kr;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIJJ(null, this);
    }
}
