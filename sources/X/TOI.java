package X;

import Y.ACallableS89S0200000_12;
import Y.IDuS81S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOI implements TNB {
    public final TOQ LIZ;
    public final TOD LIZIZ;
    public final TOE LIZJ;

    @Override // X.TNB
    public final TMR<ProviderEffect, ProviderEffectModel> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // X.TNB
    public final TMR<ProviderEffect, ProviderEffectModel> LIZIZ(String query) {
        o.LJIIIZ(query, "query");
        return this.LIZ.LLIIIL(query);
    }

    @Override // X.TNB
    public final C73622Suw LIZJ(ProviderEffect sticker) {
        o.LJIIIZ(sticker, "sticker");
        return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(this, sticker, 8)).LJJL(T16.LIZ()).LJJLI(new C73432Srs(new ACallableS89S0200000_12(this, sticker, 8)));
    }

    public TOI(TOQ toq, TOK tok, TOC toc, TOE toe) {
        this.LIZ = toq;
        this.LIZIZ = toc;
        this.LIZJ = toe;
    }
}
