package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM$startPolling$1$invokeSuspend$$inlined$map$1$2", f = "TakoPollingVM.kt", l = {149, 136}, m = "emit")
/* renamed from: X.JcV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49547JcV extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public InterfaceC64672gJ LJLJI;
    public final /* synthetic */ C49546JcU LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49547JcV(C49546JcU c49546JcU, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c49546JcU;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.emit(null, this);
    }
}
