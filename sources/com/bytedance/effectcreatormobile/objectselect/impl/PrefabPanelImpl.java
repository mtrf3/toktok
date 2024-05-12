package com.bytedance.effectcreatormobile.objectselect.impl;

import X.C1B3;
import X.C33R;
import X.C93509aS1;
import X.EnumC93821aX3;
import X.InterfaceC71762rk;
import X.V8H;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabContainerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class PrefabPanelImpl implements PrefabPanel {
    public final C33R<EnumC93821aX3> prefabPanelState = V8H.LIZ(EnumC93821aX3.DISMISS);

    private final String getTag() {
        return "PrefabPanelImpl";
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel
    public InterfaceC71762rk<EnumC93821aX3> getPanelStatus() {
        return this.prefabPanelState;
    }

    public final C33R<EnumC93821aX3> getPrefabPanelState() {
        return this.prefabPanelState;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel
    public void addPrefab(PrefabData prefabData, FragmentManager fragmentManager, int i) {
        o.LJIIIZ(prefabData, "prefabData");
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        PrefabContainerFragment prefabContainerFragment = new PrefabContainerFragment();
        prefabContainerFragment.setArguments(C93509aS1.LIZ(prefabData, null, 2));
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJJI(R.anim.i1, R.anim.i5, 0, 0);
        c1b3.LJIIIIZZ(i, 1, prefabContainerFragment, getTag());
        c1b3.LJI();
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabPanel
    public void editPrefab(long j, FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        PrefabContainerFragment prefabContainerFragment = new PrefabContainerFragment();
        prefabContainerFragment.setArguments(C93509aS1.LIZ(null, Long.valueOf(j), 1));
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJJI(R.anim.i1, R.anim.i5, 0, 0);
        c1b3.LJIIIIZZ(i, 1, prefabContainerFragment, getTag());
        c1b3.LJI();
    }
}
