package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.4Rg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109444Rg extends F9E {
    public final Effect LJLIL;
    public final C109454Rh LJLILLLLZI;
    public final Integer LJLJI;
    public final Exception LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C109444Rg(Effect effect, C109454Rh c109454Rh, Integer num, Exception exc) {
        o.LJIIIZ(effect, "effect");
        this.LJLIL = effect;
        this.LJLILLLLZI = c109454Rh;
        this.LJLJI = num;
        this.LJLJJI = exc;
    }
}
