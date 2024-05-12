package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Iou, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47768Iou {
    public final C47776Ip2 LIZ = new C47776Ip2();
    public int LIZIZ = 1;
    public boolean LIZJ = false;
    public int LIZLLL = 0;
    public int LJ = -1;
    public java.util.Map<Integer, List<Integer>> LJFF = new HashMap();
    public final java.util.Map<String, Object> LJI = new HashMap();

    public final String LIZ() {
        return this.LIZ.toString();
    }

    public final boolean LIZJ() {
        Boolean bool = this.LIZ.LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void LJ() {
        this.LIZ.LIZIZ();
        C47776Ip2 c47776Ip2 = this.LIZ;
        Boolean bool = Boolean.FALSE;
        c47776Ip2.LIZ = bool;
        c47776Ip2.LJIIJJI = bool;
        c47776Ip2.LJIIZILJ = bool;
        this.LIZIZ = 1;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = -1;
        ((HashMap) this.LJI).clear();
    }

    public C47768Iou() {
        LJ();
        this.LJFF.put(2, new ArrayList(Arrays.asList(3)));
    }

    public static int LIZIZ(C47160If6 c47160If6) {
        int i;
        EnumC47176IfM resolution = c47160If6.getResolution();
        if (resolution != null) {
            i = resolution.getIndex();
        } else {
            i = -1;
        }
        String LIZIZ = c47160If6.LIZIZ(32);
        if (LIZIZ != null) {
            try {
                return CastIntegerProtector.parseInt(LIZIZ);
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0137, code lost:
    
        if (r2.compareTo(java.lang.Integer.valueOf(r0.intValue() & r2.intValue())) != 0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0175, code lost:
    
        if (r2.compareTo(java.lang.Integer.valueOf(r0.intValue() & r2.intValue())) != 0) goto L134;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C47776Ip2 r8) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47768Iou.LJI(X.Ip2):void");
    }

    public final void LIZLLL(int i, int i2) {
        int i3 = this.LJ;
        if (i == i3) {
            return;
        }
        if (i == 0 && 2 == i3) {
            return;
        }
        this.LJ = i;
        if (2 == i) {
            this.LIZLLL = i2;
        }
    }

    public final void LJFF(Object obj, String str) {
        if (!TextUtils.isEmpty(str) && !((HashMap) this.LJI).containsKey(str)) {
            ((HashMap) this.LJI).put(str, obj);
        }
    }

    public final Boolean LJII(C47160If6 c47160If6, List<C47160If6> list) {
        int LIZIZ = LIZIZ(c47160If6);
        if (!((HashMap) this.LJFF).containsKey(Integer.valueOf(LIZIZ))) {
            return Boolean.FALSE;
        }
        Integer num = this.LIZ.LJJIFFI;
        List list2 = (List) ((HashMap) this.LJFF).get(Integer.valueOf(LIZIZ));
        if (list2 == null) {
            return Boolean.FALSE;
        }
        C47160If6 c47160If62 = null;
        for (C47160If6 c47160If63 : list) {
            int LIZIZ2 = LIZIZ(c47160If63);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((Integer) it.next()).intValue() == LIZIZ2 && (c47160If62 == null || c47160If62.LIZLLL(3) < c47160If63.LIZLLL(3))) {
                    c47160If62 = c47160If63;
                    break;
                }
            }
        }
        if (c47160If62 == null || (num != null && c47160If62.LIZLLL(1) <= num.intValue())) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
