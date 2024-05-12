package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NCC extends QZV {
    public final double LIZ;

    @Override // X.QZV
    public final String LJIIL() {
        return NCT.SHAKE.getType();
    }

    public NCC(double d) {
        this.LIZ = d;
    }

    @Override // X.QZV
    public final boolean LJIJ(AnoleComponentAppearModel appearModel) {
        Double d;
        o.LJIIIZ(appearModel, "appearModel");
        if (!super.LJIJ(appearModel)) {
            return false;
        }
        java.util.Map<String, Object> params = appearModel.getParams();
        Object obj = null;
        if (params != null) {
            obj = params.get("speed");
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null || this.LIZ < d.doubleValue()) {
            return false;
        }
        return true;
    }
}
