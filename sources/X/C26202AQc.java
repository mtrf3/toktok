package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.offlinemode.repo.OfflineModeManager", f = "OfflineModeManager.kt", l = {109, 110}, m = "clearUserCache")
/* renamed from: X.AQc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26202AQc extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ AQV LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26202AQc(AQV aqv, InterfaceC67352kd<? super C26202AQc> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = aqv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LLFFF(this);
    }
}
