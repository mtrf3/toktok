package X;

import kotlin.jvm.internal.o;

/* renamed from: X.M8b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56309M8b implements Comparable<C56309M8b> {
    public final M74 LJLIL;
    public final String LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC55643Lsd LJLJJI;
    public final M76 LJLJJL;
    public M74 LJLJJLL = C55360Lo4.LJLIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("\n            id = ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(",\n            priority = ");
        LIZ.append(this.LJLJI);
        LIZ.append(",\n            scene = ");
        LIZ.append(this.LJLJJI);
        LIZ.append(",\n            dependency = ");
        LIZ.append(this.LJLJJL);
        LIZ.append(",\n            mTask = ");
        LIZ.append(this.LJLJJLL);
        LIZ.append("\n        ");
        return C38346F3e.LJJIJIIJI(X1D.LIZIZ(LIZ));
    }

    public C56309M8b(M74 m74) {
        this.LJLIL = m74;
        this.LJLILLLLZI = m74.getId();
        this.LJLJI = m74.getPriority();
        this.LJLJJI = m74.scene;
        this.LJLJJL = m74.getDependency();
    }

    @Override // java.lang.Comparable
    public final int compareTo(C56309M8b c56309M8b) {
        C56309M8b other = c56309M8b;
        o.LJIIIZ(other, "other");
        if (this.LJLJI > other.LJLJI) {
            return 1;
        }
        return -1;
    }
}
