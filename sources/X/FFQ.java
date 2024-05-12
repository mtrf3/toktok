package X;

import com.ss.android.legoapi.ICrashSdkTaskApi;
import com.ss.android.ugc.aweme.legoImp.CrashSdkTaskImpl;

/* loaded from: classes7.dex */
public final class FFQ implements ICrashSdkTaskApi {
    public static final FFQ LIZIZ = new FFQ();
    public final /* synthetic */ ICrashSdkTaskApi LIZ;

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJI() {
        return this.LIZ.LJI();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJII() {
        return this.LIZ.LJII();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJIIIIZZ() {
        return this.LIZ.LJIIIIZZ();
    }

    @Override // com.ss.android.legoapi.ICrashSdkTaskApi
    public final EE1 LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    public FFQ() {
        ICrashSdkTaskApi iCrashSdkTaskApi;
        Object LIZ = C58096Mr6.LIZ(ICrashSdkTaskApi.class, false);
        if (LIZ != null) {
            iCrashSdkTaskApi = (ICrashSdkTaskApi) LIZ;
        } else {
            if (C58096Mr6.e2 == null) {
                synchronized (ICrashSdkTaskApi.class) {
                    if (C58096Mr6.e2 == null) {
                        C58096Mr6.e2 = new CrashSdkTaskImpl();
                    }
                }
            }
            iCrashSdkTaskApi = C58096Mr6.e2;
        }
        this.LIZ = iCrashSdkTaskApi;
    }
}
