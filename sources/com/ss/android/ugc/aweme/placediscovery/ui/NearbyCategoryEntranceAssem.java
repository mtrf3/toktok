package com.ss.android.ugc.aweme.placediscovery.ui;

import X.ActivityC45651qj;
import X.AnonymousClass391;
import X.C025908h;
import X.C110614Vt;
import X.C16880lQ;
import X.C193607im;
import X.C214298b3;
import X.C2K0;
import X.C45804HyK;
import X.C53209KuT;
import X.C54411LXb;
import X.C55096Ljo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C86V;
import X.C9BE;
import X.InterfaceC55102Lju;
import X.LJ5;
import X.LTU;
import X.LXZ;
import X.QD3;
import X.ViewOnClickListenerC54410LXa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.placediscovery.manager.NearbyCategoryTabViewModel;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class NearbyCategoryEntranceAssem extends UISlotAssem implements CategoryEntranceAbility, InterfaceC55102Lju {
    public final C214298b3 LJLJLLL;
    public TuxTextView LJLL;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1351108355) {
            return null;
        }
        return this;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.bwm;
    }

    public NearbyCategoryEntranceAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyCategoryTabViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 480), C54411LXb.INSTANCE, null);
    }

    @Override // com.ss.android.ugc.aweme.api.NearbyBaseVAbility
    public final void v20() {
        if (LTU.LIZ && !o.LJ(LTU.LIZIZ, Boolean.TRUE)) {
            return;
        }
        withState((AssemViewModel) this.LJLJLLL.getValue(), new AqS175S0100000_9(this, 168));
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.CategoryEntranceAbility
    public final boolean fn() {
        if (getContainerView().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.api.NearbyBaseVAbility
    public final void ia() {
        getContainerView().setVisibility(8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
        EventBus.LIZJ().LJIILJJIL(this);
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

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRegionChange(RoamingLocationInfo event) {
        int i;
        o.LJIIIZ(event, "event");
        String manualRegionName = event.getManualRegionName();
        if (manualRegionName != null) {
            i = manualRegionName.length();
        } else {
            i = 0;
        }
        if (i > C53209KuT.LIZ()) {
            TuxTextView tuxTextView = this.LJLL;
            if (tuxTextView != null) {
                String LJFF = C86V.LJFF(R.string.p07);
                o.LJIIIIZZ(LJFF, "getString(R.string.poidiscovery_discover_)");
                Object[] objArr = new Object[1];
                String manualRegionName2 = event.getManualRegionName();
                if (manualRegionName2 == null) {
                    manualRegionName2 = "";
                }
                objArr[0] = manualRegionName2;
                C025908h.LJ(objArr, 1, LJFF, "format(format, *args)", tuxTextView);
                return;
            }
            o.LJIJI("tvDiscoveryRegionName");
            throw null;
        }
        TuxTextView tuxTextView2 = this.LJLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(C86V.LJFF(R.string.p08));
        } else {
            o.LJIJI("tvDiscoveryRegionName");
            throw null;
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSimpleMode(C193607im event) {
        o.LJIIIZ(event, "event");
        LXZ.LIZ.getClass();
        if (LXZ.LIZIZ() || o.LJ(event.LJLILLLLZI, Boolean.TRUE)) {
            return;
        }
        if (event.LJLIL) {
            ia();
        } else {
            v20();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        int i;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        View findViewById = view.findViewById(R.id.m5l);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.tv_discovery_region)");
        this.LJLL = (TuxTextView) findViewById;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
        c110614Vt.LJFF = Integer.valueOf(R.attr.dh);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d9);
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        view.setBackground(c110614Vt.LIZ(context));
        C16880lQ.LJIIJ(ViewOnClickListenerC54410LXa.LJLIL, view);
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            Context context2 = tuxTextView.getContext();
            o.LJIIIIZZ(context2, "tvDiscoveryRegionName.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI != null) {
                RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LJJIFFI);
                if (LIZIZ != null) {
                    str = LIZIZ.getManualRegionName();
                } else {
                    str = null;
                }
                if (str != null) {
                    i = str.length();
                } else {
                    i = 0;
                }
                if (i > C53209KuT.LIZ()) {
                    TuxTextView tuxTextView2 = this.LJLL;
                    if (tuxTextView2 != null) {
                        String LJFF = C86V.LJFF(R.string.p07);
                        o.LJIIIIZZ(LJFF, "getString(R.string.poidiscovery_discover_)");
                        Object[] objArr = new Object[1];
                        if (str == null) {
                            str = "";
                        }
                        objArr[0] = str;
                        C025908h.LJ(objArr, 1, LJFF, "format(format, *args)", tuxTextView2);
                        return;
                    }
                    o.LJIJI("tvDiscoveryRegionName");
                    throw null;
                }
                TuxTextView tuxTextView3 = this.LJLL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(C86V.LJFF(R.string.p08));
                    return;
                } else {
                    o.LJIJI("tvDiscoveryRegionName");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("tvDiscoveryRegionName");
        throw null;
    }
}
