package X;

import defpackage.e1;
import java.io.File;

/* renamed from: X.QBo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66592QBo extends AbstractC43055Gv5 {
    public final int LIZIZ = 1;
    public final int LIZJ = 1000;
    public final int LIZLLL = 60000;
    public final int LJ = 3600000;
    public final int LJFF = 86400000;

    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final File LIZLLL() {
        return null;
    }

    @Override // X.AbstractC43055Gv5
    public final String LJI() {
        return "RESOURCE";
    }

    @Override // X.AbstractC43055Gv5, X.InterfaceC37286EkE
    public final boolean LIZ() {
        if (!e1.LIZ(31744, "video_resource_auto_clean", true, false)) {
            return false;
        }
        try {
            FFL.LJIIIZ().getClass();
            LJII(C47242IgQ.LIZ().tryToClearAndGetCachesByUsedTime(LJIIIZ(FFL.LJIIJ(31744, 3, "video_resource_clean_time", true)), true), "auto_clean_videores");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final boolean LJFF() {
        if (!C23930wn.LIZ()) {
            return false;
        }
        try {
            FFL.LJIIIZ().getClass();
            LJII(C47242IgQ.LIZ().tryToClearAndGetCachesByUsedTime(LJIIIZ(FFL.LJIIJ(31744, 3, "video_resource_clean_time", true)), true), "manual_clean_videores");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.AbstractC43055Gv5
    public final long LJIIIIZZ() {
        if (!C23930wn.LIZ()) {
            return 0L;
        }
        try {
            FFL.LJIIIZ().getClass();
            return C47242IgQ.LIZ().tryToClearAndGetCachesByUsedTime(LJIIIZ(FFL.LJIIJ(31744, 3, "video_resource_clean_time", true)), false);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public final long LJIIIZ(int i) {
        return System.currentTimeMillis() - (((((i * this.LJFF) * this.LJ) * this.LIZLLL) * this.LIZJ) * this.LIZIZ);
    }
}
