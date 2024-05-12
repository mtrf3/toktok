package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {524, 525}, m = "updateIMUserBaseInfo")
/* renamed from: X.3Z1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z1 extends C3CS {
    public IMUserBaseInfo LJLIL;
    public IMUserBaseInfo LJLILLLLZI;
    public IMUserBaseInfo LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C85913Yt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z1(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z1> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIILIIL(null, null, this);
    }
}
