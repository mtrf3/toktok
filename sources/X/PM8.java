package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.File;
import org.json.JSONArray;

/* loaded from: classes12.dex */
public class PM8 {
    public final File LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;

    public PM8(File file) {
        this.LJ = 1;
        this.LIZ = file;
        try {
            if (file.exists()) {
                JSONArray LJII = PK8.LJII(file, -1L);
                this.LIZIZ = CastIntegerProtector.parseInt(LJII.optString(0));
                this.LIZJ = CastIntegerProtector.parseInt(LJII.optString(1));
                this.LIZLLL = CastIntegerProtector.parseInt(LJII.optString(2));
                this.LJ = CastIntegerProtector.parseInt(LJII.optString(3));
            }
        } catch (Throwable unused) {
        }
    }
}
