package com.bytedance.effectcreatormobile.camera.viewmodel;

import X.AbstractC94370afu;
import X.C93624aTs;
import X.C93991aZn;
import X.C94899aoR;
import X.EnumC93623aTr;
import X.ORZ;
import X.XKX;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes34.dex */
public final class EffectHintViewModel extends StateViewModel {
    public final C93624aTs<LinkedHashMap<String, EffectHint>> LJLILLLLZI = new C93624aTs<>();
    public final C93624aTs<List<EffectHint>> LJLJI = new C93624aTs<>();
    public final C93624aTs<EnumC93623aTr> LJLJJI = new C93624aTs<>(EnumC93623aTr.Loading);
    public final MutableLiveData<EffectHint> LJLJJL = new MutableLiveData<>();
    public final MutableLiveData<EffectHint> LJLJJLL = new MutableLiveData<>();

    public final List<EffectHint> iv0() {
        EffectHint effectHint;
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC94370afu> it = C93991aZn.LIZ().getCommandList().iterator();
        while (it.hasNext()) {
            String LJIIIIZZ = it.next().LJII().LJIIIIZZ();
            LinkedHashMap<String, EffectHint> value = this.LJLILLLLZI.LIZ.getValue();
            if (value != null && (effectHint = value.get(LJIIIIZZ)) != null && !arrayList.contains(effectHint)) {
                arrayList.add(effectHint);
            }
        }
        return arrayList;
    }

    public EffectHintViewModel() {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C94899aoR(this, null), 3);
    }

    public final List<EffectHint> jv0() {
        List<EffectHint> iv0 = iv0();
        StateViewModel.hv0(this.LJLJI, iv0);
        List<EffectHint> value = this.LJLJI.LIZ.getValue();
        if (value != null && value.isEmpty()) {
            this.LJLJJL.setValue(null);
            this.LJLJJLL.setValue(null);
            StateViewModel.gv0(this.LJLJJI, EnumC93623aTr.Success);
        } else {
            List<EffectHint> value2 = this.LJLJI.LIZ.getValue();
            if (value2 != null) {
                if (this.LJLJJL.getValue() != null && !ORZ.LJLJJI(this.LJLJJL.getValue(), value2)) {
                    this.LJLJJL.setValue(null);
                    this.LJLJJLL.setValue(null);
                }
                if (this.LJLJJLL.getValue() == null && (!((ArrayList) iv0).isEmpty())) {
                    LiveData liveData = this.LJLJJLL;
                    Object LLFF = ORZ.LLFF(iv0);
                    this.LJLJJL.setValue(LLFF);
                    liveData.setValue(LLFF);
                }
                StateViewModel.hv0(this.LJLJJI, EnumC93623aTr.Success);
            }
        }
        return iv0;
    }
}
