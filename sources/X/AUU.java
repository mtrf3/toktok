package X;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AUU {
    public final AU2 LIZ = new AU2(0);
    public AUV LIZIZ = new AUV(0);
    public final AUM LIZJ = new AUM(null);

    public final void LIZ(InterfaceC53590L1m<? extends AUS>... interfaceC53590L1mArr) {
        java.util.Set set;
        java.util.Set<? extends InterfaceC53590L1m<?>> set2 = this.LIZIZ.LIZ;
        if (set2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C51029K0z.LJJIIZ(set2.size() + interfaceC53590L1mArr.length));
            linkedHashSet.addAll(set2);
            ORS.LJJLIIIJJIZ(linkedHashSet, interfaceC53590L1mArr);
            set = linkedHashSet;
        } else {
            set = ORY.LJLIL(interfaceC53590L1mArr);
        }
        AUW businessPriority = this.LIZIZ.LIZIZ;
        o.LJIIIZ(businessPriority, "businessPriority");
        this.LIZIZ = new AUV(set, businessPriority);
    }
}
