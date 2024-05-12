package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {492, 494, 497}, m = "updateIMUserProfileInfo")
/* renamed from: X.3Z3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z3 extends C3CS {
    public IMUserProfileInfo LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C85913Yt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z3(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z3> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIILJJIL(null, this);
    }
}
