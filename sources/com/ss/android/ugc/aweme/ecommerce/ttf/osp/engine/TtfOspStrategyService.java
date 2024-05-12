package com.ss.android.ugc.aweme.ecommerce.ttf.osp.engine;

import X.AN2;
import X.ANI;
import X.ANK;
import X.ANM;
import X.ANO;
import X.AbstractC26779Af9;
import X.C26096AMa;
import X.C26129ANh;
import X.C26458AZy;
import X.C26538AbG;
import X.C26539AbH;
import X.C26540AbI;
import X.C26542AbK;
import X.C26545AbN;
import X.C26585Ac1;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "order_submit")
/* loaded from: classes5.dex */
public final class TtfOspStrategyService extends DefaultOspStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTF_SA_ORDER_SUBMIT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26585Ac1 c26585Ac1;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26585Ac1) && (c26585Ac1 = (C26585Ac1) adapter) != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1401), C26538AbG.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1407), C26542AbK.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1408), C26545AbN.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1409), AN2.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1395), ANK.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1396), ANM.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1397), ANI.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1398), C26540AbI.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1399), ANO.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1400), C26129ANh.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1402), C26458AZy.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1403), C26539AbH.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1404), new AqS170S0100000_4(c26585Ac1, 1405), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1406), C26096AMa.INSTANCE, null);
        }
    }
}
