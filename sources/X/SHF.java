package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.tpsc.settings.account.DisclosureAdapterConfigs;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class SHF extends SLJ {
    public final DisclosureAdapterConfigs LJLL;

    @Override // X.SLJ
    public final boolean LL() {
        return this.LJLL.isVisible;
    }

    public SHF(DisclosureAdapterConfigs disclosureAdapterConfigs, Context context) {
        super(context);
        this.LJLL = disclosureAdapterConfigs;
        SK9 sk9 = new SK9();
        AbstractC71913SKf.LIZJ(sk9, disclosureAdapterConfigs.titleRes);
        Integer num = disclosureAdapterConfigs.iconRes;
        if (num != null) {
            sk9.LIZIZ(num.intValue());
        }
        Integer num2 = disclosureAdapterConfigs.subTitleRes;
        if (num2 != null) {
            sk9.LJ = Integer.valueOf(num2.intValue());
        }
        sk9.LJIIIIZZ = new AqS178S0100000_12(this, 565);
        LJLLLLLL(sk9.LIZ());
    }
}
