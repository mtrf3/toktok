package X;

import com.ss.ugc.effectplatform.model.Effect;
import java.util.LinkedHashMap;

/* loaded from: classes16.dex */
public final class XAT {
    public boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String[] LIZLLL;

    public final boolean LIZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!ORY.LJJIJIIJIL(effect.getPanel(), this.LIZLLL) || !this.LIZIZ || !this.LIZ) {
            return false;
        }
        return true;
    }

    public final boolean LIZIZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!ORY.LJJIJIIJIL(effect.getPanel(), this.LIZLLL) || !this.LIZJ) {
            return false;
        }
        return true;
    }

    public XAT(boolean z, boolean z2, String[] strArr) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = strArr;
        new LinkedHashMap();
    }
}
