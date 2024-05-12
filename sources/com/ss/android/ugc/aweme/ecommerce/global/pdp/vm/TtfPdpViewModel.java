package com.ss.android.ugc.aweme.ecommerce.global.pdp.vm;

import X.AbstractC69707RXj;
import X.C26840Ag8;
import X.C47261Igj;
import X.C52311Kfz;
import X.C69710RXm;
import X.C69713RXp;
import X.C69714RXq;
import X.C69719RXv;
import X.C69722RXy;
import X.C69812Raa;
import X.C69816Rae;
import X.C69818Rag;
import X.C69819Rah;
import X.InterfaceC27624Asm;
import X.InterfaceC67352kd;
import X.RY5;
import X.RY7;
import X.RY9;
import X.RYB;
import X.RYP;
import X.RYT;
import X.RYW;
import android.view.View;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TtfPdpViewModel extends PdpViewModel {
    public final List<AbstractC69707RXj> LLLJL = C47261Igj.LJJIJIIJI(new C69722RXy(), new RY5(), new C69710RXm(), new C69816Rae(), new RY9(), new C69713RXp(), new C69714RXq(), new RYP(), new RYB(), new C69812Raa(), new C69719RXv());

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final boolean Q90() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void WJ() {
        C69818Rag.LIZLLL(this, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27170AlS
    public final boolean Zb() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final boolean ui() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cl0() {
        /*
            r3 = this;
            X.XKQ r0 = r3.LLLJ
            if (r0 == 0) goto L23
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L23
        Lb:
            r2 = 0
            if (r0 == 0) goto L15
            X.XKQ r0 = r3.LLLJ
            if (r0 == 0) goto L15
            r0.LIZIZ(r2)
        L15:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.2tI r0 = new X.2tI
            r0.<init>(r3, r2)
            X.XKQ r0 = X.C78565UsT.LJJIJ(r3, r1, r0)
            r3.LLLJ = r0
            return
        L23:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.TtfPdpViewModel.Cl0():void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final SkuItem Ek0() {
        SkuPanelState skuPanelState = this.LJLL;
        List<SkuItem> list = null;
        if (skuPanelState == null) {
            return null;
        }
        ProductPackStruct productPackStruct = this.LJLJLLL;
        if (productPackStruct != null) {
            list = productPackStruct.skus;
        }
        return skuPanelState.getFullSkuItem(list);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27598AsM
    public IProductDescStyle I50() {
        return new GlobalProductDescStyle();
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69933RcX
    public final void mg() {
        super.mg();
        C69819Rah.LJFF(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69933RcX
    public final void ok0() {
        super.ok0();
        C69819Rah.LJI(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void Lc0() {
        ax0();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void QJ(long j) {
        C69819Rah.LIZLLL(j, this);
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
    public final SkuPanelState Eg0(SkuPanelState skuPanelState, SkuPanelState skuPanelState2) {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        super.onEvent(eventName, str);
        C69819Rah.LIZJ(this, eventName, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.RYS
    public final void au(List<Object> list, C26840Ag8 gray, ProductDetailReview productDetailReview, ShopReviewEntry shopReviewEntry) {
        o.LJIIIZ(gray, "gray");
        C69819Rah.LIZ(this, list, gray, productDetailReview, shopReviewEntry);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel
    public List<Object> Bw0(ProductPackStruct productionInfoPack, boolean z, boolean z2, boolean z3, boolean z4) {
        o.LJIIIZ(productionInfoPack, "productionInfoPack");
        ArrayList arrayList = new ArrayList();
        RY7 ry7 = new RY7(productionInfoPack, z, z2, z3, z4);
        Iterator<AbstractC69707RXj> it = this.LLLJL.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().LIZ(this, ry7));
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final Object NC(View view, int i, String str, HashMap<String, Object> hashMap, String str2, String str3, String str4, String str5, InterfaceC67352kd<? super SkuPanelState> interfaceC67352kd) {
        return C69819Rah.LJ(this, view, i, str, hashMap, str2, str3, str4, str5, interfaceC67352kd);
    }
}
