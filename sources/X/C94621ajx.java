package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ugc.effectcreator.foundation.statistic.ProjectDurationReporter", f = "ProjectDurationReporter.kt", l = {92}, m = "readDurationInfo")
/* renamed from: X.ajx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94621ajx extends C3CS {
    public /* synthetic */ Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C93677aUj LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94621ajx(C93677aUj c93677aUj, InterfaceC67352kd interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c93677aUj;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLILLLLZI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this);
    }
}
