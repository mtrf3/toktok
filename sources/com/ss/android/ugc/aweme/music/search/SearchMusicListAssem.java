package com.ss.android.ugc.aweme.music.search;

import X.C208708Ha;
import X.C213688a4;
import X.C214298b3;
import X.C221108m2;
import X.C239459aX;
import X.C239559ah;
import X.C239579aj;
import X.C239779b3;
import X.C239829b8;
import X.C26045AKb;
import X.C2NU;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9A4;
import X.C9A7;
import X.C9BE;
import X.EF7;
import X.EnumC55365Lo9;
import X.InterfaceC191547fS;
import X.InterfaceC240029bS;
import X.InterfaceC241869eQ;
import X.InterfaceC242149es;
import X.SYL;
import X.TBT;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.music.assem.list.MusicFooterCell;
import com.ss.android.ugc.aweme.music.search.SearchMusicListAssem;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SearchMusicListAssem extends Hilt_SearchMusicListAssem implements InterfaceC242149es, InterfaceC240029bS {
    public final C214298b3 LJLJJI;
    public final C214298b3 LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public final C214298b3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public Map<Integer, View> LJLL = new LinkedHashMap();
    public final C5H3 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 468));

    public void _$_clearFindViewByIdCache() {
        this.LJLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLL;
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

    @Override // X.InterfaceC242149es, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public SearchMusicListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LJLJJI = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 465), C239559ah.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LegacyCommunicateViewModel.class);
        this.LJLJJL = C78926UyI.LJ(this, LIZ2, c9be, new AqS154S0100000_4(LIZ2, 466), C9A7.INSTANCE, null);
        this.LJLJJLL = true;
        this.LJLJL = true;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 469);
        C65776Prg LIZ3 = C65352Pkq.LIZ(SearchMusicListViewModel.class);
        this.LJLJLJ = C78926UyI.LJ(this, LIZ3, c9be, new AqS154S0100000_4(LIZ3, 467), C239459aX.INSTANCE, aqS154S0100000_4);
        this.LJLJLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 462));
    }

    public final LegacyCommunicateViewModel E3() {
        return (LegacyCommunicateViewModel) this.LJLJJL.getValue();
    }

    public final MusicPlayViewModel F3() {
        return (MusicPlayViewModel) this.LJLJJI.getValue();
    }

    public final C73305Spp H3() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-statusView>(...)");
        return (C73305Spp) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public SearchMusicListViewModel A3() {
        return (SearchMusicListViewModel) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC242149es
    public View LJIJJ() {
        if (this._isViewValid) {
            return v3();
        }
        return null;
    }

    @Override // X.InterfaceC240029bS
    public C239579aj LJJJIL() {
        return new C239579aj(v3(), new InterfaceC191547fS() { // from class: X.9ab
            @Override // X.InterfaceC191547fS
            public final void LJIIJJI() {
                SearchMusicListAssem.this.A3().manualListRetry(SZP.Next);
            }
        });
    }

    @Override // X.InterfaceC242149es
    public void LL() {
        if (this._isViewValid && v3().getChildCount() > 0) {
            v3().LJLIL(0);
        }
    }

    @Override // X.InterfaceC242149es
    public boolean LLLZI() {
        if (!this._isViewValid) {
            return false;
        }
        if (v3().getChildCount() > 0) {
            v3().LJLI(0);
        }
        A3().refresh();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC242149es
    public boolean isEmpty() {
        if (!this._isViewValid) {
            return false;
        }
        C239829b8 c239829b8 = (C239829b8) A3().getState();
        c239829b8.getClass();
        List LIZ = C208708Ha.LIZ(c239829b8);
        if (LIZ != null && !LIZ.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public SYL v3() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-list>(...)");
        return (SYL) value;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZJ = MusicFooterCell.class;
        return c57939MoZ;
    }

    public final void K3() {
        H3().setVisibility(0);
        C73305Spp H3 = H3();
        C73306Spq c73306Spq = new C73306Spq();
        C73312Spw.LJI(c73306Spq, new AqS154S0100000_4(this, 464));
        H3.setStatus(c73306Spq);
    }

    @Override // X.InterfaceC242149es
    public boolean LJJ() {
        return this.LJLJL;
    }

    public static boolean C3(Context context) {
        try {
            return C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        PerfMonitorService LIZ = PerfMonitorServiceImpl.LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(PerfMonitorService::class.java)");
        LIZ.LJI("origin_music_new_fragment", EnumC55365Lo9.RECYCLER_VIEW, v3(), null, null);
        getContext();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.LLJJIII(1);
        v3().setLayoutManager(wrapLinearLayoutManager);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9aa
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZ(c239829b8);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 123), 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9am
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239829b8) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C239779b3.LJLIL, 4);
        C8YN.LJII(this, A3(), new TBT() { // from class: X.9ac
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C239829b8) obj).LJLIL);
            }
        }, null, new AqS186S0100000_4(this, 124), 6);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.9aZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZLLL(c239829b8);
            }
        }, null, new AqS170S0100000_4(this, 444), new AqS154S0100000_4(this, 463), new AqS170S0100000_4(this, 442), 2, null);
        C8VC.LJIIJJI(this, C65352Pkq.LIZ(InterfaceC241869eQ.class), new TBT() { // from class: X.9ap
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C240369c0) obj).LJFF;
            }
        }, new AqS170S0100000_4(this, 443));
        if (!C3(EF7.LIZIZ())) {
            new C26045AKb(view).LJIIIIZZ(R.string.img);
        } else if (E3().LJLJI) {
            A3().refresh();
        }
        C8YN.LJII(this, E3(), new TBT() { // from class: X.9A3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2310494y) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), C9A4.LJLIL, 4);
    }
}
