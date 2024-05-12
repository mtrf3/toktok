package com.ss.android.ugc.aweme.offlinemode.ui.popup;

import X.A2W;
import X.A2X;
import X.AQO;
import X.C2068389v;
import X.C212428Vi;
import X.C221108m2;
import X.C252329vI;
import X.C26218AQs;
import X.C26222AQw;
import X.C2K0;
import X.C42625Go9;
import X.C48203Ivv;
import X.C56842Ky;
import X.C62822Ol8;
import X.C78540Us4;
import X.C9SY;
import X.InterfaceC55102Lju;
import X.QD3;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import com.ss.android.ugc.feed.platform.panel.BasePanelComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS59S1200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OfflineModeSwitchComponent extends BasePanelComponent implements IOfflineModeSwitchAbility, InterfaceC55102Lju {
    public static final C26222AQw LJLJJLL = new C26222AQw("OfflineModeSwitchComponent");
    public static final long LJLJL = System.currentTimeMillis();
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 510));
    public int LJLJJI;
    public boolean LJLJJL;

    @Override // com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility
    public final void As() {
        this.LJLJJI = 0;
    }

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -1360875123) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility
    public final void V70() {
        int i = this.LJLJJI + 1;
        this.LJLJJI = i;
        if (i == 3 && C252329vI.LIZIZ.getEffectiveConnectionType() <= 3) {
            x3(false);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onCreate() {
        super.onCreate();
        C42625Go9.LIZIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        this.LJLJJL = false;
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        this.LJLJJL = true;
        if (!this.LJLIL) {
            this.LJLIL = true;
            v3();
        }
    }

    public final void v3() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        int effectiveConnectionType = C252329vI.LIZIZ.getEffectiveConnectionType();
        if (!C48203Ivv.LJ(context) && effectiveConnectionType <= 1) {
            x3(true);
        } else {
            this.LJLILLLLZI = false;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
    }

    @Override // X.C8W0
    public final void onParentViewCreated() {
        super.onParentViewCreated();
    }

    @QD3
    public final void onNetworkChangeEvent(C56842Ky event) {
        o.LJIIIZ(event, "event");
        v3();
    }

    public final void x3(boolean z) {
        IRootAbility iRootAbility;
        A2X a2x;
        if (this.LJLILLLLZI || AQO.LIZIZ() <= 0 || LJLJL - AQO.LIZLLL().getLong("key_last_update_cache_time", 0L) > 172800000 || (iRootAbility = (IRootAbility) this.LJLJI.getValue()) == null || !iRootAbility.getUserVisibleHint() || !this.LJLJJL) {
            C26222AQw c26222AQw = LJLJJLL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[popupEnterOfflineModeBottomToast] failed, toastShowed ");
            LIZ.append(this.LJLILLLLZI);
            c26222AQw.LIZ(null, X1D.LIZIZ(LIZ));
            return;
        }
        this.LJLILLLLZI = true;
        if (z) {
            a2x = A2X.NO_NET_WATCH_OFFLINE_VIDEOS_TOAST;
        } else {
            a2x = A2X.WEAK_NET_WATCH_OFFLINE_VIDEOS_TOAST;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_cloud_arrow_down_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        String LJFF = C78540Us4.LJFF(getPanelContext());
        if (LJFF == null) {
            LJFF = "";
        }
        C9SY.LIZ(C212428Vi.LIZ(this), C212428Vi.LIZLLL(this), R.string.j8k, c2068389v, new AqS59S1200000_4(this, LJFF, a2x, 0));
        C26218AQs.LIZ("show_offline_mode_toast", LJFF, null, null, null, null, null, null, null, null, null, null, null, null, null, a2x.getMobName(), null, null, null, null, null, null, null, 8355836);
        LJLJJLL.LJIIJ(A2W.LJLIL);
    }
}
