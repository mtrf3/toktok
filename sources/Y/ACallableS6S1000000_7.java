package Y;

import X.C0JU;
import X.C163296az;
import X.C188727au;
import X.C1E4;
import X.C44172HVg;
import X.C44687HgJ;
import X.C44694HgQ;
import X.C44890Hja;
import X.C47636Imm;
import X.C5S1;
import X.C61184Nzo;
import X.C76800UCe;
import X.C81995WFz;
import X.EF7;
import X.FMX;
import X.OR7;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS6S1000000_7 implements Callable {
    public final int $t;
    public String s0;

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
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            default:
                return null;
        }
    }

    public ACallableS6S1000000_7(int i) {
        this.$t = i;
        this.s0 = "video_play";
    }

    public static final Object call$0(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        return DetailApi.LIZIZ(aCallableS6S1000000_7.s0, "");
    }

    public static final Object call$1(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        String str;
        if (C47636Imm.LJIIIIZZ(EF7.LIZIZ())) {
            str = "on";
        } else {
            str = "off";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("plugin_type", aCallableS6S1000000_7.s0);
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("earphone_status", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        try {
            if (!TextUtils.isEmpty(aCallableS6S1000000_7.s0)) {
                C44687HgJ.LJIIL(new File(aCallableS6S1000000_7.s0));
                return null;
            }
            return null;
        } catch (Exception unused) {
            C0JU.LIZLLL("delete failed");
            return null;
        }
    }

    public static final Object call$3(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        return new Pair(aCallableS6S1000000_7.s0, null);
    }

    public static final Object call$4(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        return DetailApi.LIZIZ(aCallableS6S1000000_7.s0, "");
    }

    public static final Object call$5(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        C5S1 c5s1 = new C5S1(C44172HVg.LIZ);
        c5s1.LIZLLL(aCallableS6S1000000_7.s0);
        c5s1.LJ();
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        String generatePath = aCallableS6S1000000_7.s0;
        o.LJIIIIZZ(generatePath, "generatePath");
        Context LIZ = C44890Hja.LIZ();
        if (generatePath.length() == 0 || C44890Hja.LIZ || (Build.VERSION.SDK_INT < 29 && C61184Nzo.LIZ.LJFF(LIZ) != 0)) {
            return "";
        }
        String fileName = new File(generatePath).getName();
        File file = new File(C163296az.LIZIZ());
        o.LJIIIIZZ(fileName, "fileName");
        File LLLILZJ = OR7.LLLILZJ(file, fileName);
        File file2 = new File(generatePath);
        if (C44694HgQ.LJJ()) {
            C44694HgQ.LJJI(LIZ, file2.getAbsolutePath(), fileName, true, null, 48);
        } else {
            OR7.LLLIIIL(file2, LLLILZJ, true, 4);
        }
        if (LLLILZJ.exists() && LLLILZJ.length() > 0) {
            C1E4.LJJIIZI(LIZ, LLLILZJ.getPath());
        }
        String absolutePath = LLLILZJ.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "targetFile.absolutePath");
        return absolutePath;
    }

    public static final Object call$7(ACallableS6S1000000_7 aCallableS6S1000000_7) {
        TextUtils.isEmpty(aCallableS6S1000000_7.s0);
        String str = aCallableS6S1000000_7.s0;
        o.LJI(str);
        return C81995WFz.LIZLLL(str);
    }

    public ACallableS6S1000000_7(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
                this.s0 = str;
                return;
            case 1:
            case 3:
            default:
                this.s0 = str;
                return;
        }
    }
}
