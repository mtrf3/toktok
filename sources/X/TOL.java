package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOL implements TOE {
    public final String LIZ;

    public TOL(String rootPath) {
        o.LJIIIZ(rootPath, "rootPath");
        this.LIZ = rootPath;
    }

    @Override // X.TOE
    public final boolean LIZ(ProviderEffect effect) {
        o.LJIIIZ(effect, "effect");
        return C44687HgJ.LIZIZ(LIZIZ(effect));
    }

    @Override // X.TOE
    public final String LIZIZ(ProviderEffect effect) {
        o.LJIIIZ(effect, "effect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C17N.LJJIJIL(this.LIZ));
        LIZ.append(effect.getId());
        LIZ.append(".gif");
        return X1D.LIZIZ(LIZ);
    }
}
