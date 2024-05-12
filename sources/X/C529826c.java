package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {BaseNotice.CREATOR, 63}, m = "withFrameNanos")
/* renamed from: X.26c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C529826c<R> extends C3CS {
    public C529926d LJLIL;
    public InterfaceC88472Yns LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C529926d LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C529826c(C529926d c529926d, InterfaceC67352kd<? super C529826c> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c529926d;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJ(null, this);
    }
}
