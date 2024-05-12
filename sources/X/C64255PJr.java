package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import org.json.JSONObject;

/* renamed from: X.PJr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64255PJr {
    public final long LIZ;
    public long LIZIZ;
    public final File LIZJ;
    public JSONObject LIZLLL;
    public long LJ;

    public final JSONObject LIZ() {
        if (this.LIZLLL == null) {
            try {
                this.LIZLLL = new JSONObject(PK8.LJFF(this.LIZJ.getAbsolutePath()));
            } catch (Throwable unused) {
            }
            if (this.LIZLLL == null) {
                this.LIZLLL = new JSONObject();
            }
        }
        return this.LIZLLL;
    }

    public C64255PJr(File file) {
        this.LIZJ = file;
        String[] split = file.getName().split("-|\\.");
        this.LIZ = CastLongProtector.parseLong(split[0]);
        this.LIZIZ = CastLongProtector.parseLong(split[1]);
    }
}
