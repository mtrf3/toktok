package X;

import Y.AgS48S1100000_6;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.EfU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36992EfU {
    public static final C36992EfU LIZ = new C36992EfU();
    public static final ExecutorService LIZIZ = C16880lQ.LLLLZLLIL();
    public static String LIZJ;
    public static boolean LIZLLL;
    public static C36780Ec4 LJ;
    public static C36991EfT LJFF;

    public static String LIZ() {
        boolean z;
        BufferedReader bufferedReader;
        String LIZJ2 = O3U.LIZJ(C38943FQd.LIZ(), "gecko_hybrid_prefetch_config");
        if (TextUtils.isEmpty(LIZJ2)) {
            return null;
        }
        File file = new File(LIZJ2);
        if (file.exists() && file.listFiles() != null) {
            File[] listFiles = file.listFiles();
            o.LJIIIIZZ(listFiles, "dir.listFiles()");
            if (listFiles.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                File[] listFiles2 = file.listFiles();
                o.LJIIIIZZ(listFiles2, "dir.listFiles()");
                for (File file2 : listFiles2) {
                    if (ujb.o.LJJJJIZL("prefetch.json", file2.getName(), true)) {
                        try {
                            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file2.getAbsolutePath()), PVC.LIZ);
                            if (inputStreamReader instanceof BufferedReader) {
                                bufferedReader = (BufferedReader) inputStreamReader;
                            } else {
                                bufferedReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
                            }
                            try {
                                String LJIILJJIL = C77321UWf.LJIILJJIL(bufferedReader);
                                AnonymousClass636.LJFF(bufferedReader, null);
                                LIZJ = LJIILJJIL;
                                return LJIILJJIL;
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } catch (Exception e) {
                            C36922EeM.LJFF(e);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static void LIZIZ(C38113ExZ bridge, String str) {
        try {
            LJ = C36780Ec4.LJLIL;
            C36991EfT c36991EfT = LJFF;
            if (c36991EfT != null) {
                o.LJIIJ(bridge, "bridge");
                bridge.LIZJ(c36991EfT.LIZLLL, new C36995EfX(c36991EfT));
            }
            C36991EfT c36991EfT2 = LJFF;
            if (c36991EfT2 != null) {
                c36991EfT2.LIZJ(str);
            }
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
    }

    public static void LIZJ(C38113ExZ c38113ExZ, String str) {
        if (c38113ExZ == null || str == null || c38113ExZ.LJFF) {
            return;
        }
        if (LIZLLL) {
            LIZIZ(c38113ExZ, str);
        } else {
            C10K.LIZJ(CallableC36993EfV.LJLIL).LJ(new AgS48S1100000_6(c38113ExZ, str, 1), C10K.LJIIIIZZ, null);
        }
    }
}
