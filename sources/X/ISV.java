package X;

import android.app.Application;
import android.os.Environment;
import android.text.TextUtils;
import defpackage.i0;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes9.dex */
public final class ISV {
    public static final Object LIZ = new Object();
    public static volatile ISZ LIZIZ = null;
    public static final C35751E1j<String, String> LIZJ = new C35751E1j<>(5);

    public static String LIZ() {
        File LLIIJI;
        Application application = C46982IcE.LIZ;
        if (Environment.isExternalStorageEmulated()) {
            LLIIJI = C16880lQ.LLIIJLIL(application);
        } else {
            LLIIJI = C16880lQ.LLIIJI(application, null);
            if (LLIIJI != null) {
                if (!LLIIJI.exists()) {
                    LLIIJI.mkdirs();
                }
            } else {
                LLIIJI = C16880lQ.LLIIJLIL(application);
            }
        }
        String LJFF = i0.LJFF(LLIIJI.getPath(), "/data_middleware_v3/tracking/");
        File file = new File(LJFF);
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return LJFF;
    }

    public static ISA LIZIZ() {
        if (LIZIZ == null) {
            synchronized (LIZ) {
                if (LIZIZ == null) {
                    LIZIZ = ISZ.LIZJ(LIZ());
                    C46982IcE.LIZ.registerActivityLifecycleCallbacks(new ISU());
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZJ() {
        String str;
        if (!IZ8.LJIJ()) {
            return;
        }
        Iterator<String> it = LIZJ.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                str = it.next();
                if (!TextUtils.isEmpty(str)) {
                    String str2 = LIZJ.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        ((ISZ) LIZIZ()).LJ(ISQ.VIDEO_REQUEST, str, str2);
                        break;
                    }
                }
            } else {
                str = null;
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            LIZJ.remove(str);
        }
    }
}
