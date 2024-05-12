package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.IMUserDaoPerformance", f = "ImUserDaoPerformance.kt", l = {69, 69}, m = "insertOrReplaceIMUser")
/* renamed from: X.3aT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86533aT extends C3CS {
    public C86503aQ LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C15150id LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C86503aQ LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86533aT(C86503aQ c86503aQ, InterfaceC67352kd<? super C86533aT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c86503aQ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIIIIZZ(null, this);
    }
}
