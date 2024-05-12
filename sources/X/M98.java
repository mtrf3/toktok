package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.nows.service.NowDailyPushService;
import com.ss.android.ugc.aweme.service.INowDailyPushService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M98 implements INowDailyPushService {
    public static final M98 LIZIZ = new M98();
    public final /* synthetic */ INowDailyPushService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowDailyPushService
    public final boolean LIZ(String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.LIZ(url);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDailyPushService
    public final void LIZIZ(Context context, Intent intent, String str) {
        o.LJIIIZ(context, "context");
        this.LIZ.LIZIZ(context, intent, str);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDailyPushService
    public final String LIZJ() {
        return this.LIZ.LIZJ();
    }

    public M98() {
        INowDailyPushService iNowDailyPushService;
        Object LIZ = C58096Mr6.LIZ(INowDailyPushService.class, false);
        if (LIZ != null) {
            iNowDailyPushService = (INowDailyPushService) LIZ;
        } else {
            if (C58096Mr6.z3 == null) {
                synchronized (INowDailyPushService.class) {
                    if (C58096Mr6.z3 == null) {
                        C58096Mr6.z3 = new NowDailyPushService();
                    }
                }
            }
            iNowDailyPushService = C58096Mr6.z3;
        }
        this.LIZ = iNowDailyPushService;
    }
}
