package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import java.io.File;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public final class O41 implements Runnable {
    public static final O41 LJLIL = new O41();

    public static void LIZ() {
        Object LIZ;
        try {
            CDNFetcher.Companion.getClass();
            File[] listFiles = O4E.LIZ().listFiles();
            if (listFiles == null) {
                listFiles = new File[0];
            }
            for (File file : listFiles) {
                o.LJFF(file, "file");
                String filename = file.getName();
                o.LJFF(filename, "filename");
                if (s.LJJJLZIJ(filename, "_tmp", false) || (s.LJLJJL(filename, new String[]{"-"}, 0, 6).size() == 3 && !O4W.LIZ.contains(filename))) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("clean file: ");
                    LIZ2.append(filename);
                    C39930Flm.LJI("TTNetDepender", X1D.LIZIZ(LIZ2), false, 4);
                    O4W.LIZ(filename);
                    C16880lQ.LLLZZIL(file);
                }
            }
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            JSONObject jSONObject = new JSONObject();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("clean cdn cache failed: ");
            LIZ3.append(m10exceptionOrNullimpl.getMessage());
            jSONObject.put("error", X1D.LIZIZ(LIZ3));
            jSONObject.put("tag", "TTNetDepender");
            jSONObject.put("type", 2);
            C61288O3o.LIZIZ("", null, jSONObject);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
