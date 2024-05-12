package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes12.dex */
public class PL2 {
    public final File LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL;

    public final int LIZ() {
        BufferedReader bufferedReader;
        int i;
        if (!this.LIZ.exists() || !this.LIZ.isFile()) {
            return -1;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.LIZ));
            i = -1;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    int i2 = this.LIZLLL;
                    if (readLine.startsWith(this.LIZIZ)) {
                        try {
                            i2 = CastIntegerProtector.parseInt(readLine.split(this.LIZJ)[1].trim());
                        } catch (NumberFormatException e) {
                            PJZ.LIZ.getClass();
                            PJY.LIZ("NPTH_CATCH", e);
                        }
                        if (i2 < 0) {
                            i = -2;
                            break;
                        }
                    }
                    i = i2;
                    if (i2 != -1) {
                        break;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        PJZ.LIZ.getClass();
                        PJY.LIZ("NPTH_CATCH", th);
                        if (bufferedReader != null) {
                            FPX.LIZIZ(bufferedReader);
                        }
                        return i;
                    } catch (Throwable th2) {
                        if (bufferedReader != null) {
                            FPX.LIZIZ(bufferedReader);
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
            i = -1;
        }
        FPX.LIZIZ(bufferedReader);
        return i;
    }

    public PL2(File file) {
        this.LIZ = file;
    }
}
