package X;

import android.app.Application;
import android.content.Context;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EF7 {
    public static volatile Application LIZ;
    public static volatile Integer LIZIZ;
    public static volatile String LIZJ;
    public static volatile EF5 LIZLLL;
    public static volatile EF6 LJ;
    public static volatile String LJFF;
    public static volatile EFG LJI;
    public static volatile int LJII;
    public static volatile boolean LJIIIIZZ;
    public static volatile int LJIIIZ;
    public static volatile String LJIIJ;
    public static volatile String LJIIJJI;
    public static volatile String LJIIL;
    public static volatile String LJIILIIL;
    public static volatile String LJIILJJIL;
    public static volatile int LJIILL;
    public static boolean LJIILLIIL;

    static {
        C221108m2.LIZIZ(EFA.LJLIL);
        LJI = new EFG();
        LJII = 2;
        LJIIIZ = -1;
        LJIIJ = "";
        LJIIJJI = "";
        LJIIL = "";
        LJIILIIL = "unknown";
        LJIILL = -1;
    }

    public static String LIZ() {
        String str = LIZJ;
        if (str != null) {
            return str;
        }
        o.LJIJI("appName");
        throw null;
    }

    public static Context LIZIZ() {
        try {
            Application application = LIZ;
            if (application == null) {
                o.LJIJI("context");
                throw null;
            }
            return application;
        } catch (Throwable unused) {
            AwemeHostApplication LIZ2 = FKM.LIZ();
            o.LJI(LIZ2);
            return LIZ2;
        }
    }

    public static long LIZJ() {
        EF6 ef6 = LJ;
        if (ef6 != null) {
            return ef6.LIZ;
        }
        o.LJIJI("bussinessVersionInfo");
        throw null;
    }

    public static String LIZLLL() {
        EF6 ef6 = LJ;
        if (ef6 != null) {
            return ef6.LIZIZ;
        }
        o.LJIJI("bussinessVersionInfo");
        throw null;
    }

    public static String LJ() {
        String str = LJFF;
        if (str != null) {
            return str;
        }
        o.LJIJI("releaseBuild");
        throw null;
    }

    public static long LJFF() {
        EF6 ef6 = LJ;
        if (ef6 != null) {
            return ef6.LIZJ;
        }
        o.LJIJI("bussinessVersionInfo");
        throw null;
    }

    public static long LJI() {
        EF5 ef5 = LIZLLL;
        if (ef5 != null) {
            return ef5.LIZ;
        }
        o.LJIJI("versionInfo");
        throw null;
    }

    public static String LJII() {
        EF5 ef5 = LIZLLL;
        if (ef5 != null) {
            return ef5.LIZIZ;
        }
        o.LJIJI("versionInfo");
        throw null;
    }

    public static boolean LJIIIIZZ() {
        if (LJII == 5) {
            return true;
        }
        return false;
    }

    public static final void LJIIIZ() {
        EFG efg = LJI;
        efg.LIZ = "api-va.tiktokv.com";
        efg.LIZJ = "ichannel-va.tiktokv.com";
        efg.LIZIZ = "api-va.tiktokv.com";
        efg.LIZLLL = "widget-va.tiktokv.com";
    }
}
