package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.ftc.repository.KidsProfileRepositoryImpl", f = "KidsProfileRepository.kt", l = {37}, m = "loadPublishEditModels")
/* loaded from: classes8.dex */
public final class GPM extends C3CS {
    public GPL LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ GPL LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPM(GPL gpl, InterfaceC67352kd<? super GPM> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = gpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZIZ(this);
    }
}
