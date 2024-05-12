package com.ss.android.ugc.aweme.sticker.view.internal.viewmodels;

import X.C1FP;
import X.C221108m2;
import X.C44236HXs;
import X.C45927I0t;
import X.C61878OQg;
import X.C62822Ol8;
import X.C73299Spj;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78866UxK;
import X.EnumC44267HYx;
import X.InterfaceC43949HMr;
import X.InterfaceC46204IBk;
import X.InterfaceC65784Pro;
import X.InterfaceC73367Sqp;
import X.J8V;
import X.OSJ;
import X.OSZ;
import X.T4I;
import X.T4J;
import X.TE7;
import X.TE8;
import X.TEA;
import X.TEF;
import X.TEN;
import X.TEZ;
import X.TIF;
import X.V3N;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.view.base.HumbleViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class BaseStickerListViewModel extends HumbleViewModel implements T4I {
    public final C73318Sq2 LJLIL;
    public final MutableLiveData<List<Effect>> LJLILLLLZI;
    public final MutableLiveData<Boolean> LJLJI;
    public final MutableLiveData<Effect> LJLJJI;
    public final MutableLiveData<TEN> LJLJJL;
    public final MutableLiveData<C45927I0t<Effect>> LJLJJLL;
    public final TE7 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final TEZ LJLJLLL;
    public final InterfaceC46204IBk LJLL;
    public final TEF LJLLI;
    public final InterfaceC73367Sqp LJLLILLLL;

    public abstract List<Effect> gv0(TE8 te8, int i);

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.T4I
    public final LiveData<OSJ<Effect, TEA, Integer>> Sg0() {
        return this.LJLLILLLL.LIZ();
    }

    public T4J<Effect> iv0() {
        return new C73299Spj();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LJLIL.LIZLLL();
    }

    @Override // X.T4I
    public final MutableLiveData ST() {
        return this.LJLJI;
    }

    @Override // X.T4I
    public final LiveData<List<Effect>> e7() {
        return this.LJLILLLLZI;
    }

    @Override // X.T4I
    public final LiveData<TEN> getPageState() {
        return this.LJLJJL;
    }

    @Override // X.T4I
    public final MutableLiveData qK() {
        return this.LJLJJLL;
    }

    @Override // X.T4I
    public final MutableLiveData ro0() {
        return this.LJLJJI;
    }

    @Override // X.T4I
    public final int L4(Object obj) {
        return ((T4J) this.LJLJLJ.getValue()).L4(obj);
    }

    @Override // X.T4I
    public final void fX(TE8 request) {
        boolean z;
        List<Effect> list;
        o.LJIIIZ(request, "request");
        Effect effect = (Effect) request.LJLIL;
        int i = request.LJLILLLLZI;
        int i2 = request.LJLJI;
        boolean z2 = request.LJLJJI;
        boolean z3 = request.LJLJJL;
        boolean z4 = request.LJLJJLL;
        Bundle bundle = request.LJLJL;
        InterfaceC43949HMr interfaceC43949HMr = request.LJLJLJ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = request.LJLJLLL;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = request.LJLL;
        if (V3N.LJIILLIIL(this.LJLJLLL.LLJJIJIIJIL())) {
            return;
        }
        boolean hv0 = hv0(effect, z3);
        if (z2) {
            z = hv0;
        } else {
            z = false;
        }
        this.LJLJLLL.LJIIIIZZ().LJ(new C44236HXs(effect, i2, i, z, z3, 32));
        if (hv0 && !z3) {
            if (z2) {
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                InterfaceC46204IBk interfaceC46204IBk = this.LJLL;
                EnumC44267HYx requestSource = EnumC44267HYx.UI_CLICK;
                o.LJIIIZ(requestSource, "requestSource");
                interfaceC46204IBk.LIZJ(new TIF(effect, i, requestSource, bundle));
                return;
            }
            return;
        }
        if (C1FP.LJIILLIIL(this.LJLJLLL, effect)) {
            return;
        }
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
        }
        this.LJLLI.LIZLLL(effect);
        InterfaceC46204IBk interfaceC46204IBk2 = this.LJLL;
        EnumC44267HYx enumC44267HYx = EnumC44267HYx.UI_CLICK;
        if (z4) {
            list = gv0(request, this.LJLJLLL.LJJIL().LJLJJL);
        } else {
            list = C61878OQg.INSTANCE;
        }
        interfaceC46204IBk2.LIZJ(J8V.LJI(effect, i, enumC44267HYx, list, bundle, this.LJLJL, interfaceC43949HMr, i2, false, this.LJLJLLL.LJJ(), 128));
    }

    public boolean hv0(Effect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        if (!z) {
            return C78866UxK.LJJJJZI(this.LJLJLLL, effect);
        }
        return C78866UxK.LJJJJZ(this.LJLJLLL, effect);
    }

    @Override // X.T4I
    public final OSZ oQ(Object obj, boolean z) {
        Effect data = (Effect) obj;
        o.LJIIIZ(data, "data");
        return this.LJLLILLLL.LIZJ(data, z);
    }

    public final void jv0(Effect effect, TEA state, Integer num) {
        o.LJIIIZ(effect, "effect");
        o.LJIIIZ(state, "state");
        this.LJLLILLLL.LIZIZ(effect, state, num, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseStickerListViewModel(LifecycleOwner lifecycleOwner, TEZ stickerDataManager, InterfaceC46204IBk clickController, TEF tagHandler, InterfaceC73367Sqp interfaceC73367Sqp) {
        super(lifecycleOwner);
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(tagHandler, "tagHandler");
        this.LJLJLLL = stickerDataManager;
        this.LJLL = clickController;
        this.LJLLI = tagHandler;
        this.LJLLILLLL = interfaceC73367Sqp;
        this.LJLIL = new C73318Sq2();
        this.LJLILLLLZI = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.TRUE);
        this.LJLJI = mutableLiveData;
        this.LJLJJI = new MutableLiveData<>();
        new MutableLiveData();
        this.LJLJJL = new MutableLiveData<>();
        this.LJLJJLL = new MutableLiveData<>();
        this.LJLJL = new TE7(this);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 919));
    }
}
