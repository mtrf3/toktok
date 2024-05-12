package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ag6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94382ag6 extends F9E {
    public final boolean LJLIL;
    public final LinkedHashMap<String, EffectHint> LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C94382ag6(boolean z, LinkedHashMap<String, EffectHint> result) {
        o.LJIIIZ(result, "result");
        this.LJLIL = z;
        this.LJLILLLLZI = result;
    }
}
