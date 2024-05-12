package com.ss.android.ugc.aweme.music.assem.list;

import X.C184077Kh;
import X.C208708Ha;
import X.C213688a4;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C221108m2;
import X.C239469aY;
import X.C239549ag;
import X.C239569ai;
import X.C239579aj;
import X.C239669as;
import X.C239789b4;
import X.C239829b8;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8VV;
import X.C8W0;
import X.C8YN;
import X.C9A5;
import X.C9A6;
import X.C9BE;
import X.EnumC55365Lo9;
import X.InterfaceC191547fS;
import X.InterfaceC240029bS;
import X.InterfaceC242149es;
import X.InterfaceC65784Pro;
import X.SYL;
import X.TBT;
import android.view.View;
import com.ss.android.ugc.aweme.PerfMonitorServiceImpl;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.assem.list.MusicListAssem;
import com.ss.android.ugc.aweme.music.highlight.HighlightSharedViewModel;
import com.ss.android.ugc.aweme.music.vm.LegacyCommunicateViewModel;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicListAssem extends Hilt_MusicListAssem implements InterfaceC242149es, InterfaceC240029bS {
    public final C214298b3 LJLJJLL;
    public final C214378bB LJLJL;
    public final C214298b3 LJLJLJ;
    public final C214298b3 LJLJLLL;
    public Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLJI = true;
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, OriginMusicArg.class, null), checkSupervisorPrepared());
    public final C5H3 LJLJJL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 416));

    private final void initSubscribe() {
        OriginMusicListViewModel A3 = A3();
        C8YN.LJII(this, A3, new TBT() { // from class: X.9ae
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C239829b8 c239829b8 = (C239829b8) obj;
                c239829b8.getClass();
                return C208708Ha.LIZ(c239829b8);
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 112), 4);
        C8YN.LJII(this, A3, new TBT() { // from class: X.9al
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239829b8) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), C239789b4.LJLIL, 4);
        C8YN.LJII(this, A3, new TBT() { // from class: X.9an
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239829b8) obj).LJLJI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 113), 4);
        C8YN.LJII(this, A3, new TBT() { // from class: X.9ad
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C239829b8) obj).LJLIL);
            }
        }, null, new AqS186S0100000_4(this, 114), 6);
        C8YN.LJII(this, A3, new TBT() { // from class: X.9ao
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239829b8) obj).LJLJJI;
            }
        }, C213688a4.LIZLLL(), C9A5.LJLIL, 4);
        C8YN.LJII(this, A3, new TBT() { // from class: X.9ak
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239829b8) obj).LJLJJL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 111), 4);
        LegacyCommunicateViewModel F3 = F3();
        C8YN.LJII(this, F3, new TBT() { // from class: X.9A2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2310494y) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 115), 4);
        C8YN.LJII(this, F3, new TBT() { // from class: X.9A1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C2310494y) obj).LJLILLLLZI;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 116), 4);
        C8YN.LJII(this, C3(), new TBT() { // from class: X.9aq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C239679at) obj).LJLIL;
            }
        }, C213688a4.LIZLLL(), new AqS186S0100000_4(this, 117), 4);
    }

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

    public MusicListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        C9BE c9be = C9BE.LIZ;
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(this, 415);
        C65776Prg LIZ = C65352Pkq.LIZ(OriginMusicListViewModel.class);
        this.LJLJJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS154S0100000_4(LIZ, 418), C239469aY.INSTANCE, aqS154S0100000_4);
        C239669as c239669as = C239669as.LJLIL;
        C65776Prg LIZ2 = C65352Pkq.LIZ(HighlightSharedViewModel.class);
        C239569ai c239569ai = C239569ai.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS154S0100000_4((C8W0) this, 414);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLJL = new C214378bB(LIZ2, c239669as, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c239569ai, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
        C65776Prg LIZ3 = C65352Pkq.LIZ(LegacyCommunicateViewModel.class);
        this.LJLJLJ = C78926UyI.LJ(this, LIZ3, c9be, new AqS154S0100000_4(LIZ3, 419), C9A6.INSTANCE, null);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(this, 417);
        C65776Prg LIZ4 = C65352Pkq.LIZ(MusicPlayViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ4, c9be, new AqS154S0100000_4(LIZ4, 413), C239549ag.INSTANCE, aqS154S0100000_42);
    }

    private final HighlightSharedViewModel C3() {
        return (HighlightSharedViewModel) this.LJLJL.getValue();
    }

    private final LegacyCommunicateViewModel F3() {
        return (LegacyCommunicateViewModel) this.LJLJLJ.getValue();
    }

    public final OriginMusicArg E3() {
        return (OriginMusicArg) this.LJLJJI.getValue();
    }

    public final MusicPlayViewModel H3() {
        return (MusicPlayViewModel) this.LJLJLLL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: I3, reason: merged with bridge method [inline-methods] */
    public OriginMusicListViewModel A3() {
        return (OriginMusicListViewModel) this.LJLJJLL.getValue();
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
        return new C239579aj(v3(), new InterfaceC191547fS() { // from class: X.9af
            @Override // X.InterfaceC191547fS
            public final void LJIIJJI() {
                MusicListAssem.this.A3().manualListRetry(SZP.Next);
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
        return (SYL) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = false;
        c57939MoZ.LIZ = 2;
        c57939MoZ.LIZJ = MusicFooterCell.class;
        return c57939MoZ;
    }

    private final void K3() {
        SYL v3 = v3();
        v3.getContext();
        v3.setLayoutManager(new WrapLinearLayoutManager(1));
        v3.setItemAnimator(null);
        PerfMonitorService LIZ = PerfMonitorServiceImpl.LIZ();
        o.LJIIIIZZ(LIZ, "get().getService(PerfMonitorService::class.java)");
        LIZ.LJI("origin_music_new_fragment", EnumC55365Lo9.RECYCLER_VIEW, v3, null, null);
        C8VV.LIZJ(this, new AqS170S0100000_4(this, 417));
    }

    @Override // X.InterfaceC242149es
    public boolean LJJ() {
        return this.LJLJI;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        K3();
        initSubscribe();
        A3().listClear();
        A3().refresh();
    }
}
