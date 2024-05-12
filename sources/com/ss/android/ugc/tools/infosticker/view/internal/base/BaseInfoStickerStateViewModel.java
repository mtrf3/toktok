package com.ss.android.ugc.tools.infosticker.view.internal.base;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C157166Eu;
import X.C45927I0t;
import X.C73318Sq2;
import X.C73969T1h;
import X.InterfaceC92693kP;
import X.ORZ;
import X.OSZ;
import X.T16;
import X.TEA;
import X.TLD;
import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class BaseInfoStickerStateViewModel extends HumbleViewModel implements TLD {
    public final MutableLiveData<Map<Object, OSZ<TEA, Integer>>> LJLIL;
    public final MutableLiveData<C45927I0t<List<Object>>> LJLILLLLZI;
    public final MutableLiveData<C45927I0t<List<Object>>> LJLJI;
    public C73318Sq2 LJLJJI;

    public abstract AbstractC73672Svk<C157166Eu> gv0(Object obj);

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C73318Sq2 c73318Sq2 = this.LJLJJI;
        if (c73318Sq2 != null) {
            c73318Sq2.dispose();
        }
        this.LJLJJI = null;
    }

    @Override // X.TLD
    public final MutableLiveData AF() {
        return this.LJLIL;
    }

    @Override // X.TLD
    public final MutableLiveData FB() {
        return this.LJLILLLLZI;
    }

    @Override // X.TLD
    public final MutableLiveData KD() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseInfoStickerStateViewModel(LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = new MutableLiveData<>();
        this.LJLILLLLZI = new MutableLiveData<>();
        this.LJLJI = new MutableLiveData<>();
    }

    @Override // X.TLD
    public final void DR(Object obj) {
        Map<Object, OSZ<TEA, Integer>> linkedHashMap;
        if (isDestroyed()) {
            return;
        }
        Map<Object, OSZ<TEA, Integer>> value = this.LJLIL.getValue();
        if (value != null && value.containsKey(obj)) {
            return;
        }
        Map<Object, OSZ<TEA, Integer>> value2 = this.LJLIL.getValue();
        if (value2 != null) {
            linkedHashMap = C113554cx.LJJLIL(value2);
        } else {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap.put(obj, new OSZ<>(TEA.UNKNOWN, 0));
        this.LJLIL.setValue(linkedHashMap);
        InterfaceC92693kP LJJJLIIL = gv0(obj).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS64S0100000_12(this, 49), new AfS61S0200000_12(this, obj, 7));
        C73318Sq2 c73318Sq2 = this.LJLJJI;
        if (c73318Sq2 == null) {
            c73318Sq2 = new C73318Sq2();
            this.LJLJJI = c73318Sq2;
        }
        c73318Sq2.LIZ(LJJJLIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void hv0(MutableLiveData mutableLiveData, Object obj) {
        List arrayList;
        Collection collection;
        C45927I0t c45927I0t = (C45927I0t) mutableLiveData.getValue();
        if (c45927I0t != null && (collection = (Collection) c45927I0t.LIZIZ()) != null) {
            arrayList = ORZ.LLJILJILJ(collection);
        } else {
            arrayList = new ArrayList();
        }
        arrayList.add(obj);
        mutableLiveData.setValue(new C45927I0t(arrayList));
    }
}
