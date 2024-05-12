package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.helper.IMContactManager", f = "IMContactManager.kt", l = {215, 248, 251}, m = "doRealFetchAndDBUpdate")
/* renamed from: X.3Yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C85943Yw extends C3CS {
    public C85913Yt LJLIL;
    public C34K LJLILLLLZI;
    public C68322mC LJLJI;
    public Object LJLJJI;
    public Object LJLJJL;
    public Object LJLJJLL;
    public C76732zl LJLJL;
    public Object LJLJLJ;
    public Object LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public /* synthetic */ Object LJLLJ;
    public final /* synthetic */ C85913Yt LJLLL;
    public int LJLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85943Yw(C85913Yt c85913Yt, InterfaceC67352kd<? super C85943Yw> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLL = c85913Yt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLJ = obj;
        this.LJLLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLL.LIZJ(this);
    }
}
