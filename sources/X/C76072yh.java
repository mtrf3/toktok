package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationPlayer", f = "IMNotificationPlayer.kt", l = {231}, m = "showNotificationUsingPlatformApi$showInner")
/* renamed from: X.2yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76072yh extends C3CS {
    public C112444bA LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public int LJLJI;

    public C76072yh(InterfaceC67352kd<? super C76072yh> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C112444bA.LIZLLL(null, this);
    }
}
