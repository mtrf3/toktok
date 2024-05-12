package X;

import java.util.Comparator;

/* loaded from: classes6.dex */
public final class CX1<T> implements Comparator {
    public static final CX1<T> LJLIL = new CX1<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC31462CWk abstractC31462CWk = (AbstractC31462CWk) obj;
        AbstractC31462CWk abstractC31462CWk2 = (AbstractC31462CWk) obj2;
        if (abstractC31462CWk.LIZJ() < abstractC31462CWk2.LIZJ()) {
            return -1;
        }
        if (abstractC31462CWk.LIZJ() > abstractC31462CWk2.LIZJ()) {
            return 1;
        }
        return 0;
    }
}
