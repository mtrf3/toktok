package com.ss.android.ugc.aweme.legoImp.task;

import X.AV1;
import X.C0RN;
import X.C16880lQ;
import X.C188727au;
import X.C1DG;
import X.C34080DZc;
import X.C34509DgX;
import X.C37696Eqq;
import X.C38235EzX;
import X.C38914FPa;
import X.C78983UzD;
import X.EE1;
import X.EF7;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FMX;
import X.FPH;
import X.FPI;
import X.FPJ;
import X.FPK;
import X.FPM;
import X.FPN;
import X.FPQ;
import X.FPT;
import X.JBR;
import X.X1D;
import Y.ARunnableS1S0001000_6;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class ProfileEditorTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "ProfileEditorTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    public static int LIZLLL() {
        boolean z;
        int i;
        BufferedWriter bufferedWriter;
        String str;
        String str2;
        boolean z2 = true;
        if (C1DG.LIZIZ() == 4 || C1DG.LIZIZ() == 3) {
            new FPJ("snapboost_list.txt").LIZIZ();
        }
        if (C1DG.LIZIZ() != 1 && C1DG.LIZIZ() != 2 && C1DG.LIZIZ() != 3 && (C34509DgX.LIZ & 2) != 2) {
            C34080DZc.LIZ.getClass();
            if (!C34080DZc.LIZIZ) {
                return 0;
            }
        }
        FPN fpn = new FPN();
        fpn.LIZ = "tiktok_profile";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("");
        LIZ.append(EF7.LJFF());
        fpn.LIZIZ = X1D.LIZIZ(LIZ);
        if (C1DG.LIZIZ() == 2) {
            z = true;
        } else {
            z = false;
        }
        fpn.LIZJ = z;
        FPK fpk = new FPK();
        List<String> list = null;
        fpk.LJ = null;
        fpk.LIZJ = fpn.LIZ;
        fpk.LIZLLL = fpn.LIZIZ;
        fpk.LJFF = fpn.LIZJ;
        if (C1DG.LIZIZ() == 1 || C1DG.LIZIZ() == 2 || C1DG.LIZIZ() == 3) {
            ((ArrayList) fpk.LJI).add(new FPJ("snapboost_list.txt"));
        }
        if ((C34509DgX.LIZ & 2) == 2) {
            ((ArrayList) fpk.LJI).add(new FPJ("snapboost_list_profile_enter.txt"));
        }
        if ((((Number) FPT.LIZ.getValue()).intValue() & 2) == 2) {
            ((ArrayList) fpk.LJI).add(new FPJ("snapboost_list_detail_enter.txt"));
        }
        C34080DZc.LIZ.getClass();
        if (C34080DZc.LIZIZ) {
            ((ArrayList) fpk.LJI).add(new FPJ("snapboost_list_search.txt"));
        }
        if (!FPI.LIZ) {
            return 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 28 || i2 == 29 || i2 == 30) {
            if (C38235EzX.LIZIZ(new File(FPH.LIZLLL(), fpk.LIZ()))) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(new File(FPH.LIZJ()).getParentFile().getAbsolutePath());
                LIZ2.append("/oat/");
                if (FPH.LIZJ == null) {
                    try {
                        Method declaredMethod = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]);
                        declaredMethod.setAccessible(true);
                        FPH.LIZJ = (String) declaredMethod.invoke(null, new Object[0]);
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        str2 = "";
                    }
                }
                str2 = FPH.LIZJ;
                if (!new File(JBR.LJFF(LIZ2, str2, "/base.art", LIZ2)).exists()) {
                    return 4;
                }
                return 3;
            }
            Iterator it = ((ArrayList) fpk.LIZ).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (str3.endsWith("*")) {
                    if (list == null) {
                        list = FPH.LIZIZ();
                    }
                    String substring = str3.substring(0, str3.lastIndexOf(42));
                    int i3 = 0;
                    for (String str4 : list) {
                        if (str4.startsWith(substring)) {
                            ((HashSet) fpk.LIZIZ).add(str4);
                            i3++;
                        }
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("CheckClasses: ");
                    LIZ3.append(str3);
                    LIZ3.append(" match ");
                    LIZ3.append(i3);
                    X1D.LIZIZ(LIZ3);
                } else {
                    ((HashSet) fpk.LIZIZ).add(str3);
                }
            }
            Iterator it2 = ((ArrayList) fpk.LJI).iterator();
            while (it2.hasNext()) {
                FPJ fpj = (FPJ) it2.next();
                fpj.LIZIZ();
                fpk.LIZIZ.addAll(fpj.LIZ());
            }
            if (((HashSet) fpk.LIZIZ).isEmpty()) {
                return 5;
            }
            SystemClock.uptimeMillis();
            File file = new File(FPH.LIZLLL(), fpk.LIZ());
            File file2 = new File(FPH.LIZLLL(), "cart.list");
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file2, false));
            } catch (IOException unused) {
            }
            try {
                Iterator it3 = ((HashSet) fpk.LIZIZ).iterator();
                while (it3.hasNext()) {
                    String str5 = (String) it3.next();
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("L");
                    LIZ4.append(str5.replace('.', '/'));
                    if (fpk.LJFF) {
                        str = ";->*";
                    } else {
                        str = ";";
                    }
                    LIZ4.append(str);
                    bufferedWriter.write(X1D.LIZIZ(LIZ4));
                    bufferedWriter.newLine();
                }
                bufferedWriter.flush();
                bufferedWriter.close();
                if (!C38235EzX.LIZIZ(file2)) {
                    i = 102;
                } else {
                    if (fpk.LJ == null) {
                        fpk.LJ = FPH.LIZ().getPackageCodePath();
                    }
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("Target dex: ");
                    LIZ5.append(fpk.LJ);
                    X1D.LIZIZ(LIZ5);
                    String str6 = fpk.LJ;
                    if (C38235EzX.LIZIZ(file2) && !TextUtils.isEmpty(str6)) {
                        File file3 = new File(str6);
                        if (file3.exists()) {
                            FPM fpm = new FPM();
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("--create-profile-from=");
                            LIZ6.append(file2.toString());
                            fpm.LIZ(X1D.LIZIZ(LIZ6));
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append("--apk=");
                            LIZ7.append(file3.toString());
                            fpm.LIZ(X1D.LIZIZ(LIZ7));
                            StringBuilder LIZ8 = X1D.LIZ();
                            LIZ8.append("--dex-location=");
                            LIZ8.append(file3.getName());
                            fpm.LIZ(X1D.LIZIZ(LIZ8));
                            StringBuilder LIZ9 = X1D.LIZ();
                            LIZ9.append("--reference-profile-file=");
                            LIZ9.append(file.toString());
                            fpm.LIZ(X1D.LIZIZ(LIZ9));
                            FPQ fpq = new FPQ();
                            fpq.LIZ = fpm.LIZ;
                            if (fpq.LIZIZ() == 0) {
                                if (FPH.LIZIZ == null) {
                                    FPH.LIZIZ = FPH.LIZ().getPackageName();
                                }
                                String str7 = FPH.LIZIZ;
                                StringBuilder LIZ10 = X1D.LIZ();
                                LIZ10.append("/data/misc/profiles/cur/");
                                LIZ10.append(Process.myUid() / ImagePreloadExperiment.PRIORITY_DEFAULT);
                                LIZ10.append("/");
                                LIZ10.append(str7);
                                LIZ10.append("/primary.prof");
                                File file4 = new File(X1D.LIZIZ(LIZ10));
                                synchronized (C37696Eqq.class) {
                                    StringBuilder LIZ11 = X1D.LIZ();
                                    LIZ11.append("Try to merge current profile:");
                                    LIZ11.append(file);
                                    LIZ11.append(" with reference profile:");
                                    LIZ11.append(file4);
                                    X1D.LIZIZ(LIZ11);
                                    if (C38235EzX.LIZIZ(file)) {
                                        try {
                                        } catch (Exception e2) {
                                            C78983UzD.LJIIZILJ(e2);
                                            e2.toString();
                                        }
                                        if (!TextUtils.equals(file.getCanonicalPath(), file4.getCanonicalPath())) {
                                            if (!file4.exists()) {
                                                try {
                                                    file4.getParentFile().mkdirs();
                                                } catch (Exception e3) {
                                                    C16880lQ.LLLLIIL(e3);
                                                }
                                                if (!file4.createNewFile()) {
                                                    StringBuilder LIZ12 = X1D.LIZ();
                                                    LIZ12.append("fail to create ");
                                                    LIZ12.append(file4.getAbsolutePath());
                                                    X1D.LIZIZ(LIZ12);
                                                }
                                            }
                                            FPM fpm2 = new FPM();
                                            StringBuilder LIZ13 = X1D.LIZ();
                                            LIZ13.append("--profile-file=");
                                            LIZ13.append(file.toString());
                                            fpm2.LIZ(X1D.LIZIZ(LIZ13));
                                            StringBuilder LIZ14 = X1D.LIZ();
                                            LIZ14.append("--reference-profile-file=");
                                            LIZ14.append(file4.toString());
                                            fpm2.LIZ(X1D.LIZIZ(LIZ14));
                                            fpm2.LIZ("--force-merge");
                                            FPQ fpq2 = new FPQ();
                                            fpq2.LIZ = fpm2.LIZ;
                                            int LIZIZ = fpq2.LIZIZ();
                                            if (LIZIZ != 0) {
                                                if (LIZIZ != 1) {
                                                    if (LIZIZ != 2) {
                                                        if (LIZIZ != 3 && LIZIZ != 4) {
                                                            StringBuilder LIZ15 = X1D.LIZ();
                                                            LIZ15.append("Unknown error code while processing profiles ");
                                                            LIZ15.append(file);
                                                            LIZ15.append(" and ");
                                                            LIZ15.append(file4);
                                                            X1D.LIZIZ(LIZ15);
                                                        } else {
                                                            StringBuilder LIZ16 = X1D.LIZ();
                                                            LIZ16.append("IO error while reading profiles ");
                                                            LIZ16.append(file);
                                                            LIZ16.append(" and ");
                                                            LIZ16.append(file4);
                                                            X1D.LIZIZ(LIZ16);
                                                        }
                                                    } else {
                                                        StringBuilder LIZ17 = X1D.LIZ();
                                                        LIZ17.append("Bad profiles in merging ");
                                                        LIZ17.append(file);
                                                        LIZ17.append(" and ");
                                                        LIZ17.append(file4);
                                                        LIZ17.append(", do clean-up.");
                                                        X1D.LIZIZ(LIZ17);
                                                    }
                                                }
                                                z2 = false;
                                            }
                                            if (z2) {
                                                i = 2;
                                            }
                                        }
                                    }
                                }
                                i = 104;
                            }
                        }
                    }
                    i = 103;
                }
                SystemClock.uptimeMillis();
                C38914FPa.LIZ.execute(new ARunnableS1S0001000_6(i, 12));
                return i;
            } finally {
            }
        } else {
            return 101;
        }
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.APP_BACKGROUND;
    }

    @Override // X.EEY
    public final void run(Context context) {
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            FPI.LIZ(context, true);
            i = LIZLLL();
        } catch (Throwable unused) {
            i = 0;
        }
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin() && !AV1.LJIILLIIL()) {
            C188727au c188727au = new C188727au();
            c188727au.LJ(uptimeMillis2, "commit_took");
            c188727au.LIZLLL(2, "commit_id");
            c188727au.LIZLLL(i, "commit_result");
            FMX.LJIIL("tool_performance_profile_editor", c188727au.LIZ);
        }
    }
}
