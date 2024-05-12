package com.bytedance.creativex.recorder.filter.panel;

import X.AbstractC73672Svk;
import X.C113554cx;
import X.C122924s4;
import X.C16880lQ;
import X.C1EP;
import X.C221108m2;
import X.C48841JEv;
import X.C5H3;
import X.C73318Sq2;
import X.C73340SqO;
import X.C73426Srm;
import X.C73893SzJ;
import X.C77357UXp;
import X.C81322Vvq;
import X.C81324Vvs;
import X.C81667W3j;
import X.C82232WPc;
import X.C82237WPh;
import X.C82265WQj;
import X.C82622Wbi;
import X.C82891Wg3;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC79150V4o;
import X.InterfaceC82086WJm;
import X.InterfaceC82230WPa;
import X.InterfaceC82236WPg;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.THS;
import X.THT;
import X.THY;
import X.TMC;
import X.UW4;
import X.UW5;
import X.V8S;
import X.WPC;
import X.WPE;
import X.WPT;
import X.WPX;
import X.WPZ;
import X.WRP;
import android.app.Activity;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS56S0110000_14;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FilterPanelViewModel extends LifecycleAwareViewModel<FilterPanelState> implements THT {
    public final C5H3 LJLJL;
    public WRP LJLJLJ;
    public final Handler LJLJLLL;
    public final C73318Sq2 LJLL;
    public final C5H3 LJLLI;
    public InterfaceC79150V4o LJLLILLLL;
    public int LJLLJ;
    public final MutableLiveData<THS> LJLLL;
    public final C73893SzJ<THY> LJLLLL;
    public final AbstractC73672Svk<THY> LJLLLLLL;
    public final C82622Wbi LJLZ;
    public final InterfaceC65784Pro<InterfaceC82236WPg> LJZ;
    public final InterfaceC65784Pro<Boolean> LJZI;
    public final InterfaceC88472Yns<Activity, Boolean> LJZL;

    private final InterfaceC82086WJm Mv0() {
        return (InterfaceC82086WJm) this.LJLJL.getValue();
    }

    public final InterfaceC70422pa Nv0() {
        return (InterfaceC70422pa) this.LJLLI.getValue();
    }

    private final WRP Ov0() {
        WRP wrp = this.LJLJLJ;
        if (wrp != null) {
            return wrp;
        }
        WRP wrp2 = (WRP) ((C1EP) this.LJLZ.LJ(C1EP.class, null)).sO(WRP.class);
        if (wrp2 == null) {
            return null;
        }
        this.LJLJLJ = wrp2;
        return wrp2;
    }

    public final void Jv0() {
        Sv0(C122924s4.LIZ);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Kv0 */
    public FilterPanelState kv0() {
        return new FilterPanelState(new C81667W3j(), null, o.LJ(this.LJZI.invoke(), Boolean.TRUE), C113554cx.LJJJLIIL(), null, null, 48, null);
    }

    @Override // X.THT
    public LiveData<THS> Y70() {
        return C73340SqO.LJIILL(this.LJLLL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        if (!this.LJLL.LJLILLLLZI) {
            this.LJLL.dispose();
        }
        C48841JEv.LIZJ(Nv0(), null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        ((C1EP) this.LJLZ.LJ(C1EP.class, null)).m3(WRP.class, new AqS180S0100000_14(this, 31));
    }

    @Override // X.THT
    public AbstractC73672Svk<THY> Be0() {
        return this.LJLLLLLL;
    }

    private final void Sv0(OSZ<Integer, String> osz) {
        setState(new AqS180S0100000_14(osz, 32));
    }

    public final void Lv0(C82237WPh c82237WPh) {
        WPX LJJJJIZL;
        boolean z;
        InterfaceC82236WPg invoke = this.LJZ.invoke();
        if (invoke != null && (LJJJJIZL = invoke.LJJJJIZL()) != null) {
            List list = (List) LJJJJIZL.LIZ().getValue();
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJLLL.getValue() == THS.ON_SHOWN && z) {
                setStateImmediate(new AqS180S0100000_14(C82265WQj.LIZJ(c82237WPh, LJJJJIZL.LIZIZ()), 30));
                C82891Wg3.LIZLLL().d("viki filter, record page -> panel null and fresh");
                InterfaceC82230WPa interfaceC82230WPa = WPZ.LIZ;
                if (interfaceC82230WPa != null) {
                    interfaceC82230WPa.LIZLLL("video_shoot_page", false);
                }
            }
        }
    }

    public final void Pv0(C81322Vvq event) {
        WPX LJJJJIZL;
        MutableLiveData LIZJ;
        List list;
        o.LJIIIZ(event, "event");
        int i = C81324Vvs.LIZ[event.LJLIL.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Jv0();
            withState(new AqS145S0200000_14(this, event, 2));
            return;
        }
        InterfaceC82236WPg invoke = this.LJZ.invoke();
        Object obj = null;
        if (invoke != null && (LJJJJIZL = invoke.LJJJJIZL()) != null && (LIZJ = LJJJJIZL.LIZJ()) != null && (list = (List) LIZJ.getValue()) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C77357UXp.LJJIIZ((FilterBean) next, event.LJLILLLLZI.LJLIL)) {
                    obj = next;
                    break;
                }
            }
            FilterBean filterBean = (FilterBean) obj;
            if (filterBean != null) {
                Uv0(this, filterBean, true, null, 4, null);
                return;
            }
        }
        Sv0(new OSZ<>(Integer.valueOf(event.LJLILLLLZI.LJLIL.LIZ), event.LJLILLLLZI.LJLIL.LIZLLL));
    }

    public final void Qv0(Activity activity) {
        InterfaceC88472Yns<Activity, Boolean> interfaceC88472Yns = this.LJZL;
        if (interfaceC88472Yns == null || interfaceC88472Yns.invoke(activity).booleanValue()) {
            InterfaceC82236WPg invoke = this.LJZ.invoke();
            if (invoke != null) {
                C82232WPc.LIZ(invoke, false, 2);
            }
            setState(WPC.LJLIL);
        }
    }

    public final void Rv0(boolean z) {
        WRP Ov0 = Ov0();
        if (Ov0 != null) {
            Ov0.setFilterDisable(z, "build_in");
        }
        setState(new AqS18S0010000_14(z, 0));
        if (z) {
            setStateImmediate(WPE.LJLIL);
        }
    }

    public final void Vv0(List<? extends FilterBean> list) {
        withState(new AqS145S0200000_14(this, list, 3));
    }

    public final void Xv0(THY actionEvent) {
        o.LJIIIZ(actionEvent, "actionEvent");
        this.LJLLLL.onNext(actionEvent);
    }

    @Override // X.THT
    public void vc0(boolean z) {
        setStateImmediate(new AqS56S0110000_14(this, z, 0));
        Mv0().PY(new V8S(!z, false, false));
    }

    public final void Wv0(FilterBean filterBean, int i) {
        o.LJIIIZ(filterBean, "filterBean");
        WRP Ov0 = Ov0();
        if (Ov0 != null) {
            Ov0.setFilterProgress(filterBean, i);
        }
    }

    public final void Tv0(FilterBean filterBean, boolean z, String str) {
        String enterFrom = str;
        o.LJIIIZ(enterFrom, "enterFrom");
        InterfaceC82236WPg invoke = this.LJZ.invoke();
        if (invoke == null || !TMC.LJJIII(filterBean, invoke)) {
            return;
        }
        if (filterBean != null) {
            WRP Ov0 = Ov0();
            if (Ov0 != null) {
                if (z) {
                    enterFrom = "filter_box";
                }
                Ov0.setFilterChosen(filterBean, enterFrom, true, true, false);
            }
            WRP Ov02 = Ov0();
            if (Ov02 != null) {
                Ov02.setFilterDisable(false, "build_in");
            }
            setState(WPT.LJLIL);
        }
        setStateImmediate(new AqS180S0100000_14(filterBean, 33));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FilterPanelViewModel(C82622Wbi diContainer, InterfaceC65784Pro<? extends InterfaceC82236WPg> repository, InterfaceC65784Pro<Boolean> disableFilterByDefault, InterfaceC88472Yns<? super Activity, Boolean> interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(repository, "repository");
        o.LJIIIZ(disableFilterByDefault, "disableFilterByDefault");
        this.LJLZ = diContainer;
        this.LJZ = repository;
        this.LJZI = disableFilterByDefault;
        this.LJZL = interfaceC88472Yns;
        this.LJLJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 40));
        this.LJLJLLL = new Handler(C16880lQ.LLJJJJ());
        this.LJLL = new C73318Sq2();
        this.LJLLI = C221108m2.LIZIZ(UW4.LJLIL);
        this.LJLLJ = -1;
        this.LJLLL = new MutableLiveData<>();
        C73893SzJ<THY> c73893SzJ = new C73893SzJ<>();
        this.LJLLLL = c73893SzJ;
        this.LJLLLLLL = new C73426Srm(c73893SzJ);
    }

    public /* synthetic */ FilterPanelViewModel(C82622Wbi c82622Wbi, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c82622Wbi, interfaceC65784Pro, (i & 4) != 0 ? UW5.LJLIL : interfaceC65784Pro2, (i & 8) != 0 ? null : interfaceC88472Yns);
    }

    public static /* synthetic */ void Uv0(FilterPanelViewModel filterPanelViewModel, FilterBean filterBean, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            str = "";
        }
        filterPanelViewModel.Tv0(filterBean, z, str);
    }
}
