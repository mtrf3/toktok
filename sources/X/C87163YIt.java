package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.YIt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87163YIt {
    public static final Class<?> LIZ;
    public static final YJA<?, ?> LIZIZ;
    public static final YJA<?, ?> LIZJ;
    public static final C87162YIs LIZLLL;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        LIZ = cls;
        LIZIZ = LJIILLIIL(false);
        LIZJ = LJIILLIIL(true);
        LIZLLL = new C87162YIs();
    }

    public static int LJ(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84680XLg) {
            C84680XLg c84680XLg = (C84680XLg) list;
            i = 0;
            while (i2 < size) {
                c84680XLg.LJFF(i2);
                i += AbstractC87156YIm.LJIILLIIL(c84680XLg.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87156YIm.LJIILLIIL(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJFF(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84680XLg) {
            C84680XLg c84680XLg = (C84680XLg) list;
            i = 0;
            while (i2 < size) {
                c84680XLg.LJFF(i2);
                i += AbstractC87156YIm.LJIILLIIL(c84680XLg.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87156YIm.LJIILLIIL(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJI(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84680XLg) {
            C84680XLg c84680XLg = (C84680XLg) list;
            i = 0;
            while (i2 < size) {
                c84680XLg.LJFF(i2);
                long j = c84680XLg.LJLILLLLZI[i2];
                i += AbstractC87156YIm.LJIILLIIL((j >> 63) ^ (j << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) ListProtector.get(list, i2)).longValue();
                i += AbstractC87156YIm.LJIILLIIL((longValue >> 63) ^ (longValue << 1));
                i2++;
            }
        }
        return i;
    }

    public static int LJII(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84679XLf) {
            C84679XLf c84679XLf = (C84679XLf) list;
            i = 0;
            while (i2 < size) {
                c84679XLf.LJFF(i2);
                i += AbstractC87156YIm.LJIJJLI(c84679XLf.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87156YIm.LJIJJLI(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJIIIIZZ(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84679XLf) {
            C84679XLf c84679XLf = (C84679XLf) list;
            i = 0;
            while (i2 < size) {
                c84679XLf.LJFF(i2);
                i += AbstractC87156YIm.LJIJJLI(c84679XLf.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87156YIm.LJIJJLI(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJIIIZ(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84679XLf) {
            C84679XLf c84679XLf = (C84679XLf) list;
            i = 0;
            while (i2 < size) {
                c84679XLf.LJFF(i2);
                i += AbstractC87156YIm.LJIL(c84679XLf.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC87156YIm.LJIL(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJIIJ(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C84679XLf) {
            C84679XLf c84679XLf = (C84679XLf) list;
            i = 0;
            while (i2 < size) {
                c84679XLf.LJFF(i2);
                int i3 = c84679XLf.LJLILLLLZI[i2];
                i += AbstractC87156YIm.LJIL((i3 >> 31) ^ (i3 << 1));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) ListProtector.get(list, i2)).intValue();
                i += AbstractC87156YIm.LJIL((intValue >> 31) ^ (intValue << 1));
                i2++;
            }
        }
        return i;
    }

    public static int LJIIJJI(List<?> list) {
        return list.size() << 2;
    }

    public static int LJIIL(List<?> list) {
        return list.size() << 3;
    }

    public static YJA<?, ?> LJIILLIIL(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
        }
        if (cls == null) {
            return null;
        }
        try {
            return (YJA) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int LJIJ(int i, List<?> list) {
        int LJJ;
        int LJJ2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int LJIJJ = AbstractC87156YIm.LJIJJ(i) * size;
        if (list instanceof InterfaceC84696XLw) {
            InterfaceC84696XLw interfaceC84696XLw = (InterfaceC84696XLw) list;
            while (i2 < size) {
                Object LJJ3 = interfaceC84696XLw.LJJ(i2);
                if (LJJ3 instanceof AbstractC87141YHx) {
                    int size2 = ((AbstractC87141YHx) LJJ3).size();
                    LJJ2 = AbstractC87156YIm.LJIL(size2) + size2;
                } else {
                    LJJ2 = AbstractC87156YIm.LJJ((String) LJJ3);
                }
                LJIJJ += LJJ2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = ListProtector.get(list, i2);
                if (obj instanceof AbstractC87141YHx) {
                    int size3 = ((AbstractC87141YHx) obj).size();
                    LJJ = AbstractC87156YIm.LJIL(size3) + size3;
                } else {
                    LJJ = AbstractC87156YIm.LJJ((String) obj);
                }
                LJIJJ += LJJ;
                i2++;
            }
        }
        return LJIJJ;
    }

    public static int LJIJJLI(int i, List<AbstractC87141YHx> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int LJIJJ = AbstractC87156YIm.LJIJJ(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = ((AbstractC87141YHx) ListProtector.get(list, i2)).size();
            LJIJJ += AbstractC87156YIm.LJIL(size2) + size2;
        }
        return LJIJJ;
    }

    public static boolean LJJI(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static int LJJIJIIJIL(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC87156YIm.LJI(i) * size;
    }

    public static int LJJIJIL(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC87156YIm.LJJIIJ(i) * size;
    }

    public static void LIZ(int i, List list, YJ8 yj8) {
        if (list != null && !list.isEmpty()) {
            yj8.getClass();
            int i2 = 0;
            if (list instanceof InterfaceC84696XLw) {
                InterfaceC84696XLw interfaceC84696XLw = (InterfaceC84696XLw) list;
                while (i2 < list.size()) {
                    Object LJJ = interfaceC84696XLw.LJJ(i2);
                    if (LJJ instanceof String) {
                        yj8.LIZ.LJIILIIL(i, (String) LJJ);
                    } else {
                        yj8.LIZ.LIZIZ(i, (AbstractC87141YHx) LJJ);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                yj8.LIZ.LJIILIIL(i, (String) ListProtector.get(list, i2));
                i2++;
            }
        }
    }

    public static <T, FT extends YJB<FT>> void LIZLLL(YJ7<FT> yj7, T t, T t2) {
        C87165YIv<FT> LIZLLL2 = yj7.LIZLLL(t2);
        if (!LIZLLL2.LIZ.isEmpty()) {
            C87165YIv<FT> LJ = yj7.LJ(t);
            LJ.getClass();
            for (int i = 0; i < LIZLLL2.LIZ.LIZLLL(); i++) {
                LJ.LJII(LIZLLL2.LIZ.LJIIIIZZ(i));
            }
            Iterator<T> it = LIZLLL2.LIZ.LJ().iterator();
            while (it.hasNext()) {
                LJ.LJII((Map.Entry) it.next());
            }
        }
    }

    public static void LJIILIIL(int i, List list, YJ8 yj8) {
        if (list != null && !list.isEmpty()) {
            yj8.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                yj8.LIZ.LIZIZ(i, (AbstractC87141YHx) ListProtector.get(list, i2));
            }
        }
    }

    public static int LJIIZILJ(int i, YIU yiu, Object obj) {
        int i2;
        if (obj instanceof YIB) {
            YIB yib = (YIB) obj;
            int LJIJJ = AbstractC87156YIm.LJIJJ(i);
            if (yib.LIZIZ != null) {
                i2 = yib.LIZIZ.size();
            } else if (yib.LIZ != null) {
                i2 = yib.LIZ.LIZLLL();
            } else {
                i2 = 0;
            }
            return AbstractC87156YIm.LJIL(i2) + i2 + LJIJJ;
        }
        int LJIJJ2 = AbstractC87156YIm.LJIJJ(i);
        YIQ yiq = (YIQ) ((YIZ) obj);
        int LJFF = yiq.LJFF();
        if (LJFF == -1) {
            LJFF = yiu.LJ(yiq);
            yiq.LJI(LJFF);
        }
        return AbstractC87156YIm.LJIL(LJFF) + LJFF + LJIJJ2;
    }

    public static int LJIJI(int i, List<?> list, YIU yiu) {
        int LJFF;
        int LJIL;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int LJIJJ = AbstractC87156YIm.LJIJJ(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            if (obj instanceof YIB) {
                YIB yib = (YIB) obj;
                if (yib.LIZIZ != null) {
                    LJIL = yib.LIZIZ.size();
                } else if (yib.LIZ != null) {
                    LJIL = yib.LIZ.LIZLLL();
                } else {
                    LJIL = 0;
                }
                LJFF = AbstractC87156YIm.LJIL(LJIL);
            } else {
                YIQ yiq = (YIQ) ((YIZ) obj);
                LJFF = yiq.LJFF();
                if (LJFF == -1) {
                    LJFF = yiu.LJ(yiq);
                    yiq.LJI(LJFF);
                }
                LJIL = AbstractC87156YIm.LJIL(LJFF);
            }
            LJIJJ += LJFF + LJIL;
        }
        return LJIJJ;
    }

    public static void LIZIZ(int i, List list, YJ8 yj8, YIU yiu) {
        if (list != null && !list.isEmpty()) {
            yj8.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                yj8.LIZ.LIZJ(i, (YIZ) ListProtector.get(list, i2), yiu);
            }
        }
    }

    public static void LIZJ(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) ListProtector.get(list, i4)).doubleValue();
                    i3 += 8;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    AbstractC87156YIm abstractC87156YIm = yj8.LIZ;
                    double doubleValue = ((Double) ListProtector.get(list, i2)).doubleValue();
                    abstractC87156YIm.getClass();
                    abstractC87156YIm.LJIILL(Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                AbstractC87156YIm abstractC87156YIm2 = yj8.LIZ;
                double doubleValue2 = ((Double) ListProtector.get(list, i2)).doubleValue();
                abstractC87156YIm2.getClass();
                abstractC87156YIm2.LJJIFFI(i, Double.doubleToRawLongBits(doubleValue2));
                i2++;
            }
        }
    }

    public static void LJIILJJIL(int i, List list, YJ8 yj8, YIU yiu) {
        if (list != null && !list.isEmpty()) {
            yj8.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                yj8.LIZIZ(i, yiu, ListProtector.get(list, i2));
            }
        }
    }

    public static void LJIILL(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) ListProtector.get(list, i4)).floatValue();
                    i3 += 4;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    AbstractC87156YIm abstractC87156YIm = yj8.LIZ;
                    float floatValue = ((Float) ListProtector.get(list, i2)).floatValue();
                    abstractC87156YIm.getClass();
                    abstractC87156YIm.LJIJI(Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                AbstractC87156YIm abstractC87156YIm2 = yj8.LIZ;
                float floatValue2 = ((Float) ListProtector.get(list, i2)).floatValue();
                abstractC87156YIm2.getClass();
                abstractC87156YIm2.LIZLLL(i, Float.floatToRawIntBits(floatValue2));
                i2++;
            }
        }
    }

    public static void LJIJJ(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87156YIm.LJIILLIIL(((Long) ListProtector.get(list, i4)).longValue());
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIILJJIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJI(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIL(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87156YIm.LJIILLIIL(((Long) ListProtector.get(list, i4)).longValue());
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIILJJIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJI(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJJ(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += AbstractC87156YIm.LJIILLIIL((longValue >> 63) ^ (longValue << 1));
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    AbstractC87156YIm abstractC87156YIm = yj8.LIZ;
                    long longValue2 = ((Long) ListProtector.get(list, i2)).longValue();
                    abstractC87156YIm.LJIILJJIL((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                AbstractC87156YIm abstractC87156YIm2 = yj8.LIZ;
                long longValue3 = ((Long) ListProtector.get(list, i2)).longValue();
                abstractC87156YIm2.LJJI(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void LJJIFFI(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += 8;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIILL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJIFFI(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJJII(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += 8;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIILL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJIFFI(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJJIII(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87156YIm.LJIJJLI(((Integer) ListProtector.get(list, i4)).intValue());
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIIZILJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJIIZ(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJIIJ(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87156YIm.LJIL(((Integer) ListProtector.get(list, i4)).intValue());
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJIIZI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJIIJZLJL(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += AbstractC87156YIm.LJIL((intValue >> 31) ^ (intValue << 1));
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    AbstractC87156YIm abstractC87156YIm = yj8.LIZ;
                    int intValue2 = ((Integer) ListProtector.get(list, i2)).intValue();
                    abstractC87156YIm.LJIJ((intValue2 >> 31) ^ (intValue2 << 1));
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                AbstractC87156YIm abstractC87156YIm2 = yj8.LIZ;
                int intValue3 = ((Integer) ListProtector.get(list, i2)).intValue();
                abstractC87156YIm2.LJJIIZI(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i2++;
            }
        }
    }

    public static void LJJIIZ(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += 4;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIJI(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LIZLLL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJIIZI(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += 4;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIJI(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LIZLLL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJIJ(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC87156YIm.LJIJJLI(((Integer) ListProtector.get(list, i4)).intValue());
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIIZILJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJIIZ(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJIJIIJI(int i, List list, YJ8 yj8, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                yj8.LIZ.LJJIIJZLJL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) ListProtector.get(list, i4)).booleanValue();
                    i3++;
                }
                yj8.LIZ.LJIJ(i3);
                while (i2 < list.size()) {
                    yj8.LIZ.LJIIL(((Boolean) ListProtector.get(list, i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            yj8.getClass();
            while (i2 < list.size()) {
                yj8.LIZ.LJJII(i, ((Boolean) ListProtector.get(list, i2)).booleanValue());
                i2++;
            }
        }
    }
}
