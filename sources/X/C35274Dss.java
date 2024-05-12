package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import kotlin.jvm.internal.o;

/* renamed from: X.Dss, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35274Dss {
    public static final Keva LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;
    public static final C62822Ol8 LJI;
    public static final C62822Ol8 LJII;
    public static final C62822Ol8 LJIIIIZZ;
    public static final C62822Ol8 LJIIIZ;
    public static final C62822Ol8 LJIIJ;
    public static final C62822Ol8 LJIIJJI;
    public static final C62822Ol8 LJIIL;
    public static final C62822Ol8 LJIILIIL;
    public static final C62822Ol8 LJIILJJIL;
    public static final C62822Ol8 LJIILL;
    public static final C62822Ol8 LJIILLIIL;
    public static final C62822Ol8 LJIIZILJ;
    public static final C62822Ol8 LJIJ;
    public static final C62822Ol8 LJIJI;
    public static final C62822Ol8 LJIJJ;
    public static final C62822Ol8 LJIJJLI;
    public static final C62822Ol8 LJIL;
    public static final C62822Ol8 LJJ;
    public static final C62822Ol8 LJJI;
    public static final C62822Ol8 LJJIFFI;

    static {
        Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
        o.LJIIIIZZ(repo, "getRepo(\"ab_repo_cold_boot\")");
        LIZ = repo;
        LIZIZ = C221108m2.LIZIZ(C35205Drl.LJLIL);
        LIZJ = C221108m2.LIZIZ(C35258Dsc.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C35265Dsj.LJLIL);
        LJ = C221108m2.LIZIZ(C35256Dsa.LJLIL);
        LJFF = C221108m2.LIZIZ(C35266Dsk.LJLIL);
        LJI = C221108m2.LIZIZ(C35267Dsl.LJLIL);
        LJII = C221108m2.LIZIZ(C35271Dsp.LJLIL);
        LJIIIIZZ = C221108m2.LIZIZ(C35269Dsn.LJLIL);
        LJIIIZ = C221108m2.LIZIZ(C35270Dso.LJLIL);
        LJIIJ = C221108m2.LIZIZ(C35272Dsq.LJLIL);
        LJIIJJI = C221108m2.LIZIZ(C35268Dsm.LJLIL);
        LJIIL = C221108m2.LIZIZ(C35279Dsx.LJLIL);
        LJIILIIL = C221108m2.LIZIZ(C35280Dsy.LJLIL);
        LJIILJJIL = C221108m2.LIZIZ(C35282Dt0.LJLIL);
        LJIILL = C221108m2.LIZIZ(C35277Dsv.LJLIL);
        LJIILLIIL = C221108m2.LIZIZ(C35278Dsw.LJLIL);
        LJIIZILJ = C221108m2.LIZIZ(C35281Dsz.LJLIL);
        LJIJ = C221108m2.LIZIZ(C35203Drj.LJLIL);
        LJIJI = C221108m2.LIZIZ(C35202Dri.LJLIL);
        LJIJJ = C221108m2.LIZIZ(C35204Drk.LJLIL);
        LJIJJLI = C221108m2.LIZIZ(C35284Dt2.LJLIL);
        LJIL = C221108m2.LIZIZ(C35283Dt1.LJLIL);
        LJJ = C221108m2.LIZIZ(C35275Dst.LJLIL);
        LJJI = C221108m2.LIZIZ(C35276Dsu.LJLIL);
        LJJIFFI = C221108m2.LIZIZ(C35273Dsr.LJLIL);
    }

    public static int LIZ() {
        return ((Number) LJIJJ.getValue()).intValue();
    }

    public static void LIZIZ() {
        Keva keva = LIZ;
        FFL.LJIIIZ().getClass();
        keva.storeInt("optimize_preloadmainbackground", FFL.LJIIJ(31744, 0, "optimize_preloadmainbackground", true));
        keva.storeBoolean("optimize_preloadsubdecor", C35259Dsd.LIZ);
        keva.storeBoolean("optimize_boostmainthread_v3", ((Boolean) C35287Dt5.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_ttspeeder", C35257Dsb.LIZ);
        keva.storeBoolean("optimize_speedactivity", ((Boolean) C35319Dtb.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_speeddelegatehandler", ((Boolean) C35323Dtf.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_focuslivedns", ((Boolean) C35305DtN.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_focusfirbase", ((Boolean) C35297DtF.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_focushookwebview", ((Boolean) C35301DtJ.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_focusprioritized", ((Boolean) C35307DtP.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_focusfeed", ((Boolean) C35293DtB.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_preinitpush", ((Boolean) C35289Dt7.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_preinituitask", ((Boolean) C35291Dt9.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_runfocustasks", ((Boolean) C35315DtX.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_preinitav", ((Boolean) C35317DtZ.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_preinitassem", ((Boolean) C35321Dtd.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_createtask_v2", ((Boolean) C35309DtR.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_preinituser", ((Boolean) C35295DtD.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_preinitstatisticlogger_v2", ((Boolean) C34241DcD.LIZ.getValue()).booleanValue());
        FFL.LJIIIZ().getClass();
        keva.storeInt("optimize_controlbackgroundtask", FFL.LJIIJ(31744, -1, "optimize_controlbackgroundtask", true));
        keva.storeBoolean("optimize_ugio", ((Boolean) C35303DtL.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_ucio", ((Boolean) C35299DtH.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_jatoio", ((Boolean) C35311DtT.LIZ.getValue()).booleanValue());
        keva.storeBoolean("optimize_kevapreloadio", ((Boolean) C35313DtV.LIZ.getValue()).booleanValue());
        keva.storeBoolean("olduser_message_statistics_switch", ((Boolean) C35285Dt3.LIZ.getValue()).booleanValue());
    }
}
