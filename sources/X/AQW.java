package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import defpackage.q;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AQW {
    public static final AQW LIZ;
    public static C64962gm LIZIZ;
    public static volatile boolean LIZJ;
    public static final C26222AQw LIZLLL;
    public static final IAccountUserService LJ;
    public static EnumC237129Si LJFF;

    static {
        EnumC237129Si enumC237129Si;
        AQW aqw = new AQW();
        LIZ = aqw;
        LIZIZ = C48841JEv.LIZ(C78613UtF.LIZJ);
        LIZLLL = new C26222AQw("OfflineModeCacheVideoManager");
        LJ = HG3.LJIILL();
        Context LIZIZ2 = EF7.LIZIZ();
        if (!C48203Ivv.LJ(LIZIZ2) || C252329vI.LIZIZ.getEffectiveConnectionType() <= 1) {
            enumC237129Si = EnumC237129Si.NETWORK_NO;
        } else if (C48203Ivv.LJFF(LIZIZ2)) {
            enumC237129Si = EnumC237129Si.NETWORK_WIFI;
        } else {
            enumC237129Si = EnumC237129Si.NETWORK_MOBILE;
        }
        LJFF = enumC237129Si;
        if (C26212AQm.LIZ()) {
            C42625Go9.LIZIZ(aqw);
        }
    }

    public static void LIZJ() {
        String LIZIZ2;
        if (!((Boolean) C26216AQq.LIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C47242IgQ.LIZ().getCacheTopDirPath());
            LIZ3.append("/offlinemode/");
            LIZ2.append(X1D.LIZIZ(LIZ3));
            String curSecUserId = LJ.getCurSecUserId();
            if (curSecUserId == null) {
                LIZIZ2 = null;
            } else {
                LIZ2.append(curSecUserId);
                LIZ2.append('/');
                LIZIZ2 = X1D.LIZIZ(LIZ2);
            }
            File file = new File(LIZIZ2);
            if (!file.exists()) {
                return;
            }
            String LJII = LJII();
            File file2 = new File(LJII);
            C39579Fg7.LJ(LJII, false);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    if (file4.exists()) {
                        C16880lQ.LLLZZIL(file4);
                    }
                    if (!file3.renameTo(file4)) {
                        C26222AQw c26222AQw = LIZLLL;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("cache file move failed ");
                        LIZ4.append(file3.getName());
                        c26222AQw.LIZLLL(X1D.LIZIZ(LIZ4));
                    }
                }
            }
            if (file.exists() && file.isDirectory()) {
                OR7.LLLIIL(file);
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(C47242IgQ.LIZ().getCacheTopDirPath());
            LIZ5.append("/offlinemode/");
            File file5 = new File(X1D.LIZIZ(LIZ5));
            if (file5.exists()) {
                File[] listFiles2 = file5.listFiles();
                if (listFiles2 == null || listFiles2.length == 0) {
                    OR7.LLLIIL(file5);
                }
            }
        } catch (Exception e) {
            C26222AQw c26222AQw2 = LIZLLL;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("checkCacheDir failed: ");
            LIZ6.append(e);
            c26222AQw2.LIZLLL(X1D.LIZIZ(LIZ6));
        }
    }

    public static void LIZLLL() {
        try {
            LIZLLL.LJIIIIZZ("In clearOfflineFile()");
            File file = new File(LJFF());
            if (file.exists() && file.isDirectory()) {
                OR7.LLLIIL(file);
            }
        } catch (Exception e) {
            C26222AQw c26222AQw = LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("delete cache file failed ");
            LIZ2.append(e);
            c26222AQw.LIZLLL(X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJ() {
        List<String> LJIIL;
        Integer num;
        if (!((Boolean) C26214AQo.LIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            LIZLLL.LJIIIIZZ("delete invalid file");
            String LJII = LJII();
            InterfaceC26200AQa LIZJ2 = AQY.LIZJ();
            String curSecUserId = AQY.LIZ.getCurSecUserId();
            if (curSecUserId == null) {
                LJIIL = C61878OQg.INSTANCE;
            } else {
                LJIIL = LIZJ2.LJIIL(curSecUserId);
            }
            java.util.Set LLJILLL = ORZ.LLJILLL(LJIIL);
            if (!o.LJ(LJII, LJII())) {
                return;
            }
            File file = new File(LJII);
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File it : listFiles) {
                    o.LJIIIIZZ(it, "it");
                    if (!LLJILLL.contains(OR7.LLLIL(it))) {
                        C16880lQ.LLLZZIL(it);
                    }
                }
            }
            C26222AQw c26222AQw = LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("files size after deleting invalid file: ");
            File[] listFiles2 = file.listFiles();
            if (listFiles2 != null) {
                num = Integer.valueOf(listFiles2.length);
            } else {
                num = null;
            }
            LIZ2.append(num);
            c26222AQw.LJIIIIZZ(X1D.LIZIZ(LIZ2));
        } catch (Exception e) {
            C26222AQw c26222AQw2 = LIZLLL;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("deleteInvalidFile failed: ");
            LIZ3.append(e);
            c26222AQw2.LIZLLL(X1D.LIZIZ(LIZ3));
        }
    }

    public static C9SO LIZIZ() {
        if (C39687Fhr.LJFF() < 2147483648L) {
            if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJIIJJI(false);
                LJIIIZ(C9SO.STORAGE_NOT_ENOUGH.getValue());
                AQO.LJIIIIZZ(C9SN.PAUSE_STORAGE);
            }
            LIZLLL.LJIIIIZZ("Pause for storage");
            return C9SO.STORAGE_NOT_ENOUGH;
        }
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJIIJJI(false);
                LJIIIZ(C9SO.NO_NET.getValue());
                AQO.LJIIIIZZ(C9SN.PAUSE_NO_NETWORK);
            }
            LIZLLL.LJIIIIZZ("Pause for no network");
            return C9SO.NO_NET;
        }
        if (!C48203Ivv.LJFF(EF7.LIZIZ()) && AQO.LJ()) {
            if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJIIJJI(false);
                LJIIIZ(C9SO.NOT_WIFI.getValue());
                AQO.LJIIIIZZ(C9SN.PAUSE_NOT_WIFI);
            }
            LIZLLL.LJIIIIZZ("Pause for not wifi");
            return C9SO.NOT_WIFI;
        }
        return null;
    }

    public static String LJFF() {
        String str;
        Context LIZIZ2 = EF7.LIZIZ();
        if (C46982IcE.LIZIZ().isDebug() && C16880lQ.LLIIJI(LIZIZ2, null) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            File LLIIJI = C16880lQ.LLIIJI(LIZIZ2, null);
            if (LLIIJI == null || (str = LLIIJI.getAbsolutePath()) == null) {
                str = "";
            }
            return JBR.LJFF(LIZ2, str, "/offlinemode/", LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C16880lQ.LLIIJLIL(LIZIZ2).getAbsolutePath());
        LIZ3.append("/offlinemode/");
        return X1D.LIZIZ(LIZ3);
    }

    public static long LJI() {
        try {
            return C36980EfI.LIZLLL(new File(LJII()));
        } catch (Exception e) {
            C26222AQw c26222AQw = LIZLLL;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getUserVideoCacheSize() failed : ");
            LIZ2.append(e);
            c26222AQw.LIZLLL(X1D.LIZIZ(LIZ2));
            return 0L;
        }
    }

    public static String LJII() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJFF());
        String curSecUserId = LJ.getCurSecUserId();
        if (curSecUserId == null) {
            return null;
        }
        return q.LIZIZ(LIZ2, curSecUserId, '/', LIZ2);
    }

    public static void LJIIIZ(int i) {
        if (!AQO.LIZLLL().getBoolean("HAS_DOWNLOAD_START", false)) {
            return;
        }
        AQO.LIZLLL().LJI("HAS_DOWNLOAD_START", false);
        AQO.LIZLLL().LIZLLL("keva_end_reason", i);
        int LIZIZ2 = AQO.LIZIZ();
        C26218AQs.LIZ("offline_mode_cache_load_end", null, null, null, null, Integer.valueOf(LIZIZ2), null, null, Integer.valueOf(i), Long.valueOf((long) Math.ceil(AQO.LIZLLL().getDouble("key_cached_size", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX))), null, null, null, Long.valueOf(System.currentTimeMillis() - AQO.LIZLLL().getLong("key_start_time_millis", 0L)), Integer.valueOf(O6R.LJJIIJZLJL(((LIZIZ2 * 1.0d) / AQO.LIZ()) * 100)), null, null, null, null, null, null, null, null, 8363230);
    }

    public static void LJIIJ(EnumC237029Ry startReason) {
        Integer valueOf;
        o.LJIIIZ(startReason, "startReason");
        if (AQO.LIZLLL().getBoolean("HAS_DOWNLOAD_START", false)) {
            return;
        }
        AQO.LIZLLL().LJI("HAS_DOWNLOAD_START", true);
        Integer valueOf2 = Integer.valueOf(startReason.getValue());
        if (AQO.LIZLLL().getInt("keva_end_reason", -1) == -1) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(AQO.LIZLLL().getInt("keva_end_reason", -1));
        }
        C26218AQs.LIZ("offline_mode_cache_load_start", null, null, null, null, null, null, valueOf2, valueOf, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388222);
        AQO.LIZLLL().LIZLLL("keva_end_reason", -1);
        AQO.LIZLLL().LIZJ("key_start_time_millis", System.currentTimeMillis());
    }

    public static void LJIIJJI(boolean z) {
        LIZLLL.LJIIIIZZ("pause download");
        if (z) {
            if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJIIIZ(C9SO.USER_PAUSE.getValue());
            }
            AQO.LJIIIIZZ(C9SN.USER_PAUSE);
            AQO.LIZLLL().LJI("HAS_DOWNLOAD_START", false);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("offline_mode.");
        String curSecUserId = LJ.getCurSecUserId();
        if (curSecUserId == null) {
            return;
        }
        LIZ2.append(curSecUserId);
        C47242IgQ.LIZ().removePriorityTaskByContextKey(X1D.LIZIZ(LIZ2));
    }

    @QD3
    public final void onNetworkChangeEvent(C56842Ky event) {
        EnumC237129Si state;
        o.LJIIIZ(event, "event");
        Context LIZIZ2 = EF7.LIZIZ();
        boolean z = true;
        if (C48203Ivv.LJ(LIZIZ2) && C252329vI.LIZIZ.getEffectiveConnectionType() > 1) {
            z = false;
        }
        boolean LIZLLL2 = C48203Ivv.LIZLLL(LIZIZ2);
        boolean LJFF2 = C48203Ivv.LJFF(LIZIZ2);
        if (z) {
            if (AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJIIJJI(false);
                AQO.LJIIIIZZ(C9SN.PAUSE_NO_NETWORK);
                LJIIIZ(C9SO.NO_NET.getValue());
            }
            state = EnumC237129Si.NETWORK_NO;
        } else if (LIZLLL2) {
            if (AQO.LJ() && AQO.LIZJ() == C9SN.DOWNLOADING) {
                LJIIJJI(false);
                AQO.LJIIIIZZ(C9SN.PAUSE_NOT_WIFI);
                LJIIIZ(C9SO.NOT_WIFI.getValue());
            }
            state = EnumC237129Si.NETWORK_MOBILE;
        } else if (LJFF2) {
            state = EnumC237129Si.NETWORK_WIFI;
        } else {
            return;
        }
        LJFF = state;
        AQV.LJLIL.getClass();
        o.LJIIIZ(state, "state");
        Iterator<AQP> it = AQV.LJLJJI.iterator();
        while (it.hasNext()) {
            it.next().fY(state);
        }
        C26222AQw c26222AQw = LIZLLL;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("networkState: ");
        LIZ2.append(LJFF);
        c26222AQw.LIZ(null, X1D.LIZIZ(LIZ2));
        if (AQO.LIZJ().isPauseByNet()) {
            if (C39687Fhr.LJFF() < 2147483648L) {
                AQO.LJIIIIZZ(C9SN.PAUSE_STORAGE);
                return;
            }
            if (z) {
                AQO.LJIIIIZZ(C9SN.PAUSE_NO_NETWORK);
                return;
            }
            if (LIZLLL2 && AQO.LJ()) {
                AQO.LJIIIIZZ(C9SN.PAUSE_NOT_WIFI);
            } else {
                if (!LJFF2 && (!LIZLLL2 || AQO.LJ())) {
                    return;
                }
                AQV.LJLIL.LJLLLL(EnumC237029Ry.SYSTEM_RESUME);
            }
        }
    }

    public static void LIZ(List awemeList, EnumC237029Ry startReason) {
        String str;
        o.LJIIIZ(awemeList, "awemeList");
        o.LJIIIZ(startReason, "startReason");
        LIZLLL.LJIIIIZZ("in cacheVideos()");
        if (awemeList.isEmpty() || LIZIZ() != null || AQO.LIZJ() == C9SN.USER_PAUSE) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("offline_mode.");
        String curSecUserId = LJ.getCurSecUserId();
        if (curSecUserId == null) {
            return;
        }
        LIZ2.append(curSecUserId);
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        String LJII = LJII();
        if (LJII == null) {
            return;
        }
        String LJII2 = LJII();
        if (LJII2 != null) {
            C39579Fg7.LJ(LJII2, false);
        }
        Iterator it = awemeList.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            EnumC26207AQh enumC26207AQh = EnumC26207AQh.PRELOAD_TASK_PRIORITY_LOW;
            String sb = C278817o.LIZJ(LIZIZ2).toString();
            o.LJIIIIZZ(sb, "StringBuilder().apply(builderAction).toString()");
            C26206AQg c26206AQg = new C26206AQg(enumC26207AQh, new C26210AQk(LJII, sb), new AQX(aweme, startReason));
            if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C47242IgQ.LIZ() != null) {
                C47335Ihv.LIZ();
                SimVideoUrlModel LIZLLL2 = C46728IVo.LIZLLL(aweme);
                C47242IgQ.LIZ().addPreloadItem(LIZLLL2, c26206AQg);
                if (LIZLLL2 != null && LIZLLL2.getBitRate().size() >= 1) {
                    str = ((SimBitRate) ListProtector.get(LIZLLL2.getBitRate(), LIZLLL2.getBitRate().size() - 1)).getUrlKey();
                    XKX.LIZLLL(LIZIZ, null, null, new AQT(aweme, str, null), 3);
                }
            }
            str = null;
            XKX.LIZLLL(LIZIZ, null, null, new AQT(aweme, str, null), 3);
        }
    }

    public static void LJIIIIZZ(int i, long j, AQU aqu) {
        String str;
        long ceil = (long) Math.ceil(j / 1024.0d);
        String value = aqu.getValue();
        if (aqu != AQU.CLICK_CLEAR_ICON) {
            str = null;
        } else if (AQO.LIZIZ() == AQO.LIZ()) {
            str = "2";
        } else {
            str = "1";
        }
        C26218AQs.LIZ("offline_mode_cache_clear", null, null, null, null, Integer.valueOf(i), null, null, null, Long.valueOf(ceil), str, value, null, null, null, null, null, null, null, null, null, null, null, 8384990);
    }
}
