package X;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.util.NativeTools;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PK3 {
    public final Context LIZ;
    public final boolean LIZIZ;

    public PK3(Context context, boolean z) {
        this.LIZ = context;
        this.LIZIZ = z;
    }

    public final void LIZ(long j, Thread thread, Throwable th, String str, String str2, boolean z) {
        int i;
        CrashType crashType;
        String LJI;
        int i2;
        File file = new File(C78596Usy.LJIJJLI(this.LIZ), str);
        file.mkdirs();
        File file2 = new File(file, "lock");
        try {
            file2.createNewFile();
            i = NativeTools.LJIILJJIL().LJJIIZI(file2.getAbsolutePath());
        } catch (Throwable th2) {
            PJZ.LIZ.getClass();
            PJY.LIZ("NPTH_CATCH", th2);
            i = -1;
        }
        PKN LIZIZ = C64268PKe.LIZLLL().LIZIZ(CrashType.JAVA, null, new PKJ(PKW.LJI(th), th, j, str2, z, thread, str, file, this.LIZIZ), true);
        if (i > 0) {
            NativeTools.LJIILJJIL().LJJIJL(i);
        }
        if (FPX.LIZJ() || (i2 = FPX.LIZ) == 24 || i2 == 23) {
            LIZIZ.LJFF("no_space", "direct");
            int i3 = FPX.LIZ;
            if (i3 == 24 || i3 == 23) {
                LIZIZ.LJFF("fd_leak", "true");
            }
            JSONObject jSONObject = LIZIZ.LIZ;
            try {
                jSONObject = PKL.LJIILJJIL(str, jSONObject, PK0.LIZJ(), this.LIZIZ);
            } catch (JSONException unused) {
            }
            File LJIJ = C78596Usy.LJIJ(this.LIZ);
            File file3 = new File(LJIJ, "os_memory.txt");
            Pair<Long, Long> LIZLLL = C64265PKb.LIZLLL(file3, null);
            if (LIZLLL != null) {
                C64265PKb.LIZ(jSONObject, ((Long) LIZLLL.first).longValue(), ((Long) LIZLLL.second).longValue());
            }
            if (!PJA.LJFF()) {
                PK8.LIZJ(file3);
            }
            C78857UxB.LJIL(jSONObject, LJIJ);
            if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    new PthreadThread(new RunnableC64253PJp(this, jSONObject, LJIJ, file, countDownLatch), "ava/JavaCrash").start();
                    countDownLatch.await(5L, TimeUnit.SECONDS);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            }
            if (this.LIZIZ) {
                crashType = CrashType.LAUNCH;
            } else {
                crashType = CrashType.JAVA;
            }
            String name = crashType.getName();
            if (this.LIZIZ) {
                LJI = PK0.LJIIIIZZ.getLaunchCrashUploadUrl();
            } else {
                LJI = C63986P9i.LJI();
            }
            if (C63986P9i.LJIIJ(name, C63986P9i.LJFF(LJI, jSONObject.optJSONObject("header")), jSONObject.toString(), null, new PK7(new File[]{LJIJ}, true)).LIZ()) {
                PK8.LIZJ(file);
            }
        }
    }
}
