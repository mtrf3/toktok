package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68368QsO {
    public static double LIZ(double d) {
        int i;
        if (Double.isNaN(d)) {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        if (!Double.isInfinite(d) && d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                i = 1;
            } else {
                i = -1;
            }
            return Math.floor(Math.abs(d)) * i;
        }
        return d;
    }

    public static int LIZIZ(double d) {
        int i;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return 0;
        }
        if (d > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            i = 1;
        } else {
            i = -1;
        }
        return (int) ((Math.floor(Math.abs(d)) * i) % 4.294967296E9d);
    }

    public static void LIZJ(C68377QsX c68377QsX) {
        int LIZIZ = LIZIZ(c68377QsX.LIZLLL("runtime.counter").LJI().doubleValue() + 1.0d);
        if (LIZIZ <= 1000000) {
            c68377QsX.LJFF("runtime.counter", new C68366QsM(Double.valueOf(LIZIZ)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long LIZLLL(double d) {
        return LIZIZ(d) & 4294967295L;
    }

    public static EnumC68385Qsf LJ(String str) {
        EnumC68385Qsf zza;
        if (str != null && !str.isEmpty() && (zza = EnumC68385Qsf.zza(CastIntegerProtector.parseInt(str))) != null) {
            return zza;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Unsupported commandId %s", new Object[]{str}));
    }

    public static Object LJFF(InterfaceC68379QsZ interfaceC68379QsZ) {
        if (InterfaceC68379QsZ.LJIIJJI.equals(interfaceC68379QsZ)) {
            return null;
        }
        if (InterfaceC68379QsZ.LJIIJ.equals(interfaceC68379QsZ)) {
            return "";
        }
        if (interfaceC68379QsZ instanceof C68363QsJ) {
            return LJI((C68363QsJ) interfaceC68379QsZ);
        }
        if (interfaceC68379QsZ instanceof C68375QsV) {
            ArrayList arrayList = new ArrayList();
            C68375QsV c68375QsV = (C68375QsV) interfaceC68379QsZ;
            c68375QsV.getClass();
            C68374QsU c68374QsU = new C68374QsU(c68375QsV);
            while (c68374QsU.hasNext()) {
                Object LJFF = LJFF((InterfaceC68379QsZ) c68374QsU.next());
                if (LJFF != null) {
                    arrayList.add(LJFF);
                }
            }
            return arrayList;
        }
        if (!interfaceC68379QsZ.LJI().isNaN()) {
            return interfaceC68379QsZ.LJI();
        }
        return interfaceC68379QsZ.LJII();
    }

    public static java.util.Map LJI(C68363QsJ c68363QsJ) {
        HashMap hashMap = new HashMap();
        c68363QsJ.getClass();
        Iterator it = new ArrayList(((HashMap) c68363QsJ.LJLIL).keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object LJFF = LJFF(c68363QsJ.LJIIIZ(str));
            if (LJFF != null) {
                hashMap.put(str, LJFF);
            }
        }
        return hashMap;
    }

    public static boolean LJIIJ(InterfaceC68379QsZ interfaceC68379QsZ) {
        if (interfaceC68379QsZ == null) {
            return false;
        }
        Double LJI = interfaceC68379QsZ.LJI();
        if (LJI.isNaN() || LJI.doubleValue() < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || !LJI.equals(Double.valueOf(Math.floor(LJI.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJJI(InterfaceC68379QsZ interfaceC68379QsZ, InterfaceC68379QsZ interfaceC68379QsZ2) {
        if (!interfaceC68379QsZ.getClass().equals(interfaceC68379QsZ2.getClass())) {
            return false;
        }
        if ((interfaceC68379QsZ instanceof C68371QsR) || (interfaceC68379QsZ instanceof C68367QsN)) {
            return true;
        }
        if (interfaceC68379QsZ instanceof C68366QsM) {
            if (Double.isNaN(interfaceC68379QsZ.LJI().doubleValue()) || Double.isNaN(interfaceC68379QsZ2.LJI().doubleValue())) {
                return false;
            }
            return interfaceC68379QsZ.LJI().equals(interfaceC68379QsZ2.LJI());
        }
        if (interfaceC68379QsZ instanceof C68376QsW) {
            return interfaceC68379QsZ.LJII().equals(interfaceC68379QsZ2.LJII());
        }
        if (interfaceC68379QsZ instanceof C68365QsL) {
            return interfaceC68379QsZ.LIZJ().equals(interfaceC68379QsZ2.LIZJ());
        }
        if (interfaceC68379QsZ != interfaceC68379QsZ2) {
            return false;
        }
        return true;
    }

    public static void LJII(int i, String str, List list) {
        if (list.size() == i) {
        } else {
            throw new IllegalArgumentException(C16880lQ.LLLZ("%s operation requires %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    public static void LJIIIIZZ(int i, String str, List list) {
        if (list.size() >= i) {
        } else {
            throw new IllegalArgumentException(C16880lQ.LLLZ("%s operation requires at least %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(list.size())}));
        }
    }

    public static void LJIIIZ(int i, String str, List list) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() <= i) {
        } else {
            throw new IllegalArgumentException(C16880lQ.LLLZ("%s operation requires at most %s parameters found %s", new Object[]{str, Integer.valueOf(i), Integer.valueOf(arrayList.size())}));
        }
    }
}
