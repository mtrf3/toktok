package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.05G, reason: invalid class name */
/* loaded from: classes.dex */
public final class C05G {
    public final C1JY LIZ;
    public final java.util.Set<Integer> LIZIZ;

    public C05G(C07210Qb semanticsNode, java.util.Map<Integer, C05I> currentSemanticsNodes) {
        o.LJIIIZ(semanticsNode, "semanticsNode");
        o.LJIIIZ(currentSemanticsNodes, "currentSemanticsNodes");
        this.LIZ = semanticsNode.LJFF;
        this.LIZIZ = new LinkedHashSet();
        List<C07210Qb> LJII = semanticsNode.LJII();
        int size = LJII.size();
        for (int i = 0; i < size; i++) {
            C07210Qb c07210Qb = (C07210Qb) ListProtector.get(LJII, i);
            if (currentSemanticsNodes.containsKey(Integer.valueOf(c07210Qb.LJI))) {
                this.LIZIZ.add(Integer.valueOf(c07210Qb.LJI));
            }
        }
    }
}
