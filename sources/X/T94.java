package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionDetailRepository$operator$1", f = "VoiceConversionDetailRepository.kt", l = {42}, m = "fetchFeedInformation")
/* loaded from: classes13.dex */
public final class T94 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ T92 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T94(T92 t92, InterfaceC67352kd<? super T94> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = t92;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZLLL(null, false, false, this);
    }
}
