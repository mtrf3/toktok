package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us;

import X.AbstractC69707RXj;
import X.C00F;
import X.C26059AKp;
import X.C47261Igj;
import X.C69705RXh;
import X.C69708RXk;
import X.C69712RXo;
import X.C69713RXp;
import X.C69714RXq;
import X.C69718RXu;
import X.C69808RaW;
import X.C69811RaZ;
import X.C69818Rag;
import X.C69819Rah;
import X.InterfaceC67352kd;
import X.RY1;
import X.RYB;
import X.RYN;
import X.RYQ;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.arch.JediBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.IProductDescStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.GlobalPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.desc.UsProductDescStyle;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsPdpBottomNavBarWidget;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsPdpViewModel extends GlobalPdpViewModel {
    public final List<AbstractC69707RXj> LLLL = C47261Igj.LJJIJIIJI(new RY1(), new C69705RXh(), new C69712RXo(), new C69708RXk(), new C69808RaW(), new C69713RXp(), new C69714RXq(), new RYQ(), new RYB(), new C69811RaZ(), new C69718RXu());
    public boolean LLLLII;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69803RaR
    public final void V20(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.GlobalPdpViewModel, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void WJ() {
        C69818Rag.LIZLLL(this, true);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel
    public final void hx0() {
        this.LLLLII = false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.GlobalPdpViewModel, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC27598AsM
    public final IProductDescStyle I50() {
        return new UsProductDescStyle();
    }

    public UsPdpViewModel() {
        this.LLLLII = C00F.LIZ(31744, 0, "ecom_unread_msg_hint_config", true) > 0;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C26059AKp.LIZ().LIZIZ("ec_clear_unread_msg", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        C26059AKp.LIZ().LIZJ("ec_clear_unread_msg", this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.GlobalPdpViewModel
    public final List<AbstractC69707RXj> Cx0() {
        return this.LLLL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel
    public final boolean kw0() {
        return this.LLLLII;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69766RZq
    public final void Gu0(ProductPackStruct productPackStruct) {
        RYN.LIZJ(this, productPackStruct);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final void QJ(long j) {
        C69819Rah.LIZLLL(j, this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.RYY
    public final JediBaseWidget iw(PdpFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new UsPdpBottomNavBarWidget(fragment);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.global.pdp.vm.GlobalPdpViewModel, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69804RaS
    public final SkuPanelState Eg0(SkuPanelState skuPanelState, SkuPanelState skuPanelState2) {
        RYN.LIZ(this, skuPanelState, skuPanelState2);
        return skuPanelState;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
        super.onEvent(eventName, str);
        RYN.LIZIZ(this, eventName, str);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, X.InterfaceC69823Ral
    public final Object NC(View view, int i, String str, HashMap<String, Object> hashMap, String str2, String str3, String str4, String str5, InterfaceC67352kd<? super SkuPanelState> interfaceC67352kd) {
        return C69819Rah.LJ(this, view, i, str, hashMap, str2, str3, str4, str5, interfaceC67352kd);
    }
}
