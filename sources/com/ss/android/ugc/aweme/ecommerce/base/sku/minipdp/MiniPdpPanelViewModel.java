package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C70326Ris;
import X.C70567Rml;
import X.C70853RrN;
import X.C70858RrS;
import X.C76800UCe;
import X.C79234V7u;
import X.InterfaceC27438Apm;
import X.InterfaceC60061Nhh;
import X.InterfaceC69848RbA;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MiniPdpPanelViewModel extends JediViewModel<SkuCommonState> implements InterfaceC60061Nhh, InterfaceC69848RbA, InterfaceC27438Apm {
    public SkuPanelStarter.SkuEnterParams LJLJJLL;
    public SkuPanelViewModel LJLJL;
    public ProductPackStruct LJLJLJ;

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageName() {
        return "sku";
    }

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        o.LJIIIZ(eventName, "eventName");
    }

    @Override // X.InterfaceC69848RbA
    public final void Aj0() {
        setState(C70326Ris.LJLIL);
    }

    @Override // X.InterfaceC69847Rb9
    public final SkuPanelState Ih0() {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            return skuPanelViewModel.Ih0();
        }
        return null;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final SkuCommonState kv0() {
        return new SkuCommonState(null);
    }

    @Override // X.InterfaceC69847Rb9
    public final String[] nR() {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            return skuPanelViewModel.fw0();
        }
        return null;
    }

    @Override // X.InterfaceC69847Rb9
    public final SkuPanelStarter.SkuEnterParams qu() {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            return skuPanelViewModel.LJLLJ;
        }
        return null;
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC37828Esy
    public final Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    @Override // X.InterfaceC69847Rb9
    public final void Jh(List<String> list) {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            skuPanelViewModel.Jh(list);
        }
    }

    @Override // X.InterfaceC69847Rb9
    public final void er(AqS178S0100000_12 aqS178S0100000_12) {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            skuPanelViewModel.er(aqS178S0100000_12);
        }
    }

    @Override // X.InterfaceC27438Apm
    public final boolean onDetectBlank(Map<String, String> map) {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel == null || skuPanelViewModel.onDetectBlank(map)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC69847Rb9
    public final void tN(InterfaceC88472Yns<? super ProductPackStruct, C76800UCe> interfaceC88472Yns) {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            skuPanelViewModel.tN(interfaceC88472Yns);
        }
    }

    @Override // X.InterfaceC69847Rb9
    public final void vs0(InterfaceC88472Yns<? super List<String>, C76800UCe> interfaceC88472Yns) {
        SkuPanelViewModel skuPanelViewModel = this.LJLJL;
        if (skuPanelViewModel != null) {
            skuPanelViewModel.vs0(interfaceC88472Yns);
        }
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}
