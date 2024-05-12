package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58625Mzd extends AbstractC58624Mzc {
    public final List<InterfaceC55235Lm3> LJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC58625Mzd(Object... contexts) {
        super(Arrays.copyOf(contexts, contexts.length));
        o.LJIIIZ(contexts, "contexts");
        this.LJI = new ArrayList();
    }

    @Override // X.C58620MzY
    public final M95 LJIILLIIL(C58620MzY... c58620MzYArr) {
        return new M96(this.LJI, (L71[]) Arrays.copyOf(c58620MzYArr, c58620MzYArr.length));
    }

    public final <T extends AbstractC63695OzD> void LJJIFFI(T t) {
        java.util.Map LIZ = LJJ().LIZ(LJIILLIIL(new C58620MzY[0]), t.LIZ, C113554cx.LJJLIL(t.LIZJ()));
        if (LIZ == null) {
            return;
        }
        LJJI(t.LIZ, LIZ);
    }
}
