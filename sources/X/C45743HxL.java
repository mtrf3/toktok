package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HxL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45743HxL extends F9E {
    public final C45744HxM LJLIL;
    public final List<MediaModel> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C45743HxL(C45744HxM param, List<MediaModel> mediaModelList) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        this.LJLIL = param;
        this.LJLILLLLZI = mediaModelList;
    }

    public static C45743HxL L(C45743HxL c45743HxL, List mediaModelList) {
        C45744HxM param = c45743HxL.LJLIL;
        c45743HxL.getClass();
        o.LJIIIZ(param, "param");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        return new C45743HxL(param, mediaModelList);
    }
}
