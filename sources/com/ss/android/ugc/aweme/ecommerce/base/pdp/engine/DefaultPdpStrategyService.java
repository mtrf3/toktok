package com.ss.android.ugc.aweme.ecommerce.base.pdp.engine;

import X.AN3;
import X.ANA;
import X.AND;
import X.ANS;
import X.ANT;
import X.ANW;
import X.AZB;
import X.AZL;
import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.C26098AMc;
import X.C26103AMh;
import X.C26105AMj;
import X.C26108AMm;
import X.C26109AMn;
import X.C26111AMp;
import X.C26113AMr;
import X.C26115AMt;
import X.C26116AMu;
import X.C26118AMw;
import X.C26124ANc;
import X.C26445AZl;
import X.C26446AZm;
import X.C26448AZo;
import X.C26450AZq;
import X.C26499Aad;
import X.C26778Af8;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.ConnectionResult;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "product_detail")
/* loaded from: classes5.dex */
public class DefaultPdpStrategyService extends AbstractC26551AbT<PdpViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public PdpViewModel LIZIZ() {
        return new PdpViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public InterfaceC26883Agp<PdpViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26499Aad(owner);
    }

    public static void LJ(C26778Af8 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1494), AND.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1487), new AqS170S0100000_4(adapter, 1514), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1481), AZL.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1491), ANT.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1495), C26116AMu.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1473), C26118AMw.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1479), C26103AMh.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1483), new AqS170S0100000_4(adapter, 1486), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1488), new AqS170S0100000_4(adapter, 1490), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1492), new AqS170S0100000_4(adapter, 1496), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1499), new AqS170S0100000_4(adapter, 1501), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1504), new AqS170S0100000_4(adapter, 1506), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1509), C26105AMj.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1513), C26450AZq.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1517), ANW.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1523), C26448AZo.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1465), new AqS170S0100000_4(adapter, 1470), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1474), new AqS170S0100000_4(adapter, 1477), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1480), C26108AMm.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1484), ANA.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1493), C26124ANc.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1497), C26111AMp.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1502), C26109AMn.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1507), new AqS170S0100000_4(adapter, 1510), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1511), C26446AZm.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1518), new AqS170S0100000_4(adapter, 1519), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1521), C26113AMr.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1466), ANS.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1471), new AqS170S0100000_4(adapter, 1475), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1478), C26445AZl.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, 1485), AN3.LJLIL, null);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof C26778Af8)) {
            return;
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1520), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1522), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1524), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1467), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1469), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1472), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1476), C26098AMc.LJLIL, null);
        LJ((C26778Af8) adapter, c73242Soo);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1482), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1498), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1505), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1508), C26115AMt.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1512), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1515), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1516), AZB.LJLIL, null);
    }
}
