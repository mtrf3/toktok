package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.0S3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0S3 {
    public static C0S2 LIZ = C0S2.UNINITED;

    public static C0S2 LIZIZ() {
        C0S2 c0s2;
        if (LIZ != C0S2.UNINITED) {
            return LIZ;
        }
        String LIZ2 = C0YP.LIZ("ro.hardware");
        if (LIZ2 == null) {
            c0s2 = C0S2.UNKNOWN;
        } else {
            if (!LIZ2.startsWith("qcom") && !LIZ2.startsWith("msm") && !LIZ2.startsWith("qsc") && !LIZ2.startsWith("sdm")) {
                if (LIZ2.startsWith("mt")) {
                    c0s2 = C0S2.MTK;
                } else if (LIZ2.startsWith("kirin") || LIZ2.startsWith("hi")) {
                    c0s2 = C0S2.CHRY;
                } else {
                    String LIZ3 = C0YP.LIZ("ro.hardware.egl");
                    if (LIZ3 == null || !LIZ3.toLowerCase().equals("adreno")) {
                        C0YN.LIZ(5);
                        c0s2 = C0S2.UNKNOWN;
                    }
                }
            }
            c0s2 = C0S2.QCOM;
        }
        LIZ = c0s2;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("hardware platform type: ");
        LIZ4.append(c0s2);
        X1D.LIZIZ(LIZ4);
        C0YN.LIZ(3);
        return c0s2;
    }

    public static int LIZ(int i) {
        String LIZIZ = C0NY.LIZIZ("/sys/devices/system/cpu/cpu", i, "/cpufreq/cpuinfo_max_freq");
        if (LIZIZ != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(LIZIZ, "r");
                String readLine = randomAccessFile.readLine();
                randomAccessFile.close();
                return CastIntegerProtector.parseInt(readLine);
            } catch (IOException | NumberFormatException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return -1;
    }
}
