package com.ss.android.ugc.aweme.placediscovery.ui;

import X.ActivityC45651qj;
import X.C193607im;
import X.C214298b3;
import X.C2K0;
import X.C34K;
import X.C45804HyK;
import X.C47704Ins;
import X.C48840JEu;
import X.C51733KSb;
import X.C53083KsR;
import X.C54485LZx;
import X.C54570LbK;
import X.C54586Lba;
import X.C54587Lbb;
import X.C54590Lbe;
import X.C54591Lbf;
import X.C54592Lbg;
import X.C55096Ljo;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C780334l;
import X.C78613UtF;
import X.C78926UyI;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.FFL;
import X.InterfaceC55102Lju;
import X.LJ6;
import X.LTU;
import X.LXZ;
import X.LZV;
import X.QD3;
import X.TBT;
import X.XKX;
import Y.ARunnableS15S0110000_9;
import Y.IDLListenerS196S0100000_9;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.api.NearbyBaseVAbility;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.ss.android.ugc.aweme.vm.NearbySkylightViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class NearbyTopDrawerAssem extends UISlotAssem implements INearbyCategoryTabAbility, InterfaceC55102Lju {
    public final /* synthetic */ C54587Lbb LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final C214298b3 LJLLJ;
    public final C214298b3 LJLLL;
    public final C214298b3 LJLLLL;
    public final C55749LuL LJLLLLLL;

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void ZL() {
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void ia() {
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(this, 484);
        C54587Lbb c54587Lbb = this.LJLJLLL;
        if (!c54587Lbb.LIZJ) {
            aqS159S0100000_9.invoke();
            return;
        }
        c54587Lbb.LIZJ = false;
        NearbySkylightViewModel nearbySkylightViewModel = c54587Lbb.LIZIZ;
        if (nearbySkylightViewModel != null) {
            nearbySkylightViewModel.LJLIL = false;
            C54485LZx.LIZ(false);
            c54587Lbb.LIZIZ(c54587Lbb.LIZ(), 0.0f, true, false, aqS159S0100000_9);
            return;
        }
        o.LJIJI("vm");
        throw null;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1501226910) {
            return null;
        }
        return this;
    }

    public NearbyTopDrawerAssem() {
        new LinkedHashMap();
        this.LJLJLLL = new C54587Lbb();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyCategoryTabViewModel.class);
        this.LJLLJ = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 485), C54590Lbe.INSTANCE, null);
        C65776Prg LIZ2 = C65352Pkq.LIZ(NearbySkylightViewModel.class);
        this.LJLLL = C78926UyI.LJ(this, LIZ2, c9be, new AqS159S0100000_9(LIZ2, 486), C54591Lbf.INSTANCE, null);
        C65776Prg LIZ3 = C65352Pkq.LIZ(NearbyFeedListViewModel.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ3, c9be, new AqS159S0100000_9(LIZ3, 487), C54592Lbg.INSTANCE, null);
        this.LJLLLLLL = new C55749LuL(C47704Ins.LIZJ(this, LZV.class, "NearbyFeedContentHierarchyData"), checkSupervisorPrepared());
    }

    public final NearbyCategoryTabViewModel H3() {
        return (NearbyCategoryTabViewModel) this.LJLLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void Le0() {
        float f;
        if (this.LJLJLLL.LIZJ) {
            if (C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICategoryListAbility.class, null) != null) {
                C54587Lbb c54587Lbb = this.LJLJLLL;
                if (c54587Lbb.LIZJ) {
                    C54570LbK c54570LbK = c54587Lbb.LJ;
                    if (c54570LbK != null) {
                        f = c54570LbK.getTranslationY();
                    } else {
                        f = 0.0f;
                    }
                    c54587Lbb.LIZIZ(f, c54587Lbb.LIZ(), true, true, null);
                    return;
                }
                return;
            }
            ia();
        }
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final boolean Q5() {
        return this.LJLJLLL.LIZJ;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        LXZ.LIZ.getClass();
        if (LXZ.LIZIZ()) {
            return R.layout.bwp;
        }
        return R.layout.bw_;
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void vG() {
        if (this.LJLJLLL.LIZJ) {
            ia();
        } else {
            Je("click_discover_button", true);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void En0(RoamingLocationInfo roamingLocationInfo) {
        NearbyCategoryTabViewModel H3 = H3();
        LXZ.LIZ.getClass();
        H3.gv0(LXZ.LIZ(), roamingLocationInfo);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRegionChange(RoamingLocationInfo event) {
        o.LJIIIZ(event, "event");
        if (event.getSource() != 5) {
            return;
        }
        NearbyCategoryTabViewModel H3 = H3();
        LXZ.LIZ.getClass();
        H3.gv0(LXZ.LIZ(), event);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSimpleMode(C193607im event) {
        o.LJIIIZ(event, "event");
        LXZ.LIZ.getClass();
        if (!LXZ.LIZIZ() && event.LJLIL) {
            ia();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        View view3;
        View view4;
        ActivityC45651qj LJJIFFI;
        Object parent;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        NearbySkylightViewModel nearbySkylightViewModel = (NearbySkylightViewModel) this.LJLLL.getValue();
        C54587Lbb c54587Lbb = this.LJLJLLL;
        c54587Lbb.getClass();
        c54587Lbb.LIZIZ = nearbySkylightViewModel;
        NearbyFeedFragmentPanel panel = ((LZV) this.LJLLLLLL.getValue()).LJLIL;
        o.LJIIIZ(panel, "panel");
        C54587Lbb c54587Lbb2 = this.LJLJLLL;
        c54587Lbb2.getClass();
        C54570LbK c54570LbK = panel.LLILZ;
        c54587Lbb2.LJ = c54570LbK;
        if (c54570LbK != null) {
            NearbySkylightViewModel nearbySkylightViewModel2 = c54587Lbb2.LIZIZ;
            if (nearbySkylightViewModel2 != null) {
                c54570LbK.setSkylightViewModel(nearbySkylightViewModel2);
            } else {
                o.LJIJI("vm");
                throw null;
            }
        }
        C54570LbK c54570LbK2 = c54587Lbb2.LJ;
        if (c54570LbK2 != null) {
            c54570LbK2.setCallBack(new AqS159S0100000_9(panel, 753));
        }
        C54570LbK c54570LbK3 = panel.LLILZ;
        if (c54570LbK3 != null) {
            view2 = c54570LbK3.findViewById(R.id.g99);
        } else {
            view2 = null;
        }
        c54587Lbb2.LJI = view2;
        C54570LbK c54570LbK4 = panel.LLILZ;
        if (c54570LbK4 != null) {
            view3 = c54570LbK4.findViewById(R.id.lgd);
        } else {
            view3 = null;
        }
        c54587Lbb2.LIZLLL = view3;
        C54570LbK c54570LbK5 = panel.LLILZ;
        if (c54570LbK5 != null) {
            view4 = c54570LbK5.findViewById(R.id.arj);
        } else {
            view4 = null;
        }
        c54587Lbb2.LJIIIIZZ = view4;
        View view5 = c54587Lbb2.LIZLLL;
        if (view5 != null && (viewTreeObserver2 = view5.getViewTreeObserver()) != null) {
            viewTreeObserver2.addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(c54587Lbb2, 3));
        }
        View view6 = c54587Lbb2.LJIIIIZZ;
        if (view6 != null && (viewTreeObserver = view6.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new IDLListenerS196S0100000_9(c54587Lbb2, 4));
        }
        C54570LbK c54570LbK6 = panel.LLILZ;
        if (c54570LbK6 != null && (parent = c54570LbK6.getParent()) != null) {
            c54587Lbb2.LJII = ((View) parent).findViewById(R.id.ark);
        }
        View containerView = getContainerView();
        o.LJIIIZ(containerView, "containerView");
        C54587Lbb c54587Lbb3 = this.LJLJLLL;
        c54587Lbb3.getClass();
        c54587Lbb3.LIZ = containerView;
        getContainerView().setVisibility(4);
        LXZ.LIZ.getClass();
        if (LXZ.LIZIZ()) {
            C8VV.LIZJ(this, new AqS175S0100000_9(this, 170));
        } else {
            C8VV.LIZJ(this, new AqS175S0100000_9(this, 171));
        }
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLLLL.getValue(), new TBT() { // from class: X.Lbc
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getRefreshState();
            }
        }, null, null, null, new AqS175S0100000_9(this, 172), 14, null);
        C8YN.LJII(this, H3(), new TBT() { // from class: X.Lbi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54663Lcp) obj).LJLIL;
            }
        }, null, new AqS191S0100000_9(this, 43), 6);
        NearbyCategoryTabViewModel H3 = H3();
        H3.getClass();
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C48840JEu(H3, null), 2);
        Context context = view.getContext();
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            TokenCert with = TokenCert.Companion.with("bpea-nearby_tab_fetch_location_when_entering_v2");
            with.auth("nany");
            Mn0(with, LJJIFFI);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void Je(String str, boolean z) {
        INearbyLocationPermissionAbility iNearbyLocationPermissionAbility;
        NearbyBaseVAbility nearbyBaseVAbility;
        boolean z2;
        String str2 = str;
        if (LTU.LIZ && !o.LJ(LTU.LIZIZ, Boolean.TRUE)) {
            return;
        }
        C34K c34k = new C34K();
        withState(H3(), new AqS175S0100000_9(c34k, 173));
        if (!c34k.element) {
            INearbyLocationPermissionAbility iNearbyLocationPermissionAbility2 = (INearbyLocationPermissionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INearbyLocationPermissionAbility.class, null);
            if (iNearbyLocationPermissionAbility2 != null) {
                z2 = iNearbyLocationPermissionAbility2.gP();
            } else {
                z2 = false;
            }
            c34k.element = z2;
        }
        NearbyCategoryTabViewModel H3 = H3();
        if (str2 == null) {
            str2 = "enter_tab";
        }
        H3.LJLIL = str2;
        if (c34k.element) {
            if (!z) {
                C53083KsR.LIZ.getClass();
                FFL.LJIIIZ().getClass();
                int LJIIJ = FFL.LJIIJ(31744, 7, "nearby_place_discover_banner_show_interval", false);
                long j = LJ6.LIZ.getLong(LJ6.LIZJ("nearby_top_drawer_show_time"), 0L);
                if (LJIIJ > 0 && j > 0 && System.currentTimeMillis() - j <= LJIIJ * 24 * 60 * 60 * 1000 && ((iNearbyLocationPermissionAbility = (INearbyLocationPermissionAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), INearbyLocationPermissionAbility.class, null)) == null || !iNearbyLocationPermissionAbility.gP())) {
                    if (this.LJLJLLL.LIZJ || (nearbyBaseVAbility = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), CategoryEntranceAbility.class, null)) == null) {
                        return;
                    }
                    nearbyBaseVAbility.v20();
                    return;
                }
            }
            if (o.LJ(LTU.LIZIZ, Boolean.TRUE) && !z) {
                NearbyBaseVAbility nearbyBaseVAbility2 = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), CategoryEntranceAbility.class, null);
                if (nearbyBaseVAbility2 != null) {
                    nearbyBaseVAbility2.v20();
                    return;
                }
                return;
            }
            C54587Lbb c54587Lbb = this.LJLJLLL;
            if (!c54587Lbb.LIZJ) {
                View view = c54587Lbb.LIZ;
                if (view != null) {
                    view.setVisibility(0);
                    c54587Lbb.LIZJ = true;
                    NearbySkylightViewModel nearbySkylightViewModel = c54587Lbb.LIZIZ;
                    if (nearbySkylightViewModel != null) {
                        nearbySkylightViewModel.LJLIL = true;
                        C54485LZx.LIZ(true);
                        if (c54587Lbb.LJIIIZ < 0) {
                            View view2 = c54587Lbb.LIZLLL;
                            if (view2 != null) {
                                view2.post(new ARunnableS15S0110000_9(c54587Lbb, 6));
                            }
                        } else {
                            c54587Lbb.LIZIZ(0.0f, c54587Lbb.LIZ(), true, true, null);
                        }
                    } else {
                        o.LJIJI("vm");
                        throw null;
                    }
                } else {
                    o.LJIJI("containerView");
                    throw null;
                }
            }
            NearbyBaseVAbility nearbyBaseVAbility3 = (NearbyBaseVAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), CategoryEntranceAbility.class, null);
            if (nearbyBaseVAbility3 != null) {
                nearbyBaseVAbility3.ia();
            }
            ICategoryListAbility iCategoryListAbility = (ICategoryListAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ICategoryListAbility.class, null);
            if (iCategoryListAbility != null) {
                iCategoryListAbility.mc0(null, null);
            }
            if (z) {
                return;
            }
            LJ6.LIZ.storeLong(LJ6.LIZJ("nearby_top_drawer_show_time"), System.currentTimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility
    public final void Mn0(TokenCert bpeaCert, ActivityC45651qj activity) {
        o.LJIIIZ(bpeaCert, "bpeaCert");
        o.LJIIIZ(activity, "activity");
        C51733KSb.LIZ("poi", "nearby", bpeaCert, null, new C54586Lba(this, activity), 32);
    }
}
