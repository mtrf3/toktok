package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IL4 {
    public static final C35751E1j<String, Long> LIZ = new C35751E1j<>(20);
    public static final C35751E1j<String, Integer> LIZIZ = new C35751E1j<>(20);
    public static final C35751E1j<String, Integer> LIZJ = new C35751E1j<>(20);
    public static final C35751E1j<String, Boolean> LIZLLL = new C35751E1j<>(20);
    public static final C35751E1j<String, Integer> LJ = new C35751E1j<>(20);

    public static ILN LIZ(IGM igm) {
        if (igm == null) {
            return ILN.DEFAULT;
        }
        return igm.LJ();
    }

    public static int LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return 0;
        }
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4() && simVideoUrlModel.getHitDashAudioBitrate() != null) {
            return simVideoUrlModel.getHitDashAudioBitrate().getBitRate();
        }
        if (simVideoUrlModel.getAudioBitrate() == null || simVideoUrlModel.getAudioBitrate().size() < 1) {
            return 0;
        }
        return ((SimAudioBitrate) ListProtector.get(simVideoUrlModel.getAudioBitrate(), 0)).getBitRate();
    }

    public static String LIZLLL(InterfaceC46645ISj interfaceC46645ISj) {
        if (interfaceC46645ISj != null) {
            return interfaceC46645ISj.getPlayerType().toString();
        }
        return "TT";
    }

    public static String LJ(String str) {
        List<C59772Wf> list;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C46664ITc c46664ITc = C46664ITc.LJIJ;
        synchronized (c46664ITc) {
            if (!TextUtils.isEmpty(str)) {
                list = c46664ITc.LJIIL.get(str);
            } else {
                list = null;
            }
        }
        c46664ITc.LJJI(str);
        if (list != null && !list.isEmpty()) {
            return GsonProtectorUtils.toJson(new Gson(), list);
        }
        return "";
    }

    public static String LJFF(String str) {
        return C46664ITc.LJIJ.LJIIIZ(str);
    }

    public static int LJII(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return 0;
        }
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            if (simVideoUrlModel.getHitDashVideoBitrate() != null) {
                return simVideoUrlModel.getHitDashVideoBitrate().getBitRate();
            }
        } else if (simVideoUrlModel.getHitBitrate() != null) {
            return simVideoUrlModel.getHitBitrate().getBitRate();
        }
        if (simVideoUrlModel.getRawBitRate() == null || simVideoUrlModel.getRawBitRate().size() < 1) {
            return 0;
        }
        return ((SimBitRate) ListProtector.get(simVideoUrlModel.getRawBitRate(), 0)).getBitRate();
    }

    public static int LIZJ(InterfaceC46645ISj interfaceC46645ISj, String str) {
        Integer valueOf;
        SimVideoUrlModel LJI = LJI(interfaceC46645ISj, str);
        if (LJI == null) {
            return -1;
        }
        SimAudioBitrate hitDashAudioBitrate = LJI.getHitDashAudioBitrate();
        if (hitDashAudioBitrate == null || (valueOf = Integer.valueOf(hitDashAudioBitrate.getQualityType())) == null) {
            valueOf = -1;
        }
        return valueOf.intValue();
    }

    public static SimVideoUrlModel LJI(InterfaceC46645ISj interfaceC46645ISj, String str) {
        if (interfaceC46645ISj == null) {
            return null;
        }
        return interfaceC46645ISj.LJIILJJIL(str);
    }

    public static int LJIIIIZZ(InterfaceC46645ISj interfaceC46645ISj, String str) {
        Integer valueOf;
        Integer valueOf2;
        SimVideoUrlModel LJI = LJI(interfaceC46645ISj, str);
        Integer num = -1;
        if (LJI == null) {
            return -1;
        }
        if (LJI.hasDashBitrateAndSelectAsMp4()) {
            SimBitRate hitDashVideoBitrate = LJI.getHitDashVideoBitrate();
            if (hitDashVideoBitrate != null && (valueOf2 = Integer.valueOf(hitDashVideoBitrate.getQualityType())) != null) {
                num = valueOf2;
            }
            return num.intValue();
        }
        if (!TextUtils.isEmpty(C46664ITc.LJIJ.LJI(str))) {
            ITI videoInfo = interfaceC46645ISj.getVideoInfo();
            if (videoInfo == null) {
                return -1;
            }
            return videoInfo.LJIIJJI;
        }
        IYN hitBitrate = LJI.getHitBitrate();
        if (hitBitrate != null && (valueOf = Integer.valueOf(hitBitrate.getQualityType())) != null) {
            num = valueOf;
        }
        return num.intValue();
    }

    public static void LJIIIZ(final IGM igm, final IP0 ip0, final InterfaceC46645ISj interfaceC46645ISj, final String str, boolean z, final IPH iph, final boolean z2, final HashMap<String, Object> hashMap) {
        final Long l = LIZ.get(str);
        final ILN LIZ2 = LIZ(igm);
        final SimVideoUrlModel LJI = LJI(interfaceC46645ISj, str);
        C35751E1j<String, Integer> c35751E1j = LJ;
        Integer num = c35751E1j.get(str);
        if (num != null && z2) {
            if (z) {
                if (num.intValue() >= 2 && num.intValue() != 3) {
                    c35751E1j.put(str, 5);
                }
            } else if (num.intValue() == 5) {
                c35751E1j.put(str, 2);
            }
        }
        ILI.LIZ().reportVideoBuffering(str, z2, z, new Callable() { // from class: X.IOv
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0 */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v10 */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ?? r1;
                String LIZIZ2;
                int i;
                IP0 ip02 = IP0.this;
                SimVideoUrlModel simVideoUrlModel = LJI;
                boolean z3 = z2;
                ILN type = LIZ2;
                InterfaceC46645ISj interfaceC46645ISj2 = interfaceC46645ISj;
                String str2 = str;
                Long l2 = l;
                IPH iph2 = iph;
                IGM igm2 = igm;
                HashMap hashMap2 = hashMap;
                int i2 = 0;
                if (ip02 != null) {
                    r1 = ip02.isCache(simVideoUrlModel);
                } else {
                    r1 = 0;
                }
                C46555IOx c46555IOx = new C46555IOx();
                C46554IOw c46554IOw = c46555IOx.LIZ;
                c46554IOw.LJI = z3;
                c46554IOw.LIZ = r1;
                o.LJIIIZ(type, "type");
                c46555IOx.LIZ.getClass();
                c46555IOx.LIZ.LIZIZ = interfaceC46645ISj2.LJIILL();
                c46555IOx.LIZ.LJIIIIZZ = IL4.LIZLLL(interfaceC46645ISj2);
                c46555IOx.LIZ.LIZJ = interfaceC46645ISj2.getCurrentPosition();
                if (ip02 != null) {
                    i2 = ip02.LIZLLL();
                }
                c46555IOx.LIZ.LJ = i2;
                if (IZ8.LJJJJJL()) {
                    LIZIZ2 = IL4.LJFF(str2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(l2);
                    LIZ3.append("");
                    LIZIZ2 = X1D.LIZIZ(LIZ3);
                }
                C46554IOw c46554IOw2 = c46555IOx.LIZ;
                c46554IOw2.LJII = LIZIZ2;
                if (ILN.T_FEED == type) {
                    if (iph2 == null) {
                        i = -1;
                    } else {
                        i = iph2.LJIIIZ;
                    }
                    c46554IOw2.LIZ(Integer.valueOf(i), "url_type");
                }
                if (igm2 != null) {
                    c46554IOw2.LIZ(igm2.LJI(), "play_type");
                    c46554IOw2.LIZIZ(igm2.LJFF(str2, z3));
                }
                java.util.Map map = (java.util.Map) interfaceC46645ISj2.LIZ(IP1.LIZLLL);
                if (map != null && !map.isEmpty()) {
                    for (String str3 : map.keySet()) {
                        c46554IOw2.LIZ(map.get(str3), str3);
                    }
                }
                c46554IOw2.LIZIZ(hashMap2);
                return c46554IOw2;
            }
        });
    }
}
