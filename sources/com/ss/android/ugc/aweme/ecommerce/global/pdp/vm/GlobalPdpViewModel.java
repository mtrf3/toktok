package com.ss.android.ugc.aweme.ecommerce.global.pdp.vm;

import X.AbstractC69707RXj;
import X.C26840Ag8;
import X.C47261Igj;
import X.C52311Kfz;
import X.C69711RXn;
import X.C69719RXv;
import X.C69809RaX;
import X.C69814Rac;
import X.C69815Rad;
import X.C69816Rae;
import X.C69818Rag;
import X.InterfaceC27624Asm;
import X.RY2;
import X.RY6;
import X.RY7;
import X.RYB;
import X.RYQ;
import X.RYT;
import X.RYW;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.desc.GlobalProductDescStyle;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class GlobalPdpViewModel extends PdpViewModel {
    public final List<AbstractC69707RXj> LLLJL = C47261Igj.LJJIJIIJI(new RY2(), new RY6(), new C69711RXn(), new C69809RaX(), new C69816Rae(), new C69815Rad(), new RYQ(), new RYB(), new C69814Rac(), new C69719RXv());

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final boolean Q90() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public void WJ() {
        C69818Rag.LIZLLL(this, false);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27170AlS
    public final boolean Zb() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final boolean ui() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27598AsM
    public IProductDescStyle I50() {
        return new GlobalProductDescStyle();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final SkuItem Ek0() {
        return C69818Rag.LJI(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69824Ram
    public final boolean Mv() {
        if (C52311Kfz.LIZ()) {
            return true;
        }
        return super.Mv();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69824Ram
    public final int Rf() {
        if (C52311Kfz.LIZ()) {
            return R.layout.a2i;
        }
        return R.layout.a2h;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final boolean WU() {
        return C69818Rag.LJIIIIZZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void Cl0() {
        C69818Rag.LJ(this);
    }

    public List<AbstractC69707RXj> Cx0() {
        return this.LLLJL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void Lc0() {
        ax0();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27598AsM
    public final InterfaceC27624Asm TT(List<Specification> specifications) {
        o.LJIIIZ(specifications, "specifications");
        return C69818Rag.LIZJ(this, specifications);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69792RaG
    public final ProductPackStruct fr0(ProductPackStruct productPackStruct) {
        if (productPackStruct != null) {
            return RYT.LIZ(productPackStruct);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69824Ram
    public final void yk0(List<Object> contentList) {
        o.LJIIIZ(contentList, "contentList");
        if (C52311Kfz.LIZ()) {
            contentList.add(new RYW());
        } else {
            super.yk0(contentList);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69804RaS
    public SkuPanelState Eg0(SkuPanelState skuPanelState, SkuPanelState skuPanelState2) {
        Integer num;
        if (skuPanelState != null) {
            if (skuPanelState2 != null) {
                num = skuPanelState2.getProductQuantity();
            } else {
                num = null;
            }
            skuPanelState.setProductQuantity(num);
        }
        return skuPanelState;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.RYR
    public final void VS(List<Object> list, ShopReviewEntry shopReviewEntry) {
        C69818Rag.LIZIZ(this, list, shopReviewEntry);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.RYS
    public final void au(List<Object> list, C26840Ag8 gray, ProductDetailReview productDetailReview, ShopReviewEntry shopReviewEntry) {
        o.LJIIIZ(gray, "gray");
        C69818Rag.LIZ(this, list, gray, productDetailReview, shopReviewEntry);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel
    public final List<Object> Bw0(ProductPackStruct productionInfoPack, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(productionInfoPack, "productionInfoPack");
        ArrayList arrayList = new ArrayList();
        RY7 ry7 = new RY7(productionInfoPack, z, z2, z3, z4);
        Iterator<AbstractC69707RXj> it = Cx0().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LIZ(this, ry7));
        }
        return arrayList;
    }
}
