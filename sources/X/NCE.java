package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NCE extends QZV {
    public NCE(String sourceComponentType) {
        o.LJIIIZ(sourceComponentType, "sourceComponentType");
        o.LJIIIZ(null, "direction");
        throw null;
    }

    @Override // X.QZV
    public final String LJIIL() {
        return NCT.SLIDE.getType();
    }

    @Override // X.QZV
    public final boolean LJIJ(AnoleComponentAppearModel appearModel) {
        o.LJIIIZ(appearModel, "appearModel");
        if (!super.LJIJ(appearModel)) {
            return false;
        }
        java.util.Map<String, Object> params = appearModel.getParams();
        Object obj = null;
        if (params != null) {
            obj = params.get("direction");
        }
        boolean z = obj instanceof Integer;
        throw null;
    }
}
