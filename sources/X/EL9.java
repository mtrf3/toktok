package X;

import com.ss.android.ugc.aweme.aigc.AIGCStyle;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EL9 extends F9E implements C33Q {
    public final C43I<List<AIGCStyle>> LJLIL;
    public final C43I<java.util.Set<AIGCStyle>> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EL9(C43I<? extends List<AIGCStyle>> c43i, C43I<? extends java.util.Set<AIGCStyle>> c43i2) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = c43i2;
    }

    public static EL9 L(EL9 el9, C43I dataSource, C43I selectedData, int i) {
        if ((i & 1) != 0) {
            dataSource = el9.LJLIL;
        }
        if ((i & 2) != 0) {
            selectedData = el9.LJLILLLLZI;
        }
        el9.getClass();
        o.LJIIIZ(dataSource, "dataSource");
        o.LJIIIZ(selectedData, "selectedData");
        return new EL9(dataSource, selectedData);
    }
}
