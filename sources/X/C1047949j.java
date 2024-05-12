package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.helper.unreadindicator.UnreadIndicatorDelegate", f = "UnreadIndicatorDelegate.kt", l = {234}, m = "checkShowUnreadMessageTips")
/* renamed from: X.49j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1047949j extends C3CS {
    public C1047549f LJLIL;
    public C1047549f LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C1047549f LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1047949j(C1047549f c1047549f, InterfaceC67352kd<? super C1047949j> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c1047549f;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(0L, 0L, 0L, this);
    }
}
