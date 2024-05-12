package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.notification.creator.repo.CreatorNoticeRepository$operator$1", f = "CreatorNoticeRepository.kt", l = {91}, m = "getJanusList")
/* loaded from: classes10.dex */
public final class MOT extends C3CS {
    public C68322mC LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ MOR LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MOT(MOR mor, InterfaceC67352kd<? super MOT> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = mor;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJJJIL(this);
    }
}
