package X;

import android.text.TextUtils;
import java.util.List;

/* loaded from: classes12.dex */
public final class QFC {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public int LJII;
    public int LJIIIIZZ;
    public java.util.Map<String, String> LJIIIZ;
    public QFF LJIIJ = QFF.UNKNOWN;
    public QFP LJIIJJI;
    public List<Integer> LJIIL;

    public QFC(int i, String str, String str2, String str3, int i2, int i3, String str4) {
        if (i > 0 && i2 > 0 && i3 > 0) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                this.LIZ = i;
                this.LIZIZ = i2;
                this.LIZLLL = i3;
                this.LIZJ = str;
                this.LJ = str2;
                this.LJFF = str3;
                this.LJI = str4;
                return;
            }
            throw new IllegalArgumentException("Host, appVersion, appKey and deviceId must not be empty.");
        }
        throw new IllegalArgumentException("Appid, fpid and port must be set greater than 0.");
    }
}
