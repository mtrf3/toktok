package com.ss.android.ugc.aweme.poi.collect;

import X.C0A2;
import X.C184367Lk;
import X.C185287Oy;
import X.C185297Oz;
import X.C187127Wa;
import X.C214298b3;
import X.C221108m2;
import X.C42625Go9;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C78926UyI;
import X.C7DQ;
import X.C7P0;
import X.C7WZ;
import X.C85256Xd6;
import X.C9BE;
import X.QD3;
import X.SYL;
import X.TBT;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class PoiCollectListAssem extends UIListContentAssem<PoiCollectListViewModel> implements C7DQ {
    public View LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public Long LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public void _$_clearFindViewByIdCache() {
        this.LJLLILLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLILLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C7DQ, X.C8V9
    public String serviceKey() {
        return null;
    }

    public PoiCollectListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PoiCollectListViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 682), C184367Lk.INSTANCE, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 680));
        this.LJLJL = true;
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 678));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 679));
        this.LJLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 681));
        this.LJLLI = C221108m2.LIZIZ(new AqS153S0100000_3(this, 683));
    }

    public final C73306Spq C3() {
        return (C73306Spq) this.LJLJLJ.getValue();
    }

    public final C73306Spq E3() {
        return (C73306Spq) this.LJLJLLL.getValue();
    }

    public final C73305Spp F3() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: H3, reason: merged with bridge method [inline-methods] */
    public PoiCollectListViewModel A3() {
        return (PoiCollectListViewModel) this.LJLILLLLZI.getValue();
    }

    public final boolean I3() {
        return ((Boolean) this.LJLJI.getValue()).booleanValue();
    }

    @Override // X.C7DQ
    public void nh() {
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJI = Long.valueOf(System.currentTimeMillis());
        this.LJLJJL = true;
        K3();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public SYL v3() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZ = 5;
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZJ = LoadingFooterCell.class;
        return c57939MoZ;
    }

    public final void K3() {
        A3().manualListRefresh();
        v3().setVisibility(8);
        F3().LJFF();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            this.LJLJJLL = C85256Xd6.LIZIZ(context);
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onCollectedStatusChange(C187127Wa event) {
        String str;
        C7WZ c7wz;
        LinearLayoutManager linearLayoutManager;
        String str2;
        C7WZ c7wz2;
        o.LJIIIZ(event, "event");
        if (event.LJLIL) {
            if (((ArrayList) v3().getState().LJII()).isEmpty()) {
                v3().setVisibility(0);
                F3().setVisibility(8);
            }
            ArrayList arrayList = (ArrayList) v3().getState().LJII();
            Iterator it = arrayList.iterator();
            boolean z = false;
            if (it != null) {
                while (it.hasNext()) {
                    Object next = it.next();
                    if ((next instanceof C7WZ) && (c7wz2 = (C7WZ) next) != null) {
                        str2 = c7wz2.LJLJI;
                    } else {
                        str2 = null;
                    }
                    if (o.LJ(str2, event.LJLILLLLZI)) {
                        it.remove();
                        z = true;
                    }
                }
            }
            if (z) {
                v3().getState().LJIIJJI(arrayList);
            }
            v3().getState().LIZIZ(0, new C7WZ(event.LJLJI, event.LJLJJI, event.LJLILLLLZI));
            C0A2 layoutManager = v3().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.LLILL() == 0) {
                v3().post(new ARunnableS39S0100000_3(this, 86));
                return;
            }
            return;
        }
        ArrayList arrayList2 = (ArrayList) v3().getState().LJII();
        Iterator it2 = arrayList2.iterator();
        if (it2 != null) {
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if ((next2 instanceof C7WZ) && (c7wz = (C7WZ) next2) != null) {
                    str = c7wz.LJLJI;
                } else {
                    str = null;
                }
                if (o.LJ(str, event.LJLILLLLZI)) {
                    it2.remove();
                }
            }
        }
        v3().getState().LJIIJJI(arrayList2);
        if (((ArrayList) v3().getState().LJII()).isEmpty()) {
            v3().setVisibility(8);
            F3().setStatus(C3());
            F3().setVisibility(0);
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        this.LJLIL = view;
        super.onViewCreated(view);
        v3().LLLF.LJZL(PoiCollectCell.class);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7Ov
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182387Du c182387Du = (C182387Du) obj;
                c182387Du.getClass();
                return C208708Ha.LIZLLL(c182387Du);
            }
        }, null, new AqS169S0100000_3(this, 365), C185297Oz.LJLIL, new AqS169S0100000_3(this, 366), 2, null);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.7Ow
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C182387Du c182387Du = (C182387Du) obj;
                c182387Du.getClass();
                return C208708Ha.LIZJ(c182387Du);
            }
        }, null, C185287Oy.LJLIL, C7P0.LJLIL, new AqS169S0100000_3(this, 367), 2, null);
        PerfMonitorServiceImpl.LIZ().LJ(v3(), "poi_collect_list");
    }
}
