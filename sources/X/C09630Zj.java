package X;

import Y.IDRunnableS29S0200000;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;

/* renamed from: X.0Zj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C09630Zj {
    public static void LIZ() {
        File file = new File(C09640Zk.LIZIZ);
        if (file.exists()) {
            C16880lQ.LLLZZIL(file);
        }
        File file2 = new File(C09640Zk.LIZ);
        if (file2.exists()) {
            C16880lQ.LLLZZIL(file2);
        }
    }

    public static void LIZIZ(PKN pkn, File file) {
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            new PthreadThread(new IDRunnableS29S0200000(pkn, file, 25), "UploadManager$UploadUtils").start();
        } else {
            if (C63986P9i.LJIIIZ(PK0.LJIIIIZZ.getNativeCrashUploadUrl(), pkn.LIZ.toString(), file).LIZ != 0) {
                return;
            }
            LIZ();
        }
    }
}
