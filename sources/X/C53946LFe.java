package X;

import Y.IDComparatorS29S0000000_1;
import android.app.Activity;
import com.bytedance.keva.Keva;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.LFe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53946LFe {
    public static WeakReference<Activity> LIZ;
    public static int LIZIZ = -1;
    public static volatile C53948LFg LIZJ;
    public static volatile C53948LFg LIZLLL;

    public static C53948LFg LIZIZ() {
        C53948LFg c53948LFg = LIZJ;
        if (c53948LFg != null && c53948LFg.LIZ == LIZIZ) {
            C53948LFg c53948LFg2 = LIZJ;
            o.LJI(c53948LFg2);
            return c53948LFg2;
        }
        return LIZJ(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r2.LJFF == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (r4 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.app.Activity r7, android.content.res.Configuration r8) {
        /*
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            if (r8 == 0) goto L98
            int r0 = r8.screenWidthDp
            double r0 = (double) r0
            int r6 = X.C17N.LJIILL(r0)
            int r0 = r8.screenHeightDp
            double r0 = (double) r0
            int r5 = X.C17N.LJIILL(r0)
        L18:
            if (r8 == 0) goto L79
            int r1 = r8.orientation
            r0 = 2
            if (r1 != r0) goto L80
            r4 = 1
        L20:
            X.LFg r0 = X.C53946LFe.LIZJ
            if (r0 == 0) goto L3c
            X.LFg r2 = X.C53946LFe.LIZJ
            if (r2 == 0) goto L69
            int r1 = r7.hashCode()
            int r0 = r2.LIZ
            if (r0 != r1) goto L3c
            int r0 = r2.LIZIZ
            if (r0 != r6) goto L3c
            int r0 = r2.LIZJ
            if (r0 != r5) goto L3c
            boolean r0 = r2.LJFF
            if (r0 == r4) goto L69
        L3c:
            X.LFg r0 = X.C53946LFe.LIZJ
            if (r0 != 0) goto L47
            X.LFg r0 = new X.LFg
            r0.<init>()
            X.C53946LFe.LIZJ = r0
        L47:
            X.LFg r3 = X.C53946LFe.LIZJ
            if (r3 == 0) goto L69
            int r2 = r7.hashCode()
            boolean r1 = X.C78886Uxe.LJJIJIIJIL(r7)
            boolean r0 = X.C78886Uxe.LJJIJIL(r7)
            r3.LIZ = r2
            r3.LIZIZ = r6
            r3.LIZJ = r5
            r3.LJFF = r4
            r3.LJI = r1
            r3.LJII = r0
            r0 = -120(0xffffffffffffff88, float:NaN)
            r3.LIZLLL = r0
            r3.LJ = r0
        L69:
            X.LFg r0 = X.C53946LFe.LIZJ
            if (r0 == 0) goto L78
            int r1 = r0.LIZIZ()
            int r0 = r0.LIZ()
            LIZLLL(r1, r0)
        L78:
            return
        L79:
            boolean r4 = X.C78886Uxe.LJJIJLIJ(r7)
            if (r4 == 0) goto L80
            goto L20
        L80:
            if (r6 <= r5) goto L93
            r2 = r5
            r0 = r6
        L84:
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = r1 / r0
            double r3 = (double) r1
            r1 = 4608533498688228557(0x3ff4cccccccccccd, double:1.3)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L96
            r4 = 1
            goto L20
        L93:
            r0 = r5
            r2 = r6
            goto L84
        L96:
            r4 = 0
            goto L20
        L98:
            int r6 = r0.widthPixels
            int r5 = r0.heightPixels
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53946LFe.LIZ(android.app.Activity, android.content.res.Configuration):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C53948LFg LIZJ(android.content.Context r3, android.content.res.Configuration r4) {
        /*
            if (r3 == 0) goto L84
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L84
            android.app.Activity r3 = (android.app.Activity) r3
        L8:
            if (r3 != 0) goto L90
        La:
            X.LFg r0 = X.C53946LFe.LIZJ
            if (r0 == 0) goto L14
            X.LFg r0 = X.C53946LFe.LIZJ
            kotlin.jvm.internal.o.LJI(r0)
        L13:
            return r0
        L14:
            X.LFg r0 = X.C53946LFe.LIZLLL
            r4 = -120(0xffffffffffffff88, float:NaN)
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            X.Ol8 r0 = X.C35815E3v.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r0 = r0 & 1
            if (r0 != r1) goto L32
        L2c:
            X.LFg r0 = X.C53946LFe.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            goto L13
        L32:
            X.LFg r0 = X.C53946LFe.LIZLLL
            if (r0 == 0) goto L2c
            int r0 = r0.LIZ
            if (r0 != r4) goto L2c
        L3a:
            android.content.Context r0 = X.EF7.LIZIZ()
            int[] r0 = X.C60996Nwm.LIZ(r0)
            r2 = r0[r3]
            r1 = r0[r1]
            r0 = -1
            if (r2 == r0) goto L4b
            if (r1 != r0) goto L4e
        L4b:
            X.LFg r0 = X.C53948LFg.LJIIIIZZ
            goto L13
        L4e:
            X.LFg r0 = new X.LFg
            r0.<init>()
            X.C53946LFe.LIZLLL = r0
            X.LFg r0 = X.C53946LFe.LIZLLL
            if (r0 == 0) goto L69
            r0.LIZ = r4
            r0.LIZIZ = r2
            r0.LIZJ = r1
            r0.LJFF = r3
            r0.LJI = r3
            r0.LJII = r3
            r0.LIZLLL = r4
            r0.LJ = r4
        L69:
            X.LFg r0 = X.C53946LFe.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            int r1 = r0.LIZIZ()
            X.LFg r0 = X.C53946LFe.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            int r0 = r0.LIZ()
            LIZLLL(r1, r0)
            X.LFg r0 = X.C53946LFe.LIZLLL
            kotlin.jvm.internal.o.LJI(r0)
            goto L13
        L84:
            java.lang.ref.WeakReference<android.app.Activity> r0 = X.C53946LFe.LIZ
            if (r0 == 0) goto La
            java.lang.Object r3 = r0.get()
            android.app.Activity r3 = (android.app.Activity) r3
            goto L8
        L90:
            LIZ(r3, r4)
            X.LFg r0 = X.C53946LFe.LIZJ
            kotlin.jvm.internal.o.LJI(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53946LFe.LIZJ(android.content.Context, android.content.res.Configuration):X.LFg");
    }

    public static void LIZLLL(int i, int i2) {
        Integer LIZIZ2;
        int i3;
        int i4;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i > i2) {
            int intValue = ((Number) C53947LFf.LIZ.getValue()).intValue() + i2;
            if (i > intValue) {
                i2 = i;
                i = intValue;
            } else {
                i2 = i;
                i = i2;
            }
        }
        C53947LFf.LJFF();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(i);
        LIZ2.append(',');
        LIZ2.append(i2);
        String LIZIZ3 = X1D.LIZIZ(LIZ2);
        Integer num = (Integer) ((LinkedHashMap) C53947LFf.LJFF).get(LIZIZ3);
        int i5 = 1;
        if (num == null) {
            LIZIZ2 = 1;
            Keva LIZJ2 = C53947LFf.LIZJ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ3);
            LIZ3.append("_width");
            LIZJ2.storeInt(X1D.LIZIZ(LIZ3), i);
            Keva LIZJ3 = C53947LFf.LIZJ();
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZIZ3);
            LIZ4.append("_height");
            LIZJ3.storeInt(X1D.LIZIZ(LIZ4), i2);
        } else {
            LIZIZ2 = C77339UWx.LIZIZ(num, 1);
        }
        C53947LFf.LJFF.put(LIZIZ3, LIZIZ2);
        C53947LFf.LIZIZ().storeInt(LIZIZ3, LIZIZ2.intValue());
        if (!o.LJ(LIZIZ3, C53947LFf.LIZLLL)) {
            Integer num2 = (Integer) ((LinkedHashMap) C53947LFf.LJFF).get(C53947LFf.LIZLLL);
            if (num2 != null) {
                i4 = num2.intValue();
            } else {
                i4 = 0;
            }
            if (LIZIZ2.intValue() > i4) {
                C53947LFf.LIZLLL = LIZIZ3;
                C53947LFf.LIZIZ = i;
                C53947LFf.LIZJ = i2;
            }
        }
        Integer num3 = (Integer) ((LinkedHashMap) C53947LFf.LJFF).get(C53947LFf.LIZLLL);
        if (num3 != null && num3.intValue() >= 3000000) {
            ArrayList arrayList = new ArrayList();
            for (String str : ((LinkedHashMap) C53947LFf.LJFF).keySet()) {
                Integer num4 = (Integer) ((LinkedHashMap) C53947LFf.LJFF).get(str);
                if (num4 != null) {
                    i3 = num4.intValue();
                } else {
                    i3 = 0;
                }
                int i6 = i3 - 1500000;
                C53947LFf.LJFF.put(str, Integer.valueOf(i6));
                C53947LFf.LIZIZ().storeInt(str, i6);
                if (i6 <= 0) {
                    arrayList.add(str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C53947LFf.LJ((String) it.next());
            }
        }
        if (C53947LFf.LJFF.size() < 100) {
            return;
        }
        List<Map.Entry> LLILII = ORZ.LLILII(new IDComparatorS29S0000000_1(13), ((LinkedHashMap) C53947LFf.LJFF).entrySet());
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(LLILII, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (Map.Entry entry : LLILII) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((Number) entry.getValue()).intValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : linkedHashMap.keySet()) {
            if (i5 >= 50) {
                break;
            }
            i5++;
            arrayList2.add(obj);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C53947LFf.LJ((String) it2.next());
        }
    }
}
