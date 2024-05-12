package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager", f = "OfflineModeManager.kt", l = {170, 184, 188, 191, 201, 210}, m = "downloadTask")
/* loaded from: classes5.dex */
public final class AQZ extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public /* synthetic */ Object LJLL;
    public final /* synthetic */ AQV LJLLI;
    public int LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AQZ(AQV aqv, InterfaceC67352kd<? super AQZ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLI = aqv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLL = obj;
        this.LJLLILLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLI.LJJJLL(null, this);
    }
}
