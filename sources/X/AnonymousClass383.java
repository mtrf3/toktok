package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.perf.DBEntireDiffer", f = "DBEntireDiffer.kt", l = {55}, m = "afterFullUpdate")
/* renamed from: X.383, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass383 extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ AnonymousClass382 LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass383(AnonymousClass382 anonymousClass382, InterfaceC67352kd<? super AnonymousClass383> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = anonymousClass382;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(this);
    }
}
