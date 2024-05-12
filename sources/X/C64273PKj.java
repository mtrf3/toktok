package X;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;

/* renamed from: X.PKj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64273PKj {
    public final long LIZ;
    public final String LIZIZ;
    public final ArrayList<PLW> LIZJ = new ArrayList<>();
    public final long LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final String LJI;
    public final String LJII;
    public final File LJIIIIZZ;

    public C64273PKj(long j, File file, File file2) {
        this.LJII = null;
        this.LIZ = j;
        this.LJIIIIZZ = file;
        JSONArray LJII = PK8.LJII(file2, -1L);
        for (int i = 0; i < LJII.length(); i++) {
            String optString = LJII.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split("\\s+");
                if (split.length == 4) {
                    PLW plw = new PLW();
                    this.LIZJ.add(plw);
                    plw.LIZ = PKQ.LIZJ(-1L, split[0]);
                    plw.LIZIZ = PKQ.LIZJ(-1L, split[1]);
                    plw.LIZJ = PKQ.LIZJ(-1L, split[2]);
                    String str = split[3];
                    plw.LIZLLL = str;
                    if (i == 0 || C64264PKa.LJIIIIZZ(PK0.LIZ, str)) {
                        if (C64264PKa.LJIIIIZZ(PK0.LIZ, str)) {
                            this.LIZIZ = str;
                        }
                        this.LIZLLL = plw.LIZ;
                        this.LJ = plw.LIZIZ;
                        this.LJFF = plw.LIZJ;
                        this.LJI = plw.LIZLLL;
                    }
                }
            }
        }
        if (file != null) {
            if (new File(file, "hasJavaCrash").exists()) {
                this.LJII = "java";
            }
            if (new File(file, "hasNativeCrash").exists()) {
                String str2 = "native";
                if (this.LJII != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    str2 = JBR.LJFF(LIZ, this.LJII, "native", LIZ);
                }
                this.LJII = str2;
            }
            if (new File(file, "hashAnrCrash").exists()) {
                this.LJII = "anr";
            }
        }
    }
}
