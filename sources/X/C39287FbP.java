package X;

import Y.AfS58S0100000_6;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.legoImpl.task.AdColdStartTask;
import com.ss.android.ugc.aweme.service.AttributionService;

/* renamed from: X.FbP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39287FbP implements InterfaceC39285FbN {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ AdColdStartTask LIZIZ;

    @Override // X.InterfaceC39285FbN
    public final void LIZ(C39288FbQ c39288FbQ) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.LIZ;
        C73470SsU LJIJJ = AttributionService.LIZIZ().LIZ(c39288FbQ, false).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ());
        AdColdStartTask adColdStartTask = this.LIZIZ;
        LJIJJ.LJJII(new C39286FbO(c39288FbQ, j, elapsedRealtime, adColdStartTask), new AfS58S0100000_6(adColdStartTask, 14));
    }

    public C39287FbP(long j, AdColdStartTask adColdStartTask) {
        this.LIZ = j;
        this.LIZIZ = adColdStartTask;
    }
}
