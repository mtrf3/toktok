package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "androidx.compose.foundation.lazy.grid.LazyGridState", f = "LazyGridState.kt", l = {266, 267}, m = "scroll")
/* renamed from: X.20W, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20W extends C3CS {
    public C1QP LJLIL;
    public C0SF LJLILLLLZI;
    public InterfaceC88471Ynr LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C1QP LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20W(C1QP c1qp, InterfaceC67352kd<? super C20W> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c1qp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZIZ(null, null, this);
    }
}
