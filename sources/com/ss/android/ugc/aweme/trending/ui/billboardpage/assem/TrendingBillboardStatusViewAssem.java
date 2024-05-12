package com.ss.android.ugc.aweme.trending.ui.billboardpage.assem;

import X.ActivityC45651qj;
import X.C212428Vi;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73305Spp;
import X.C78926UyI;
import X.C7PL;
import X.C7SW;
import X.C9BE;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem;
import com.ss.android.ugc.aweme.prefab.NetworkHelper;
import com.ss.android.ugc.aweme.trending.ui.billboardpage.viewmodel.TrendingBillboardViewModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TrendingBillboardStatusViewAssem extends DetailPageStatusViewAssem {
    public NetworkHelper LJLLL;
    public final C214298b3 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    public TrendingBillboardStatusViewAssem() {
        new LinkedHashMap();
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TrendingBillboardViewModel.class);
        this.LJLLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS153S0100000_3(LIZ, 1129), C7PL.INSTANCE, null);
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1126));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshLoadingSubscriber
    public final void J80() {
        String str = (String) this.LJLLLLLL.getValue();
        if (str != null) {
            C7SW.LIZ("detail_prepare_network", str);
            C7SW.LIZLLL("detail_page_visible", str);
        }
        NetworkHelper networkHelper = this.LJLLL;
        if (networkHelper != null) {
            networkHelper.LIZIZ(this.LJLLI);
        }
        NetworkHelper networkHelper2 = this.LJLLL;
        if (networkHelper2 != null) {
            networkHelper2.LIZLLL(this.LJLLI);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshSuccessSubscriber
    public final void pN() {
        if (this.LJLLJ) {
            this.LJLLJ = false;
            String str = (String) this.LJLLLLLL.getValue();
            if (str != null) {
                C7SW.LIZ("detail_page_visible", str);
            }
        }
        NetworkHelper networkHelper = this.LJLLL;
        if (networkHelper != null) {
            networkHelper.LIZJ(this.LJLLI);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Object obj;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C73305Spp c73305Spp = this.LJLLI;
        LifecycleOwner lifecycleOwner = null;
        if (c73305Spp != null) {
            obj = c73305Spp.getParent();
        } else {
            obj = null;
        }
        View view2 = (View) obj;
        if (view2 != null) {
            C26338AVi.LJI(view2, 0, 0, 0, 0, false, 16);
        }
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1127);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(this, 1128);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        String str = (String) this.LJLJLLL.getValue();
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            lifecycleOwner = LIZLLL.getViewLifecycleOwner();
        }
        this.LJLLL = new NetworkHelper(aqS153S0100000_3, aqS153S0100000_32, null, null, LIZ, str, 0, lifecycleOwner, UserLevelGeckoUpdateSetting.DEFAULT);
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.FullPageStatusViewAssem, com.ss.android.ugc.aweme.prefab.ability.RefreshErrorSubscriber
    public final void s6(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        if (this.LJLLJ) {
            this.LJLLJ = false;
            String str = (String) this.LJLLLLLL.getValue();
            if (str != null) {
                C7SW.LIZJ("detail_page_visible", str);
            }
        }
        NetworkHelper networkHelper = this.LJLLL;
        if (networkHelper != null) {
            networkHelper.LIZ(throwable, this.LJLLI);
        }
    }
}
