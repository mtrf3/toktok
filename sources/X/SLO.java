package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLO extends AbstractC03120Ai {
    public final /* synthetic */ List<String> LIZ;
    public final /* synthetic */ List<String> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public SLO(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }
}
