package X;

import com.ss.android.ugc.aweme.video.preload.PreloadSessionManager;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;

/* renamed from: X.IOd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46535IOd implements IP0 {
    @Override // X.IP0
    public final int LIZLLL() {
        return C1DG.LIZ().LIZJ();
    }

    @Override // X.IP0
    public final int LIZ(SimVideoUrlModel simVideoUrlModel) {
        if (C47242IgQ.LIZ().isCache(simVideoUrlModel)) {
            return C47242IgQ.LIZ().LIZLLL(simVideoUrlModel);
        }
        if (PreloadSessionManager.LIZIZ.LIZ(simVideoUrlModel.getSourceId()) == null) {
            return -2;
        }
        return -1;
    }

    @Override // X.IP0
    public final int LIZIZ(SimVideoUrlModel simVideoUrlModel) {
        return (int) C47242IgQ.LIZ().LIZIZ(simVideoUrlModel);
    }

    @Override // X.IP0
    public final int LIZJ(SimVideoUrlModel simVideoUrlModel) {
        Session LIZIZ = C46664ITc.LJIJ.LIZIZ(simVideoUrlModel.getUri());
        if (LIZIZ != null) {
            return (int) ((LIZIZ.speed / 8.0f) / 1000.0f);
        }
        return -1;
    }

    @Override // X.IP0
    public final List<C87748YcC> getRequestInfoList(SimVideoUrlModel simVideoUrlModel) {
        return C47242IgQ.LIZ().getRequestInfoList(simVideoUrlModel);
    }

    @Override // X.IP0
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        return C47242IgQ.LIZ().isCache(simVideoUrlModel);
    }

    @Override // X.IP0
    public final int LJ(SimVideoUrlModel simVideoUrlModel, int i) {
        PreloadSessionManager.PreloadSession LIZ = PreloadSessionManager.LIZIZ.LIZ(simVideoUrlModel.getSourceId());
        if (LIZ != null && i > 0) {
            return LIZ.speed;
        }
        return -1;
    }
}
