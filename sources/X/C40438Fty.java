package X;

import Y.ARunnableS13S0000000_6;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS42S0100000_6;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.Fty, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40438Fty {
    public static final java.util.Map<String, EnumC40442Fu2> LIZ = new HashMap();
    public static int LIZIZ = -1;
    public static boolean LIZJ = true;
    public static boolean LIZLLL = false;
    public static final ARunnableS1S0001000_6 LJ = new ARunnableS1S0001000_6(1, 0);
    public static final C40447Fu7 LJFF = new C40447Fu7();
    public static boolean LJI = false;
    public static final ARunnableS13S0000000_6 LJII = new ARunnableS13S0000000_6(47);
    public static final C40439Ftz LJIIIIZZ = new C40439Ftz();
    public static final C40440Fu0 LJIIIZ = new C40440Fu0();
    public static final ARunnableS1S0001000_6 LJIIJ = new ARunnableS1S0001000_6(1, 22);
    public static final ARunnableS1S0001000_6 LJIIJJI = new ARunnableS1S0001000_6(2, 5);
    public static final ARunnableS1S0001000_6 LJIIL = new ARunnableS1S0001000_6(0, 19);

    public static void LJFF() {
        if (!LJI) {
            return;
        }
        C40443Fu3.LIZ("search_sug").stop();
        LJI = false;
    }

    public static String LIZ(Aweme aweme) {
        if (aweme == null) {
            return "others";
        }
        if (aweme.isAd()) {
            return "ad";
        }
        if (aweme.getAwemeType() == 40 || aweme.getIsTikTokStory()) {
            return "story";
        }
        if (aweme.isMixAweme()) {
            return "mix";
        }
        if (aweme.isLive()) {
            return "live";
        }
        if (aweme.isPhotoMode()) {
            return "photo_mode";
        }
        if (aweme.getDistributeType() == 2) {
            return "long";
        }
        return "video";
    }

    public static boolean LIZIZ(String str) {
        if (((HashMap) LIZ).get(str) == EnumC40442Fu2.MONITORING) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        java.util.Map<String, EnumC40442Fu2> map = LIZ;
        Object obj = ((HashMap) map).get(str);
        if (obj == null) {
            ((HashMap) map).put(str, EnumC40442Fu2.NOT_MONITORED);
            return true;
        }
        if (obj == EnumC40442Fu2.NOT_MONITORED) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(String str) {
        if (LIZJ(str)) {
            ((HashMap) LIZ).put(str, EnumC40442Fu2.MONITORING);
            C40443Fu3.LIZ(str).start();
            return true;
        }
        return false;
    }

    public static void LJ(String str) {
        InterfaceC58433MwX interfaceC58433MwX;
        C58697N1x c58697N1x;
        int i;
        if (((HashMap) LIZ).get("system_launch") == EnumC40442Fu2.MONITORED) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_pause", str);
        LJI("system_launch", hashMap);
        C1DH.LIZJ(LJFF);
        DXK.LIZ = false;
        DXE.LIZ = false;
        if (!C35570Dxe.LJFF && ((Boolean) C35570Dxe.LIZJ.getValue()).booleanValue()) {
            C35570Dxe.LIZIZ(C35573Dxh.LJLIL);
        }
        if (((Boolean) DQV.LIZLLL.getValue()).booleanValue()) {
            C232469Ak.LJFF("SystemLaunch");
        }
        LJI("system_launch_after_first_frame", hashMap);
        LJI("system_launch_isolate_after_first_frame", null);
        EIT.LIZ("system_launch").LIZ();
        if (DRE.LIZ()) {
            EnumC38662FFi enumC38662FFi = EnumC38662FFi.AB;
            C38657FFd.LJ(enumC38662FFi, "system_launch_ab_preload_experiment");
            C38657FFd.LIZIZ(enumC38662FFi, "system_launch_ab_preload_experiment");
        }
        C38660FFg.LJFF.getClass();
        if (((Boolean) C34668Dj6.LIZLLL.getValue()).booleanValue()) {
            EnumC38662FFi enumC38662FFi2 = EnumC38662FFi.KV;
            C38657FFd.LJ(enumC38662FFi2, "system_launcher_keva");
            C38657FFd.LIZIZ(enumC38662FFi2, "system_launcher_keva");
        }
        if (((Boolean) C60762a0.LIZIZ.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = FEN.LIZJ;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i2 = 0; i2 < i; i2++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                FON remove = FEN.LIZIZ.remove("system_launch");
                int i3 = 0;
                if (remove != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    remove.LIZJ = currentTimeMillis;
                    if (currentTimeMillis - remove.LIZIZ > 0) {
                        HandlerThreadC36423ERf.LIZJ().LJ(new ARunnableS42S0100000_6(remove, 7));
                    }
                }
            } finally {
                for (int i4 = 0; i4 < i; i4++) {
                    readLock.lock();
                }
                writeLock.unlock();
            }
        }
        if (((Number) C58424MwO.LIZJ.getValue()).intValue() != 1 || (interfaceC58433MwX = (InterfaceC58433MwX) C58424MwO.LJFF.getValue()) == null || !(interfaceC58433MwX instanceof C58697N1x) || (c58697N1x = (C58697N1x) interfaceC58433MwX) == null) {
            return;
        }
        c58697N1x.LIZJ = false;
    }

    public static boolean LJI(String str, java.util.Map<String, String> map) {
        String str2;
        if (LIZIZ(str)) {
            ((HashMap) LIZ).put(str, EnumC40442Fu2.MONITORED);
            InterfaceC55057LjB LIZ2 = C40443Fu3.LIZ(str);
            if (map != null) {
                HashMap hashMap = (HashMap) map;
                if (!hashMap.isEmpty()) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        if (str3 != null && (str2 = (String) entry.getValue()) != null) {
                            LIZ2.LIZ(str3, str2);
                        }
                    }
                }
            }
            LIZ2.stop();
            return true;
        }
        return false;
    }
}
