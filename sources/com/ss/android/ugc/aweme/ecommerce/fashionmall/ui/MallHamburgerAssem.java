package com.ss.android.ugc.aweme.ecommerce.fashionmall.ui;

import X.ActivityC45651qj;
import X.C113554cx;
import X.C16880lQ;
import X.C212428Vi;
import X.C214298b3;
import X.C36746EbW;
import X.C47704Ins;
import X.C51029K0z;
import X.C51762KTe;
import X.C55749LuL;
import X.C55961Lxl;
import X.C55962Lxm;
import X.C55966Lxq;
import X.C55977Ly1;
import X.C56020Lyi;
import X.C56045Lz7;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BE;
import X.E2C;
import X.InterfaceC88472Yns;
import X.OSZ;
import X.QD3;
import X.TBT;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MallHamburgerAssem extends UISlotAssem {
    public final C214298b3 LJLJLLL;
    public final C55749LuL LJLL;
    public View LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public TuxSheet LJLLL;
    public volatile boolean LJLLLL;
    public long LJLLLLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLZ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ao8;
    }

    public MallHamburgerAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 107), C55966Lxq.INSTANCE, null);
        this.LJLL = new C55749LuL(C47704Ins.LIZJ(this, C56020Lyi.class, null), checkSupervisorPrepared());
        this.LJLLILLLL = -1L;
        this.LJLLLLLL = -1L;
    }

    public final void H3() {
        C36746EbW.LIZ(3, "UpdateToolPanel setHamburgerEventShow");
        if (((TuxAlertBadgeLayout) _$_findCachedViewById(R.id.e29)).LJLJL) {
            Map LJJL = C113554cx.LJJL(new OSZ("button_name", "more"), new OSZ("notice_type", "red_dot"), new OSZ("notice_number", ""));
            if (!this.LJLLLL) {
                this.LJLLLL = true;
                C56045Lz7.LIZ.getClass();
                C56045Lz7.LJ(LJJL);
                return;
            }
            return;
        }
        Map LIZJ = E2C.LIZJ("button_name", "more");
        if (this.LJLLLL) {
            return;
        }
        this.LJLLLL = true;
        C56045Lz7.LIZ.getClass();
        C56045Lz7.LJ(LIZJ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C36746EbW.LIZ(3, "onResume");
        C51762KTe c51762KTe = FashionMallFragment.LJZ;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        c51762KTe.getClass();
        if (C51762KTe.LIZ(LIZ) && this.LJLLJ > 0) {
            this.LJLLILLLL = SystemClock.elapsedRealtime();
        }
    }

    @Override // X.C8W0
    public final void onStop() {
        super.onStop();
        C51762KTe c51762KTe = FashionMallFragment.LJZ;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        c51762KTe.getClass();
        if (C51762KTe.LIZ(LIZ) && this.LJLLILLLL > 0) {
            this.LJLLJ = (SystemClock.elapsedRealtime() - this.LJLLILLLL) + this.LJLLJ;
            this.LJLLILLLL = -1L;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void dismissToolPanel(C55977Ly1 event) {
        o.LJIIIZ(event, "event");
        TuxSheet tuxSheet = this.LJLLL;
        if (tuxSheet != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(3, "onViewCreated");
        EventBus LIZJ = EventBus.LIZJ();
        if (!LIZJ.LJI(this)) {
            LIZJ.LJIILJJIL(this);
        }
        ((TuxAlertBadgeLayout) _$_findCachedViewById(R.id.e29)).LIZIZ();
        I3(C51029K0z.LJJIIZI(new OSZ("button_name", "more")), new C55962Lxm(C56045Lz7.LIZ));
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Lxs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLJJLL;
            }
        }, null, null, null, new AqS175S0100000_9(this, 511), 14, null);
    }

    public final void I3(Map map, InterfaceC88472Yns interfaceC88472Yns) {
        View hamburger = _$_findCachedViewById(R.id.e28);
        o.LJIIIIZZ(hamburger, "hamburger");
        C16880lQ.LJIIJ(new C55961Lxl(map, this, interfaceC88472Yns), hamburger);
    }
}
