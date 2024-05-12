package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager", f = "OfflineModeManager.kt", l = {313}, m = "fetchOfflineVideos")
/* renamed from: X.AQb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26201AQb extends C3CS {
    public int LJLIL;
    public int LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ AQV LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26201AQb(AQV aqv, InterfaceC67352kd<? super C26201AQb> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = aqv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LJIIJ(0, this);
    }
}
