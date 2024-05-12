package X;

import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.speeddetector.core.impl.NetworkSpeedDetectorManager", f = "NetworkSpeedDetectorManager.kt", l = {382, 409}, m = "repeatSendJob")
/* renamed from: X.1yB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50271yB extends C3CS {
    public C42111l1 LJLIL;
    public Object LJLILLLLZI;
    public ConfigData LJLJI;
    public Object LJLJJI;
    public C42111l1 LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public long LJLL;
    public /* synthetic */ Object LJLLI;
    public final /* synthetic */ C42111l1 LJLLILLLL;
    public int LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50271yB(C42111l1 c42111l1, InterfaceC67352kd<? super C50271yB> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLLILLLL = c42111l1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLLI = obj;
        this.LJLLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLLILLLL.LJI(null, null, this);
    }
}
