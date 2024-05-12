package X;

import android.os.Build;
import android.view.FrameMetrics;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.1oA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44061oA extends AbstractC36361bk {
    public static boolean LJLJJL;
    public final ArrayList<PH3> LJLILLLLZI = new ArrayList<>();
    public final HashMap<String, C25420zC> LJLJI = new HashMap<>();
    public final C25410zB LJLJJI = new C25410zB();

    public C44061oA() {
        C36381bm.LJIL.LJ = true;
        PH4.LJIILIIL = true;
    }

    public final void LJIILIIL(long j, String str) {
        if (!LJLJJL || j <= 0) {
            return;
        }
        C25420zC c25420zC = this.LJLJI.get(str);
        if (c25420zC == null) {
            c25420zC = new C25420zC(str);
            this.LJLJI.put(str, c25420zC);
        }
        float f = PH9.LIZ;
        c25420zC.LIZIZ += j;
        int min = Math.min(Math.max((int) (((float) j) / f), 0), c25420zC.LJFF);
        int[] iArr = c25420zC.LJ;
        iArr[min] = iArr[min] + 1;
        c25420zC.LIZLLL += min;
        c25420zC.LIZJ++;
        if (c25420zC.LIZIZ < 10000) {
            return;
        }
        this.LJLJI.remove(str);
        try {
            float f2 = PH9.LIZ;
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i <= c25420zC.LJFF; i++) {
                if (c25420zC.LJ[i] > 0) {
                    jSONObject.put(String.valueOf(i), c25420zC.LJ[i]);
                }
            }
            int i2 = c25420zC.LIZJ;
            int i3 = ((i2 * 100) * PH9.LIZIZ) / (i2 + c25420zC.LIZLLL);
            C64185PGz c64185PGz = PH2.LIZ;
            c64185PGz.getClass();
            F9U.LIZ.LIZJ(new PH0(c64185PGz, c25420zC.LIZ, null, (float) (i3 / 100.0d)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(WM7.SCENE_SERVICE, c25420zC.LIZ);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("total_scroll_time", c25420zC.LIZIZ);
            jSONObject3.put("drop_time_rate", 1.0f - ((c25420zC.LIZJ * 1.0f) / ((int) (((float) c25420zC.LIZIZ) / f2))));
            jSONObject3.put("refresh_rate", c25420zC.LJFF + 1);
            C64089PDh.LJIIJ().LIZLLL(new PEF("fps_drop", c25420zC.LIZ, jSONObject, jSONObject2, jSONObject3));
        } catch (Throwable unused) {
        }
        c25420zC.LIZJ = 0;
        c25420zC.LIZLLL = 0;
        c25420zC.LIZIZ = 0L;
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIJ(long j, long j2, String str) {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        long j3 = j2 - j;
        LJIILIIL(j3, str);
        for (int i = 0; i < this.LJLILLLLZI.size(); i++) {
            ((PH3) ListProtector.get(this.LJLILLLLZI, i)).LIZ(j3);
        }
    }

    @Override // X.AbstractC06100Lu
    public final void LJIIL(String str, FrameMetrics frameMetrics, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            long metric = (frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))))) / 1000000;
            LJIILIIL(metric, str);
            for (int i2 = 0; i2 < this.LJLILLLLZI.size(); i2++) {
                ((PH3) ListProtector.get(this.LJLILLLLZI, i2)).LIZ(metric);
            }
        }
    }
}
