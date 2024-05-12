package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TOS implements TOQ {
    public final InterfaceC65784Pro<InterfaceC84498XEg> LIZ;
    public final C74577TOr LIZIZ;
    public final InterfaceC65784Pro<String> LIZJ;
    public final InterfaceC65784Pro<String> LIZLLL;
    public final int LJ;
    public final int LJFF;

    @Override // X.TOQ
    public final TMR<ProviderEffect, ProviderEffectModel> LIZ() {
        return new C74585TOz(this.LIZ, this.LIZIZ, this.LIZJ.invoke(), this.LIZLLL.invoke(), this.LJ);
    }

    @Override // X.TOQ
    public final TMR<ProviderEffect, ProviderEffectModel> LLIIIL(String query) {
        o.LJIIIZ(query, "query");
        return new TP0(this.LIZ, this.LIZIZ, this.LIZJ.invoke(), this.LIZLLL.invoke(), query, this.LJFF);
    }

    public TOS(AqS162S0100000_12 aqS162S0100000_12, C74577TOr c74577TOr, AqS157S0100000_7 aqS157S0100000_7, TOX tox, int i, int i2) {
        this.LIZ = aqS162S0100000_12;
        this.LIZIZ = c74577TOr;
        this.LIZJ = aqS157S0100000_7;
        this.LIZLLL = tox;
        this.LJ = i;
        this.LJFF = i2;
    }
}
