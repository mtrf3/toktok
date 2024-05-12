package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TNH implements TO7<C74397THt, Effect, C44368HbA> {
    public final /* synthetic */ TNG LJLIL;
    public final /* synthetic */ TO7 LJLILLLLZI;

    public TNH(TNG tng, TO7 to7) {
        this.LJLIL = tng;
        this.LJLILLLLZI = to7;
    }

    @Override // X.TO7
    public final void LJII(int i, Object key) {
        o.LJIIIZ(key, "key");
        this.LJLILLLLZI.LJII(i, key);
    }

    @Override // X.TO7
    public final void LJIIJJI(C74397THt key, Effect result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        this.LJLILLLLZI.LJIIJJI(key, result);
    }

    @Override // X.TO7
    public final void LIZ(C74397THt c74397THt, Effect result, C44368HbA info, long j) {
        C74397THt key = c74397THt;
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        o.LJIIIZ(info, "info");
        this.LJLIL.LIZ.put(key.LJLIL.getId(), key.LJLIL);
        this.LJLILLLLZI.LIZ(key, result, info, j);
    }

    @Override // X.TO7
    public final void LIZIZ(C74397THt key, Exception exc, C44368HbA info, long j) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(info, "info");
        this.LJLILLLLZI.LIZIZ(key, exc, info, j);
    }
}
