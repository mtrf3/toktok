package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TF7 extends F9E {
    public final List<Effect> LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TF7(List<? extends Effect> effectId) {
        o.LJIIIZ(effectId, "effectId");
        this.LJLIL = effectId;
    }
}
