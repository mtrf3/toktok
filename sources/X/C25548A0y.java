package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.A0y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25548A0y extends AbstractC03120Ai {
    public final List<ManagementPagePaidVideo> LIZ;
    public final List<ManagementPagePaidVideo> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C25548A0y(List<ManagementPagePaidVideo> oldList, List<ManagementPagePaidVideo> newList) {
        o.LJIIIZ(oldList, "oldList");
        o.LJIIIZ(newList, "newList");
        this.LIZ = oldList;
        this.LIZIZ = newList;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        return o.LJ(ListProtector.get(this.LIZ, i), ListProtector.get(this.LIZIZ, i2));
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((ManagementPagePaidVideo) ListProtector.get(this.LIZ, i)).id, ((ManagementPagePaidVideo) ListProtector.get(this.LIZIZ, i2)).id);
    }
}
