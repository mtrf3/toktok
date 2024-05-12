package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.legacy.IMNotificationContentProvider", f = "IMNotificationContentProvider.kt", l = {399}, m = "processReplyMsgPrefix")
/* renamed from: X.3GZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GZ extends C3CS {
    public Object LJLIL;
    public C109544Rq LJLILLLLZI;
    public BaseContent LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C3GW LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GZ(C3GW c3gw, InterfaceC67352kd<? super C3GZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c3gw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIIZ(null, null, null, this);
    }
}
