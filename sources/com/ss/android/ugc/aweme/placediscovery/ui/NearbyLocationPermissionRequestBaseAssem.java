package com.ss.android.ugc.aweme.placediscovery.ui;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C40328FsC;
import X.C54558Lb8;
import X.C54559Lb9;
import X.C55096Ljo;
import X.C55230Lly;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C85296Xdk;
import X.C9BE;
import X.FMX;
import X.L8O;
import X.LJ1;
import X.LJ5;
import X.LJE;
import X.LSK;
import X.TBT;
import X.X1D;
import Y.ARunnableS45S0100000_9;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility;
import com.ss.android.ugc.aweme.vm.NearbyFeedListViewModel;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class NearbyLocationPermissionRequestBaseAssem extends UISlotAssem implements INearbyLocationPermissionAbility {
    public final C214298b3 LJLJLLL;
    public boolean LJLL;
    public LSK LJLLI;

    public NearbyLocationPermissionRequestBaseAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(NearbyFeedListViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS159S0100000_9(LIZ, 483), C54558Lb8.INSTANCE, null);
    }

    public final void H3() {
        ActivityC45651qj LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("showNearbyToast, toastEnable: ");
        LIZ2.append(NearbyTabConfig.LJII());
        L8O.LIZ(X1D.LIZIZ(LIZ2));
        if (NearbyTabConfig.LJII() && (LIZ = C212428Vi.LIZ(this)) != null) {
            C40328FsC.LIZLLL(LIZ, R.string.im3);
        }
    }

    public final void I3() {
        LJ1 LJII;
        INearbyContentAssemAbility iNearbyContentAssemAbility;
        String str;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (LJII = LJ5.LJII(LIZ)) != null && LJII.LJLJJLL && (iNearbyContentAssemAbility = (INearbyContentAssemAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), INearbyContentAssemAbility.class, null)) != null) {
            RoamingLocationInfo LIZIZ = LJ5.LIZIZ(LIZ);
            if (LIZIZ == null || (str = LIZIZ.getManualRegionName()) == null) {
                str = "";
            }
            iNearbyContentAssemAbility.Cd(str);
        }
        if (LJE.LIZIZ()) {
            getContainerView().postDelayed(new ARunnableS45S0100000_9(this, 88), 200L);
        }
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyLocationPermissionAbility
    public final boolean gP() {
        Integer num = NearbyTabConfig.LIZIZ().abMode;
        if (num == null || num.intValue() != 1 || !LJE.LIZIZ()) {
            return false;
        }
        C85296Xdk.LIZ.getClass();
        if (!C85296Xdk.LIZLLL("poi", "nearby")) {
            return false;
        }
        PermissionCache.LJLIL.getClass();
        if (PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return true;
    }

    public void ia() {
        INearbyCategoryTabAbility iNearbyCategoryTabAbility;
        getContainerView().setVisibility(8);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), INearbyCategoryTabAbility.class, null)) != null) {
            iNearbyCategoryTabAbility.Le0();
        }
    }

    @Override // com.ss.android.ugc.aweme.placediscovery.ui.INearbyLocationPermissionAbility
    public final boolean isShowing() {
        if (getContainerView().getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        PermissionCache.LJLIL.getClass();
        if (PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION")) {
            ia();
        }
    }

    public void v20() {
        INearbyCategoryTabAbility iNearbyCategoryTabAbility;
        INearbyCategoryTabAbility iNearbyCategoryTabAbility2;
        getContainerView().setVisibility(0);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null && (iNearbyCategoryTabAbility2 = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ, null), INearbyCategoryTabAbility.class, null)) != null) {
            iNearbyCategoryTabAbility2.Je(null, false);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LIZ2, null), INearbyCategoryTabAbility.class, null)) != null) {
            iNearbyCategoryTabAbility.ZL();
        }
        FMX.onEventV3("turn_on_location_banner_show");
        LJE.LJFF();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJLLL.getValue(), new TBT() { // from class: X.Lb7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C54665Lcr) obj).getRefreshState();
            }
        }, null, C54559Lb9.LJLIL, null, new AqS175S0100000_9(this, 169), 10, null);
    }
}
