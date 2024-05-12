package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserProfileInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {137, 138}, m = "updateIMContact")
/* renamed from: X.3Z5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Z5 extends C3CS {
    public IMUserProfileInfo LJLIL;
    public IMUserProfileInfo LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C85913Yt LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3Z5(C85913Yt c85913Yt, InterfaceC67352kd<? super C3Z5> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJJI(null, this);
    }
}
