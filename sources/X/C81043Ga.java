package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationContentProvider", f = "IMNotificationContentProvider.kt", l = {388}, m = "getDescriptionForSingleMsgPush")
/* renamed from: X.3Ga, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81043Ga extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C3GW LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81043Ga(C3GW c3gw, InterfaceC67352kd<? super C81043Ga> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c3gw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJI(null, this);
    }
}
