package X;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Iny, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47710Iny {
    public long LIZ;
    public long LIZIZ;
    public final ReentrantLock LIZJ = new ReentrantLock();
    public final HashMap<String, C47726IoE> LIZLLL = new HashMap<>();

    public final void LIZIZ(String str) {
        C47726IoE c47726IoE = this.LIZLLL.get(str);
        if (c47726IoE == null) {
            return;
        }
        if (c47726IoE.LIZ > this.LIZIZ && !c47726IoE.LJ) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("trigger preload ", str, " playable buffer is: ");
            LIZIZ.append(c47726IoE.LIZ);
            TTVideoEngineLog.d("PreloadUtil", X1D.LIZIZ(LIZIZ));
            DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
            long j = c47726IoE.LIZ;
            C47573Ill c47573Ill = dataLoaderHelper.LIZ;
            if (c47573Ill != null) {
                c47573Ill.LIZJ(9, 0L, j, "");
            }
            c47726IoE.LJ = true;
        }
        if (!c47726IoE.LIZLLL) {
            long j2 = c47726IoE.LIZJ;
            if (j2 <= 0 || c47726IoE.LIZ + c47726IoE.LIZIZ + 1000 < j2) {
                if (c47726IoE.LIZ < this.LIZ) {
                    DataLoaderHelper dataLoaderHelper2 = C47148Ieu.LIZ;
                    long LIZIZ2 = dataLoaderHelper2.LIZLLL.LIZIZ() + dataLoaderHelper2.LJFF.LIZIZ() + dataLoaderHelper2.LJ.LIZIZ();
                    if (c47726IoE.LJ && LIZIZ2 > 0) {
                        LIZ("low_buffer", str);
                        c47726IoE.LJ = false;
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (!c47726IoE.LJ) {
            StringBuilder LIZIZ3 = C25620zW.LIZIZ("cached video trigger preload ", str, " playable buffer is: ");
            LIZIZ3.append(c47726IoE.LIZ);
            TTVideoEngineLog.d("PreloadUtil", X1D.LIZIZ(LIZIZ3));
            DataLoaderHelper dataLoaderHelper3 = C47148Ieu.LIZ;
            long j3 = c47726IoE.LIZ;
            C47573Ill c47573Ill2 = dataLoaderHelper3.LIZ;
            if (c47573Ill2 != null) {
                c47573Ill2.LIZJ(9, 0L, j3, "");
            }
            c47726IoE.LJ = true;
        }
    }

    public static void LIZ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel preload because:");
        LIZ.append(str);
        LIZ.append(" traceId:");
        LIZ.append(str2);
        TTVideoEngineLog.d("PreloadUtil", X1D.LIZIZ(LIZ));
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.LJIJJ();
        C47573Ill c47573Ill = dataLoaderHelper.LIZ;
        if (c47573Ill == null) {
            return;
        }
        c47573Ill.LIZJ(8, 0L, 0L, str);
    }
}
