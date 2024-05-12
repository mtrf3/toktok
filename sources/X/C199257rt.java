package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.detail.api.CollectMovieMutation", f = "CollectMovieMutation.kt", l = {15}, m = "operate")
/* renamed from: X.7rt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C199257rt extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C199207ro LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199257rt(C199207ro c199207ro, InterfaceC67352kd<? super C199257rt> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c199207ro;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJJLIIIJILLIZJL(null, this);
    }
}
