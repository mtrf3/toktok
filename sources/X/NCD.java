package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NCD extends QZV {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    @Override // X.QZV
    public final String LJIIL() {
        return this.LIZJ;
    }

    @Override // X.QZV
    public final boolean LJIJ(AnoleComponentAppearModel appearModel) {
        Object obj;
        o.LJIIIZ(appearModel, "appearModel");
        if (!super.LJIJ(appearModel)) {
            return false;
        }
        java.util.Map<String, Object> params = appearModel.getParams();
        Integer num = null;
        if (params != null) {
            obj = params.get("touchnumber");
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        }
        int i = this.LIZIZ;
        if (num == null || num.intValue() != i) {
            return false;
        }
        return QZV.LJIILJJIL(this.LIZ, appearModel.getSourceComponents());
    }

    public NCD(String sourceComponentType, int i) {
        o.LJIIIZ(sourceComponentType, "sourceComponentType");
        this.LIZ = sourceComponentType;
        this.LIZIZ = i == 0 ? 1 : i;
        this.LIZJ = NCT.TAP.getType();
    }
}
