package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.performance.SearchQueryPerformanceDataKt", f = "SearchQueryPerformanceData.kt", l = {27}, m = "measureDuration")
/* renamed from: X.35T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35T<T> extends C3CS {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public int LJLJJL;

    public C35T(InterfaceC67352kd<? super C35T> interfaceC67352kd) {
        super(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return C35S.LIZ(null, this);
    }
}
