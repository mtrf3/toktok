package com.ss.android.ugc.aweme.ecommerce.global.pdp.vm;

import X.AbstractC69707RXj;
import X.C47261Igj;
import X.C69710RXm;
import X.C69713RXp;
import X.C69714RXq;
import X.C69719RXv;
import X.C69721RXx;
import X.C69810RaY;
import X.C69813Rab;
import X.C69816Rae;
import X.RY5;
import X.RY7;
import X.RYB;
import X.RYP;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.desc.GlobalProductDescStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TtfUkPdpViewModel extends TtfPdpViewModel {
    public final List<AbstractC69707RXj> LLLL = C47261Igj.LJJIJIIJI(new C69721RXx(), new RY5(), new C69710RXm(), new C69810RaY(), new C69816Rae(), new C69713RXp(), new C69714RXq(), new RYP(), new RYB(), new C69813Rab(), new C69719RXv());

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.TtfPdpViewModel, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27598AsM
    public final IProductDescStyle I50() {
        return new GlobalProductDescStyle();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.TtfPdpViewModel, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel
    public final List<Object> Bw0(ProductPackStruct productionInfoPack, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(productionInfoPack, "productionInfoPack");
        ArrayList arrayList = new ArrayList();
        RY7 ry7 = new RY7(productionInfoPack, z, z2, z3, z4);
        Iterator<AbstractC69707RXj> it = this.LLLL.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LIZ(this, ry7));
        }
        return arrayList;
    }
}
