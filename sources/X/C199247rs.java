package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.detail.api.UnCollectBookMutation", f = "UnCollectBookMutation.kt", l = {15}, m = "operate")
/* renamed from: X.7rs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199247rs extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199197rn LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199247rs(C199197rn c199197rn, InterfaceC67352kd<? super C199247rs> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199197rn;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
