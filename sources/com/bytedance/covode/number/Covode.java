package com.bytedance.covode.number;

import X.C38774FJq;
import X.C39743Fil;
import X.F3N;
import X.X1D;
import java.io.PrintStream;

/* loaded from: classes7.dex */
public abstract class Covode {
    public abstract boolean report(F3N f3n);

    public abstract boolean start(C38774FJq c38774FJq);

    public static CovodeNumberImpl getImpl() {
        return CovodeNumberImpl.LIZIZ;
    }

    public static void recordClassIndex(int i) {
        CovodeNumberImpl impl = getImpl();
        impl.getClass();
        PrintStream printStream = System.out;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("index: ");
        LIZ.append(i);
        printStream.println(X1D.LIZIZ(LIZ));
        C38774FJq c38774FJq = impl.LIZ;
        if (c38774FJq == null) {
            C39743Fil c39743Fil = CovodeNumberImpl.LIZJ;
            if (c39743Fil != null && c39743Fil.LIZJ) {
                if (i < 32767) {
                    c39743Fil.LIZIZ.add(Short.valueOf((short) i));
                    return;
                } else {
                    c39743Fil.LIZ.add(Integer.valueOf(i));
                    return;
                }
            }
            return;
        }
        if (!c38774FJq.LIZIZ) {
            return;
        }
        impl.recordClassIndexToFile(i);
    }

    public static boolean reportCollections(F3N f3n) {
        return getImpl().report(f3n);
    }

    public static boolean startCollecting(C38774FJq c38774FJq) {
        return getImpl().start(c38774FJq);
    }
}
