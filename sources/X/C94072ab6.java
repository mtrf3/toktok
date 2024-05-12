package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ab6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94072ab6 extends AbstractC03120Ai {
    public final /* synthetic */ C94071ab5 LIZ;
    public final /* synthetic */ List LIZIZ;

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return true;
    }

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.LJLIL.size();
    }

    public C94072ab6(C94071ab5 c94071ab5, List list) {
        this.LIZ = c94071ab5;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ.LJLIL, i), ListProtector.get(this.LIZIZ, i2));
    }
}
