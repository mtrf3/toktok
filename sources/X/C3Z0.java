package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {449, 452, 458, 462, 466, 472, 474}, m = "updateIMUserBaseInfo")
/* renamed from: X.3Z0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z0 extends C3CS {
    public Object LJLIL;
    public IMUserBaseInfo LJLILLLLZI;
    public IMUserBaseInfo LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C85913Yt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z0(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIIL(null, this);
    }
}
