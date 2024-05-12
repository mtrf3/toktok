package Y;

import X.C198517qh;
import X.C39579Fg7;
import X.C66580QBc;
import X.EYD;
import X.FUA;
import com.bytedance.common.jato.gfx.GLESInitBoost;
import com.bytedance.common.jato.logcut.LogCut;
import com.bytedance.crash.Npth;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.io.File;

/* loaded from: classes7.dex */
public class ARunnableS1S0010000_6 implements Runnable {
    public final int $t;
    public boolean z0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        File[] listFiles;
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("force", Boolean.FALSE);
        FUA.LIZJ("aweme_clean_cached_files", c198517qh.LJ());
        boolean z = this.z0;
        if (C66580QBc.LIZ) {
            return;
        }
        try {
            str = AVExternalServiceImpl.LIZ().configService().cacheConfig().rootDir();
        } catch (Exception unused) {
            str = "";
        }
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        if (!z && C39579Fg7.LJIIIIZZ(str) < 52428800) {
            return;
        }
        C66580QBc.LIZ = true;
        C66580QBc.LJJIFFI(listFiles, C66580QBc.LJIIL());
        C66580QBc.LIZ = false;
    }

    public ARunnableS1S0010000_6(int i) {
        this.$t = i;
        this.z0 = true;
    }

    public static final void run$0(ARunnableS1S0010000_6 aRunnableS1S0010000_6) {
        boolean LIZ;
        try {
            GLESInitBoost.LIZ(aRunnableS1S0010000_6.z0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0010000_6 aRunnableS1S0010000_6) {
        boolean LIZ;
        try {
            aRunnableS1S0010000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S0010000_6 aRunnableS1S0010000_6) {
        boolean LIZ;
        try {
            if (!aRunnableS1S0010000_6.z0) {
                LogCut.logCutStop();
                Npth.addTag("has_native_log", "true");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S0010000_6 aRunnableS1S0010000_6) {
        boolean LIZ;
        try {
            EYD.LIZ(aRunnableS1S0010000_6.z0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S0010000_6(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
