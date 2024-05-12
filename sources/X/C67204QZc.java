package X;

import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.QZc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67204QZc implements QYS {
    public final String LIZ;
    public final C67205QZd LIZIZ;

    @Override // X.QYS
    public final String getUserAgent() {
        java.util.Set unmodifiableSet;
        C67205QZd c67205QZd = this.LIZIZ;
        synchronized (c67205QZd.LIZ) {
            unmodifiableSet = Collections.unmodifiableSet(c67205QZd.LIZ);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.LIZ;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(' ');
        LIZ.append(LIZ(this.LIZIZ.LIZ()));
        return X1D.LIZIZ(LIZ);
    }

    public static String LIZ(java.util.Set<AbstractC67210QZi> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC67210QZi> it = set.iterator();
        while (it.hasNext()) {
            AbstractC67210QZi next = it.next();
            sb.append(next.LIZ());
            sb.append('/');
            sb.append(next.LIZIZ());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public C67204QZc(java.util.Set<AbstractC67210QZi> set, C67205QZd c67205QZd) {
        this.LIZ = LIZ(set);
        this.LIZIZ = c67205QZd;
    }
}
