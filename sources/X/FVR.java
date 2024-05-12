package X;

import com.ss.android.common.applog.AppLog;

/* loaded from: classes7.dex */
public final class FVR {
    public static final AbstractC73851Syd<String> LIZ = new C73849Syb().LJJZ();
    public static final AbstractC73851Syd<String> LIZIZ = new C73849Syb().LJJZ();
    public static final AbstractC73851Syd<Boolean> LIZJ = new C73893SzJ().LJJZ();
    public static final AbstractC73851Syd<Boolean> LIZLLL = new C73893SzJ().LJJZ();
    public static final AbstractC73851Syd<FVT> LJ = new C73893SzJ().LJJZ();
    public static final String LJFF = "-2147483648";
    public static final FVS LJI = new FVS();

    public static void LIZIZ() {
        AbstractC73851Syd<String> abstractC73851Syd = LIZ;
        String str = LJFF;
        abstractC73851Syd.onNext(str);
        abstractC73851Syd.onNext(LIZJ());
        AbstractC73851Syd<String> abstractC73851Syd2 = LIZIZ;
        abstractC73851Syd2.onNext(str);
        String installId = AppLog.getInstallId();
        if (installId != null) {
            abstractC73851Syd2.onNext(installId);
        }
    }

    public static void LIZ() {
        LIZ.onNext(LIZJ());
        String installId = AppLog.getInstallId();
        if (installId != null) {
            LIZIZ.onNext(installId);
        }
    }

    public static String LIZJ() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId == null) {
            return "";
        }
        return serverDeviceId;
    }
}
