package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.api.CollectBookMutation", f = "CollectBookMutation.kt", l = {15}, m = "operate")
/* renamed from: X.7rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199237rr extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199187rm LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199237rr(C199187rm c199187rm, InterfaceC67352kd<? super C199237rr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199187rm;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
