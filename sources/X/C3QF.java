package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.utils.IMSearchContentUtils", f = "IMSearchContentUtils.kt", l = {160, 173}, m = "fullUpdateSearchContent")
/* renamed from: X.3QF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3QF extends C3CS {
    public InterfaceC88472Yns LJLIL;
    public C3Q8 LJLILLLLZI;
    public C98453th LJLJI;
    public C3QC LJLJJI;
    public C68322mC LJLJJL;
    public Object LJLJJLL;
    public Object LJLJL;
    public C76732zl LJLJLJ;
    public Object LJLJLLL;
    public Object LJLL;
    public boolean LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public /* synthetic */ Object LJLLLL;
    public final /* synthetic */ C3QE LJLLLLLL;
    public int LJLZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3QF(C3QE c3qe, InterfaceC67352kd<? super C3QF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLLLLL = c3qe;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLLL = obj;
        this.LJLZ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLLLLL.LIZ(0, null, null, null, null, null, null, null, null, false, this);
    }
}
