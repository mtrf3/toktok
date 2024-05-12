package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ag3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94379ag3 extends F9E implements C33Q {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final boolean LJLJI;
    public final List<C113624d4> LJLJJI;

    public C94379ag3() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C94379ag3(int i) {
        this("", "", false, C61878OQg.INSTANCE);
    }

    public C94379ag3(String currentKey, String selectedKey, boolean z, List<C113624d4> clusterList) {
        o.LJIIIZ(currentKey, "currentKey");
        o.LJIIIZ(selectedKey, "selectedKey");
        o.LJIIIZ(clusterList, "clusterList");
        this.LJLIL = currentKey;
        this.LJLILLLLZI = selectedKey;
        this.LJLJI = z;
        this.LJLJJI = clusterList;
    }

    public static C94379ag3 L(C94379ag3 c94379ag3, String currentKey, String selectedKey, boolean z, List clusterList, int i) {
        if ((i & 1) != 0) {
            currentKey = c94379ag3.LJLIL;
        }
        if ((i & 2) != 0) {
            selectedKey = c94379ag3.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z = c94379ag3.LJLJI;
        }
        if ((i & 8) != 0) {
            clusterList = c94379ag3.LJLJJI;
        }
        c94379ag3.getClass();
        o.LJIIIZ(currentKey, "currentKey");
        o.LJIIIZ(selectedKey, "selectedKey");
        o.LJIIIZ(clusterList, "clusterList");
        return new C94379ag3(currentKey, selectedKey, z, clusterList);
    }
}
