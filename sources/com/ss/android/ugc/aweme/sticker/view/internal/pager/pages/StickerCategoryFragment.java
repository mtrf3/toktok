package com.ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import X.AbstractC029409q;
import X.C03880Dg;
import X.C165706es;
import X.C221108m2;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C71857SIb;
import X.C74266TCs;
import X.C74453TJx;
import X.C780334l;
import X.C82894Wg6;
import X.InterfaceC73367Sqp;
import X.InterfaceC73389SrB;
import X.InterfaceC74343TFr;
import X.SIZ;
import X.T4I;
import X.TE1;
import X.TEK;
import X.TEN;
import X.TEO;
import X.TEP;
import X.TEZ;
import X.THZ;
import X.TLG;
import Y.AObserverS80S0100000_12;
import Y.IDCListenerS247S0100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.SharedPoolStickerListViewModel;
import com.ss.android.ugc.aweme.sticker.view.internal.viewmodels.StickerStatesStoreViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class StickerCategoryFragment extends AbstractStickerFragment<C74266TCs> {
    public boolean LJLLJ;
    public String LJLLL;
    public String LJLLLL;
    public boolean LJLLLLLL;
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 917));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 915));
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public int LL;
    public boolean LLD;
    public boolean LLF;

    public EffectCategoryModel Ol() {
        return (EffectCategoryModel) this.LJZ.getValue();
    }

    public final T4I<Effect> Pl() {
        return (T4I) this.LJZL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public void Il() {
        String str = this.LJLLLL;
        if (str != null) {
            Pl().do0(str);
        }
    }

    public final void LJII() {
        if (C82894Wg6.LIZIZ.LIZIZ() && !this.LJLL) {
            return;
        }
        TLG<TEN> tlg = this.LJLJI;
        if (tlg != null) {
            tlg.setState(TEN.LOADING);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    public final void Ql() {
        C74266TCs c74266TCs;
        String str = this.LJLLL;
        if (str != null && (c74266TCs = this.LJLJJI) != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("category_model", Ol());
            Collection collection = c74266TCs.LJLILLLLZI;
            if (collection == null || ((ArrayList) collection).isEmpty()) {
                return;
            }
            LinearLayoutManager linearLayoutManager = this.LJLILLLLZI;
            if (linearLayoutManager != null) {
                int LLILL = linearLayoutManager.LLILL();
                if (LLILL < 1) {
                    LLILL = 1;
                }
                LinearLayoutManager linearLayoutManager2 = this.LJLILLLLZI;
                if (linearLayoutManager2 != null) {
                    int LLILLJJLI = linearLayoutManager2.LLILLJJLI() + 1;
                    while (LLILL < LLILLJJLI) {
                        TE1 te1 = wl().LIZ;
                        if (te1 != null) {
                            te1.LIZJ(LLILL, str, bundle, new AqS178S0100000_12(c74266TCs, 297));
                        }
                        LLILL++;
                    }
                    return;
                }
                o.LJIJI("layoutManager");
                throw null;
            }
            o.LJIJI("layoutManager");
            throw null;
        }
    }

    public T4I<Effect> Tl() {
        return new SharedPoolStickerListViewModel(this, Al(), vl(), Dl(), Wl());
    }

    public C74266TCs Vl() {
        return new C74266TCs(Al(), Dl(), Pl(), xl().LJFF, wl().LIZLLL, wl().LIZIZ, wl(), Ol(), this.LJLJJL);
    }

    public StickerCategoryFragment() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 916));
        this.LJZI = LIZIZ;
        this.LJZL = LIZIZ;
        this.LL = -1;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void Hl() {
        if (mo49getActivity() == null || !Gl()) {
            return;
        }
        if (wl().LJII && this.LJLL) {
            EffectCategoryModel Ol = Ol();
            if (Ol != null) {
                String key = Ol.getKey();
                this.LJLLLL = key;
                if (key == null || ujb.o.LJJJJJL(key)) {
                    LJII();
                } else {
                    Il();
                }
            } else {
                return;
            }
        }
        if (xl().LJFF.LJLL) {
            Sl();
        }
    }

    public void Ml() {
        w6().LJIIJJI(new TEK(this));
        w6().addOnAttachStateChangeListener(new IDCListenerS247S0100000_12(this, 1));
    }

    public void Nl() {
        Pl().e7().observe(this, new AObserverS80S0100000_12(this, 28));
        Al().LJIIIIZZ().LJIIL().observe(this, new AObserverS80S0100000_12(this, 29));
    }

    public final void Sl() {
        if ((xl().LJFF.LJLL && !this.LJLL) || this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        Al().LJIIIIZZ().LIZ().observe(this, new AObserverS80S0100000_12(this, 123));
        if (Pl().getPageState().getValue() == TEN.LOADING) {
            LJII();
        }
        C74453TJx.LIZ(Pl().getPageState(), C780334l.LJLIL, TEO.LJLIL, TEP.LJLIL).observe(this, new AObserverS80S0100000_12(this, 122));
        Nl();
        Pl().Sg0().observe(this, new AObserverS80S0100000_12(this, 124));
        Pl().qK().observe(this, new AObserverS80S0100000_12(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        Al().LJIIIIZZ().LIZJ().observe(this, new AObserverS80S0100000_12(this, 121));
    }

    public final InterfaceC73367Sqp Wl() {
        String str;
        if (xl().LJFF.LJLLLL) {
            return StickerStatesStoreViewModel.hv0((StickerStatesStoreViewModel) C165706es.LJII(getView(), null, 6).get(StickerStatesStoreViewModel.class), Al().LJJJJLL().LJ(), null, 6);
        }
        StickerStatesStoreViewModel stickerStatesStoreViewModel = (StickerStatesStoreViewModel) C165706es.LJII(getView(), null, 6).get(StickerStatesStoreViewModel.class);
        InterfaceC73389SrB LJ = Al().LJJJJLL().LJ();
        EffectCategoryModel Ol = Ol();
        if (Ol == null || (str = Ol.getKey()) == null) {
            str = "";
        }
        return stickerStatesStoreViewModel.gv0(LJ, str, null);
    }

    public final void Rl(int i) {
        Object obj;
        TE1 te1;
        LiveData liveData = (LiveData) this.LJLZ.getValue();
        if (liveData != null) {
            obj = liveData.getValue();
        } else {
            obj = null;
        }
        if (obj == THZ.SHOWN && getUserVisibleHint() && (te1 = wl().LIZ) != null) {
            te1.LIZLLL(i);
        }
    }

    public void Xl(List<? extends Effect> list) {
        o.LJIIIZ(list, "list");
        C74266TCs c74266TCs = this.LJLJJI;
        if (c74266TCs == null || mo49getActivity() == null || list.isEmpty()) {
            return;
        }
        c74266TCs.LJLJI = this.LJLJJL;
        c74266TCs.setData(list);
        SIZ.LIZIZ(list, Al());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        EffectCategoryModel Ol;
        super.onActivityCreated(bundle);
        if (mo49getActivity() != null && Gl() && (Ol = Ol()) != null) {
            this.LJLLL = Ol.getName();
            this.LJLLLL = Ol.getKey();
            AbstractC029409q abstractC029409q = null;
            String str = null;
            if (w6().getAdapter() == null) {
                w6().setItemAnimator(null);
                RecyclerView w6 = w6();
                C74266TCs Vl = Vl();
                this.LJLJJI = Vl;
                w6.setAdapter(Vl);
                C74266TCs c74266TCs = this.LJLJJI;
                if (c74266TCs != null) {
                    LinearLayoutManager linearLayoutManager = this.LJLILLLLZI;
                    if (linearLayoutManager != null) {
                        String str2 = this.LJLLL;
                        String str3 = this.LJLLLL;
                        InterfaceC74343TFr interfaceC74343TFr = xl().LIZJ;
                        TEZ Al = Al();
                        EffectCategoryModel Ol2 = Ol();
                        if (Ol2 != null) {
                            str = Ol2.getId();
                        }
                        c74266TCs.LJLJL = new C71857SIb(linearLayoutManager, interfaceC74343TFr, Al, str3, str2, str);
                    } else {
                        o.LJIJI("layoutManager");
                        throw null;
                    }
                }
            } else {
                AbstractC029409q adapter = w6().getAdapter();
                if (adapter instanceof C74266TCs) {
                    abstractC029409q = adapter;
                }
                this.LJLJJI = (C74266TCs) abstractC029409q;
            }
            String str4 = this.LJLLLL;
            if (str4 == null || ujb.o.LJJJJJL(str4)) {
                LJII();
            } else {
                if (!wl().LJII) {
                    Il();
                }
                if (this.LJLZ.getValue() != null) {
                    LiveData liveData = (LiveData) this.LJLZ.getValue();
                    if (liveData != null) {
                        liveData.observe(this, new AObserverS80S0100000_12(this, 118));
                    }
                } else {
                    Sl();
                }
                LiveData liveData2 = (LiveData) this.LJLZ.getValue();
                if (liveData2 != null) {
                    liveData2.observe(this, new AObserverS80S0100000_12(this, 119));
                }
            }
            Ml();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Boolean.valueOf(z)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Z)V", "1746611074561862355");
        if (c03880Dg.LIZJ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/StickerCategoryFragment", "setUserVisibleHint", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/StickerCategoryFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, false);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            Ql();
            C82894Wg6 c82894Wg6 = C82894Wg6.LIZIZ;
            if (c82894Wg6.LIZIZ() && this.LJZI.isInitialized() && (Pl().getPageState().getValue() == TEN.LOADING || (c82894Wg6.LIZJ().LIZJ() && Pl().getPageState().getValue() == null))) {
                LJII();
            }
        }
        c03880Dg.LIZIZ(10502, "com/ss/android/ugc/aweme/sticker/view/internal/pager/pages/StickerCategoryFragment", "setUserVisibleHint", null, objArr, this, c65300Pk0, true);
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (mo49getActivity() != null && Gl() && xl().LJFF.LJLL) {
            LJII();
        }
    }
}
