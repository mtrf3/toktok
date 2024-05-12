package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.THt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74397THt extends F9E {
    public final Effect LJLIL;
    public final boolean LJLILLLLZI;
    public final TID LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C74397THt(Effect effect, boolean z, TID tid) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL = effect;
        this.LJLILLLLZI = z;
        this.LJLJI = tid;
    }

    public /* synthetic */ C74397THt(Effect effect, boolean z, TID tid, int i) {
        this(effect, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : tid);
    }
}
