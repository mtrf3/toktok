package com.bytedance.effectcreatormobile.behaviour;

import X.C1B3;
import X.C36636EZk;
import X.C3BJ;
import X.C48841JEv;
import X.C76800UCe;
import X.C79853Bl;
import X.C79883Bo;
import X.C93940aYy;
import X.C94190ad0;
import X.C94418agg;
import X.C94523aiN;
import X.C94524aiO;
import X.C94750am2;
import X.EnumC93993aZp;
import X.InterfaceC70352pT;
import X.InterfaceC70422pa;
import X.T2R;
import X.XKX;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment;
import com.bytedance.effectcreatormobile.behaviour.container.BehaviourContainerFragment;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class BehaviourImpl implements IBehaviour {
    public final C3BJ<C76800UCe> commandListChangeEvent;
    public final InterfaceC70422pa messageScope;
    public final BehaviourLiveData<EnumC93993aZp> panelState;
    public final C3BJ<C76800UCe> validCommandAddedEvent;

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public void init() {
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public void onRecycle() {
    }

    private final Fragment getFragment() {
        Bundle bundle = new Bundle();
        BehaviourContainerFragment behaviourContainerFragment = new BehaviourContainerFragment();
        behaviourContainerFragment.setArguments(bundle);
        return behaviourContainerFragment;
    }

    public final InterfaceC70352pT<C76800UCe> getCommandListChangeEvent() {
        return new C79883Bo(this.commandListChangeEvent);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public String getTag() {
        return BehaviourImpl.class.getName();
    }

    public final void notifyCommandListChanged() {
        XKX.LIZLLL(this.messageScope, null, null, new C94750am2(this, null), 3);
    }

    public BehaviourImpl() {
        BehaviourLiveData<EnumC93993aZp> behaviourLiveData = new BehaviourLiveData<>();
        this.panelState = behaviourLiveData;
        this.commandListChangeEvent = C79853Bl.LIZ(0, 0, null, 7);
        this.validCommandAddedEvent = C79853Bl.LIZ(0, 0, null, 7);
        this.messageScope = C48841JEv.LIZ(C36636EZk.LIZ.LJJIJIL().plus(T2R.LJIIJJI()));
        behaviourLiveData.postValue(EnumC93993aZp.Hide);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public void hidePanel() {
        FragmentManager fragmentManager;
        C94190ad0 c94190ad0;
        C94418agg c94418agg;
        IEditorContext LIZ = C93940aYy.LIZ();
        if (LIZ != null && (fragmentManager = LIZ.getFragmentManager()) != null) {
            Fragment LJJJIL = fragmentManager.LJJJIL(getTag());
            if (!(LJJJIL instanceof BehaviourContainerFragment)) {
                LJJJIL = null;
            }
            BehaviourBaseFragment behaviourBaseFragment = (BehaviourBaseFragment) LJJJIL;
            if (behaviourBaseFragment != null && (c94190ad0 = (C94190ad0) behaviourBaseFragment.Al()) != null && (c94418agg = c94190ad0.LJLILLLLZI) != null) {
                c94418agg.dismiss();
            }
        }
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public LiveData<EnumC93993aZp> getPanelStateLiveData() {
        return this.panelState;
    }

    public final C3BJ<C76800UCe> getValidCommandAddedEvent() {
        return this.validCommandAddedEvent;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public InterfaceC70352pT<C76800UCe> validCommandAdded() {
        return this.validCommandAddedEvent;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public void open(FragmentManager fragmentManager, int i) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJJI(R.anim.i1, R.anim.i5, 0, 0);
        c1b3.LJIIIIZZ(i, 1, getFragment(), getTag());
        c1b3.LJI();
        CKEffectEditorContext.LIZLLL(C94524aiO.LJLIL);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.behaviour.IBehaviour
    public void open(FragmentManager fragmentManager, int i, long j) {
        o.LJIIIZ(fragmentManager, "fragmentManager");
        if (fragmentManager.LJJJIL(getTag()) != null) {
            return;
        }
        C1B3 c1b3 = new C1B3(fragmentManager);
        c1b3.LJIIJJI(R.anim.i1, R.anim.i5, 0, 0);
        Bundle bundle = new Bundle();
        bundle.putString("page", "behaviour_edit");
        bundle.putLong("cke_behaviour_command_object_id_key", j);
        BehaviourContainerFragment behaviourContainerFragment = new BehaviourContainerFragment();
        behaviourContainerFragment.setArguments(bundle);
        c1b3.LJIIIIZZ(i, 1, behaviourContainerFragment, getTag());
        c1b3.LJI();
        CKEffectEditorContext.LIZLLL(C94523aiN.LJLIL);
    }
}
