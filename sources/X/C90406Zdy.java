package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Zdy, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90406Zdy {
    public static final Class<?> LIZ;
    public static final AbstractC90306ZcM<?, ?> LIZIZ;
    public static final AbstractC90306ZcM<?, ?> LIZJ;
    public static final C90713Ziv LIZLLL;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        LIZ = cls;
        LIZIZ = LJIIZILJ(false);
        LIZJ = LJIIZILJ(true);
        LIZLLL = new C90713Ziv();
    }

    public static AbstractC90306ZcM<?, ?> LJIIZILJ(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC90306ZcM) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int LJIJI(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90894Zlq) {
            C90894Zlq c90894Zlq = (C90894Zlq) list;
            i = 0;
            while (i2 < size) {
                c90894Zlq.LJIIIIZZ(i2);
                i += AbstractC90761Zjh.LJIJ(c90894Zlq.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC90761Zjh.LJIJ(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJIJJLI(List<?> list) {
        return list.size() * 4;
    }

    public static int LJJ(List<?> list) {
        return list.size() * 8;
    }

    public static int LJJI(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90894Zlq) {
            C90894Zlq c90894Zlq = (C90894Zlq) list;
            i = 0;
            while (i2 < size) {
                c90894Zlq.LJIIIIZZ(i2);
                i += AbstractC90761Zjh.LJIJ(c90894Zlq.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC90761Zjh.LJIJ(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJIFFI(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90884Zlg) {
            C90884Zlg c90884Zlg = (C90884Zlg) list;
            i = 0;
            while (i2 < size) {
                c90884Zlg.LJII(i2);
                i += AbstractC90761Zjh.LIZIZ(c90884Zlg.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC90761Zjh.LIZIZ(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJIIJ(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90894Zlq) {
            C90894Zlq c90894Zlq = (C90894Zlq) list;
            i = 0;
            while (i2 < size) {
                c90894Zlq.LJIIIIZZ(i2);
                int i3 = c90894Zlq.LJLILLLLZI[i2];
                i += AbstractC90761Zjh.LIZ((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) ListProtector.get(list, i2)).intValue();
                i += AbstractC90761Zjh.LIZ((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int LJJIIJZLJL(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90884Zlg) {
            C90884Zlg c90884Zlg = (C90884Zlg) list;
            i = 0;
            while (i2 < size) {
                c90884Zlg.LJII(i2);
                long j = c90884Zlg.LJLILLLLZI[i2];
                i += AbstractC90761Zjh.LIZIZ((j >> 63) ^ (j + j));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) ListProtector.get(list, i2)).longValue();
                i += AbstractC90761Zjh.LIZIZ((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int LJJIIZI(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90894Zlq) {
            C90894Zlq c90894Zlq = (C90894Zlq) list;
            i = 0;
            while (i2 < size) {
                c90894Zlq.LJIIIIZZ(i2);
                i += AbstractC90761Zjh.LIZ(c90894Zlq.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC90761Zjh.LIZ(((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int LJJIJ(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C90884Zlg) {
            C90884Zlg c90884Zlg = (C90884Zlg) list;
            i = 0;
            while (i2 < size) {
                c90884Zlg.LJII(i2);
                i += AbstractC90761Zjh.LIZIZ(c90884Zlg.LJLILLLLZI[i2]);
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += AbstractC90761Zjh.LIZIZ(((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static boolean LIZ(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int LJIJ(int i, List<AbstractC90364ZdI> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int LJIJJ = size * AbstractC90761Zjh.LJIJJ(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            int zzd = ((AbstractC90364ZdI) ListProtector.get(list, i2)).zzd();
            LJIJJ += AbstractC90761Zjh.LIZ(zzd) + zzd;
        }
        return LJIJJ;
    }

    public static int LJIJJ(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC90761Zjh.LIZ(i << 3) + 4);
    }

    public static int LJIL(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC90761Zjh.LIZ(i << 3) + 8);
    }

    public static int LJJIIZ(int i, List<?> list) {
        int LJIJI;
        int LJIJI2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int LJIJJ = AbstractC90761Zjh.LJIJJ(i) * size;
        if (list instanceof InterfaceC90398Zdq) {
            InterfaceC90398Zdq interfaceC90398Zdq = (InterfaceC90398Zdq) list;
            while (i2 < size) {
                Object LJIJJ2 = interfaceC90398Zdq.LJIJJ(i2);
                if (LJIJJ2 instanceof AbstractC90364ZdI) {
                    int zzd = ((AbstractC90364ZdI) LJIJJ2).zzd();
                    LJIJI2 = AbstractC90761Zjh.LIZ(zzd) + zzd;
                } else {
                    LJIJI2 = AbstractC90761Zjh.LJIJI((String) LJIJJ2);
                }
                LJIJJ += LJIJI2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = ListProtector.get(list, i2);
                if (obj instanceof AbstractC90364ZdI) {
                    int zzd2 = ((AbstractC90364ZdI) obj).zzd();
                    LJIJI = AbstractC90761Zjh.LIZ(zzd2) + zzd2;
                } else {
                    LJIJI = AbstractC90761Zjh.LJIJI((String) obj);
                }
                LJIJJ += LJIJI;
                i2++;
            }
        }
        return LJIJJ;
    }

    public static void LIZJ(int i, List<AbstractC90364ZdI> list, C90405Zdx c90405Zdx) {
        if (list != null && !list.isEmpty()) {
            c90405Zdx.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c90405Zdx.LIZ.LJ(i, (AbstractC90364ZdI) ListProtector.get(list, i2));
            }
        }
    }

    public static void LJIILJJIL(int i, List<String> list, C90405Zdx c90405Zdx) {
        if (list != null && !list.isEmpty()) {
            c90405Zdx.getClass();
            int i2 = 0;
            if (list instanceof InterfaceC90398Zdq) {
                InterfaceC90398Zdq interfaceC90398Zdq = (InterfaceC90398Zdq) list;
                while (i2 < list.size()) {
                    Object LJIJJ = interfaceC90398Zdq.LJIJJ(i2);
                    if (LJIJJ instanceof String) {
                        c90405Zdx.LIZ.LJIIJJI(i, (String) LJIJJ);
                    } else {
                        c90405Zdx.LIZ.LJ(i, (AbstractC90364ZdI) LJIJJ);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJIIJJI(i, (String) ListProtector.get(list, i2));
                i2++;
            }
        }
    }

    public static int LJJII(int i, InterfaceC90399Zdr interfaceC90399Zdr, Object obj) {
        int i2;
        if (obj instanceof C90381ZdZ) {
            C90381ZdZ c90381ZdZ = (C90381ZdZ) obj;
            int LIZ2 = AbstractC90761Zjh.LIZ(i << 3);
            if (c90381ZdZ.LIZIZ != null) {
                i2 = ((C90895Zlr) c90381ZdZ.LIZIZ).LJLIL.length;
            } else if (c90381ZdZ.LIZ != null) {
                i2 = c90381ZdZ.LIZ.LJFF();
            } else {
                i2 = 0;
            }
            return LIZ2 + AbstractC90761Zjh.LIZ(i2) + i2;
        }
        int LIZ3 = AbstractC90761Zjh.LIZ(i << 3);
        AbstractC90893Zlp abstractC90893Zlp = (AbstractC90893Zlp) ((InterfaceC90712Ziu) obj);
        int LIZ4 = abstractC90893Zlp.LIZ();
        if (LIZ4 == -1) {
            LIZ4 = interfaceC90399Zdr.LIZJ(abstractC90893Zlp);
            abstractC90893Zlp.LIZIZ(LIZ4);
        }
        return LIZ3 + AbstractC90761Zjh.LIZ(LIZ4) + LIZ4;
    }

    public static int LJJIII(int i, List<?> list, InterfaceC90399Zdr interfaceC90399Zdr) {
        int LIZ2;
        int LIZ3;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int LJIJJ = AbstractC90761Zjh.LJIJJ(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = ListProtector.get(list, i2);
            if (obj instanceof C90381ZdZ) {
                C90381ZdZ c90381ZdZ = (C90381ZdZ) obj;
                if (c90381ZdZ.LIZIZ != null) {
                    LIZ2 = ((C90895Zlr) c90381ZdZ.LIZIZ).LJLIL.length;
                } else if (c90381ZdZ.LIZ != null) {
                    LIZ2 = c90381ZdZ.LIZ.LJFF();
                } else {
                    LIZ2 = 0;
                }
                LIZ3 = AbstractC90761Zjh.LIZ(LIZ2);
            } else {
                AbstractC90893Zlp abstractC90893Zlp = (AbstractC90893Zlp) ((InterfaceC90712Ziu) obj);
                LIZ2 = abstractC90893Zlp.LIZ();
                if (LIZ2 == -1) {
                    LIZ2 = interfaceC90399Zdr.LIZJ(abstractC90893Zlp);
                    abstractC90893Zlp.LIZIZ(LIZ2);
                }
                LIZ3 = AbstractC90761Zjh.LIZ(LIZ2);
            }
            LJIJJ += LIZ3 + LIZ2;
        }
        return LJIJJ;
    }

    public static void LIZIZ(int i, List<Boolean> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) ListProtector.get(list, i4)).booleanValue();
                    i3++;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LIZJ(((Boolean) ListProtector.get(list, i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LIZLLL(i, ((Boolean) ListProtector.get(list, i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void LIZLLL(int i, List<Double> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) ListProtector.get(list, i4)).doubleValue();
                    i3 += 8;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIIIIZZ(Double.doubleToRawLongBits(((Double) ListProtector.get(list, i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJII(i, Double.doubleToRawLongBits(((Double) ListProtector.get(list, i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void LJ(int i, List<Integer> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC90761Zjh.LJIJ(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIIJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJIIIZ(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJFF(int i, List<Integer> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += 4;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJI(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJFF(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJI(int i, List<Long> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += 8;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIIIIZZ(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJII(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJII(int i, List<Float> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) ListProtector.get(list, i4)).floatValue();
                    i3 += 4;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJI(Float.floatToRawIntBits(((Float) ListProtector.get(list, i2)).floatValue()));
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJFF(i, Float.floatToRawIntBits(((Float) ListProtector.get(list, i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void LJIIIIZZ(int i, List<Integer> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC90761Zjh.LJIJ(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIIJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJIIIZ(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIIIZ(int i, List<Long> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC90761Zjh.LIZIZ(((Long) ListProtector.get(list, i4)).longValue());
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIILLIIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJIILL(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIIJ(int i, List<Integer> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += 4;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJI(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJFF(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIIJJI(int i, List<Long> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += 8;
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIIIIZZ(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJII(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIIL(int i, List<Integer> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) ListProtector.get(list, i4)).intValue();
                    i3 += AbstractC90761Zjh.LIZ((intValue >> 31) ^ (intValue + intValue));
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    AbstractC90761Zjh abstractC90761Zjh = c90405Zdx.LIZ;
                    int intValue2 = ((Integer) ListProtector.get(list, i2)).intValue();
                    abstractC90761Zjh.LJIILJJIL((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                AbstractC90761Zjh abstractC90761Zjh2 = c90405Zdx.LIZ;
                int intValue3 = ((Integer) ListProtector.get(list, i2)).intValue();
                abstractC90761Zjh2.LJIILIIL(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void LJIILIIL(int i, List<Long> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) ListProtector.get(list, i4)).longValue();
                    i3 += AbstractC90761Zjh.LIZIZ((longValue >> 63) ^ (longValue + longValue));
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    AbstractC90761Zjh abstractC90761Zjh = c90405Zdx.LIZ;
                    long longValue2 = ((Long) ListProtector.get(list, i2)).longValue();
                    abstractC90761Zjh.LJIILLIIL((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                AbstractC90761Zjh abstractC90761Zjh2 = c90405Zdx.LIZ;
                long longValue3 = ((Long) ListProtector.get(list, i2)).longValue();
                abstractC90761Zjh2.LJIILL(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public static void LJIILL(int i, List<Integer> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC90761Zjh.LIZ(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIILJJIL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJIILIIL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIILLIIL(int i, List<Long> list, C90405Zdx c90405Zdx, boolean z) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            if (z) {
                c90405Zdx.LIZ.LJIIL(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += AbstractC90761Zjh.LIZIZ(((Long) ListProtector.get(list, i4)).longValue());
                }
                c90405Zdx.LIZ.LJIILJJIL(i3);
                while (i2 < list.size()) {
                    c90405Zdx.LIZ.LJIILLIIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            c90405Zdx.getClass();
            while (i2 < list.size()) {
                c90405Zdx.LIZ.LJIILL(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }
}
