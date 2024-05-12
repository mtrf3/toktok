package X;

import android.os.Build;
import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.memory.gcblocker.GcBlocker;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.File;

/* loaded from: classes7.dex */
public final class EG1 {
    public static volatile QXX LIZ;

    public static QXX LIZ() {
        if (LIZ == null) {
            synchronized (EG1.class) {
                if (LIZ == null) {
                    if (!new File("/data/local/tmp/disable-gcblocker").exists() && !EUT.LIZIZ() && !EUT.LIZJ() && JatoXL.getConfig() != null) {
                        if (!C48693J9d.LJFF()) {
                            LIZ = new EG2();
                        } else {
                            if (JatoXL.getConfig().isEnabledDalvikGcBlocker()) {
                                try {
                                    String str = EUT.LIZJ;
                                    if (str != null && str.length() >= 1) {
                                        CastIntegerProtector.parseInt(String.valueOf(str.charAt(0)));
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            if (JatoXL.getConfig().isEnabledArtGcBlocker() && Build.VERSION.SDK_INT >= 24) {
                                LIZ = new GcBlocker(JatoXL.getConfig().getMaxGcBlockTimeout());
                            } else {
                                LIZ = new EG2();
                            }
                        }
                    }
                    LIZ = new EG2();
                }
            }
        }
        return LIZ;
    }
}
