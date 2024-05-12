package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MRj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56811MRj extends AbstractC03120Ai {
    public final List<MusNotice> LIZ;
    public final List<MusNotice> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C56811MRj(List<? extends MusNotice> oldList, List<? extends MusNotice> newList) {
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
        if (((MusNotice) ListProtector.get(this.LIZ, i)).getUniqueId() == ((MusNotice) ListProtector.get(this.LIZIZ, i2)).getUniqueId()) {
            return true;
        }
        return false;
    }
}
