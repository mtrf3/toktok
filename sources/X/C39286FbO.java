package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.legoImpl.task.AdColdStartTask;

/* renamed from: X.FbO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39286FbO<T> implements InterfaceC64592gB {
    public final /* synthetic */ C39288FbQ LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ long LJLJI;
    public final /* synthetic */ AdColdStartTask LJLJJI;

    public C39286FbO(C39288FbQ c39288FbQ, long j, long j2, AdColdStartTask adColdStartTask) {
        this.LJLIL = c39288FbQ;
        this.LJLILLLLZI = j;
        this.LJLJI = j2;
        this.LJLJJI = adColdStartTask;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("source", this.LJLIL.LJLIL);
        c188727au.LJ(this.LJLILLLLZI, "service_duration");
        c188727au.LJ(SystemClock.elapsedRealtime() - this.LJLJI, "req_duration");
        FMX.LJIIL("attribution_data_boot_perf", c188727au.LIZ);
        this.LJLJJI.getClass();
    }
}
