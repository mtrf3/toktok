package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.live.GoLiveChecker", f = "GoLiveChecker.kt", l = {164}, m = "fetchStreamInfoApi")
/* renamed from: X.Bd4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29198Bd4 extends C3CS {
    public C29199Bd5 LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C29199Bd5 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29198Bd4(C29199Bd5 c29199Bd5, InterfaceC67352kd<? super C29198Bd4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c29199Bd5;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
