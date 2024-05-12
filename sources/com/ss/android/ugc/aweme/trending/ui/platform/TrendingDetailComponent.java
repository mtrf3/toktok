package com.ss.android.ugc.aweme.trending.ui.platform;

import X.AbstractC51036K1g;
import X.C221108m2;
import X.C55457Lpd;
import X.C62822Ol8;
import X.InterfaceC50422Jqc;
import X.InterfaceC51679KPz;
import X.JEZ;
import X.M89;
import android.util.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.common.viewmodel.TrendingMixInFlowViewModel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.aweme.trending.ui.TrendingDetailPageFragment;
import com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class TrendingDetailComponent extends DetailPageComponent {
    public final C62822Ol8 LLIILII;

    public TrendingDetailComponent() {
        new LinkedHashMap();
        this.LLIILII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 344));
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final InterfaceC51679KPz A3(AbstractC51036K1g<?, ?> abstractC51036K1g) {
        InterfaceC51679KPz interfaceC51679KPz;
        InterfaceC51679KPz A3 = super.A3(abstractC51036K1g);
        if ((A3 instanceof TrendingDetailOperatorWrapper) && ((TrendingDetailPageFragment) this.LLIILII.getValue()).Zl() && ((Boolean) ((TrendingDetailPageFragment) this.LLIILII.getValue()).Yl().LLFII.getValue()).booleanValue()) {
            TrendingDetailOperatorWrapper trendingDetailOperatorWrapper = (TrendingDetailOperatorWrapper) A3;
            M89 m89 = this.LJZ;
            JediViewModel<?> jediViewModel = C55457Lpd.LJLJL;
            ViewModel viewModel = null;
            C55457Lpd.LJLJL = null;
            HashMap hashMap = new HashMap();
            Iterator it = ServiceManager.get().getServices(IDetailPageOperatorService.class).iterator();
            while (it.hasNext()) {
                HashMap<String, InterfaceC50422Jqc> LIZ = ((IDetailPageOperatorService) it.next()).LIZ();
                if (LIZ != null) {
                    hashMap.putAll(LIZ);
                }
            }
            if (hashMap.containsKey("from_search_mix")) {
                interfaceC51679KPz = ((InterfaceC50422Jqc) hashMap.get("from_search_mix")).LIZ(m89, abstractC51036K1g, jediViewModel);
                Objects.requireNonNull(interfaceC51679KPz);
            } else {
                interfaceC51679KPz = null;
            }
            o.LJIIIIZZ(interfaceC51679KPz, "getOperatorByKey(\n      …(),\n                    )");
            Lifecycle lifecycle = trendingDetailOperatorWrapper.getLifecycle();
            o.LJIIIZ(lifecycle, "lifecycle");
            if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
                try {
                    viewModel = JEZ.LIZ(lifecycle, TrendingMixInFlowViewModel.class);
                } catch (Throwable unused) {
                }
            }
            final TrendingMixInFlowViewModel trendingMixInFlowViewModel = (TrendingMixInFlowViewModel) viewModel;
            if (trendingMixInFlowViewModel != null) {
                trendingDetailOperatorWrapper.LL = interfaceC51679KPz;
                trendingMixInFlowViewModel.LJLJI = true;
                trendingDetailOperatorWrapper.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.trending.viewmodel.TrendingDetailOperatorWrapper$setBusinessProxy$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            release();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    public final void release() {
                        TrendingMixInFlowViewModel trendingMixInFlowViewModel2 = TrendingMixInFlowViewModel.this;
                        trendingMixInFlowViewModel2.getClass();
                        trendingMixInFlowViewModel2.LJLJI = false;
                    }
                });
            }
        }
        return A3;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void x3(Fragment owner, Aweme aweme, Map map) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(aweme, "aweme");
        if (!((Boolean) ((TrendingDetailPageFragment) this.LLIILII.getValue()).Yl().LLFII.getValue()).booleanValue()) {
            super.x3(owner, aweme, map);
            return;
        }
        TrendingDetailOperatorWrapper Yl = ((TrendingDetailPageFragment) this.LLIILII.getValue()).Yl();
        Yl.getClass();
        boolean z = true;
        if (!Yl.LLFF && ((TrendingMixInFlowViewModel) Yl.LLFFF.getValue()).LJLILLLLZI != null) {
            TrendingMixInFlowViewModel trendingMixInFlowViewModel = (TrendingMixInFlowViewModel) Yl.LLFFF.getValue();
            trendingMixInFlowViewModel.getClass();
            List<Aweme> list = trendingMixInFlowViewModel.LJLILLLLZI;
            if (list != null) {
                if (list.indexOf(aweme) >= trendingMixInFlowViewModel.LJLIL) {
                    z = false;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (z) {
            TrendingDetailServiceImpl.LIZLLL().LIZJ();
            ((ArrayMap) map).put("isTrending", "1");
        } else {
            ((ArrayMap) map).remove("isTrending");
        }
        ((ArrayMap) map).put("visibility_flags", "show");
        super.x3(owner, aweme, map);
    }
}
