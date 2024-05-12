package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NCH extends QZV {
    public final String LIZ;

    @Override // X.QZV
    public final String LJIIL() {
        return NCT.OTHER_SHOW_FAILURE.getType();
    }

    public NCH(String sourceComponentType) {
        o.LJIIIZ(sourceComponentType, "sourceComponentType");
        this.LIZ = sourceComponentType;
    }

    @Override // X.QZV
    public final boolean LJIJ(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        if (!super.LJIJ(appearModel)) {
            return false;
        }
        return QZV.LJIILJJIL(this.LIZ, appearModel.getSourceComponents());
    }
}
