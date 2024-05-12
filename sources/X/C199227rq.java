package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.reviews.DoPoiReviewInteractMutation", f = "DoPoiReviewInteractMutation.kt", l = {19}, m = "operate")
/* renamed from: X.7rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199227rq extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199177rl LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199227rq(C199177rl c199177rl, InterfaceC67352kd<? super C199227rq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199177rl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
