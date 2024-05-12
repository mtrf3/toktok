package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.base.model.UrlModel;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationContentProvider", f = "IMNotificationContentProvider.kt", l = {251}, m = "buildNotificationContentByMessage")
/* renamed from: X.3GX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GX extends C3CS {
    public C771931f LJLIL;
    public C109544Rq LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public UrlModel LJLJJLL;
    public Object LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public /* synthetic */ Object LJLLI;
    public final /* synthetic */ C3GW LJLLILLLL;
    public int LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GX(C3GW c3gw, InterfaceC67352kd<? super C3GX> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLILLLL = c3gw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLI = obj;
        this.LJLLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLILLLL.LIZIZ(null, 0L, this);
    }
}
