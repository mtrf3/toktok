package com.ss.android.ugc.trill.download.protocol;

import X.AbstractC44957Hkf;
import X.C44956Hke;
import X.C45339Hqp;
import X.C66580QBc;
import com.ss.android.ugc.aweme.share.downloadv2.protocol.DefaultWaterMarkAbilityProtocol;

/* loaded from: classes8.dex */
public final class AwemeVideoWaterMarkAbilityProtocol extends DefaultWaterMarkAbilityProtocol {
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final String LJLJJL;

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final String LIZLLL() {
        return this.LJLJJL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJFF() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJI() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol
    public final boolean LJII() {
        return this.LJLJJI;
    }

    public AwemeVideoWaterMarkAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        boolean z;
        boolean z2;
        C44956Hke c44956Hke;
        C44956Hke c44956Hke2;
        C45339Hqp c45339Hqp;
        boolean z3 = abstractC44957Hkf instanceof C44956Hke;
        C44956Hke c44956Hke3 = z3 ? (C44956Hke) abstractC44957Hkf : null;
        boolean z4 = false;
        if (c44956Hke3 != null) {
            z = c44956Hke3.LJIILLIIL;
        } else {
            z = false;
        }
        this.LJLILLLLZI = z;
        if (z3 && (c44956Hke2 = (C44956Hke) abstractC44957Hkf) != null && (c45339Hqp = c44956Hke2.LJIILL) != null) {
            z2 = c45339Hqp.LIZJ;
        } else {
            z2 = false;
        }
        this.LJLJI = z2;
        if (z3 && (c44956Hke = (C44956Hke) abstractC44957Hkf) != null) {
            z4 = c44956Hke.LJIILJJIL;
        }
        this.LJLJJI = z4;
        this.LJLJJL = C66580QBc.LJIILLIIL(abstractC44957Hkf.LIZIZ);
    }
}
