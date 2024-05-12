package com.ss.android.ugc.gamora.editor.toolbar;

import X.C145425nG;
import X.C148455s9;
import X.C150575vZ;
import X.C1535861a;
import X.C1535961b;
import X.C1536061c;
import X.C1538462a;
import X.C1539162h;
import X.C1539262i;
import X.C1539362j;
import X.C221108m2;
import X.C5H3;
import X.C60903NvH;
import X.C60F;
import X.C60M;
import X.C61Y;
import X.C61Z;
import X.C62Y;
import X.C62Z;
import X.C76800UCe;
import X.C81668W3k;
import X.InterfaceC153275zv;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OG9;
import X.TBT;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.gamora.editor.toolbar.EditToolbarState;
import java.util.Map;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS27S1000000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.AqS92S0101000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class EditToolbarViewModel extends LifecycleAwareViewModel<EditToolbarState> implements InterfaceC153275zv {
    public final MutableLiveData<Integer> LJLJL = new MutableLiveData<>();
    public final C5H3 LJLJLJ = C221108m2.LIZIZ(C1539262i.LJLIL);
    public final LiveData<Boolean> LJLJLLL = Kv0();
    public final LiveData<Boolean> LJLL = new MutableLiveData();
    public final LiveData<Boolean> LJLLI = new MutableLiveData();
    public final MutableLiveData<Boolean> LJLLILLLL;
    public final LiveData<Boolean> LJLLJ;
    public final C5H3 LJLLL;
    public final C5H3 LJLLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final MutableLiveData<C60M> LJZI;
    public final MutableLiveData<C60M> LJZL;
    public final MutableLiveData<C60M> LL;
    public final C5H3 LLD;
    public final LiveData<Boolean> LLF;
    public final C60F LLFF;
    public boolean LLFFF;
    public boolean LLFII;

    @Override // X.InterfaceC153275zv
    public void Qk0(boolean z) {
    }

    @Override // X.InterfaceC153275zv
    public void q0() {
    }

    @Override // X.InterfaceC153275zv
    public void vn(boolean z) {
    }

    private final Map<Integer, MutableLiveData<ImageUrlModel>> Mv0() {
        return (Map) this.LJLLLL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Nv0() {
        return (Map) this.LJLLLLLL.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Ov0() {
        return (Map) this.LJZ.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Pv0() {
        return (Map) this.LJLZ.getValue();
    }

    private final Map<Integer, MutableLiveData<Boolean>> Qv0() {
        return (Map) this.LJLLL.getValue();
    }

    @Override // X.InterfaceC153275zv
    public boolean B5() {
        return this.LLFF.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public EditToolbarState kv0() {
        return new EditToolbarState(new C81668W3k(), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false), 131070, 0 == true ? 1 : 0);
    }

    public final MutableLiveData<Boolean> Kv0() {
        return (MutableLiveData) this.LJLJLJ.getValue();
    }

    public final MutableLiveData<Boolean> Lv0() {
        return (MutableLiveData) this.LLD.getValue();
    }

    @Override // X.InterfaceC153275zv
    public void r3() {
        setState(C62Z.LJLIL);
    }

    @Override // X.InterfaceC153275zv
    public void refresh() {
        setState(C1538462a.LJLIL);
    }

    public EditToolbarViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLLILLLL = mutableLiveData;
        this.LJLLJ = mutableLiveData;
        this.LJLLL = C221108m2.LIZIZ(C1536061c.LJLIL);
        this.LJLLLL = C221108m2.LIZIZ(C61Y.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C61Z.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C1535961b.LJLIL);
        this.LJZ = C221108m2.LIZIZ(C1535861a.LJLIL);
        this.LJZI = new MutableLiveData<>();
        this.LJZL = new MutableLiveData<>();
        this.LL = new MutableLiveData<>();
        this.LLD = C221108m2.LIZIZ(C1539162h.LJLIL);
        this.LLF = Lv0();
        this.LLFF = new C60F();
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> I6() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> Kb() {
        return this.LJLL;
    }

    @Override // X.InterfaceC153275zv
    public boolean Qf() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> Tl() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> n2() {
        return this.LLF;
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Integer> qa() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC153275zv
    public C60F vq() {
        return this.LLFF;
    }

    @Override // X.InterfaceC153275zv
    public boolean wu() {
        return this.LLFII;
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> xW() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC153275zv
    public void A7(int i) {
        if (i == 26) {
            boolean z = !C60903NvH.LJIIJJI().LJJIL().getAICaptionSwitch(false);
            C60903NvH.LJIIJJI().LJJIL().setAICaptionSwitch(z);
            setState(new AqS7S0010000_2(z, 31));
        }
        this.LJLJL.setValue(Integer.valueOf(i));
    }

    @Override // X.InterfaceC153275zv
    public LiveData<ImageUrlModel> EV(int i) {
        return Mv0().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC153275zv
    public void HH(String value) {
        o.LJIIIZ(value, "value");
        setState(new AqS27S1000000_2(value, 4));
    }

    @Override // X.InterfaceC153275zv
    public void Jl(boolean z) {
        this.LJLLILLLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153275zv
    public void M0(int i) {
        setState(new AqS27S0001000_2(i, 21));
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> Ok0(int i) {
        return Pv0().get(Integer.valueOf(i));
    }

    public final void Rv0(C1539362j value) {
        o.LJIIIZ(value, "value");
        setState(new AqS168S0100000_2(value, 304));
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> Um0(int i) {
        return Qv0().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC153275zv
    public void f5(boolean z) {
        this.LLFF.LIZIZ = z;
    }

    @Override // X.InterfaceC153275zv
    public void gv(int i) {
        setState(new AqS27S0001000_2(i, 22));
    }

    @Override // X.InterfaceC153275zv
    public void ks0(int i) {
        Rv0(new C1539362j(i));
    }

    @Override // X.InterfaceC153275zv
    public LiveData<C60M> mF(int i) {
        if (i == 17) {
            return this.LJZI;
        }
        if (i == 15) {
            return this.LJZL;
        }
        if (i == 4) {
            return this.LL;
        }
        return null;
    }

    @Override // X.InterfaceC153275zv
    public void ot(boolean z) {
        Lv0().setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153275zv
    public void pC(boolean z) {
        this.LLFFF = z;
    }

    @Override // X.InterfaceC153275zv
    public void qb(boolean z) {
        setState(new AqS7S0010000_2(z, 32));
    }

    @Override // X.InterfaceC153275zv
    public void rb(C148455s9 autoEnhanceStatus) {
        o.LJIIIZ(autoEnhanceStatus, "autoEnhanceStatus");
        setState(new AqS168S0100000_2(autoEnhanceStatus, 305));
    }

    @Override // X.InterfaceC153275zv
    public LiveData<Boolean> se(int i) {
        return Nv0().get(Integer.valueOf(i));
    }

    @Override // X.InterfaceC153275zv
    public void u60(boolean z) {
        this.LLFII = z;
    }

    @Override // X.InterfaceC153275zv
    public void A60(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C150575vZ<Integer, String>, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62g
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getIconLottieAnimation();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 48));
    }

    @Override // X.InterfaceC153275zv
    public void Dp0(int i, ImageUrlModel imageUrlModel) {
        MutableLiveData<ImageUrlModel> mutableLiveData = Mv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(imageUrlModel);
    }

    @Override // X.InterfaceC153275zv
    public void H10(int i, InterfaceC88472Yns<? super View, C76800UCe> animator) {
        o.LJIIIZ(animator, "animator");
        setState(new AqS92S0101000_2(i, (int) animator, (InterfaceC88472Yns<? super View, C76800UCe>) 0));
    }

    @Override // X.InterfaceC153275zv
    public void Hn(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C150575vZ<Integer, InterfaceC88472Yns<View, C76800UCe>>, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62f
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getIconAnimation();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 47));
    }

    @Override // X.InterfaceC153275zv
    public void Jf(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Nv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153275zv
    public void Ly(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Boolean, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62e
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getEnableAudioEnhance();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 45));
    }

    @Override // X.InterfaceC153275zv
    public void We(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C145425nG, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.61z
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getHideMoreEvent();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 46));
    }

    @Override // X.InterfaceC153275zv
    public void b2(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Qv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153275zv
    public void bb0(int i, String path) {
        o.LJIIIZ(path, "path");
        setState(new C62Y(i, path));
    }

    @Override // X.InterfaceC153275zv
    public void fg0(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Pv0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153275zv
    public void ic0(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C148455s9, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62c
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getAutoEnhanceStatus();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 42));
    }

    @Override // X.InterfaceC153275zv
    public void os(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super C145425nG, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62W
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getRefresh();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 49));
    }

    @Override // X.InterfaceC153275zv
    public void p9(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Ov0().get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            return;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC153275zv
    public void rO(int i, boolean z) {
        MutableLiveData<Boolean> mutableLiveData = Ov0().get(Integer.valueOf(i));
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(z));
        }
    }

    @Override // X.InterfaceC153275zv
    public void uk(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Boolean, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62b
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((EditToolbarState) obj).getAiCaptionOn());
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 41));
    }

    @Override // X.InterfaceC153275zv
    public void uo0(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super String, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.620
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getChooseMusicText();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 44));
    }

    @Override // X.InterfaceC153275zv
    public void wc(LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Integer, C76800UCe> func) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(func, "func");
        OG9.LIZIZ(this, lifecycleOwner, new TBT() { // from class: X.62d
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditToolbarState) obj).getChooseMusicIconRes();
            }
        }, new AqS184S0100000_2(func, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 43));
    }

    @Override // X.InterfaceC153275zv
    public void VH(int i, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (i == 17) {
            this.LJZI.setValue(new C60M(z, interfaceC65784Pro));
        } else if (i == 15) {
            this.LJZL.setValue(new C60M(z, interfaceC65784Pro));
        } else {
            if (i != 4) {
                return;
            }
            this.LL.setValue(new C60M(z, interfaceC65784Pro));
        }
    }
}
