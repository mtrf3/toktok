package X;

import android.os.Looper;
import android.os.SystemClock;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes10.dex */
public final class MDY {
    public static C56438MDa LIZ;
    public static final long LIZIZ = ((Number) C35023Dop.LIZIZ.getValue()).longValue();
    public static Long LIZJ;
    public static String LIZLLL;
    public static String LJ;

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ() {
        C64797Pbt c64797Pbt;
        int i;
        Boolean bool;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str = null;
        try {
            C56438MDa c56438MDa = LIZ;
            if (c56438MDa != null) {
                java.util.Map<String, Long> map = c56438MDa.LIZ;
                C56569MIb.LIZ.getClass();
                map.put(C56569MIb.LIZLLL.LIZ, Long.valueOf(IGD.LIZ()));
            }
            c64797Pbt = O72.LIZ(LIZ);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            c64797Pbt = null;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        C56438MDa c56438MDa2 = LIZ;
        if (c56438MDa2 != null) {
            java.util.Map<String, Long> map2 = c56438MDa2.LIZ;
            C56569MIb.LIZ.getClass();
            map2.put(C56569MIb.LJ.LIZ, Long.valueOf(IGD.LIZ()));
        }
        C56438MDa c56438MDa3 = LIZ;
        if (c56438MDa3 != null) {
            Long valueOf = Long.valueOf(elapsedRealtime2);
            java.util.Map<String, Long> map3 = c56438MDa3.LIZ;
            C56569MIb.LIZ.getClass();
            map3.put(C56569MIb.LJFF.LIZ, valueOf);
        }
        boolean z = true;
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            i = 1;
        } else {
            i = 0;
        }
        Long l = LIZJ;
        if (l != null) {
            if (IGD.LIZ() >= l.longValue() + LIZIZ) {
                z = false;
            }
        }
        StringBuilder LIZJ2 = V10.LIZJ("realtime splash  type:REQUEST_COST cost time:", elapsedRealtime2, " curr:");
        LIZJ2.append(IGD.LIZ());
        LIZJ2.append(" success:");
        if (c64797Pbt != null) {
            bool = Boolean.valueOf(c64797Pbt.LIZIZ());
        } else {
            bool = null;
        }
        LIZJ2.append(bool);
        LIZJ2.append(" isBeforeFFDelayTime:");
        LIZJ2.append(z);
        LIZJ2.append(" ret:");
        if (c64797Pbt != null) {
            str = (String) c64797Pbt.LIZIZ;
        }
        LIZJ2.append(str);
        X1D.LIZIZ(LIZJ2);
        C56438MDa c56438MDa4 = LIZ;
        if (c56438MDa4 != null) {
            C56574MIg c56574MIg = new C56574MIg(new Object[0]);
            MIZ.LIZ.getClass();
            c56574MIg.LJIILJJIL(MIZ.LIZJ, new MIY(z, i, c56438MDa4));
        }
        SystemClock.elapsedRealtime();
    }

    public static void LIZIZ() {
        SystemClock.elapsedRealtime();
        C64829PcP.LIZLLL();
        SystemClock.elapsedRealtime();
        LIZJ = null;
        LJ = null;
        C56438MDa c56438MDa = new C56438MDa();
        LIZ = c56438MDa;
        Long valueOf = Long.valueOf(LIZIZ);
        java.util.Map<String, Long> map = c56438MDa.LIZ;
        C56569MIb.LIZ.getClass();
        map.put(C56569MIb.LJIIJ.LIZ, valueOf);
        C56438MDa c56438MDa2 = LIZ;
        if (c56438MDa2 != null) {
            C56574MIg c56574MIg = new C56574MIg(new Object[0]);
            MIZ.LIZ.getClass();
            c56574MIg.LJIILJJIL(MIZ.LIZJ, new AqS175S0100000_9(c56438MDa2, 610));
        }
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            C56438MDa c56438MDa3 = LIZ;
            if (c56438MDa3 != null) {
                C56574MIg c56574MIg2 = new C56574MIg(new Object[0]);
                MIZ.LIZ.getClass();
                c56574MIg2.LJIILJJIL(MIZ.LIZJ, new MIY(true, 0, c56438MDa3));
                return;
            }
            return;
        }
        if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
            C10K.LIZIZ(MDZ.LJLIL, C38995FSd.LIZIZ(), null);
        } else {
            LIZ();
        }
    }
}
