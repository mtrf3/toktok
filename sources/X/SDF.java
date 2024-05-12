package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SDF implements SDM<C71740SDo> {
    public final List<SEI> LIZ;
    public final C71740SDo LIZIZ;
    public final int LIZJ;

    @Override // X.SDM
    public final C71729SDd<C71740SDo> LIZ(C71740SDo c71740SDo) {
        C71740SDo state = c71740SDo;
        o.LJIIIZ(state, "state");
        if (this.LIZJ >= this.LIZ.size()) {
            return new C71729SDd<>(state);
        }
        return ((SDK) ListProtector.get(this.LIZ, this.LIZJ)).LIZ(new SDF(this.LIZ, state, this.LIZJ + 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SDF(List<? extends SEI> components, C71740SDo state, int i) {
        o.LJIIIZ(components, "components");
        o.LJIIIZ(state, "state");
        this.LIZ = components;
        this.LIZIZ = state;
        this.LIZJ = i;
    }
}
