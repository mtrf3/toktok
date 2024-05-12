package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.ss.android.ugc.aweme.contact.model.SharePermission;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {397, 399, LiveChatShowDelayForHotLiveSetting.DEFAULT, 403, 404}, m = "updateSharePermission")
/* renamed from: X.3Z6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z6 extends C3CS {
    public SharePermission LJLIL;
    public SharePermission LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C85913Yt LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z6(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z6> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIILLIIL(null, this);
    }
}
