package X;

import Y.ARunnableS15S0101000_11;
import android.content.Context;
import android.os.Debug;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Iov, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47769Iov {
    public static final String[] LJIIJJI = {"KSThread", "XYThread", "vdp:vidtask:m"};
    public static final String[] LJIIL = {"MediaLoad", "com.video.mdl.network_manager", "com.video.mdl.network_session"};
    public static ArrayList<String> LJIILIIL;
    public Context LIZ;
    public int LIZIZ = 60;
    public int LIZJ;
    public long LIZLLL;
    public long LJ;
    public C47823Ipn LJFF;
    public C47815Ipf LJI;
    public C47818Ipi LJII;
    public C47845Iq9 LJIIIIZZ;
    public ArrayList<C47881Iqj> LJIIIZ;
    public C47924IrQ LJIIJ;

    public final void LIZ() {
        C47815Ipf c47815Ipf;
        C47815Ipf c47815Ipf2;
        C47924IrQ c47924IrQ;
        TTVideoEngineLog.d("PlayerMetrics", "start collectMetrics");
        C47881Iqj c47881Iqj = new C47881Iqj();
        if ((this.LIZJ & 1) > 0 && (c47924IrQ = this.LJIIJ) != null) {
            EngineThreadPool.addExecuteTask(new ARunnableS15S0101000_11(10, c47924IrQ, 8));
        }
        if ((this.LIZJ & 2) > 0 && (c47815Ipf2 = this.LJI) != null && c47815Ipf2.LIZJ > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            int LIZ = C47795IpL.LIZ(this.LIZ);
            long currentTimeMillis2 = System.currentTimeMillis();
            C47815Ipf c47815Ipf3 = this.LJI;
            int i = c47815Ipf3.LIZ;
            if (i > 0) {
                c47815Ipf3.LIZIZ = LIZ - i;
            } else {
                c47815Ipf3.LIZIZ = 0;
            }
            c47815Ipf3.LIZ = LIZ;
            c47881Iqj.LIZ = LIZ;
            long j = currentTimeMillis2 - c47815Ipf3.LIZJ;
            c47881Iqj.LIZIZ = j;
            c47815Ipf3.LIZLLL = j;
            c47815Ipf3.LIZJ = currentTimeMillis2;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("METRICS_ABILITY_POWER ");
            LIZ2.append(this.LJI.LIZ);
            LIZ2.append(" costTime: ");
            LIZ2.append(currentTimeMillis2 - currentTimeMillis);
            LIZ2.append(" powertime: ");
            LIZ2.append(c47881Iqj.LIZIZ);
            TTVideoEngineLog.d("PlayerMetrics", X1D.LIZIZ(LIZ2));
        }
        if ((this.LIZJ & 16) > 0) {
            long currentTimeMillis3 = System.currentTimeMillis();
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            int totalPss = memoryInfo.getTotalPss() / 1024;
            long currentTimeMillis4 = System.currentTimeMillis();
            StringBuilder LJ = C7MY.LJ("METRICS_ABILITY_MEMORY ", totalPss, " costTime: ");
            LJ.append(currentTimeMillis4 - currentTimeMillis3);
            TTVideoEngineLog.d("PlayerMetrics", X1D.LIZIZ(LJ));
        }
        if ((this.LIZJ & 4) > 0 && (c47815Ipf = this.LJI) != null) {
            if (c47815Ipf.LJ > 0) {
                long currentTimeMillis5 = System.currentTimeMillis();
                c47815Ipf.LJFF = (currentTimeMillis5 - c47815Ipf.LJ) + c47815Ipf.LJFF;
                c47815Ipf.LJ = currentTimeMillis5;
            }
            C47815Ipf c47815Ipf4 = this.LJI;
            if (c47815Ipf4.LJI > 0) {
                long currentTimeMillis6 = System.currentTimeMillis();
                c47815Ipf4.LJII = (currentTimeMillis6 - c47815Ipf4.LJI) + c47815Ipf4.LJII;
                c47815Ipf4.LJI = currentTimeMillis6;
            }
        }
        if ((this.LIZJ & 256) > 0) {
            synchronized (this) {
                ArrayList<C47881Iqj> arrayList = this.LJIIIZ;
                if (arrayList != null) {
                    arrayList.add(c47881Iqj);
                }
                LIZIZ();
            }
        }
    }

    public final void LIZIZ() {
        ArrayList<C47881Iqj> arrayList;
        ArrayList<C47881Iqj> arrayList2 = this.LJIIIZ;
        if (arrayList2 != null && !arrayList2.isEmpty() && this.LJIIIZ.size() > 5) {
            C47823Ipn c47823Ipn = this.LJFF;
            if (c47823Ipn != null && (arrayList = this.LJIIIZ) != null) {
                c47823Ipn.LIZ = 0;
                c47823Ipn.LIZIZ = 0;
                c47823Ipn.LIZJ = 0;
                Iterator<C47881Iqj> it = arrayList.iterator();
                int i = 0;
                int i2 = 0;
                while (it.hasNext()) {
                    C47881Iqj next = it.next();
                    if (i > 0) {
                        i2 = Math.abs(i - next.LIZ);
                    }
                    C47823Ipn c47823Ipn2 = this.LJFF;
                    if (i2 > c47823Ipn2.LIZ) {
                        c47823Ipn2.LIZ = i2;
                    }
                    if (i2 > 1) {
                        c47823Ipn2.LIZJ++;
                    }
                    i = next.LIZ;
                }
                if (this.LJIIIZ.size() > 1) {
                    C47881Iqj c47881Iqj = (C47881Iqj) ListProtector.get(this.LJIIIZ, 0);
                    ArrayList<C47881Iqj> arrayList3 = this.LJIIIZ;
                    this.LJFF.LIZIZ = c47881Iqj.LIZ - ((C47881Iqj) AnonymousClass028.LIZIZ(arrayList3, 1, arrayList3)).LIZ;
                }
            }
            TTVideoEngineLog.d("PlayerMetrics", "startDiagnose");
            ListProtector.remove(this.LJIIIZ, 0);
        }
    }

    public final java.util.Map<String, Object> LIZJ() {
        HashMap hashMap = new HashMap();
        synchronized (this) {
            C47823Ipn c47823Ipn = this.LJFF;
            if (c47823Ipn != null && c47823Ipn.LIZIZ > 0) {
                hashMap.putAll(c47823Ipn.LIZ());
            }
            C47815Ipf c47815Ipf = this.LJI;
            if (c47815Ipf != null) {
                java.util.Map LIZ = c47815Ipf.LIZ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getMetricsLog: ");
                LIZ2.append(LIZ);
                TTVideoEngineLog.d("PlayerMetrics", X1D.LIZIZ(LIZ2));
                if (((HashMap) LIZ).size() > 0) {
                    hashMap.putAll(LIZ);
                }
            }
            C47924IrQ c47924IrQ = this.LJIIJ;
            if (c47924IrQ != null) {
                HashMap hashMap2 = new HashMap(c47924IrQ.LIZ);
                if (hashMap2.size() > 0) {
                    hashMap.putAll(hashMap2);
                }
            }
        }
        return hashMap;
    }
}
