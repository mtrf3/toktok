package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TON extends F9E {
    public final ProviderEffect LJLIL;
    public final TOR LJLILLLLZI;
    public final Integer LJLJI;
    public final Exception LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public TON(ProviderEffect sticker, TOR tor, Integer num, Exception exc) {
        o.LJIIIZ(sticker, "sticker");
        this.LJLIL = sticker;
        this.LJLILLLLZI = tor;
        this.LJLJI = num;
        this.LJLJJI = exc;
    }
}
