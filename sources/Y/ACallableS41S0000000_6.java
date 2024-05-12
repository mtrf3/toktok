package Y;

import X.C10K;
import X.C16880lQ;
import X.C36210EJa;
import X.C36839Ed1;
import X.C39177FZd;
import X.C41491GQd;
import X.C62848OlY;
import X.C85990Xow;
import X.E3T;
import X.E3W;
import X.E8S;
import X.EF7;
import X.EKS;
import X.FFL;
import X.FLJ;
import X.FRE;
import X.FRF;
import X.FRG;
import X.FW5;
import X.FWC;
import X.IW7;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.play.core.appupdate.u;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.commercialize.dao.ShowAdDataBase;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.video.simkit.SimKitCommonConfig;
import com.ss.android.ugc.aweme.video.simpreloader.PreloaderExperiment;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ACallableS41S0000000_6 implements Callable {
    public final int $t;

    public static final Object call$15(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        return C41491GQd.LIZ();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: Y.ACallableS41S0000000_6.call$6(Y.ACallableS41S0000000_6):java.lang.Object
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
        	... 1 more
        */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        /*
            r1 = this;
            int r0 = r1.$t
            switch(r0) {
                case 0: goto L7;
                case 1: goto Lc;
                case 2: goto L11;
                case 3: goto L16;
                case 4: goto L1b;
                case 5: goto L20;
                case 6: goto L25;
                case 7: goto L2a;
                case 8: goto L2f;
                case 9: goto L34;
                case 10: goto L39;
                case 11: goto L3e;
                case 12: goto L43;
                case 13: goto L48;
                case 14: goto L4d;
                case 15: goto L52;
                default: goto L5;
            }
        L5:
            r0 = 0
        L6:
            return r0
        L7:
            java.lang.Object r0 = call$0(r1)
            goto L6
        Lc:
            java.lang.Object r0 = call$1(r1)
            goto L6
        L11:
            java.lang.Object r0 = call$2(r1)
            goto L6
        L16:
            java.lang.Object r0 = call$3(r1)
            goto L6
        L1b:
            java.lang.Object r0 = call$4(r1)
            goto L6
        L20:
            java.lang.Object r0 = call$5(r1)
            goto L6
        L25:
            java.lang.Object r0 = call$6(r1)
            goto L6
        L2a:
            java.lang.Object r0 = call$7(r1)
            goto L6
        L2f:
            java.lang.Object r0 = call$8(r1)
            goto L6
        L34:
            java.lang.Object r0 = call$9(r1)
            goto L6
        L39:
            java.lang.Object r0 = call$10(r1)
            goto L6
        L3e:
            java.lang.Object r0 = call$11(r1)
            goto L6
        L43:
            java.lang.Object r0 = call$12(r1)
            goto L6
        L48:
            java.lang.Object r0 = call$13(r1)
            goto L6
        L4d:
            java.lang.Object r0 = call$14(r1)
            goto L6
        L52:
            java.lang.Object r0 = call$15(r1)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS41S0000000_6.call():java.lang.Object");
    }

    public ACallableS41S0000000_6(int i) {
        this.$t = i;
    }

    public static final Object call$0(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        C10K.LIZJ(new ACallableS41S0000000_6(3)).LJ(new C39177FZd(), C10K.LJIIIIZZ, null);
        return null;
    }

    public static final Object call$1(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        try {
            AVExternalServiceImpl.LIZ().configService().cacheConfig().clearDraftEffectCache();
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object call$10(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        if (!E8S.LIZ().getBoolean("has_reported_viewed_50_many_days", false)) {
            int i = E8S.LIZ().getInt("many_days_viewed_count", 0);
            UgCommonServiceImpl.LJIJ().LJIILIIL();
            int i2 = i + 1;
            E8S.LIZIZ().putInt("many_days_viewed_count", i2).apply();
            if (i2 >= 30) {
                if (!E8S.LIZ().getBoolean("has_reported_viewed_30_many_days", false)) {
                    if (C85990Xow.LJIIJ()) {
                        FLJ.LJI("af_vvfinish_allday30");
                    }
                    E8S.LIZIZ().putBoolean("has_reported_viewed_30_many_days", true).apply();
                }
                if (i2 >= 50 && !E8S.LIZ().getBoolean("has_reported_viewed_50_many_days", false)) {
                    if (C85990Xow.LJIIJ()) {
                        FLJ.LJI("af_vvfinish_allday50");
                    }
                    E8S.LIZIZ().putBoolean("has_reported_viewed_50_many_days", true).apply();
                }
            }
        }
        if (!C85990Xow.LJIIJ() && !C85990Xow.LJIIJJI()) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(calendar.getTimeInMillis());
        LIZ.append("");
        String LIZIZ = X1D.LIZIZ(LIZ);
        String string = E8S.LIZ().getString("current_data", "");
        int i3 = E8S.LIZ().getInt("one_day_viewed_count", 0);
        if (!TextUtils.equals(LIZIZ, string)) {
            E8S.LIZIZ().putInt("one_day_viewed_count", 0).apply();
            E8S.LIZIZ().putString("current_data", LIZIZ).apply();
            i3 = 0;
        }
        int i4 = i3 + 1;
        E8S.LIZIZ().putInt("one_day_viewed_count", i4).apply();
        UgCommonServiceImpl.LJIJ().LJIILIIL();
        if (C85990Xow.LJIIJJI() && i4 >= 10 && !E8S.LIZ().getBoolean("has_reported_viewed_10_one_day", false)) {
            FLJ.LJI("af_vvfinish_aday10");
            E8S.LIZIZ().putBoolean("has_reported_viewed_10_one_day", true).apply();
        }
        if (C85990Xow.LJIIJJI() && i4 >= 20 && !E8S.LIZ().getBoolean("has_reported_viewed_20_one_day", false)) {
            FLJ.LJI("af_vvfinish_aday20");
            E8S.LIZIZ().putBoolean("has_reported_viewed_20_one_day", true).apply();
        }
        if (t1.LJI() && C85990Xow.LJIIJJI() && i4 >= 10 && !E8S.LIZ().getBoolean("has_reported_viewed_10_one_day_login", false)) {
            FLJ.LJI("af_vvfinish_aday10_login");
            E8S.LIZIZ().putBoolean("has_reported_viewed_10_one_day_login", true).apply();
        }
        if (t1.LJI() && C85990Xow.LJIIJJI() && i4 >= 20 && !E8S.LIZ().getBoolean("has_reported_viewed_20_one_day_login", false)) {
            FLJ.LJI("af_vvfinish_aday20_login");
            E8S.LIZIZ().putBoolean("has_reported_viewed_20_one_day_login", true).apply();
        }
        if (t1.LJI() && C85990Xow.LJIIJJI() && i4 >= 30 && !E8S.LIZ().getBoolean("has_reported_viewed_30_one_day_login", false)) {
            FLJ.LJI("af_vvfinish_aday30_login");
            E8S.LIZIZ().putBoolean("has_reported_viewed_30_one_day_login", true).apply();
        }
        if (t1.LJI() && C85990Xow.LJIIJJI() && i4 >= 50) {
            if (!E8S.LIZ().getBoolean("has_reported_viewed_50_one_day_login", false)) {
                FLJ.LJI("af_vvfinish_aday50_login");
                E8S.LIZIZ().putBoolean("has_reported_viewed_50_one_day_login", true).apply();
            }
        } else if (i4 < 30) {
            return null;
        }
        if (!E8S.LIZ().getBoolean("has_reported_viewed_30_one_day", false)) {
            FLJ.LJI("af_vvfinish_aday30");
            E8S.LIZIZ().putBoolean("has_reported_viewed_30_one_day", true).apply();
        }
        if (i4 < 50 || E8S.LIZ().getBoolean("has_reported_viewed_50_one_day", false)) {
            return null;
        }
        FLJ.LJI("af_vvfinish_aday50");
        E8S.LIZIZ().putBoolean("has_reported_viewed_50_one_day", true).apply();
        return null;
    }

    public static final Object call$11(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        try {
            String LIZ = C36839Ed1.LIZ(EF7.LIZIZ());
            int currentTimeMillis = (int) ((System.currentTimeMillis() - C36210EJa.LIZ) / 1000);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", currentTimeMillis);
            jSONObject.put("processName", LIZ);
            AppLogNewUtils.onEventV3("background_start_sucess", jSONObject);
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final java.lang.Object call$12(Y.ACallableS41S0000000_6 r0) {
        /*
            com.ss.android.common.applog.AppLog.flush()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS41S0000000_6.call$12(Y.ACallableS41S0000000_6):java.lang.Object");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final java.lang.Object call$13(Y.ACallableS41S0000000_6 r0) {
        /*
            X.EU3.LJFF()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS41S0000000_6.call$13(Y.ACallableS41S0000000_6):java.lang.Object");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final java.lang.Object call$14(Y.ACallableS41S0000000_6 r0) {
        /*
            X.EU3.LJFF()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS41S0000000_6.call$14(Y.ACallableS41S0000000_6):java.lang.Object");
    }

    public static final Object call$2(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        System.currentTimeMillis();
        try {
            FFL.LJIIIZ().getClass();
            int i = 0;
            IW7.LIZ = FFL.LJIIJ(31744, 0, "share_guide", true);
            FFL.LJIIIZ().getClass();
            FRG.LIZ = Boolean.valueOf(FFL.LJ(31744, "enable_ies_route", true, true));
            FFL.LJIIIZ().getClass();
            PreloaderExperiment.videoNetworkSpeedAlgorithmExperimentValue = FFL.LJIIJ(31744, 0, "video_network_speed_algorithm", true);
            u.LJ = EKS.LIZ();
            SimKitCommonConfig.superResolutionStrategyExperimentValueInited = false;
            ArrayList<FRF> arrayList = FRE.LIZIZ;
            int size = arrayList.size();
            if (size > 0) {
                synchronized (arrayList) {
                    do {
                        FRF frf = FRE.LIZIZ.get(i);
                        if (frf != null) {
                            frf.LIZ();
                        }
                        i++;
                    } while (i < size);
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r12 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$3(Y.ACallableS41S0000000_6 r12) {
        /*
            java.lang.String r4 = " "
            java.lang.String r5 = "r"
            X.FZe r8 = new X.FZe
            r8.<init>()
            r12 = 0
            int r0 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L97
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L97
            java.io.RandomAccessFile r10 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = "/proc/stat"
            r10.<init>(r0, r5)     // Catch: java.lang.Throwable -> L97
            java.lang.String r0 = r10.readLine()     // Catch: java.lang.Throwable -> L84
            java.lang.String[] r9 = r0.split(r4)     // Catch: java.lang.Throwable -> L84
            int r3 = r9.length     // Catch: java.lang.Throwable -> L84
            r6 = 0
            r2 = 2
        L25:
            if (r2 >= r3) goto L31
            r0 = r9[r2]     // Catch: java.lang.Throwable -> L84
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L84
            double r6 = r6 + r0
            int r2 = r2 + 1
            goto L25
        L31:
            java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            r1.append(r11)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "/stat"
            r1.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L84
            r9.<init>(r0, r5)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r9.readLine()     // Catch: java.lang.Throwable -> L83
            java.lang.String[] r1 = r0.split(r4)     // Catch: java.lang.Throwable -> L83
            r0 = 13
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L83
            double r4 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L83
            r0 = 14
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L83
            double r11 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L83
            r0 = 15
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L83
            double r2 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L83
            r0 = 16
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L83
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.Throwable -> L83
            double r4 = r4 + r11
            double r4 = r4 + r2
            double r4 = r4 + r0
            r8.LIZ = r4     // Catch: java.lang.Throwable -> L83
            r8.LIZIZ = r6     // Catch: java.lang.Throwable -> L83
            r10.close()     // Catch: java.io.IOException -> L7e
            goto L8f
        L7e:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L8f
        L83:
            r12 = r9
        L84:
            r10.close()     // Catch: java.io.IOException -> L88
            goto L8c
        L88:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8c:
            r9 = r12
            if (r12 == 0) goto L97
        L8f:
            r9.close()     // Catch: java.io.IOException -> L93
            goto L97
        L93:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L97:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS41S0000000_6.call$3(Y.ACallableS41S0000000_6):java.lang.Object");
    }

    public static final Object call$4(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        try {
            ShowAdDataBase showAdDataBase = (ShowAdDataBase) FWC.LJFF.LIZJ();
            if (showAdDataBase != null) {
                showAdDataBase.LJIJ().LIZLLL();
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Object call$5(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        return Boolean.valueOf(C62848OlY.LIZJ());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final java.lang.Object call$6(Y.ACallableS41S0000000_6 r0) {
        /*
            X.FR4.LIZ()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS41S0000000_6.call$6(Y.ACallableS41S0000000_6):java.lang.Object");
    }

    public static final Object call$7(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        Context context = m43.u.LJII;
        if (context != null) {
            return C16880lQ.LLIIIL(context);
        }
        o.LJIJI("applicationContext");
        throw null;
    }

    public static final Object call$8(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        return FW5.LJFF(E3T.LIZIZ());
    }

    public static final Object call$9(ACallableS41S0000000_6 aCallableS41S0000000_6) {
        int intValue = ((Number) E3W.LJFF.getValue()).intValue();
        int i = 0;
        if (intValue != E3W.LIZJ && intValue != E3W.LIZIZ) {
            i = intValue == E3W.LIZLLL ? 1 : intValue == E3W.LJ ? 2 : -1;
        }
        return FW5.LJFF(i);
    }
}
