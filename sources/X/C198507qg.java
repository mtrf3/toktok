package X;

import android.view.View;
import com.ss.android.ugc.aweme.nows.service.NowDistributionService;
import com.ss.android.ugc.aweme.service.INowDistributionService;
import kotlin.jvm.internal.o;

/* renamed from: X.7qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198507qg implements INowDistributionService {
    public static final C198507qg LIZIZ = new C198507qg();
    public final /* synthetic */ INowDistributionService LIZ;

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final void LIZ(String str, String str2, String str3, Integer num) {
        this.LIZ.LIZ(str, str2, str3, num);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final AbstractC196727no LIZIZ(View itemView, String eventLabel, MH9 listener) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(eventLabel, "eventLabel");
        o.LJIIIZ(listener, "listener");
        return this.LIZ.LIZIZ(itemView, eventLabel, listener);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final int LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final boolean LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final boolean LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final AbstractC73672Svk<Integer> LJFF(String str) {
        return this.LIZ.LJFF(str);
    }

    @Override // com.ss.android.ugc.aweme.service.INowDistributionService
    public final boolean LJI() {
        return this.LIZ.LJI();
    }

    public C198507qg() {
        INowDistributionService iNowDistributionService;
        Object LIZ = C58096Mr6.LIZ(INowDistributionService.class, false);
        if (LIZ != null) {
            iNowDistributionService = (INowDistributionService) LIZ;
        } else {
            if (C58096Mr6.A3 == null) {
                synchronized (INowDistributionService.class) {
                    if (C58096Mr6.A3 == null) {
                        C58096Mr6.A3 = new NowDistributionService();
                    }
                }
            }
            iNowDistributionService = C58096Mr6.A3;
        }
        this.LIZ = iNowDistributionService;
    }
}
