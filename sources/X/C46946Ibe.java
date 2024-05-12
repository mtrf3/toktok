package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ibe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C46946Ibe extends AbstractC46948Ibg {
    public C46958Ibq[] LJ;

    public C46946Ibe(InterfaceC46949Ibh interfaceC46949Ibh) {
        super(interfaceC46949Ibh);
    }

    public static final int LJFF(java.util.Map<String, Object> map) {
        Object obj = map.get("internet_speed");
        if (obj != null) {
            return ((Integer) obj).intValue();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
    
        if (r2 == null) goto L36;
     */
    @Override // X.InterfaceC46926IbK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.IYO LIZIZ(java.util.List<? extends X.IYN> r18, java.util.Map<java.lang.String, java.lang.Object> r19) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46946Ibe.LIZIZ(java.util.List, java.util.Map):X.IYO");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends IYN> T LIZLLL(IYO iyo, C46945Ibd c46945Ibd, List<T> list) {
        T t = null;
        if (c46945Ibd == null) {
            InterfaceC46949Ibh interfaceC46949Ibh = this.LIZ;
            if (interfaceC46949Ibh != null) {
                String LIZIZ = interfaceC46949Ibh.LIZIZ();
                double LIZJ = this.LIZ.LIZJ();
                if (LIZJ <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        t = it.next();
                        if (TextUtils.equals(t.getGearName(), LIZIZ)) {
                            StringBuilder sb = iyo.LJLJJI;
                            if (sb != null) {
                                sb.append("getDefaultBitrate <= 0 ");
                            }
                        }
                    }
                    StringBuilder sb2 = iyo.LJLJJI;
                    if (sb2 != null) {
                        sb2.append("getDefaultBitrate null");
                    }
                    StringBuilder LIZIZ2 = C25620zW.LIZIZ("defaultGearName = ", LIZIZ, " bitrates = ");
                    LIZIZ2.append(list.toString());
                    throw new C46892Iam(4, X1D.LIZIZ(LIZIZ2));
                }
                double d = Double.MAX_VALUE;
                for (T t2 : list) {
                    double abs = Math.abs(t2.getBitRate() - LIZJ);
                    if (d > abs) {
                        t = t2;
                        d = abs;
                    }
                }
                StringBuilder sb3 = iyo.LJLJJI;
                if (sb3 != null) {
                    sb3.append("getDefaultBitrate > 0 ");
                }
                return t;
            }
            StringBuilder sb4 = iyo.LJLJJI;
            if (sb4 != null) {
                sb4.append("bitrateInfo null gearConfig null ");
            }
            throw new C46892Iam(6, "gear config is null");
        }
        ArrayList arrayList = (ArrayList) LIZJ(list);
        if (arrayList.isEmpty()) {
            StringBuilder sb5 = iyo.LJLJJI;
            if (sb5 != null) {
                sb5.append("bitrateInfo not null bitRates null ");
            }
            throw new C46892Iam(5, "Intersection bitrate list is empty.");
        }
        if (c46945Ibd.LIZIZ) {
            double d2 = c46945Ibd.LIZ;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                IYN iyn = (IYN) it2.next();
                if (t != null) {
                    if (t.getBitRate() > d2) {
                        if (iyn.getBitRate() < t.getBitRate()) {
                        }
                    } else if (d2 >= iyn.getBitRate() && iyn.getBitRate() >= t.getBitRate()) {
                    }
                }
                t = iyn;
            }
            StringBuilder sb6 = iyo.LJLJJI;
            if (sb6 != null) {
                sb6.append("findMaxBitrate ");
            }
        } else {
            double d3 = c46945Ibd.LIZ;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                IYN iyn2 = (IYN) it3.next();
                if (t == null || Math.abs(iyn2.getBitRate() - d3) < Math.abs(t.getBitRate() - d3)) {
                    t = iyn2;
                }
            }
            StringBuilder sb7 = iyo.LJLJJI;
            if (sb7 != null) {
                sb7.append("findNearestBitrate ");
            }
        }
        return t;
    }

    public final void LJ(IYO iyo, C46945Ibd c46945Ibd, List list) {
        try {
            iyo.LJLIL = LIZLLL(iyo, c46945Ibd, list);
        } catch (C46892Iam e) {
            iyo.LJLILLLLZI = e;
        }
        if (iyo.LJLIL == null) {
            iyo.LJLIL = (IYN) ListProtector.get(list, 0);
            iyo.LJLJJI.append("fallback to index 0 ");
        }
    }
}
