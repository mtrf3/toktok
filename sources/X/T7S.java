package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.repo.QnaSuggestedRepository", f = "QnaSuggestedRepository.kt", l = {160}, m = "deleteInvite")
/* loaded from: classes13.dex */
public final class T7S extends C3CS {
    public T7O LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ T7O LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T7S(T7O t7o, InterfaceC67352kd<? super T7S> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = t7o;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZ(null, this);
    }
}
