package com.ss.android.ugc.gamora.editor.filter.core;

import X.C140415fB;
import X.C221108m2;
import X.C48841JEv;
import X.C5H3;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C74216TAu;
import X.C77341UWz;
import X.C82232WPc;
import X.C82237WPh;
import X.C82622Wbi;
import X.InterfaceC115514g7;
import X.InterfaceC122704ri;
import X.InterfaceC135635Tz;
import X.InterfaceC143655kP;
import X.InterfaceC146235oZ;
import X.InterfaceC148845sm;
import X.InterfaceC70422pa;
import X.InterfaceC74236TBo;
import X.InterfaceC79150V4o;
import X.InterfaceC82231WPb;
import X.InterfaceC82236WPg;
import X.TBT;
import X.TML;
import X.UCI;
import X.WPR;
import X.WPS;
import X.WPW;
import Y.AObserverS82S0100000_14;
import Y.AfS66S0100000_14;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class EditFilterViewModel extends LifecycleAwareViewModel<EditFilterState> implements InterfaceC146235oZ, InterfaceC82231WPb, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJZI;
    public final InterfaceC115514g7 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final MutableLiveData<Boolean> LJLL;
    public final LiveData<Boolean> LJLLI;
    public final C73318Sq2 LJLLILLLL;
    public final C5H3 LJLLJ;
    public InterfaceC79150V4o LJLLL;
    public int LJLLLL;
    public final C82622Wbi LJLLLLLL;
    public final InterfaceC82236WPg LJLZ;
    public final InterfaceC82231WPb LJZ;

    static {
        TBT tbt = new TBT(EditFilterViewModel.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt};
    }

    private final InterfaceC148845sm Nv0() {
        return (InterfaceC148845sm) this.LJLJLJ.getValue();
    }

    private final InterfaceC122704ri Ov0() {
        return (InterfaceC122704ri) this.LJLJLLL.getValue();
    }

    public final InterfaceC70422pa Lv0() {
        return (InterfaceC70422pa) this.LJLLJ.getValue();
    }

    public final InterfaceC143655kP Mv0() {
        return (InterfaceC143655kP) this.LJLJL.LIZ(this, LJZI[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: Jv0, reason: merged with bridge method [inline-methods] */
    public EditFilterState kv0() {
        return new EditFilterState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.InterfaceC146235oZ
    public void dM() {
        setState(WPS.LJLIL);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.LJLLILLLL.LIZLLL();
        C48841JEv.LIZJ(Lv0(), null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public void onStart() {
        super.onStart();
        this.LJLZ.LJJJJIZL().LIZ().observe(this, new AObserverS82S0100000_14(this, 39));
        if (C74216TAu.LIZIZ.LIZIZ()) {
            this.LJLLILLLL.LIZ(this.LJLZ.LIZJ(false).LJJJLIIL(new AfS66S0100000_14(this, 20), WPW.LJLIL));
        } else {
            this.LJLZ.LJJIIJZLJL(this.LJLLLL, false);
        }
    }

    @Override // X.InterfaceC146235oZ
    public void p1() {
        Mv0().p1();
    }

    @Override // X.InterfaceC146235oZ
    public void x8() {
        Mv0().x8();
    }

    @Override // X.InterfaceC146235oZ
    public LiveData<Boolean> Bq0() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLLLLL;
    }

    public final void Kv0(C82237WPh c82237WPh) {
        withState(new AqS145S0200000_14(this, c82237WPh, 13));
    }

    @Override // X.InterfaceC146235oZ
    public void N6(boolean z) {
        Mv0().N6(z);
        setState(WPR.LJLIL);
        this.LJZ.nz(null, false, null);
    }

    @Override // X.InterfaceC146235oZ
    public void Yn0(boolean z) {
        this.LJLL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC82231WPb
    public void pg(String name) {
        o.LJIIIZ(name, "name");
        this.LJZ.pg(name);
    }

    @Override // X.InterfaceC146235oZ
    public void wU(boolean z) {
        if (!z) {
            this.LJLZ.LJJIJ();
        } else if (this.LJLLLL != -1) {
            C82232WPc.LIZ(this.LJLZ, true, 2);
        }
        setState(new AqS18S0010000_14(z, 26));
    }

    @Override // X.InterfaceC82231WPb
    public void H60(boolean z, FilterBean filterBean) {
        this.LJZ.H60(z, filterBean);
    }

    @Override // X.InterfaceC82231WPb
    public void P30(float f, boolean z) {
        this.LJZ.P30(f, z);
    }

    public EditFilterViewModel(C82622Wbi diContainer, InterfaceC82236WPg filterRepository, InterfaceC82231WPb editFilterCallback) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(filterRepository, "filterRepository");
        o.LJIIIZ(editFilterCallback, "editFilterCallback");
        this.LJLLLLLL = diContainer;
        this.LJLZ = filterRepository;
        this.LJZ = editFilterCallback;
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 199));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 200));
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LJLL = mutableLiveData;
        this.LJLLI = mutableLiveData;
        this.LJLLILLLL = new C73318Sq2();
        this.LJLLJ = C221108m2.LIZIZ(C77341UWz.LJLIL);
        this.LJLLLL = -1;
    }

    @Override // X.InterfaceC82231WPb
    public void nz(FilterBean filterBean, boolean z, Context context) {
        this.LJZ.nz(filterBean, z, context);
    }

    @Override // X.InterfaceC146235oZ
    public void Au0(FilterBean filterBean, boolean z, boolean z2, Context context) {
        setState(new AqS180S0100000_14(filterBean, 203));
    }

    public void Pv0(FilterBean filterBean, boolean z, boolean z2, Context context) {
        if (filterBean != null) {
            Mv0().AE(new C140415fB(false, filterBean, z2, this.LJLZ.LJIIJJI().LIZIZ(filterBean.getId()), 16));
            this.LJZ.nz(filterBean, z, context);
            InterfaceC82231WPb interfaceC82231WPb = this.LJZ;
            InterfaceC148845sm filterIntensityStore = Nv0();
            o.LJIIIIZZ(filterIntensityStore, "filterIntensityStore");
            InterfaceC122704ri filterInternalDefaultIntensityGetter = Ov0();
            o.LJIIIIZZ(filterInternalDefaultIntensityGetter, "filterInternalDefaultIntensityGetter");
            interfaceC82231WPb.P30(TML.LIZJ(filterBean, filterIntensityStore, filterInternalDefaultIntensityGetter), true);
            return;
        }
        this.LJZ.nz(null, z, context);
    }

    @Override // X.InterfaceC146235oZ
    public void SZ(FilterBean filterBean, boolean z, boolean z2, Context context) {
        Pv0(filterBean, z, z2, context);
        setState(new AqS180S0100000_14(filterBean, 204));
    }

    @Override // X.InterfaceC146235oZ
    public void aq(FilterBean filterBean, int i, boolean z, boolean z2) {
        o.LJIIIZ(filterBean, "filterBean");
        Nv0().LIZIZ(filterBean, i);
        Mv0().AE(new C140415fB(false, filterBean, z, (String) null, 24));
        InterfaceC82231WPb interfaceC82231WPb = this.LJZ;
        InterfaceC122704ri filterInternalDefaultIntensityGetter = Ov0();
        o.LJIIIIZZ(filterInternalDefaultIntensityGetter, "filterInternalDefaultIntensityGetter");
        interfaceC82231WPb.P30(TML.LJFF(filterBean, i, filterInternalDefaultIntensityGetter), z2);
    }
}
