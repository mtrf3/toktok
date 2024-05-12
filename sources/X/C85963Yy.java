package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {598, 599, 602}, m = "updateLocalIMUser")
/* renamed from: X.3Yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85963Yy extends C3CS {
    public IMUser LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C85913Yt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85963Yy(C85913Yt c85913Yt, InterfaceC67352kd<? super C85963Yy> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIILL(null, null, null, false, this);
    }
}
