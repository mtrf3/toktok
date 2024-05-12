package X;

import Y.ACallableS89S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOK extends AbstractC73941T0f<List<? extends ProviderEffect>, List<? extends TOR>> {
    public final TOD LIZJ;
    public final TOE LIZLLL;

    @Override // X.R30
    public final AbstractC73672Svk LJII(Object obj) {
        List req = (List) obj;
        o.LJIIIZ(req, "req");
        return AbstractC73672Svk.LJJIIJZLJL(new ACallableS89S0200000_12(this, req, 9));
    }

    public TOK(TOC toc, TOE toe) {
        this.LIZJ = toc;
        this.LIZLLL = toe;
    }
}
