package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceDetailRepository$operator$1", f = "TTSVoiceDetailRepository.kt", l = {37}, m = "fetchFeedInformation")
/* loaded from: classes13.dex */
public final class T95 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ T93 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T95(T93 t93, InterfaceC67352kd<? super T95> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = t93;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, false, false, this);
    }
}
