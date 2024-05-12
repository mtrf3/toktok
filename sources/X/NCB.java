package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NCB extends QZV {
    public final int LIZ = 0;

    @Override // X.QZV
    public final String LJIIL() {
        return NCT.PLAY_PROGRESS.getType();
    }

    @Override // X.QZV
    public final boolean LJIJ(AnoleComponentAppearModel appearModel) {
        Double playProgress;
        o.LJIIIZ(appearModel, "appearModel");
        if (!super.LJIJ(appearModel) || (playProgress = appearModel.getPlayProgress()) == null || this.LIZ != ((int) playProgress.doubleValue())) {
            return false;
        }
        return true;
    }
}
