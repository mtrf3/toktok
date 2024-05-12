package X;

import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XAU extends F9E {
    public final XAO LJLIL;
    public final ModelInfo LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public XAU(XAO xao, ModelInfo serverModelInfo) {
        o.LJIIJ(serverModelInfo, "serverModelInfo");
        this.LJLIL = xao;
        this.LJLILLLLZI = serverModelInfo;
    }
}
