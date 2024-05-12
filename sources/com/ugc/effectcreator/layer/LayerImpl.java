package com.ugc.effectcreator.layer;

import X.C1B3;
import X.C36636EZk;
import X.C3BJ;
import X.C48841JEv;
import X.C79853Bl;
import X.C94221adV;
import X.C94222adW;
import X.C94822anC;
import X.EnumC93710aVG;
import X.EnumC93712aVI;
import X.InterfaceC65462ha;
import X.InterfaceC70422pa;
import X.T2R;
import X.XKX;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class LayerImpl implements ILayer {
    public final InterfaceC70422pa coroutineScope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
    public final LayerLiveData<C94222adW> orderChangeData = new LayerLiveData<>();
    public final C3BJ<C94221adV> featureOperateData = C79853Bl.LIZ(0, 0, null, 7);
    public final LayerLiveData<EnumC93712aVI> layerPageStatus = new LayerLiveData<>();
    public boolean layerDetailStatus = true;

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public String getTag() {
        return "cke_layer_fragment";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public void init() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public void onRecycle() {
    }

    public Fragment getFragment() {
        return new EffectLayerEditorFragment();
    }

    public final boolean getLayerDetailStatus() {
        return this.layerDetailStatus;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public InterfaceC65462ha<C94221adV> getLayerFeatureOperateData() {
        return this.featureOperateData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public LiveData<C94222adW> getLayerOrderChangeData() {
        return this.orderChangeData;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public LiveData<EnumC93712aVI> getLayerPageStatus() {
        return this.layerPageStatus;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public void hideLayerPage(FragmentManager fragmentManager) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
        if (LJJJIL == null) {
            return;
        }
        ((EffectLayerEditorFragment) LJJJIL).wl();
    }

    public final void setLayerDetailStatus(boolean z) {
        this.layerDetailStatus = z;
    }

    public final void updatePageStatus(EnumC93712aVI status) {
        o.LJIIIZ(status, "status");
        this.layerPageStatus.setValue(status);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIIIZZ(i, 1, getFragment(), getTag());
        c1b3.LJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.layer.ILayer
    public void updateLayerEvent(long j, EnumC93710aVG type) {
        o.LJIIIZ(type, "type");
        XKX.LIZLLL(this.coroutineScope, null, null, new C94822anC(this, j, type, null), 3);
    }
}
