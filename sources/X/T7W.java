package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.repo.QnaSuggestedRepository", f = "QnaSuggestedRepository.kt", l = {148, 148}, m = "fetchMixedFeed")
/* loaded from: classes13.dex */
public final class T7W extends C3CS {
    public T7O LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ T7O LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T7W(T7O t7o, InterfaceC67352kd<? super T7W> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = t7o;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(this);
    }
}
