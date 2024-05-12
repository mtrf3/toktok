package com.ss.android.ugc.aweme.sec;

import X.AV1;
import X.AnonymousClass028;
import X.C0ON;
import X.C10K;
import X.C113554cx;
import X.C31461Li;
import X.C36922EeM;
import X.C38352F3k;
import X.C39182FZi;
import X.C39183FZj;
import X.C61349O5x;
import X.C66895QNf;
import X.C66896QNg;
import X.C66900QNk;
import X.C66901QNl;
import X.C66902QNm;
import X.C66905QNp;
import X.C85999Xp5;
import X.EnumC39259Fax;
import X.EnumC66897QNh;
import X.HG3;
import X.QN8;
import X.QNA;
import X.QND;
import X.QNE;
import X.QNX;
import X.QNY;
import X.QNZ;
import X.RBX;
import X.X1D;
import Y.ARunnableS28S0200000_9;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.sec.captcha.SecCaptcha;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import ms.bd.o.b2;
import ujb.s;
import yq4.a;

/* loaded from: classes12.dex */
public final class DmtSec {
    public static SecCaptcha captcha;
    public static String currentDid;
    public static String currentIid;
    public static long initBegin;
    public static boolean initSuccess;
    public static Keva keva;
    public static C66895QNf msManager;
    public static boolean needUpdateDid;
    public static boolean needUpdateIid;
    public static C66905QNp report;
    public static String targetDid;
    public static String targetIid;
    public static final DmtSec INSTANCE = new DmtSec();
    public static ArrayList<String> reportArray = new ArrayList<>();
    public static final C66901QNl appBackgroundListener = new C66901QNl();

    public final String onEvent() {
        return "";
    }

