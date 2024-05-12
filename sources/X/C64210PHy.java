package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.apm6.cpu.ApmCpuManager;
import defpackage.a1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PHy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64210PHy extends AbstractRunnableC64070PCo {
    public final /* synthetic */ C64209PHx LJLJJI;

    public final void LIZ() {
        C64209PHx c64209PHx = this.LJLJJI;
        c64209PHx.getClass();
        String cpuSceneString = ApmCpuManager.getInstance().getCpuSceneString();
        boolean z = !cpuSceneString.equals(C30581Hy.LJLIL);
        C30581Hy.LJLIL = cpuSceneString;
        if (z) {
            c64209PHx.LJIILLIIL();
            ((PI1) c64209PHx.LIZ).LIZJ();
            return;
        }
        double LJIIZILJ = C44384HbQ.LJIIZILJ();
        ((CopyOnWriteArrayList) c64209PHx.LIZIZ).add(Double.valueOf(LJIIZILJ));
        boolean LJJIIZI = C30581Hy.LJJIIZI(c64209PHx.LJFF, LJIIZILJ, c64209PHx.LJII);
        if (System.currentTimeMillis() - c64209PHx.LJI >= 30000) {
            if (((CopyOnWriteArrayList) c64209PHx.LIZIZ).isEmpty() || ((CopyOnWriteArrayList) c64209PHx.LIZLLL).isEmpty()) {
                c64209PHx.LIZ("finish collect, but no exception thread is found");
                c64209PHx.LJIILLIIL();
                ((PI1) c64209PHx.LIZ).LIZJ();
                return;
            }
            Iterator it = ((CopyOnWriteArrayList) c64209PHx.LIZIZ).iterator();
            double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            while (it.hasNext()) {
                double doubleValue = ((Double) it.next()).doubleValue();
                if (d2 < doubleValue) {
                    d2 = doubleValue;
                }
                d += doubleValue;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("report exception data, exception thread size is: ");
            LIZ.append(((CopyOnWriteArrayList) c64209PHx.LIZLLL).size());
            c64209PHx.LIZ(X1D.LIZIZ(LIZ));
            double size = d / ((CopyOnWriteArrayList) c64209PHx.LIZIZ).size();
            LinkedList linkedList = new LinkedList();
            String[] split = C30581Hy.LJLIL.split("#");
            int i = 0;
            if (c64209PHx.LJII) {
                if (!((HashMap) c64209PHx.LJFF.LJI).isEmpty()) {
                    int length = split.length;
                    while (i < length) {
                        String str = split[i];
                        if (((HashMap) c64209PHx.LJFF.LJI).containsKey(str)) {
                            double doubleValue2 = ((Double) ((HashMap) c64209PHx.LJFF.LJI).get(str)).doubleValue();
                            if (doubleValue2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && size > doubleValue2) {
                                linkedList.add(str);
                            }
                        }
                        i++;
                    }
                }
            } else if (!((HashMap) c64209PHx.LJFF.LJII).isEmpty()) {
                int length2 = split.length;
                while (i < length2) {
                    String str2 = split[i];
                    if (((HashMap) c64209PHx.LJFF.LJII).containsKey(str2)) {
                        double doubleValue3 = ((Double) ((HashMap) c64209PHx.LJFF.LJII).get(str2)).doubleValue();
                        if (doubleValue3 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && size > doubleValue3) {
                            linkedList.add(str2);
                        }
                    }
                    i++;
                }
            }
            C64199PHn c64199PHn = C64207PHv.LIZ;
            if (c64199PHn.LIZ() && (!linkedList.isEmpty() || (!c64209PHx.LJII ? size > c64209PHx.LJFF.LIZLLL : size > c64209PHx.LJFF.LIZJ))) {
                c64199PHn.LJ = System.currentTimeMillis();
                String str3 = "";
                if (linkedList.isEmpty()) {
                    if (c64209PHx.LJII) {
                        if (size > c64209PHx.LJFF.LIZJ) {
                            str3 = "apm_max_background";
                        }
                    } else if (size > c64209PHx.LJFF.LIZLLL) {
                        str3 = "apm_max_foreground";
                    }
                } else {
                    str3 = C78915Uy7.LJIIIZ(linkedList.toArray());
                    if (c64209PHx.LJII) {
                        if (size > c64209PHx.LJFF.LIZJ) {
                            str3 = a1.LJ(str3, "#", "apm_max_background");
                        }
                    } else if (size > c64209PHx.LJFF.LIZLLL) {
                        str3 = a1.LJ(str3, "#", "apm_max_foreground");
                    }
                }
                PC2.LIZ(new C64190PHe(size, d2, c64209PHx.LIZLLL, str3, c64209PHx.LJII));
            }
            c64209PHx.LJIILLIIL();
            PI1 pi1 = (PI1) c64209PHx.LIZ;
            synchronized (pi1) {
                pi1.LIZ(pi1.LJIIJ);
            }
            return;
        }
        if (!LJJIIZI) {
            c64209PHx.LIZ("not over process threshold");
            ((CopyOnWriteArrayList) c64209PHx.LIZJ).clear();
        } else {
            c64209PHx.LJIILL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64210PHy(C64209PHx c64209PHx) {
        super(0L, 1000L);
        this.LJLJJI = c64209PHx;
    }
}
