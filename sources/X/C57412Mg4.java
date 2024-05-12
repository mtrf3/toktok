package X;

import Y.ACallableS112S0100000_9;
import Y.ACallableS2S0101100_9;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AppOpenedTimesData;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeUploadApi;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57412Mg4 {
    public static int LIZ = 3;
    public static final ScreenTimeUploadApi LIZIZ = (ScreenTimeUploadApi) RetrofitFactory.LIZLLL().create(C778533t.LIZ).create(ScreenTimeUploadApi.class);

    public static void LIZ(AppOpenedTimesData appOpenedTimes) {
        o.LJIIIZ(appOpenedTimes, "appOpenedTimes");
        C10K.LIZIZ(new ACallableS112S0100000_9(appOpenedTimes, 6), C10K.LJI, null);
    }

    public static void LIZIZ(int i, List timeUsage, long j) {
        o.LJIIIZ(timeUsage, "timeUsage");
        C10K.LIZIZ(new ACallableS2S0101100_9(j, timeUsage, i, 0), C10K.LJI, null);
    }
}
