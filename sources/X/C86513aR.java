package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.decorator.IMUserDaoPerformance", f = "ImUserDaoPerformance.kt", l = {81}, m = "clear")
/* renamed from: X.3aR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86513aR extends C3CS {
    public C86503aQ LJLIL;
    public Object LJLILLLLZI;
    public C15150id LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C86503aQ LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86513aR(C86503aQ c86503aQ, InterfaceC67352kd<? super C86513aR> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c86503aQ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(this);
    }
}
