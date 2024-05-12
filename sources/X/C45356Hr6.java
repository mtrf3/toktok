package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadEndEvent;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadStartEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Hr6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45356Hr6 extends AbstractC45355Hr5 {
    @Override // X.AbstractC45355Hr5
    public final void LIZJ(long j, String str) {
        this.LIZIZ = j;
        V16.LJJLL(GScope.LJLIL, Long.valueOf(j), null, null, null, null, null, null, 126);
        V16.LJJLIIIIJ(DownloadStartEvent.class);
    }

    @Override // X.AbstractC45355Hr5
    public final void LIZIZ(int i, String str, String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        long currentTimeMillis = System.currentTimeMillis();
        C10K.LIZJ(new CallableC45370HrK(str, currentTimeMillis, currentTimeMillis - this.LIZIZ, this));
    }

    @Override // X.AbstractC45355Hr5
    public final void LIZ(long j, long j2, int i, String str, boolean z, String enterFrom, int i2, int i3) {
        o.LJIIIZ(enterFrom, "enterFrom");
        V16.LJJLL(GScope.LJLIL, null, Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(z ? 1 : 0), String.valueOf(i), str, 1);
        V16.LJJLIIIIJ(DownloadEndEvent.class);
    }
}
