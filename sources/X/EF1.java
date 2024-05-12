package X;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EF1 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(EFF.LJLIL);

    static {
        C221108m2.LIZIZ(EFE.LJLIL);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.HashMap] */
    public static void LIZIZ(Application app) {
        InterfaceC36091EEl c36099EEt;
        o.LJIIIZ(app, "app");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new HashMap();
        String packageName = app.getPackageName();
        java.util.Map map = (java.util.Map) c68322mC.element;
        o.LJIIIIZZ(packageName, "packageName");
        map.put(packageName, 1);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":push"), 2);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":pushservice"), 32);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":ttplayer"), 64);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":miniapp0"), 16);
        java.util.Map map2 = (java.util.Map) c68322mC.element;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(packageName);
        LIZ2.append(":miniapp1");
        map2.put(X1D.LIZIZ(LIZ2), 16);
        java.util.Map map3 = (java.util.Map) c68322mC.element;
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(packageName);
        LIZ3.append(":miniapp2");
        map3.put(X1D.LIZIZ(LIZ3), 16);
        java.util.Map map4 = (java.util.Map) c68322mC.element;
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(packageName);
        LIZ4.append(":miniapp3");
        map4.put(X1D.LIZIZ(LIZ4), 16);
        java.util.Map map5 = (java.util.Map) c68322mC.element;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(packageName);
        LIZ5.append(":miniapp4");
        map5.put(X1D.LIZIZ(LIZ5), 16);
        java.util.Map map6 = (java.util.Map) c68322mC.element;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append(packageName);
        LIZ6.append(":miniapp100");
        map6.put(X1D.LIZIZ(LIZ6), 16);
        java.util.Map map7 = (java.util.Map) c68322mC.element;
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append(packageName);
        LIZ7.append(":miniapp200");
        map7.put(X1D.LIZIZ(LIZ7), 16);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":error_activity"), 256);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":safemode"), 128);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":wallpaper"), 1024);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":bm"), 512);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":boost_multidex"), 2048);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":downloader"), 4);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":playcore_missing_splits_activity"), 131072);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":feedbacker"), 262144);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":dfmock"), 524288);
        ((java.util.Map) c68322mC.element).put(i0.LJFF(packageName, ":widgetProvider"), 1048576);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        sparseBooleanArray.put(16, true);
        sparseBooleanArray.put(8, true);
        C36093EEn c36093EEn = C36093EEn.LIZ;
        EF4 ef4 = new EF4(app, sparseBooleanArray, c68322mC);
        c36093EEn.getClass();
        C36093EEn.LJFF = app;
        C36093EEn.LJII = ef4;
        Context context = C36093EEn.LJFF;
        if (context != null) {
            String LIZ8 = C36839Ed1.LIZ(context);
            EEX eex = C36093EEn.LJIIJJI;
            if (eex != null) {
                eex.LIZ(EEV.COLD_BOOT_BEGIN);
            }
            EEQ.LIZIZ = Integer.valueOf(new EF3(app, sparseBooleanArray, c68322mC).LIZ());
            for (EnumC36103EEx type : EnumC36103EEx.values()) {
                o.LJIIIZ(type, "type");
                switch (C36104EEy.LIZ[type.ordinal()]) {
                    case 1:
                        c36099EEt = new C36099EEt();
                        break;
                    case 2:
                        c36099EEt = new EEB();
                        break;
                    case 3:
                        c36099EEt = new C36079EDz();
                        break;
                    case 4:
                        c36099EEt = new EE0();
                        break;
                    case 5:
                        c36099EEt = new C36075EDv();
                        break;
                    case 6:
                        c36099EEt = new EE6();
                        break;
                    case 7:
                        c36099EEt = new C36077EDx();
                        break;
                    case 8:
                        c36099EEt = new EFP();
                        break;
                    case 9:
                        c36099EEt = new EFO();
                        break;
                    case 10:
                        c36099EEt = new EFQ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        c36099EEt = new EFR();
                        break;
                    case 12:
                        c36099EEt = new EEJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        c36099EEt = new EEL();
                        break;
                    case 14:
                        c36099EEt = new EEK();
                        break;
                    case 15:
                        c36099EEt = new EER();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        c36099EEt = new EEI();
                        break;
                    case 17:
                        c36099EEt = new EET();
                        break;
                    default:
                        throw new IllegalArgumentException("uncorrect trigger type, please check");
                }
                C36093EEn.LJIILJJIL.put(type, c36099EEt);
                C36093EEn.LJIILL.put(Integer.valueOf(type.ordinal()), c36099EEt);
            }
            if (!ef4.LIZ()) {
                EEW.LIZ.LIZIZ(1205, LivePlayEnforceIntervalSetting.DEFAULT);
            }
            EEW eew = EEW.LIZ;
            Context context2 = C36093EEn.LJFF;
            if (context2 != null) {
                eew.getClass();
                ((Application) context2).registerActivityLifecycleCallbacks(new C36097EEr());
                EE9 ee9 = C36093EEn.LIZIZ;
                Context context3 = C36093EEn.LJFF;
                if (context3 != null) {
                    ee9.getClass();
                    ee9.LIZ = context3;
                    for (EFK efk : EFK.values()) {
                        ((ConcurrentHashMap) ee9.LIZIZ).put(efk, new ArrayList());
                        ((ConcurrentHashMap) ee9.LIZJ).put(efk, new ArrayList());
                    }
                    EFL efl = C36093EEn.LIZJ;
                    Context context4 = C36093EEn.LJFF;
                    if (context4 != null) {
                        efl.getClass();
                        efl.LIZ = context4;
                        for (EFN efn : EFN.values()) {
                            ((HashMap) efl.LIZIZ).put(efn, new ArrayList());
                        }
                        EEM eem = C36093EEn.LIZLLL;
                        Context context5 = C36093EEn.LJFF;
                        if (context5 != null) {
                            eem.getClass();
                            eem.LIZ = context5;
                            for (EFK efk2 : EFK.values()) {
                                ((HashMap) eem.LIZLLL).put(efk2, new ArrayList());
                            }
                            C36098EEs c36098EEs = C36093EEn.LJ;
                            Context context6 = C36093EEn.LJFF;
                            if (context6 != null) {
                                c36098EEs.getClass();
                                c36098EEs.LIZ = context6;
                                ((Application) context6).registerActivityLifecycleCallbacks(new C36102EEw(c36098EEs));
                                if (new EF3(ef4.LIZ, ef4.LIZJ, ef4.LIZIZ).LIZIZ() == EFC.WILD) {
                                    new EFB();
                                    EFB.LIZ(new EFD(0, "unexpected process init.process name " + LIZ8));
                                    EEQ.LIZ = true;
                                }
                                if (new EF3(ef4.LIZ, ef4.LIZJ, ef4.LIZIZ).LIZIZ() == EFC.PRISON) {
                                    new EFB();
                                    EFB.LIZ(new EFD(1, "prison process init.process name " + LIZ8));
                                }
                                C36093EEn.LJIIL = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_opt_lego_schedule", 2);
                                C36093EEn.LJIILIIL = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_opt_lego_add_v2", 0);
                                EED.LIZJ = C34521Dgj.LIZ;
                                EED.LIZLLL = C34521Dgj.LIZIZ;
                                EEH eeh = new EEH();
                                ((ArrayList) eeh.LIZ).add(new EFX(new EHU()));
                                if (((Boolean) C33857DQn.LIZLLL.getValue()).booleanValue()) {
                                    ((ArrayList) eeh.LIZ).add(new C35569Dxd());
                                }
                                C36093EEn.LIZ.getClass();
                                C36093EEn.LJI = eeh;
                                C36093EEn.LJIIJJI = new EF8(app);
                                return;
                            }
                            o.LJIJI("context");
                            throw null;
                        }
                        o.LJIJI("context");
                        throw null;
                    }
                    o.LJIJI("context");
                    throw null;
                }
                o.LJIJI("context");
                throw null;
            }
            o.LJIJI("context");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }

    public static void LIZ(Application app, AppBuildConfig buildConfig) {
        String str;
        long j;
        PackageInfo LLLLLLZ;
        o.LJIIIZ(app, "app");
        o.LJIIIZ(buildConfig, "buildConfig");
        AqS172S0100000_6 aqS172S0100000_6 = new AqS172S0100000_6(buildConfig, 86);
        EF9 ef9 = new EF9();
        ef9.LIZ = app;
        aqS172S0100000_6.invoke(ef9);
        Application application = ef9.LIZ;
        if (application != null) {
            EF7.LIZ = application;
            EF7.LIZIZ = ef9.LIZJ;
            String str2 = ef9.LIZLLL;
            if (str2 != null) {
                EF7.LIZJ = str2;
                if (ef9.LJFF != null) {
                    long j2 = ef9.LJI;
                    String str3 = ef9.LJ;
                    if (str3 != null) {
                        EF7.LIZLLL = new EF5(j2, str3);
                        if (ef9.LJII != null) {
                            EF7.LJII = ef9.LJIIJ;
                            EF7.LJIIIIZZ = ef9.LJIIJJI;
                            EF7.LJIIIZ = ef9.LJIIIIZZ;
                            EF7.LJIILLIIL = ef9.LJIIIZ;
                            EF5 ef5 = EF7.LIZLLL;
                            if (ef5 != null) {
                                long j3 = -1;
                                if (TextUtils.isEmpty(ef5.LIZIZ) || ef5.LIZ == 0 || ef5.LIZ == -1) {
                                    Application application2 = EF7.LIZ;
                                    if (application2 != null) {
                                        try {
                                            LLLLLLZ = C16880lQ.LLLLLLZ(application2.getPackageManager(), application2.getPackageName(), 0);
                                        } catch (Exception e) {
                                            C16880lQ.LLLLIIL(e);
                                        }
                                        if (LLLLLLZ != null) {
                                            str = LLLLLLZ.versionName;
                                            o.LJIIIIZZ(str, "packageInfo.versionName");
                                            j = LLLLLLZ.versionCode;
                                            EF7.LIZLLL = new EF5(j, str);
                                        }
                                        str = "";
                                        j = -1;
                                        EF7.LIZLLL = new EF5(j, str);
                                    } else {
                                        o.LJIJI("context");
                                        throw null;
                                    }
                                }
                                Application application3 = EF7.LIZ;
                                if (application3 != null) {
                                    String LJII = EF7.LJII();
                                    long LJI = EF7.LJI();
                                    try {
                                        LJII = String.valueOf((String) A9Y.LIZ(application3, "SS_VERSION_NAME"));
                                    } catch (Throwable unused) {
                                    }
                                    try {
                                        Object LIZ2 = A9Y.LIZ(application3, "SS_VERSION_CODE");
                                        o.LJII(LIZ2, "null cannot be cast to non-null type kotlin.Int");
                                        LJI = ((Integer) LIZ2).intValue();
                                    } catch (Throwable unused2) {
                                    }
                                    try {
                                        Object LIZ3 = A9Y.LIZ(application3, "UPDATE_VERSION_CODE");
                                        o.LJII(LIZ3, "null cannot be cast to non-null type kotlin.Int");
                                        j3 = ((Integer) LIZ3).intValue();
                                    } catch (Throwable unused3) {
                                    }
                                    EF7.LJ = new EF6(LJI, LJII, j3);
                                    Application application4 = EF7.LIZ;
                                    if (application4 != null) {
                                        String LJIJJ = C17N.LJIJJ(application4, "meta_channel");
                                        if (LJIJJ != null && LJIJJ.length() > 0) {
                                            EF7.LJIILIIL = LJIJJ;
                                            EF7.LJIILJJIL = LJIJJ;
                                        }
                                        Application application5 = EF7.LIZ;
                                        if (application5 != null) {
                                            String LJIJJ2 = C17N.LJIJJ(application5, "GIT_BRANCH");
                                            if (LJIJJ2 != null) {
                                                EF7.LJIIJ = LJIJJ2;
                                            }
                                            Application application6 = EF7.LIZ;
                                            if (application6 != null) {
                                                String LJIJJ3 = C17N.LJIJJ(application6, "GIT_SHA");
                                                if (LJIJJ3 != null) {
                                                    EF7.LJIIJJI = LJIJJ3;
                                                }
                                                Application application7 = EF7.LIZ;
                                                if (application7 != null) {
                                                    C17N.LJIJJ(application7, "GIT_USERNAME");
                                                    Application application8 = EF7.LIZ;
                                                    if (application8 != null) {
                                                        C17N.LJIJJ(application8, "GIT_USER_EMAIL");
                                                        Application application9 = EF7.LIZ;
                                                        if (application9 != null) {
                                                            String LJIJJ4 = C17N.LJIJJ(application9, "release_build");
                                                            if (LJIJJ4 != null) {
                                                                EF7.LJFF = LJIJJ4;
                                                            }
                                                            Application application10 = EF7.LIZ;
                                                            if (application10 != null) {
                                                                String LJIJJ5 = C17N.LJIJJ(application10, "BITS_MR_ID");
                                                                if (LJIJJ5 != null) {
                                                                    EF7.LJIIL = LJIJJ5;
                                                                }
                                                                Application application11 = ef9.LIZ;
                                                                if (application11 != null) {
                                                                    application11.registerActivityLifecycleCallbacks(new C84764XOm(application11));
                                                                    C84763XOl.LJIIZILJ = ef9.LIZIZ;
                                                                    return;
                                                                } else {
                                                                    o.LJIJI("context");
                                                                    throw null;
                                                                }
                                                            }
                                                            o.LJIJI("context");
                                                            throw null;
                                                        }
                                                        o.LJIJI("context");
                                                        throw null;
                                                    }
                                                    o.LJIJI("context");
                                                    throw null;
                                                }
                                                o.LJIJI("context");
                                                throw null;
                                            }
                                            o.LJIJI("context");
                                            throw null;
                                        }
                                        o.LJIJI("context");
                                        throw null;
                                    }
                                    o.LJIJI("context");
                                    throw null;
                                }
                                o.LJIJI("context");
                                throw null;
                            }
                            o.LJIJI("versionInfo");
                            throw null;
                        }
                        o.LJIJI("feedbackAppKey");
                        throw null;
                    }
                    o.LJIJI("versionName");
                    throw null;
                }
                o.LJIJI("flavor");
                throw null;
            }
            o.LJIJI("appName");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }
}
