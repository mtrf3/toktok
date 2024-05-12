package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Htf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45515Htf extends AbstractC03120Ai {
    public final List<MyMediaModel> LIZ;
    public final List<MyMediaModel> LIZIZ;

    @Override // X.AbstractC03120Ai
    public final int LIZLLL() {
        return this.LIZIZ.size();
    }

    @Override // X.AbstractC03120Ai
    public final int LJ() {
        return this.LIZ.size();
    }

    public C45515Htf(List<MyMediaModel> oldList, List<MyMediaModel> list) {
        o.LJIIIZ(oldList, "oldList");
        this.LIZ = oldList;
        this.LIZIZ = list;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZ(int i, int i2) {
        if (ListProtector.get(this.LIZ, i) == ListProtector.get(this.LIZIZ, i2)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC03120Ai
    public final boolean LIZIZ(int i, int i2) {
        return o.LJ(((MediaModel) ListProtector.get(this.LIZ, i)).id, ((MediaModel) ListProtector.get(this.LIZIZ, i2)).id);
    }

    @Override // X.AbstractC03120Ai
    public final Object LIZJ(int i, int i2) {
        return C45616HvI.LIZ;
    }
}