    public static final void dismissCaptcha() {
        if (initSuccess) {
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha != null) {
                QNE qne = secCaptcha.LJLJJL;
                if (qne == null || !qne.LIZIZ) {
                    return;
                }
                qne.LIZJ.dismissVerifyDialog();
                return;
            }
            o.LJIJI("captcha");
            throw null;
        }
    }

    public static final void finishInitAndProcessPending() {
        boolean z = needUpdateDid;
        if (z || needUpdateIid) {
            String str = currentDid;
            if (str != null) {
                String str2 = currentIid;
                if (str2 != null) {
                    if (z) {
                        str = targetDid;
                        if (str != null) {
                            needUpdateDid = false;
                        } else {
                            o.LJIJI("targetDid");
                            throw null;
                        }
                    }
                    if (needUpdateIid) {
                        str2 = targetIid;
                        if (str2 != null) {
                            needUpdateIid = false;
                        } else {
                            o.LJIJI("targetIid");
                            throw null;
                        }
                    }
                    updateDeviceIdAndInstallId(str, str2);
                } else {
                    o.LJIJI("currentIid");
                    throw null;
                }
            } else {
                o.LJIJI("currentDid");
                throw null;
            }
        }
        synchronized (INSTANCE) {
            ArrayList<String> arrayList = reportArray;
            if (!arrayList.isEmpty()) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String report2 = it.next();
                    o.LJIIIIZZ(report2, "report");
                    report(report2);
                }
            }
        }
    }

    private final void registerCrashCounter() {
        Npth.registerCrashCallback(QNZ.LJLIL, CrashType.NATIVE);
    }

    private final void updateSettings() {
        boolean z;
        String str;
        String LIZJ = C31461Li.LIZJ("ms_settings_android", "5d3a57922d5da57e49f3625d79d0d4669632612f6582c496d8487843468bbb85fcbe5f71fde92348b08d9efdd9971c3040dcbab55c2b2843", "getInstance().getStringV…e(MSSettings::class.java)");
        Keva keva2 = keva;
        if (keva2 != null) {
            z = keva2.getBoolean("safe_mode", false);
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSettings, isSafeMode: ");
        LIZ.append(z);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
        if (z) {
            String LIZJ2 = C38352F3k.LIZJ(LIZJ);
            Keva keva3 = keva;
            if (keva3 != null) {
                str = keva3.getString("settings_hash", "");
            } else {
                str = null;
            }
            if (o.LJ(LIZJ2, str)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("set settings to empty, md5_1 : ");
                LIZ2.append(LIZJ2);
                String msg2 = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(msg2, "msg");
                LIZJ = "";
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("new settings, remove safe mode. md5_1: ");
                LIZ3.append(LIZJ2);
                LIZ3.append(", md5_2: ");
                LIZ3.append(str);
                String msg3 = X1D.LIZIZ(LIZ3);
                o.LJIIIZ(msg3, "msg");
                Keva keva4 = keva;
                if (keva4 != null) {
                    keva4.storeBoolean("safe_mode", false);
                }
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("settings = ");
        LIZ4.append(LIZJ);
        String msg4 = X1D.LIZIZ(LIZ4);
        o.LJIIIZ(msg4, "msg");
        C66895QNf c66895QNf = msManager;
        if (c66895QNf != null) {
            c66895QNf.LIZJ(LIZJ);
        }
    }

    private final boolean isUsEeaRegion() {
        EnumC39259Fax region = a.LJIJJ().getRegion();
        if (region == EnumC39259Fax.US || region == EnumC39259Fax.EU) {
            return true;
        }
        return false;
    }

    public final void setParams() {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = "";
        if (AppLog.getServerDeviceId() == null) {
            str = "";
        } else {
            str = AppLog.getServerDeviceId();
        }
        if (AppLog.getInstallId() != null) {
            str2 = AppLog.getInstallId();
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        C36922EeM.LIZLLL(4, "Sec", C0ON.LIZJ("setParams:did = ", str, "  iid = ", str2));
        C66895QNf c66895QNf = msManager;
        if (c66895QNf != null) {
            c66895QNf.LIZIZ(str);
        }
        C66895QNf c66895QNf2 = msManager;
        if (c66895QNf2 != null) {
            c66895QNf2.LIZLLL(str2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("init setParamsTime = ");
        LIZ.append(currentTimeMillis2 - currentTimeMillis);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    public final C66895QNf getMsManager() {
        return msManager;
    }

    private final void innerUpdateCollectMode(EnumC66897QNh enumC66897QNh) {
        if (enumC66897QNh == null) {
            return;
        }
        int i = C66896QNg.LIZ[enumC66897QNh.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    if (isUsEeaRegion()) {
                        C66895QNf c66895QNf = msManager;
                        if (c66895QNf == null) {
                            return;
                        }
                        c66895QNf.LJI(503);
                        return;
                    }
                    C66895QNf c66895QNf2 = msManager;
                    if (c66895QNf2 == null) {
                        return;
                    }
                    c66895QNf2.LJI(603);
                    return;
                }
                if (isUsEeaRegion()) {
                    C66895QNf c66895QNf3 = msManager;
                    if (c66895QNf3 == null) {
                        return;
                    }
                    c66895QNf3.LJI(10);
                    return;
                }
                C66895QNf c66895QNf4 = msManager;
                if (c66895QNf4 == null) {
                    return;
                }
                c66895QNf4.LJI(504);
                return;
            }
            C66895QNf c66895QNf5 = msManager;
            if (c66895QNf5 == null) {
                return;
            }
            c66895QNf5.LJI(10);
            return;
        }
        C66895QNf c66895QNf6 = msManager;
        if (c66895QNf6 == null) {
            return;
        }
        c66895QNf6.LJI(5);
    }

    public static final boolean isCaptchaUrl(String url) {
        o.LJIIIZ(url, "url");
        if (!initSuccess) {
            return false;
        }
        if (captcha != null) {
            if (url.length() == 0) {
                return false;
            }
            if (!s.LJJJLZIJ(url, "/passport/", false) && !s.LJJJLZIJ(url, "/login/", false)) {
                return false;
            }
            return true;
        }
        o.LJIJI("captcha");
        throw null;
    }

    public static final boolean needVerifyImage(int i) {
        if (!initSuccess) {
            return false;
        }
        if (captcha != null) {
            if (i != 3058 && i != 3059 && i != 1104 && i != 1105) {
                return false;
            }
            return true;
        }
        o.LJIJI("captcha");
        throw null;
    }

    public static final synchronized void report(String scene) {
        synchronized (DmtSec.class) {
            o.LJIIIZ(scene, "scene");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("report .... scene = ");
            LIZ.append(scene);
            LIZ.append(", initSuccess = ");
            LIZ.append(initSuccess);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            if (initSuccess) {
                long currentTimeMillis = System.currentTimeMillis();
                C66905QNp c66905QNp = report;
                if (c66905QNp != null) {
                    String msg2 = "report .... scene = ".concat(scene);
                    o.LJIIIZ(msg2, "msg");
                    C66895QNf c66895QNf = c66905QNp.LIZ;
                    if (c66895QNf != null) {
                        c66895QNf.LJ(scene);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("report time = ");
                    LIZ2.append(currentTimeMillis2 - currentTimeMillis);
                    String msg3 = X1D.LIZIZ(LIZ2);
                    o.LJIIIZ(msg3, "msg");
                } else {
                    o.LJIJI("report");
                    throw null;
                }
            } else {
                reportArray.add(scene);
            }
        }
    }

    public static final void updateDeviceId(String deviceId) {
        o.LJIIIZ(deviceId, "deviceId");
        if (initSuccess) {
            String str = currentIid;
            if (str != null) {
                updateDeviceIdAndInstallId(deviceId, str);
                return;
            } else {
                o.LJIJI("currentIid");
                throw null;
            }
        }
        targetDid = deviceId;
        needUpdateDid = true;
    }

    public static final void updateInstallId(String iid) {
        o.LJIIIZ(iid, "iid");
        if (initSuccess) {
            String str = currentDid;
            if (str != null) {
                updateDeviceIdAndInstallId(str, iid);
                return;
            } else {
                o.LJIJI("currentDid");
                throw null;
            }
        }
        targetIid = iid;
        needUpdateIid = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int increaseCrashTimes(java.lang.String r17) {
        /*
            r16 = this;
            com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            java.lang.String r11 = "crash_count"
            r10 = 0
            if (r0 == 0) goto Ldd
            int r9 = r0.getInt(r11, r10)
        Lb:
            com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            java.lang.String r8 = "safe_mode"
            if (r0 == 0) goto Lda
            boolean r4 = r0.getBoolean(r8, r10)
        L15:
            r7 = 1
            r1 = r17
            if (r1 == 0) goto Ld7
            java.lang.String r0 = "libmetasec"
            boolean r3 = ujb.s.LJJJLZIJ(r1, r0, r7)
        L20:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "isSafeMode: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ",get crash_count from keva : "
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = ", crash at "
            r2.append(r0)
            long r12 = com.ss.android.ugc.aweme.sec.DmtSec.initBegin
            long r0 = r5 - r12
            r2.append(r0)
            java.lang.String r0 = "ms, isValid: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            java.lang.String r13 = "msg"
            kotlin.jvm.internal.o.LJIIIZ(r0, r13)
            long r0 = com.ss.android.ugc.aweme.sec.DmtSec.initBegin
            long r14 = r5 - r0
            r1 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lb5
            if (r4 != 0) goto Lb5
            if (r3 == 0) goto Lb5
            java.lang.String r12 = "last_crash_time"
            if (r9 != 0) goto Lb6
        L68:
            int r1 = r9 + 1
            r0 = 3
            if (r1 < r0) goto Ld5
            com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            if (r0 == 0) goto L74
            r0.storeBoolean(r8, r7)
        L74:
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "ms_settings_android"
            java.lang.String r0 = "5d3a57922d5da57e49f3625d79d0d4669632612f6582c496d8487843468bbb85fcbe5f71fde92348b08d9efdd9971c3040dcbab55c2b2843"
            java.lang.String r1 = com.bytedance.ies.abmock.SettingsManager.LJI(r1, r0)
            java.lang.String r0 = "getInstance().getStringV…e(MSSettings::class.java)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.String r2 = X.C38352F3k.LIZJ(r1)
            com.bytedance.keva.Keva r1 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            if (r1 == 0) goto L95
            java.lang.String r0 = "settings_hash"
            r1.storeString(r0, r2)
        L95:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "clear cache to stop crash, settings md5: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            kotlin.jvm.internal.o.LJIIIZ(r0, r13)
        La6:
            com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            if (r0 == 0) goto Lad
            r0.storeInt(r11, r10)
        Lad:
            com.bytedance.keva.Keva r0 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            if (r0 == 0) goto Lb4
            r0.storeLong(r12, r5)
        Lb4:
            r9 = r10
        Lb5:
            return r9
        Lb6:
            com.bytedance.keva.Keva r2 = com.ss.android.ugc.aweme.sec.DmtSec.keva
            if (r2 == 0) goto Le0
            r0 = 0
            long r0 = r2.getLong(r12, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto Le0
            long r0 = r0.longValue()
            long r3 = r5 - r0
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Ld4
            goto L68
        Ld4:
            r1 = 0
        Ld5:
            r10 = r1
            goto La6
        Ld7:
            r3 = 0
            goto L20
        Lda:
            r4 = 0
            goto L15
        Ldd:
            r9 = 0
            goto Lb
        Le0:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "get last_crash_time failed"
            r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sec.DmtSec.increaseCrashTimes(java.lang.String):int");
    }

    public final void setMsManager(C66895QNf c66895QNf) {
        msManager = c66895QNf;
    }

    public final void updateCollectMode(EnumC66897QNh enumC66897QNh) {
        EnumC66897QNh enumC66897QNh2;
        if (((RBX) HG3.LJIILL()).isLogin()) {
            if (AV1.LJIILLIIL()) {
                enumC66897QNh2 = EnumC66897QNh.COLLECT_MODE_KIDS;
            } else {
                enumC66897QNh2 = EnumC66897QNh.COLLECT_MODE_ALL;
            }
            innerUpdateCollectMode(enumC66897QNh2);
            return;
        }
        if (GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
            innerUpdateCollectMode(EnumC66897QNh.COLLECT_MODE_EEA_GUEST);
            return;
        }
        if (isUsEeaRegion()) {
            IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
            if (createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false)) {
                innerUpdateCollectMode(EnumC66897QNh.COLLECT_MODE_INIT);
                return;
            } else {
                innerUpdateCollectMode(EnumC66897QNh.COLLECT_MODE_EEA_GUEST);
                return;
            }
        }
        if (a.LJIJJ().LJIILL()) {
            innerUpdateCollectMode(EnumC66897QNh.COLLECT_MODE_EEA_GUEST);
        } else {
            innerUpdateCollectMode(EnumC66897QNh.COLLECT_MODE_INIT);
        }
    }

    public static final void updateDeviceIdAndInstallId(String deviceId, String iid) {
        o.LJIIIZ(deviceId, "deviceId");
        o.LJIIIZ(iid, "iid");
        if (initSuccess) {
            currentDid = deviceId;
            currentIid = iid;
            long currentTimeMillis = System.currentTimeMillis();
            C66895QNf c66895QNf = msManager;
            if (c66895QNf != null) {
                c66895QNf.LIZIZ(deviceId);
            }
            C66895QNf c66895QNf2 = msManager;
            if (c66895QNf2 != null) {
                c66895QNf2.LIZLLL(iid);
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateDeviceIdAndInstallId setParamsTime = ");
            LIZ.append(currentTimeMillis2 - currentTimeMillis);
            LIZ.append(", deviceId = ");
            LIZ.append(deviceId);
            LIZ.append(", iid = ");
            LIZ.append(iid);
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha != null) {
                secCaptcha.LIZJ(deviceId, iid);
                return;
            } else {
                o.LJIJI("captcha");
                throw null;
            }
        }
        targetIid = iid;
        targetDid = deviceId;
        needUpdateIid = true;
        needUpdateDid = true;
    }

    public final Map<String, String> frameSign(String singData, int i) {
        Map<String, String> frameSign;
        o.LJIIIZ(singData, "singData");
        C66895QNf c66895QNf = msManager;
        if (c66895QNf == null || (frameSign = c66895QNf.frameSign(singData, i)) == null) {
            return C113554cx.LJJJLIIL();
        }
        return frameSign;
    }

    public static final void popCaptcha(int i, Activity activity, QNA listener) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(listener, "listener");
        if (initSuccess) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha != null) {
                if (TextUtils.isEmpty(secCaptcha.LJLILLLLZI.LJLJJI) && AppLog.getInstallId() != null) {
                    QN8 qn8 = secCaptcha.LJLILLLLZI;
                    String installId = AppLog.getInstallId();
                    o.LJIIIIZZ(installId, "getInstallId()");
                    qn8.getClass();
                    qn8.LJLJJI = installId;
                    QN8 qn82 = secCaptcha.LJLILLLLZI;
                    secCaptcha.LIZJ(qn82.LJLJJL, qn82.LJLJJI);
                }
                if (TextUtils.isEmpty(secCaptcha.LJLILLLLZI.LJLJJL) && AppLog.getServerDeviceId() != null) {
                    QN8 qn83 = secCaptcha.LJLILLLLZI;
                    String serverDeviceId = AppLog.getServerDeviceId();
                    o.LJIIIIZZ(serverDeviceId, "getServerDeviceId()");
                    qn83.getClass();
                    qn83.LJLJJL = serverDeviceId;
                    QN8 qn84 = secCaptcha.LJLILLLLZI;
                    secCaptcha.LIZJ(qn84.LJLJJL, qn84.LJLJJI);
                }
                if (activity.isFinishing()) {
                    C36922EeM.LIZLLL(4, "Sec", "popCaptcha-activity-finishing");
                } else {
                    secCaptcha.LJLJJLL = new WeakReference<>(activity);
                    secCaptcha.LJLJL = listener;
                    activity.runOnUiThread(new ARunnableS28S0200000_9(secCaptcha, activity, 0));
                    secCaptcha.LIZIZ().LJIJJ = i;
                    String str = secCaptcha.LJLJLLL;
                    String userId = secCaptcha.LJLJI.getUserId();
                    String str2 = "";
                    if (userId == null) {
                        userId = "";
                    }
                    if (!o.LJ(str, userId)) {
                        String userId2 = secCaptcha.LJLJI.getUserId();
                        if (userId2 == null) {
                            userId2 = "";
                        }
                        secCaptcha.LJLJLLL = userId2;
                        String sessionId = secCaptcha.LJLJI.getSessionId();
                        if (sessionId != null) {
                            str2 = sessionId;
                        }
                        secCaptcha.LJLJLJ = str2;
                    }
                    secCaptcha.LIZIZ().LJIIIIZZ = secCaptcha.LJLILLLLZI.LJLJJL;
                    secCaptcha.LIZIZ().LJI = secCaptcha.LJLILLLLZI.LJLJJI;
                    secCaptcha.LIZIZ().LJIJJLI = secCaptcha.LJLJLJ;
                    String language = secCaptcha.LJLJI.getLanguage();
                    if (language != null) {
                        secCaptcha.LIZIZ().LIZJ = language;
                    }
                    QNE qne = secCaptcha.LJLJJL;
                    if (qne != null) {
                        C61349O5x.LIZ = 1;
                        if (qne.LIZJ(activity, secCaptcha)) {
                            C66900QNk c66900QNk = new C66900QNk(qne.LIZ.LJIJJ);
                            c66900QNk.LIZJ = qne.LIZ.LJIILL;
                            qne.LJFF(activity, c66900QNk, secCaptcha);
                        }
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("popCaptcha time = ");
                LIZ.append(currentTimeMillis2 - currentTimeMillis);
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIIZ(msg, "msg");
                return;
            }
            o.LJIJI("captcha");
            throw null;
        }
    }

    public final void popCaptchaV2(String riskInfo, Activity activity, QNA listener) {
        o.LJIIIZ(riskInfo, "riskInfo");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(listener, "listener");
        if (initSuccess) {
            long currentTimeMillis = System.currentTimeMillis();
            SecCaptcha secCaptcha = captcha;
            if (secCaptcha != null) {
                if (TextUtils.isEmpty(secCaptcha.LJLILLLLZI.LJLJJI) && AppLog.getInstallId() != null) {
                    QN8 qn8 = secCaptcha.LJLILLLLZI;
                    String installId = AppLog.getInstallId();
                    o.LJIIIIZZ(installId, "getInstallId()");
                    qn8.getClass();
                    qn8.LJLJJI = installId;
                    QN8 qn82 = secCaptcha.LJLILLLLZI;
                    secCaptcha.LIZJ(qn82.LJLJJL, qn82.LJLJJI);
                }
                if (TextUtils.isEmpty(secCaptcha.LJLILLLLZI.LJLJJL) && AppLog.getServerDeviceId() != null) {
                    QN8 qn83 = secCaptcha.LJLILLLLZI;
                    String serverDeviceId = AppLog.getServerDeviceId();
                    o.LJIIIIZZ(serverDeviceId, "getServerDeviceId()");
                    qn83.getClass();
                    qn83.LJLJJL = serverDeviceId;
                    QN8 qn84 = secCaptcha.LJLILLLLZI;
                    secCaptcha.LIZJ(qn84.LJLJJL, qn84.LJLJJI);
                }
                if (activity.isFinishing()) {
                    C36922EeM.LIZLLL(4, "Sec", "popCaptchaV2-activity-finishing");
                } else {
                    secCaptcha.LJLJJLL = new WeakReference<>(activity);
                    secCaptcha.LJLJL = listener;
                    activity.runOnUiThread(new ARunnableS28S0200000_9(secCaptcha, activity, 1));
                    String str = secCaptcha.LJLJLLL;
                    String userId = secCaptcha.LJLJI.getUserId();
                    String str2 = "";
                    if (userId == null) {
                        userId = "";
                    }
                    if (!o.LJ(str, userId)) {
                        String userId2 = secCaptcha.LJLJI.getUserId();
                        if (userId2 == null) {
                            userId2 = "";
                        }
                        secCaptcha.LJLJLLL = userId2;
                        String sessionId = secCaptcha.LJLJI.getSessionId();
                        if (sessionId != null) {
                            str2 = sessionId;
                        }
                        secCaptcha.LJLJLJ = str2;
                    }
                    secCaptcha.LIZIZ().LJIIIIZZ = secCaptcha.LJLILLLLZI.LJLJJL;
                    secCaptcha.LIZIZ().LJI = secCaptcha.LJLILLLLZI.LJLJJI;
                    secCaptcha.LIZIZ().LJIJJLI = secCaptcha.LJLJLJ;
                    secCaptcha.LIZIZ().LJIILIIL = C85999Xp5.LIZIZ();
                    String language = secCaptcha.LJLJI.getLanguage();
                    if (language != null) {
                        secCaptcha.LIZIZ().LIZJ = language;
                    }
                    QNE qne = secCaptcha.LJLJJL;
                    if (qne != null) {
                        C61349O5x.LIZ = 1;
                        qne.LJ(activity, new QNY(riskInfo), secCaptcha);
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("popCaptchaV2 time = ");
                LIZ.append(currentTimeMillis2 - currentTimeMillis);
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIIZ(msg, "msg");
                return;
            }
            o.LJIJI("captcha");
            throw null;
        }
    }

    public static /* synthetic */ void innerUpdateCollectMode$default(DmtSec dmtSec, EnumC66897QNh enumC66897QNh, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC66897QNh = null;
        }
        dmtSec.innerUpdateCollectMode(enumC66897QNh);
    }

    public static /* synthetic */ void updateCollectMode$default(DmtSec dmtSec, EnumC66897QNh enumC66897QNh, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC66897QNh = null;
        }
        dmtSec.updateCollectMode(enumC66897QNh);
    }

    public static final void init(Context context, String language, int i, String appName, String channel, boolean z, QND secService) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(language, "language");
        o.LJIIIZ(appName, "appName");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(secService, "secService");
        StringBuilder LJ = AnonymousClass028.LJ("init language = ", language, ", aid = ", i, ", appName = ");
        LJ.append(appName);
        LJ.append(", channel= ");
        LJ.append(channel);
        String msg = X1D.LIZIZ(LJ);
        o.LJIIIZ(msg, "msg");
        keva = KevaImpl.getRepo("mssdk", 0);
        initBegin = System.currentTimeMillis();
        DmtSec dmtSec = INSTANCE;
        dmtSec.registerCrashCounter();
        long currentTimeMillis = System.currentTimeMillis();
        GlobalContext.setContext(context);
        C39182FZi c39182FZi = new C39182FZi(String.valueOf(i));
        c39182FZi.LJIIIZ = 0;
        c39182FZi.LIZIZ = channel;
        c39182FZi.LJIIJ = 1;
        if (c39182FZi.LJIIJJI != 99999) {
            C39183FZj c39183FZj = new C39183FZj(c39182FZi);
            synchronized (C66902QNm.class) {
                b2.LIZJ(context, c39183FZj.LJIILJJIL);
            }
            msManager = C66902QNm.LIZ(String.valueOf(i));
            dmtSec.updateSettings();
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init getSdkTime = ");
            LIZ.append(currentTimeMillis2 - currentTimeMillis);
            String msg2 = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg2, "msg");
            report = new C66905QNp(msManager);
            C10K.LJII(1000L).LJ(new QNX(context, language, i, appName, channel, z, secService), C10K.LJI, null);
            long currentTimeMillis3 = System.currentTimeMillis();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("init Time = ");
            LIZ2.append(currentTimeMillis3 - initBegin);
            String msg3 = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg3, "msg");
            return;
        }
        throw new IllegalArgumentException("MSConfig init error!");
    }
}
