package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationContentProvider", f = "IMNotificationContentProvider.kt", l = {293}, m = "buildAssembleNotificationContent")
/* renamed from: X.3GY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GY extends C3CS {
    public long LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public C109544Rq LJLJJL;
    public Object LJLJJLL;
    public int LJLJL;
    public /* synthetic */ Object LJLJLJ;
    public final /* synthetic */ C3GW LJLJLLL;
    public int LJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GY(C3GW c3gw, InterfaceC67352kd<? super C3GY> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLLL = c3gw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJLJ = obj;
        this.LJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLLL.LIZ(this);
    }
}
