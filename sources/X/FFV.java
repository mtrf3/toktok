package X;

import com.ss.android.legoapi.ISysOptTaskApi;
import com.ss.android.ugc.aweme.legoImp.SysOptTaskImpl;

/* loaded from: classes7.dex */
public final class FFV implements ISysOptTaskApi {
    public static final FFV LIZIZ = new FFV();
    public final /* synthetic */ ISysOptTaskApi LIZ;

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LJFF() {
        return this.LIZ.LJFF();
    }

    @Override // com.ss.android.legoapi.ISysOptTaskApi
    public final EE1 LJI() {
        return this.LIZ.LJI();
    }

    public FFV() {
        ISysOptTaskApi iSysOptTaskApi;
        Object LIZ = C58096Mr6.LIZ(ISysOptTaskApi.class, false);
        if (LIZ != null) {
            iSysOptTaskApi = (ISysOptTaskApi) LIZ;
        } else {
            if (C58096Mr6.j2 == null) {
                synchronized (ISysOptTaskApi.class) {
                    if (C58096Mr6.j2 == null) {
                        C58096Mr6.j2 = new SysOptTaskImpl();
                    }
                }
            }
            iSysOptTaskApi = C58096Mr6.j2;
        }
        this.LIZ = iSysOptTaskApi;
    }
}
