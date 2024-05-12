package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {544, 551}, m = "checkLocalIMUser")
/* renamed from: X.3Yz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85973Yz extends C3CS {
    public Object LJLIL;
    public IMUserBaseInfo LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C85913Yt LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85973Yz(C85913Yt c85913Yt, InterfaceC67352kd<? super C85973Yz> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, null, this);
    }
}
