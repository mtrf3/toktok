package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hzn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45895Hzn extends F9E {
    public List<? extends MediaModel> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C45895Hzn(List<? extends MediaModel> photoMediaModels) {
        o.LJIIIZ(photoMediaModels, "photoMediaModels");
        this.LJLIL = photoMediaModels;
    }
}
