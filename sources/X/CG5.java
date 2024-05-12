package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveScoreSystemWeightSettings;
import com.bytedance.android.livesdk.livesetting.gift.ScoreWeights;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CG5 {
    public final CG4 LIZ;
    public volatile float LIZIZ;

    public final void LIZ() {
        float LIZLLL;
        float f;
        int i;
        float f2;
        LIZLLL = this.LIZ.LJII().LIZLLL(15);
        this.LIZ.LJIIIIZZ().getClass();
        float f3 = C31032CFw.LIZ.LIZLLL;
        this.LIZ.LJFF();
        double LIZ = CG7.LIZ();
        this.LIZ.LJI();
        float LIZ2 = CG6.LIZ();
        this.LIZ.LJ();
        long LIZ3 = CG8.LIZ();
        C123024sE LIZIZ = this.LIZ.LIZIZ();
        float f4 = 0.0f;
        if (LIZIZ != null) {
            f = LIZIZ.LIZ;
        } else {
            f = 0.0f;
        }
        if (LIZLLL <= 0.0f) {
            i = 1;
        } else {
            i = 0;
        }
        if (f3 <= 0.0f) {
            i |= 2;
        }
        if (((int) LIZ) == -999) {
            i |= 4;
        }
        if (((int) LIZ2) == -999) {
            i |= 8;
        }
        if (((int) LIZ3) <= 0) {
            i |= 16;
        }
        if (i != 0) {
            this.LIZIZ = -i;
            return;
        }
        ScoreWeights value = LiveScoreSystemWeightSettings.INSTANCE.getValue();
        Float[] fArr = new Float[6];
        fArr[0] = Float.valueOf(value.fpsWeight);
        fArr[1] = Float.valueOf(value.temperatureWeight);
        fArr[2] = Float.valueOf(value.cpuWeight);
        fArr[3] = Float.valueOf(value.memoryWeight);
        fArr[4] = Float.valueOf(value.networkWeight);
        if (f > 0.0f) {
            f4 = value.deviceScoreWeight;
        }
        fArr[5] = Float.valueOf(f4);
        ArrayList LJII = C47261Igj.LJII(fArr);
        float LLILL = ORZ.LLILL(LJII);
        if (LLILL < 1.0f) {
            LLILL = 1.0f;
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJII, 10));
        Iterator it = LJII.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((Number) it.next()).floatValue() / LLILL));
        }
        float LIZJ = LIZJ(this, Float.valueOf(LIZLLL), 0.008338f, 0.107859f, 0.040151f, -1.48278f, Float.valueOf(50.0f));
        float LIZJ2 = LIZJ(this, Float.valueOf(f3), -0.015441f, 1.362142f, -0.072795f, 3.14014f, Float.valueOf(31.0f));
        float LIZJ3 = LIZJ(this, Double.valueOf(LIZ), -0.4221014f, 0.998046f, -0.058336f, 0.270516f, Float.valueOf(2.0f));
        float f5 = 100;
        float LIZIZ2 = LIZIZ(Float.valueOf(LIZ2 * f5), -0.007036f, 1.512199f, -0.106204f, 10.635659f, Float.valueOf(92.0f), -0.00428571f, 0.52428573f, Float.valueOf(99.0f));
        float LIZJ4 = LIZJ(this, Long.valueOf(LIZ3), 6.057895E-4f, -0.09824576f, 6.185394E-5f, 0.80828875f, Float.valueOf(1666.0f));
        if (f <= 6.0f) {
            f2 = 0.21f;
        } else if (f <= 8.0f) {
            f2 = 0.58f;
        } else {
            f2 = 0.89f;
        }
        C47261Igj.LJII(Float.valueOf(LIZLLL), Float.valueOf(f3), Double.valueOf(LIZ), Float.valueOf(LIZ2), Long.valueOf(LIZ3), Float.valueOf(f));
        List LLJJIII = ORZ.LLJJIII(arrayList, C47261Igj.LJII(Float.valueOf(LIZJ), Float.valueOf(LIZJ2), Float.valueOf(LIZJ3), Float.valueOf(LIZIZ2), Float.valueOf(LIZJ4), Float.valueOf(f2)));
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(LLJJIII, 10));
        Iterator it2 = ((ArrayList) LLJJIII).iterator();
        while (it2.hasNext()) {
            OSZ osz = (OSZ) it2.next();
            arrayList2.add(Float.valueOf(((Number) osz.getSecond()).floatValue() * ((Number) osz.getFirst()).floatValue()));
        }
        this.LIZIZ = ORZ.LLILL(arrayList2) * f5;
    }

    public CG5(CG4 metricCollector) {
        o.LJIIIZ(metricCollector, "metricCollector");
        this.LIZ = metricCollector;
    }

    public static /* synthetic */ float LIZJ(CG5 cg5, Number number, float f, float f2, float f3, float f4, Float f5) {
        cg5.getClass();
        return LIZIZ(number, f, f2, f3, f4, f5, 0.0f, 0.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0019, code lost:
    
        if (r1 <= r6.floatValue()) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float LIZIZ(java.lang.Number r1, float r2, float r3, float r4, float r5, java.lang.Float r6, float r7, float r8, java.lang.Float r9) {
        /*
            float r1 = r1.floatValue()
            if (r6 == 0) goto L10
            if (r9 == 0) goto L13
            float r0 = r6.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L1c
        L10:
            float r2 = r2 * r1
            float r2 = r2 + r3
        L12:
            return r2
        L13:
            float r0 = r6.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L2c
            goto L10
        L1c:
            float r0 = r6.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L30
            float r0 = r9.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L30
        L2c:
            float r4 = r4 * r1
            float r2 = r4 + r5
            goto L12
        L30:
            float r7 = r7 * r1
            float r2 = r7 + r8
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CG5.LIZIZ(java.lang.Number, float, float, float, float, java.lang.Float, float, float, java.lang.Float):float");
    }
}
