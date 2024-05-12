package Y;

import X.C0NB;
import X.C15380j0;
import X.C16880lQ;
import X.C31268COy;
import X.C39579Fg7;
import X.C62011OVj;
import X.EnumC31814CeA;
import X.SurfaceHolderCallbackC62131OZz;
import X.X1D;
import android.content.res.AssetManager;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public class ACallableS108S0100000_5 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS108S0100000_5 aCallableS108S0100000_5) {
        EnumC31814CeA enumC31814CeA = (EnumC31814CeA) aCallableS108S0100000_5.l0;
        enumC31814CeA.getClass();
        C0NB.LIZIZ("LiveCameraResManager", "start load resources");
        AssetManager assets = C15380j0.LIZLLL().getAssets();
        boolean z = true;
        for (String str : EnumC31814CeA.LJLLJ) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(EnumC31814CeA.LJLLLL);
                LIZ.append(File.separator);
                LIZ.append(str);
                EnumC31814CeA.LIZJ(assets, str, X1D.LIZIZ(LIZ));
            } catch (IOException e) {
                ((HashMap) enumC31814CeA.LJLIL).put("copy_res_file_error", e.toString());
                C16880lQ.LLLLIIL(e);
                C0NB.LJI("LiveCameraResManager", e);
                z = false;
            }
        }
        for (String str2 : EnumC31814CeA.LJLLL) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(EnumC31814CeA.LJLLLL);
                LIZ2.append(File.separator);
                LIZ2.append(str2);
                EnumC31814CeA.LIZJ(assets, str2, X1D.LIZIZ(LIZ2));
            } catch (IOException e2) {
                ((HashMap) enumC31814CeA.LJLIL).put("copy_res_file_error", e2.toString());
                C16880lQ.LLLLIIL(e2);
                C0NB.LJI("LiveCameraResManager", e2);
                z = false;
            }
        }
        for (String str3 : EnumC31814CeA.LJLLJ) {
            try {
                EnumC31814CeA.LIZLLL(str3);
            } catch (IOException e3) {
                ((HashMap) enumC31814CeA.LJLIL).put("unzip_res_file_error", e3.toString());
                C16880lQ.LLLLIIL(e3);
                C0NB.LJI("LiveCameraResManager", e3);
                z = false;
            }
        }
        C0NB.LIZIZ("LiveCameraResManager", "finish load resources");
        return Boolean.valueOf(z);
    }

    public static final Object call$1(ACallableS108S0100000_5 aCallableS108S0100000_5) {
        ((LivePerformanceManager) aCallableS108S0100000_5.l0).LJFF("live_pull_sdk_get_data_interval");
        return ((LivePerformanceManager) aCallableS108S0100000_5.l0).LJIILJJIL();
    }

    public static final Object call$2(ACallableS108S0100000_5 aCallableS108S0100000_5) {
        C39579Fg7.LJIL(((LiveWallPaperBean) aCallableS108S0100000_5.l0).getThumbnailPath());
        C39579Fg7.LJIL(((LiveWallPaperBean) aCallableS108S0100000_5.l0).getVideoPath());
        return null;
    }

    public static final Object call$3(ACallableS108S0100000_5 aCallableS108S0100000_5) {
        C39579Fg7.LJIL(C62011OVj.LIZ());
        C39579Fg7.LIZLLL(((C31268COy) aCallableS108S0100000_5.l0).LIZLLL.getVideoPath(), C62011OVj.LIZ());
        return null;
    }

    public static final Object call$4(ACallableS108S0100000_5 aCallableS108S0100000_5) {
        ((SurfaceHolderCallbackC62131OZz) aCallableS108S0100000_5.l0).LIZ();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0030, code lost:
    
        if (r5 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$5(Y.ACallableS108S0100000_5 r6) {
        /*
            java.lang.Object r3 = r6.l0
            X.CdB r3 = (X.C31753CdB) r3
            r3.getClass()
            java.lang.String r4 = ""
            r6 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6a
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6a
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6a
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6a
            r2.<init>(r1)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6a
            r5.<init>(r2)     // Catch: java.io.IOException -> L35 java.lang.Throwable -> L6a
        L1b:
            java.lang.String r1 = r5.readLine()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            if (r1 == 0) goto L32
            java.lang.String r0 = "Hardware"
            boolean r0 = r1.startsWith(r0)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L30
            if (r0 == 0) goto L1b
            r4 = r1
            goto L32
        L2b:
            r0 = move-exception
            r5.close()     // Catch: java.io.IOException -> L6b
            goto L6b
        L30:
            if (r5 == 0) goto L35
        L32:
            r5.close()     // Catch: java.io.IOException -> L35
        L35:
            int r0 = r4.length()
            if (r0 <= 0) goto L4c
            java.lang.String r0 = ":"
            java.lang.String[] r2 = r4.split(r0)
            int r1 = r2.length
            r0 = 2
            if (r1 != r0) goto L4c
            r0 = 1
            r0 = r2[r0]
            java.lang.String r4 = r0.trim()
        L4c:
            X.Usl r2 = X.C78583Usl.LJI()
            Y.ARunnableS6S1100000_5 r1 = new Y.ARunnableS6S1100000_5
            r0 = 1
            r1.<init>(r3, r4, r0)
            boolean r0 = r2.LIZ
            if (r0 == 0) goto L62
            android.os.Handler r0 = r2.LIZJ
            if (r0 == 0) goto L61
            r0.post(r1)
        L61:
            return r6
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "LiveTaskManager: Must call init() before use."
            r1.<init>(r0)
            throw r1
        L6a:
            r0 = move-exception
        L6b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS108S0100000_5.call$5(Y.ACallableS108S0100000_5):java.lang.Object");
    }

    public ACallableS108S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
