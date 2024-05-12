package com.ss.android.ugc.aweme.ftc.components.toolbar;

import X.C1536461g;
import X.C221108m2;
import X.C5H3;
import X.C61N;
import X.C61O;
import X.C61P;
import X.C61Q;
import X.C61R;
import X.C61T;
import X.C61U;
import X.C81668W3k;
import X.InterfaceC146725pM;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS27S1000000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class FTCEditToolbarViewModel extends LifecycleAwareViewModel<FTCEditToolbarState> implements InterfaceC146725pM {
    public final MutableLiveData<Integer> LJLJL = new MutableLiveData<>();
    public final C5H3 LJLJLJ = C221108m2.LIZIZ(C61T.LJLIL);
    public final C5H3 LJLJLLL = C221108m2.LIZIZ(C61Q.LJLIL);
    public final C5H3 LJLL = C221108m2.LIZIZ(C61N.LJLIL);
    public final C5H3 LJLLI = C221108m2.LIZIZ(C61P.LJLIL);
    public final C5H3 LJLLILLLL = C221108m2.LIZIZ(C61O.LJLIL);
    public final C5H3 LJLLJ = C221108m2.LIZIZ(C61U.LJLIL);
    public boolean LJLLL;

    private final Map<Integer, MutableLiveData<Boolean>> Mv0() {
        return (Map) this.LJLL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Ov0() {
        return (Map) this.LJLLILLLL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Pv0() {
        return (Map) this.LJLLI.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Qv0() {
        return (Map) this.LJLJLLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public FTCEditToolbarState kv0() {
        return new FTCEditToolbarState(new C81668W3k(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 4094, 0 == true ? 1 : 0);
    }

    public final MutableLiveData<Boolean> Kv0() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    public final MutableLiveData<Boolean> Lv0() {
        return (MutableLiveData) this.LJLLJ.getValue();
    }

    @Override // X.InterfaceC146725pM
    public void r3() {
        setState(C61R.LJLIL);
    }

    @Override // X.InterfaceC146725pM
    public boolean B5() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC146725pM
    public LiveData<Integer> qa() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC146725pM
    public void A7(int i) {
        this.LJLJL.setValue(Integer.valueOf(i));
    }

    public final void HH(String value) {
        o.LJIIIZ(value, "value");
        setState(new AqS27S1000000_2(value, 1));
    }

    public final void LZ(int i) {
        setState(new AqS27S0001000_2(i, 5));
    }

    public final LiveData<Boolean> Nv0(int i) {
        return Ov0().get(Integer.valueOf(i));
    }

    public final LiveData<Boolean> Ok0(int i) {
        return Pv0().get(Integer.valueOf(i));
    }

    public final void Rv0(List<C1536461g> value) {
        o.LJIIIZ(value, "value");
        setState(new AqS168S0100000_2(value, (List<C1536461g>) 65));
    }

    public final void Sv0(List<C1536461g> value) {
        o.LJIIIZ(value, "value");
        setState(new AqS168S0100000_2(value, (List<C1536461g>) 66));
    }

    public final LiveData<Boolean> Um0(int i) {
        return Qv0().get(Integer.valueOf(i));
    }

    public final void V10(boolean z) {
        setState(new AqS7S0010000_2(z, 6));
    }

    public final void cm(String value) {
        o.LJIIIZ(value, "value");
        setState(new AqS27S1000000_2(value, 0));
    }

    public final void du(boolean z) {
        Kv0().setValue(Boolean.valueOf(z));
    }

    public final void f0(int i) {
        setState(new AqS27S0001000_2(i, 7));
    }

    @Override // X.InterfaceC146725pM
    public void f5(boolean z) {
        this.LJLLL = z;
    }

    public final void gv(int i) {
        setState(new AqS27S0001000_2(i, 6));
    }

    public final LiveData<Boolean> se(int i) {
        return Mv0().get(Integer.valueOf(i));
    }

    public final void yd(boolean z) {
        setState(new AqS7S0010000_2(z, 7));
    }

    public final void Jf(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Mv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC146725pM
    public void b2(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Qv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    public final void fg0(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Pv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC146725pM
    public void p9(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Ov0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    public final void rO(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Ov0().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(z));
        }
    }
}
