package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WHr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82039WHr extends AbstractC03120Ai {
    public final /* synthetic */ List<C82033WHl> LIZ;
    public final /* synthetic */ List<C82033WHl> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C82039WHr(List<C82033WHl> list, List<C82033WHl> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        if (((C82033WHl) ListProtector.get(this.LIZ, i)).LIZ == ((C82033WHl) ListProtector.get(this.LIZIZ, i2)).LIZ) {
            return true;
        }
        return false;
    }
}
