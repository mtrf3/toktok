package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XLG {
    public static final C3BS LIZ = new C3BS("NO_THREAD_ELEMENTS");
    public static final XLI LIZIZ = XLI.LJLIL;
    public static final XLK LIZJ = XLK.LJLIL;
    public static final XLH LIZLLL = XLH.LJLIL;

    public static final Object LIZIZ(MBA mba) {
        Object fold = mba.fold(0, LIZIZ);
        o.LJI(fold);
        return fold;
    }

    public static final void LIZ(Object obj, MBA mba) {
        if (obj == LIZ) {
            return;
        }
        if (obj instanceof XLJ) {
            XLJ xlj = (XLJ) obj;
            int length = xlj.LIZJ.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i = length - 1;
                XLF<Object> xlf = xlj.LIZJ[length];
                o.LJI(xlf);
                xlf.LJFF(xlj.LIZIZ[length]);
                if (i < 0) {
                    return;
                } else {
                    length = i;
                }
            }
        } else {
            Object fold = mba.fold(null, LIZJ);
            if (fold != null) {
                ((XLF) fold).LJFF(obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static final Object LIZJ(Object obj, MBA mba) {
        if (obj == null) {
            obj = LIZIZ(mba);
        }
        if (obj == 0) {
            return LIZ;
        }
        if (obj instanceof Integer) {
            return mba.fold(new XLJ(mba, ((Number) obj).intValue()), LIZLLL);
        }
        return ((XLF) obj).LJJIL(mba);
    }
}
