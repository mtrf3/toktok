package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.YIi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87152YIi {
    public static final Class LIZ;
    public static final YJH LIZIZ;
    public static final YJH LIZJ;
    public static final C87160YIq LIZLLL;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        LIZ = cls;
        LIZIZ = LJIJI(false);
        LIZJ = LJIJI(true);
        LIZLLL = new C87160YIq();
    }

    public static YJH LJIJI(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
        }
        if (cls == null) {
            return null;
        }
        try {
            return (YJH) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int LJIJJLI(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84684XLk) {
            C84684XLk c84684XLk = (C84684XLk) list;
            i = 0;
            while (i2 < size) {
                c84684XLk.LJII(i2);
                i += AbstractC87153YIj.LLFFF(c84684XLk.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87153YIj.LLFFF(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJ(List list) {
        return list.size() * 4;
    }

    public static int LJJIFFI(List list) {
        return list.size() * 8;
    }

    public static int LJJII(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84684XLk) {
            C84684XLk c84684XLk = (C84684XLk) list;
            i = 0;
            while (i2 < size) {
                c84684XLk.LJII(i2);
                i += AbstractC87153YIj.LLFFF(c84684XLk.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87153YIj.LLFFF(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJIII(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84686XLm) {
            C84686XLm c84686XLm = (C84686XLm) list;
            i = 0;
            while (i2 < size) {
                c84686XLm.LJII(i2);
                i += AbstractC87153YIj.LJLJLJ(c84686XLm.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87153YIj.LJLJLJ(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJIIZ(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84684XLk) {
            C84684XLk c84684XLk = (C84684XLk) list;
            i = 0;
            while (i2 < size) {
                c84684XLk.LJII(i2);
                int i3 = c84684XLk.LJLILLLLZI[i2];
                i += AbstractC87153YIj.LJLJL((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) ListProtector.get(list, i2)).intValue();
                i += AbstractC87153YIj.LJLJL((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int LJJIIZI(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84686XLm) {
            C84686XLm c84686XLm = (C84686XLm) list;
            i = 0;
            while (i2 < size) {
                c84686XLm.LJII(i2);
                long j = c84686XLm.LJLILLLLZI[i2];
                i += AbstractC87153YIj.LJLJLJ((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) ListProtector.get(list, i2)).longValue();
                i += AbstractC87153YIj.LJLJLJ((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int LJJIJIIJI(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84684XLk) {
            C84684XLk c84684XLk = (C84684XLk) list;
            i = 0;
            while (i2 < size) {
                c84684XLk.LJII(i2);
                i += AbstractC87153YIj.LJLJL(c84684XLk.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87153YIj.LJLJL(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJIJIIJIL(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84686XLm) {
            C84686XLm c84686XLm = (C84686XLm) list;
            i = 0;
            while (i2 < size) {
                c84686XLm.LJII(i2);
                i += AbstractC87153YIj.LJLJLJ(c84686XLm.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87153YIj.LJLJLJ(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static boolean LJIJ(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int LJIJJ(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int LLFZ = AbstractC87153YIj.LLFZ(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd = ((AbstractC87134YHq) ListProtector.get(list, i2)).zzd();
            LLFZ += AbstractC87153YIj.LJLJL(zzd) + zzd;
        }
        return LLFZ;
    }

    public static int LJIL(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC87153YIj.LJLJL(i << 3) + 4) * size;
    }

    public static int LJJI(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC87153YIj.LJLJL(i << 3) + 8) * size;
    }

    public static int LJJIJ(int i, List list) {
        int LLFII;
        int LLFII2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int LLFZ = AbstractC87153YIj.LLFZ(i) * size;
        if (list instanceof XM3) {
            XM3 xm3 = (XM3) list;
            while (i2 < size) {
                Object LJIIJJI = xm3.LJIIJJI(i2);
                if (LJIIJJI instanceof AbstractC87134YHq) {
                    int zzd = ((AbstractC87134YHq) LJIIJJI).zzd();
                    LLFII2 = AbstractC87153YIj.LJLJL(zzd) + zzd;
                } else {
                    LLFII2 = AbstractC87153YIj.LLFII((String) LJIIJJI);
                }
                LLFZ += LLFII2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = ListProtector.get(list, i2);
                if (obj instanceof AbstractC87134YHq) {
                    int zzd2 = ((AbstractC87134YHq) obj).zzd();
                    LLFII = AbstractC87153YIj.LJLJL(zzd2) + zzd2;
                } else {
                    LLFII = AbstractC87153YIj.LLFII((String) obj);
                }
                LLFZ += LLFII;
                i2++;
            }
        }
        return LLFZ;
    }

    public static void LIZIZ(int i, List list, C87149YIf c87149YIf) {
        if (list != null && !list.isEmpty()) {
            c87149YIf.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c87149YIf.LIZ.LJLLI(i, (AbstractC87134YHq) ListProtector.get(list, i2));
            }
        }
    }

    public static void LJIILL(int i, List list, C87149YIf c87149YIf) {
        if (list != null && !list.isEmpty()) {
            c87149YIf.getClass();
            int i2 = 0;
            if (list instanceof XM3) {
                XM3 xm3 = (XM3) list;
                while (i2 < list.size()) {
                    Object LJIIJJI = xm3.LJIIJJI(i2);
                    if (LJIIJJI instanceof String) {
                        c87149YIf.LIZ.LJZ(i, (String) LJIIJJI);
                    } else {
                        c87149YIf.LIZ.LJLLI(i, (AbstractC87134YHq) LJIIJJI);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJZ(i, (String) ListProtector.get(list, i2));
                i2++;
            }
        }
    }

    public static int LJJIIJ(int i, YIV yiv, Object obj) {
        int i2;
        if (obj instanceof YII) {
            YII yii = (YII) obj;
            int LJLJL = AbstractC87153YIj.LJLJL(i << 3);
            if (yii.LIZIZ != null) {
                i2 = ((C87135YHr) yii.LIZIZ).LJLIL.length;
            } else if (yii.LIZ != null) {
                i2 = yii.LIZ.LIZ();
            } else {
                i2 = 0;
            }
            return AbstractC87153YIj.LJLJL(i2) + i2 + LJLJL;
        }
        int LJLJL2 = AbstractC87153YIj.LJLJL(i << 3);
        YIP yip = (YIP) ((YIH) obj);
        int LJFF = yip.LJFF();
        if (LJFF == -1) {
            LJFF = yiv.LIZJ(yip);
            yip.LJII(LJFF);
        }
        return AbstractC87153YIj.LJLJL(LJFF) + LJFF + LJLJL2;
    }

    public static int LJJIIJZLJL(int i, List list, YIV yiv) {
        int LJFF;
        int LJLJL;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int LLFZ = AbstractC87153YIj.LLFZ(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            if (obj instanceof YII) {
                YII yii = (YII) obj;
                if (yii.LIZIZ != null) {
                    LJFF = ((C87135YHr) yii.LIZIZ).LJLIL.length;
                } else if (yii.LIZ != null) {
                    LJFF = yii.LIZ.LIZ();
                } else {
                    LJFF = 0;
                }
                LJLJL = AbstractC87153YIj.LJLJL(LJFF);
            } else {
                YIP yip = (YIP) ((YIH) obj);
                LJFF = yip.LJFF();
                if (LJFF == -1) {
                    LJFF = yiv.LIZJ(yip);
                    yip.LJII(LJFF);
                }
                LJLJL = AbstractC87153YIj.LJLJL(LJFF);
            }
            LLFZ = LJLJL + LJFF + LLFZ;
        }
        return LLFZ;
    }

    public static void LIZ(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) ListProtector.get(list, i4)).booleanValue();
                    i3++;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLJLLL(((Boolean) ListProtector.get(list, i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLL(i, ((Boolean) ListProtector.get(list, i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void LIZJ(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) ListProtector.get(list, i4)).doubleValue();
                    i3 += 8;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLLLL(Double.doubleToRawLongBits(((Double) ListProtector.get(list, i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLL(i, Double.doubleToRawLongBits(((Double) ListProtector.get(list, i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void LIZLLL(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87153YIj.LLFFF(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLZ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLLLLL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJ(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += 4;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLLJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLILLLL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJFF(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += 8;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLLLL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLL(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJI(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) ListProtector.get(list, i4)).floatValue();
                    i3 += 4;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLLJ(Float.floatToRawIntBits(((Float) ListProtector.get(list, i2)).floatValue()));
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLILLLL(i, Float.floatToRawIntBits(((Float) ListProtector.get(list, i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void LJII(int i, List list, C87149YIf c87149YIf, YIV yiv) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                c87149YIf.LIZIZ(i, yiv, ListProtector.get(list, i2));
            }
        }
    }

    public static void LJIIIIZZ(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87153YIj.LLFFF(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLZ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLLLLL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIIIZ(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87153YIj.LJLJLJ(((Long) ListProtector.get(list, i4)).longValue());
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LLF(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LLD(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIIJ(int i, List list, C87149YIf c87149YIf, YIV yiv) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                c87149YIf.LIZJ(i, yiv, ListProtector.get(list, i2));
            }
        }
    }

    public static void LJIIJJI(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += 4;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLLJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLILLLL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIIL(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += 8;
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LJLLLL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJLLL(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIILIIL(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += AbstractC87153YIj.LJLJL((intValue >> 31) ^ (intValue + intValue));
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    AbstractC87153YIj abstractC87153YIj = c87149YIf.LIZ;
                    int intValue2 = ((Integer) ListProtector.get(list, i2)).intValue();
                    abstractC87153YIj.LL((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                AbstractC87153YIj abstractC87153YIj2 = c87149YIf.LIZ;
                int intValue3 = ((Integer) ListProtector.get(list, i2)).intValue();
                abstractC87153YIj2.LJZL(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void LJIILJJIL(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += AbstractC87153YIj.LJLJLJ((longValue >> 63) ^ (longValue + longValue));
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    AbstractC87153YIj abstractC87153YIj = c87149YIf.LIZ;
                    long longValue2 = ((Long) ListProtector.get(list, i2)).longValue();
                    abstractC87153YIj.LLF((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                AbstractC87153YIj abstractC87153YIj2 = c87149YIf.LIZ;
                long longValue3 = ((Long) ListProtector.get(list, i2)).longValue();
                abstractC87153YIj2.LLD(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public static void LJIILLIIL(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87153YIj.LJLJL(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LJZL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIIZILJ(int i, List list, C87149YIf c87149YIf, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c87149YIf.LIZ.LJZI(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87153YIj.LJLJLJ(((Long) ListProtector.get(list, i4)).longValue());
                }
                c87149YIf.LIZ.LL(i3);
                while (i2 < list.size()) {
                    c87149YIf.LIZ.LLF(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c87149YIf.getClass();
            while (i2 < list.size()) {
                c87149YIf.LIZ.LLD(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }
}
