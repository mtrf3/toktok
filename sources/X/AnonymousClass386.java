package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.perf.FullUpdateMonitor", f = "FullUpdateMonitor.kt", l = {52, 54, 56}, m = "measure")
/* renamed from: X.386, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass386 extends C3CS {
    public AnonymousClass385 LJLIL;
    public InterfaceC88471Ynr LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public boolean LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ AnonymousClass385 LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass386(AnonymousClass385 anonymousClass385, InterfaceC67352kd<? super AnonymousClass386> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = anonymousClass385;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZ(null, this);
    }
}
