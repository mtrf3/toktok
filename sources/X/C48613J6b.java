package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.J6b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48613J6b implements J4I {
    public static final ArrayList<String> LJ = C47261Igj.LJII("hour", "minute", "weekday", "monthday", "access", "signal", "country", "p_dev", "sp_dev", "tcp_rtt", "tcp_band", "http_rtt", "net_quality_lv", "is_wifi", "is_charge", "battery_pct", "cur_speed", "loadmore_latency");
    public float LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;

    @Override // X.J4I
    public final Object getFeature(String str) {
        boolean z;
        int i = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        switch (str.hashCode()) {
            case -2026985990:
                if (str.equals("loadmore_latency")) {
                    return Float.valueOf(this.LIZ);
                }
                break;
            case -1897378154:
                if (str.equals("touch_velocity_x")) {
                    J5S lastSlideSpeedFeature = C48591J5f.LIZ.getLastSlideSpeedFeature();
                    if (lastSlideSpeedFeature == null) {
                        return 0;
                    }
                    return Float.valueOf(lastSlideSpeedFeature.LJLILLLLZI);
                }
                break;
            case -1897378153:
                if (str.equals("touch_velocity_y")) {
                    J5S lastSlideSpeedFeature2 = C48591J5f.LIZ.getLastSlideSpeedFeature();
                    if (lastSlideSpeedFeature2 == null) {
                        return 0;
                    }
                    return Float.valueOf(lastSlideSpeedFeature2.LJLJI);
                }
                break;
            case -1637726755:
                if (str.equals("touch_velocity")) {
                    J5S lastSlideSpeedFeature3 = C48591J5f.LIZ.getLastSlideSpeedFeature();
                    if (lastSlideSpeedFeature3 == null) {
                        return 0;
                    }
                    return Float.valueOf(lastSlideSpeedFeature3.LJLIL);
                }
                break;
            case -1483091692:
                if (str.equals("tcp_rtt")) {
                    return Integer.valueOf(C48617J6f.LIZIZ(System.currentTimeMillis()).LIZ);
                }
                break;
            case -1423461020:
                if (str.equals("access")) {
                    return C48617J6f.LIZJ(System.currentTimeMillis());
                }
                break;
            case -1074026988:
                if (str.equals("minute")) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - C48620J6i.LIZLLL > 20000) {
                        C48620J6i.LIZLLL = currentTimeMillis;
                        Calendar calendar = C48630J6s.LIZ;
                        o.LJIIIIZZ(calendar, "CalenderHolder.calendar");
                        synchronized (calendar) {
                            calendar.setTimeInMillis(currentTimeMillis);
                            C48620J6i.LIZJ = calendar.get(12);
                        }
                    }
                    return Integer.valueOf(C48620J6i.LIZJ);
                }
                break;
            case -902467928:
                if (str.equals("signal")) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - C48617J6f.LJ > 30000) {
                        Context LIZIZ = EF7.LIZIZ();
                        C48617J6f.LIZLLL = C47950Irq.LIZ(LIZIZ).LIZIZ(LIZIZ);
                        C48617J6f.LJ = currentTimeMillis2;
                    }
                    return Integer.valueOf(C48617J6f.LIZLLL);
                }
                break;
            case -897593495:
                if (str.equals("is_charge")) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (currentTimeMillis3 - C48617J6f.LJIIJ > 30000) {
                        C46625IRp LJIIJ = UC0.LJIIJ(EF7.LIZIZ());
                        if (LJIIJ != null) {
                            C46628IRs c46628IRs = LJIIJ.LIZ;
                            c46628IRs.LJI();
                            C48617J6f.LJIIIZ = c46628IRs.LJLJJL;
                        }
                        C48617J6f.LJIIJ = currentTimeMillis3;
                    }
                    return Integer.valueOf(C48617J6f.LJIIIZ ? 1 : 0);
                }
                break;
            case -896251085:
                if (str.equals("sp_dev")) {
                    return Integer.valueOf(FTB.LIZJ() ? 1 : 0);
                }
                break;
            case -481815380:
                if (str.equals("net_quality_lv")) {
                    long currentTimeMillis4 = System.currentTimeMillis();
                    if (currentTimeMillis4 - C48617J6f.LJIIIIZZ > 30000) {
                        int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
                        C48617J6f.LJII = effectiveConnectionType;
                        if (effectiveConnectionType < 0) {
                            C48617J6f.LJII = 0;
                        }
                        C48617J6f.LJIIIIZZ = currentTimeMillis4;
                    }
                    return Integer.valueOf(C48617J6f.LJII);
                }
                break;
            case -319008484:
                if (str.equals("monthday")) {
                    C48620J6i.LIZ();
                    return Integer.valueOf(C48620J6i.LJFF);
                }
                break;
            case -132747717:
                if (str.equals("http_rtt")) {
                    return Integer.valueOf(C48617J6f.LIZIZ(System.currentTimeMillis()).LIZIZ);
                }
                break;
            case 3208676:
                if (str.equals("hour")) {
                    C48620J6i.LIZ();
                    return Integer.valueOf(C48620J6i.LIZ);
                }
                break;
            case 106363846:
                if (str.equals("p_dev")) {
                    return Integer.valueOf(C16880lQ.LLLZLL() ? 1 : 0);
                }
                break;
            case 126629256:
                if (str.equals("cur_speed")) {
                    return Integer.valueOf(Math.max(C47497IkX.LIZJ(), 0));
                }
                break;
            case 957831062:
                if (str.equals("country")) {
                    if (C48617J6f.LIZ == null) {
                        C48617J6f.LIZ = C61651OHn.LIZ();
                    }
                    return C48617J6f.LIZ;
                }
                break;
            case 1226862376:
                if (str.equals("weekday")) {
                    C48620J6i.LIZ();
                    return Integer.valueOf(C48620J6i.LJ);
                }
                break;
            case 1268302803:
                if (str.equals("tcp_band")) {
                    return Integer.valueOf(C48617J6f.LIZIZ(System.currentTimeMillis()).LIZJ);
                }
                break;
            case 2023669679:
                if (str.equals("battery_pct")) {
                    long currentTimeMillis5 = System.currentTimeMillis();
                    if (currentTimeMillis5 - C48617J6f.LJIIL > 30000) {
                        C46625IRp LJIIJ2 = UC0.LJIIJ(EF7.LIZIZ());
                        if (LJIIJ2 != null) {
                            C48617J6f.LJIIJJI = LJIIJ2.LIZ();
                        }
                        C48617J6f.LJIIL = currentTimeMillis5;
                    }
                    return Integer.valueOf(C48617J6f.LJIIJJI);
                }
                break;
            case 2082342154:
                if (str.equals("is_wifi")) {
                    String LIZJ = C48617J6f.LIZJ(System.currentTimeMillis());
                    if (!TextUtils.isEmpty(LIZJ) && s.LJJJLZIJ(LIZJ, "wifi", false)) {
                        i = 1;
                    }
                    return Integer.valueOf(i);
                }
                break;
        }
        return C48537J3d.LIZ().LIZJ(str);
    }
}
