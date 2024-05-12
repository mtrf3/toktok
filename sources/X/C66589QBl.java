package X;

import android.content.Context;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import java.io.File;

/* renamed from: X.QBl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66589QBl {
    public static C66589QBl LIZLLL;
    public static final long LJ = 30000;
    public C64574PVy LIZ;
    public LD6 LIZIZ;
    public Context LIZJ;

    public static C66589QBl LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C66589QBl.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C66589QBl();
                    ICacheService cacheConfig = AVExternalServiceImpl.LIZ().configService().cacheConfig();
                    LIZLLL.LIZJ = EF7.LIZIZ();
                    C66589QBl c66589QBl = LIZLLL;
                    c66589QBl.LIZIZ = new LD6(cacheConfig);
                    c66589QBl.LIZ = new C64574PVy(cacheConfig);
                }
            }
        }
        return LIZLLL;
    }

    public final String LIZ() {
        ICacheService iCacheService = (ICacheService) this.LIZ.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(iCacheService.musicDir());
        LIZ.append("download/");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (LIZIZ.endsWith("/")) {
            return LIZIZ;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZIZ);
        LIZ2.append(File.separator);
        return X1D.LIZIZ(LIZ2);
    }
}
