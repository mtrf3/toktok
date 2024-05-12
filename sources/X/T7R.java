package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.repo.QnaSuggestedRepository", f = "QnaSuggestedRepository.kt", l = {182}, m = "saveForLaterQuestion")
/* loaded from: classes13.dex */
public final class T7R extends C3CS {
    public T7O LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ T7O LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T7R(T7O t7o, InterfaceC67352kd<? super T7R> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = t7o;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJLL.LJIIJ(null, 0, this);
    }
}
