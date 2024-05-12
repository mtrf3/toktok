package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ICacheService;
import java.io.File;
import java.util.List;

/* renamed from: X.QBe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66582QBe extends AbstractC43055Gv5 {
    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final File LIZLLL() {
        return null;
    }

    @Override // X.AbstractC43055Gv5
    public final boolean LJFF() {
        try {
            C66580QBc.LIZIZ(0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final String LJI() {
        return "RESOURCE";
    }

    @Override // X.AbstractC43055Gv5
    public final long LJIIIIZZ() {
        File[] fileArr;
        ICacheService cacheConfig = AVExternalServiceImpl.LIZ().configService().cacheConfig();
        File[] fileArr2 = null;
        try {
            fileArr = cacheConfig.tempDuetFile();
        } catch (Throwable unused) {
            fileArr = null;
        }
        List<File> LJIL = C66580QBc.LJIL(fileArr, 0);
        try {
            fileArr2 = cacheConfig.rawDuetFile();
        } catch (Throwable unused2) {
        }
        return C66580QBc.LJII(C66580QBc.LJIL(fileArr2, 0)) + C66580QBc.LJI(LJIL);
    }
}
