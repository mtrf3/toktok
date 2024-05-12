package X;

import com.ss.android.ugc.aweme.search.common.model.RecentDelHistory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.32k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C775032k extends AbstractC65781Prl implements InterfaceC88472Yns<RecentDelHistory, Boolean> {
    public static final C775032k LJLIL = new C775032k();

    public C775032k() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(RecentDelHistory recentDelHistory) {
        long j;
        RecentDelHistory recentDelHistory2 = recentDelHistory;
        boolean z = false;
        if (recentDelHistory2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Long l = recentDelHistory2.delTimeMills;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (currentTimeMillis - j >= TimeUnit.DAYS.toMillis(30L)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
