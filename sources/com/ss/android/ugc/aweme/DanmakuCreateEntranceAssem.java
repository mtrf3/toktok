package com.ss.android.ugc.aweme;

import X.C06460Ne;
import X.C16880lQ;
import X.C174046sK;
import X.C212428Vi;
import X.C214348b8;
import X.C214778bp;
import X.C214918c3;
import X.C215478cx;
import X.C215488cy;
import X.C215498cz;
import X.C215548d4;
import X.C215568d6;
import X.C215598d9;
import X.C215608dA;
import X.C215628dC;
import X.C215638dD;
import X.C2K0;
import X.C32151Nz;
import X.C42625Go9;
import X.C47261Igj;
import X.C51029K0z;
import X.C54840Lfg;
import X.C55096Ljo;
import X.C5H3;
import X.C62623Ohv;
import X.C62814Ol0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72R;
import X.C74221TAz;
import X.C8O2;
import X.C8YN;
import X.EnumC215578d7;
import X.EnumC215618dB;
import X.InterfaceC115514g7;
import X.InterfaceC217378g1;
import X.InterfaceC55102Lju;
import X.InterfaceC74236TBo;
import X.KR3;
import X.O6R;
import X.QD3;
import X.SU4;
import X.TBT;
import X.X1D;
import Y.ACListenerS23S0100000_3;
import Y.ARunnableS39S0100000_3;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.core.DanmakuViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.DanmakuProtocol;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class DanmakuCreateEntranceAssem extends BaseCellSlotComponent implements InterfaceC217378g1, DanmakuProtocol, DanmakuEntranceAbility, InterfaceC55102Lju {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIII;
    public final InterfaceC115514g7 LLFII;
    public final C5H3 LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public EnumC215578d7 LLII;

    static {
        TBT tbt = new TBT(DanmakuCreateEntranceAssem.class, "danmakuVM", "getDanmakuVM()Lcom/ss/android/ugc/aweme/core/DanmakuViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIII = new InterfaceC74236TBo[]{tbt};
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        return R.layout.ajt;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -49398551) {
            return null;
        }
        return this;
    }

    public DanmakuCreateEntranceAssem() {
        new LinkedHashMap();
        C65776Prg LIZ = C65352Pkq.LIZ(DanmakuViewModel.class);
        this.LLFII = C214348b8.LIZ(this, LIZ, null, new AqS153S0100000_3(LIZ, 64), null, C215628dC.INSTANCE, null, null);
        this.LLFZ = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoViewModel.class), C215638dD.INSTANCE);
        this.LLII = EnumC215578d7.HIDE;
    }

    @Override // X.InterfaceC217378g1
    public final boolean F1() {
        return C62623Ohv.LIZIZ.LJIIIZ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme());
    }

    @Override // X.InterfaceC217378g1
    public final boolean LLII() {
        C214778bp.LIZ.getClass();
        return C214778bp.LIZIZ();
    }

    @Override // X.InterfaceC217378g1
    public final void b2() {
        int i;
        C214778bp.LIZ.getClass();
        if (!C215608dA.LIZ().getBoolean("danmaku_allow_show", true) || C214778bp.LIZIZ) {
            return;
        }
        C214778bp.LIZIZ = true;
        if (SU4.LIZLLL(C215608dA.LIZ().getLong("danmaku_last_active_timestamp", -1L)) || (i = C215608dA.LIZ().getInt("danmaku_active_day_count_number", 0)) > 10) {
            return;
        }
        C215608dA.LIZ().storeInt("danmaku_active_day_count_number", i + 1);
        C215608dA.LIZ().storeLong("danmaku_last_active_timestamp", System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.aweme.DanmakuEntranceAbility
    public final boolean bt0() {
        if (this.LLII == EnumC215578d7.SHOW_FULL_ENTRANCE) {
            return true;
        }
        return false;
    }

    public final DanmakuViewModel q4() {
        return (DanmakuViewModel) this.LLFII.LIZ(this, LLIIII[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void e4() {
        q4().lv0(true);
        q4().mv0();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
        C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), DanmakuProtocol.class, C47261Igj.LJJIJIL(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.C8XO
    public final void unBind() {
        String str;
        Aweme aweme;
        DanmakuViewModel q4 = q4();
        q4.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DanmakuViewModel: unBind,");
        VideoItemParams gv0 = q4.gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append('\"');
        X1D.LIZIZ(LIZ);
        q4.mv0();
        q4.lv0(true);
        C215498cz c215498cz = q4.LJLL;
        if (c215498cz != null) {
            c215498cz.LJIILIIL.dispose();
        }
        q4.LJLL = null;
        q4.LJLLI = null;
        q4.LJLLILLLL = -1L;
        q4.LJLLL = null;
        q4.LJLLLL = false;
        C42625Go9.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void Z3() {
        C42625Go9.LIZJ(this);
    }

    @Override // X.InterfaceC217378g1
    public final EnumC215618dB getPriority() {
        return EnumC215618dB.DANMAKU;
    }

    @Override // X.C8XO
    public final void F0(VideoItemParams videoItemParams) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(item, "item");
        DanmakuViewModel q4 = q4();
        q4.getClass();
        q4.LJLLJ = false;
        q4.LJLL = new C215498cz(item.getAweme());
        q4.LJLLL = new C215488cy(C74221TAz.LIZJ(item, "item.aweme.aid"));
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), LandscapeEntrancesControlAbility.class, null);
        if (landscapeEntrancesControlAbility != null) {
            landscapeEntrancesControlAbility.XQ(this);
        }
        C42625Go9.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.service.DanmakuProtocol
    public final void LLIIJI(boolean z) {
        LandscapeEntrancesControlAbility landscapeEntrancesControlAbility = (LandscapeEntrancesControlAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), LandscapeEntrancesControlAbility.class, null);
        if (landscapeEntrancesControlAbility != null) {
            landscapeEntrancesControlAbility.XQ(null);
        }
    }

    @Override // X.InterfaceC217378g1
    public final void LLJIJIL(EnumC215578d7 showType) {
        o.LJIIIZ(showType, "showType");
        int i = C215568d6.LIZ[showType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    View view = this.LLI;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.LLIFFJFJJ;
                    if (view2 != null) {
                        C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), view2);
                    }
                    getContainerView().setVisibility(0);
                    r4(false);
                }
            } else {
                View view3 = this.LLI;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                View view4 = this.LLIFFJFJJ;
                if (view4 != null) {
                    C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), view4);
                }
                getContainerView().setVisibility(0);
                r4(false);
            }
        } else {
            getContainerView().setVisibility(8);
        }
        this.LLII = showType;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onChangeVideoDanmakuPrivacy(C174046sK event) {
        Context context;
        Activity LIZJ;
        o.LJIIIZ(event, "event");
        if (event.LJLIL != 8) {
            return;
        }
        String aid = event.LJLJI.getAid();
        boolean z = false;
        if (aid == null || aid.length() == 0) {
            return;
        }
        if (!C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(this), event.LJLJI.getAid()) || (context = getContext()) == null || (LIZJ = KR3.LIZJ(context)) == null) {
            return;
        }
        int identityHashCode = System.identityHashCode(LIZJ);
        Integer num = event.LJLJJI;
        if (num == null || identityHashCode != num.intValue()) {
            return;
        }
        if (event.LJLJI.getCommentSetting() != 3) {
            z = true;
            if (!C215608dA.LIZ().getBoolean("danmaku_allow_show", true)) {
                return;
            }
        }
        List LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), DanmakuProtocol.class);
        if (LJIJ == null) {
            return;
        }
        Iterator it = ((ArrayList) LJIJ).iterator();
        while (it.hasNext()) {
            DanmakuProtocol danmakuProtocol = (DanmakuProtocol) it.next();
            if (danmakuProtocol != null) {
                danmakuProtocol.LLIIJI(z);
            }
        }
    }

    @QD3
    public final void onDanmakuEntranceToggle(C72R event) {
        o.LJIIIZ(event, "event");
        List<DanmakuProtocol> LJIJ = C62814Ol0.LJIJ(C55096Ljo.LJIIZILJ(this), DanmakuProtocol.class);
        if (LJIJ != null) {
            for (DanmakuProtocol danmakuProtocol : LJIJ) {
                if (danmakuProtocol != null) {
                    danmakuProtocol.LLIIJI(event.LJLIL);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        this.LLI = view.findViewById(R.id.c3_);
        View findViewById = view.findViewById(R.id.c39);
        this.LLIFFJFJJ = findViewById;
        if (findViewById != null) {
            C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, 246), findViewById);
        }
        C8YN.LJII(this, q4(), new TBT() { // from class: X.8dK
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C215798dT) obj).LJLJI;
            }
        }, null, C8O2.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8dF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJI;
            }
        }, null, C215478cx.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8dG
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJLJ;
            }
        }, null, C214918c3.LJLIL, 6);
        C8YN.LJII(this, (AssemViewModel) this.LLFZ.getValue(), new TBT() { // from class: X.8dE
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C82B) obj).LJLJJI;
            }
        }, null, C215548d4.LJLIL, 6);
    }

    public final void r4(boolean z) {
        Aweme aweme;
        VideoItemParams gv0;
        Aweme aweme2;
        C62623Ohv c62623Ohv = C62623Ohv.LIZIZ;
        VideoItemParams gv02 = q4().gv0();
        if (gv02 != null) {
            aweme = gv02.getAweme();
        } else {
            aweme = null;
        }
        if (!c62623Ohv.LJFF(aweme)) {
            return;
        }
        if (z || !C215608dA.LIZIZ || ((gv0 = q4().gv0()) != null && (aweme2 = gv0.getAweme()) != null && aweme2.isHasDanmaku())) {
            if (c62623Ohv.LJIIJJI() && !z && ((VideoItemParams) C51029K0z.LJIILLIIL(this)).currentPosition <= 0 && o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(this)).mEventType, "homepage_hot")) {
                new SafeHandler(C212428Vi.LIZLLL(this)).postDelayed(new ARunnableS39S0100000_3(this, 21), 5000L);
                return;
            }
            DanmakuViewModel q4 = q4();
            if (q4.LJLLJ) {
                return;
            }
            q4.setState(C215598d9.LJLIL);
            q4.LJLLJ = true;
        }
    }
}
