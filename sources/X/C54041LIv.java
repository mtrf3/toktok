package X;

import Y.ARunnableS28S0200000_9;
import Y.IDCListenerS246S0100000_9;
import android.content.Context;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.delegate.NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.LIv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54041LIv extends C54117LLt {
    public static final /* synthetic */ int LJLJJLL = 0;
    public LLQ LJLJI;
    public View LJLJJL;
    public final /* synthetic */ C54044LIy LJLILLLLZI = new C54044LIy();
    public final String LJLJJI = "Nearby";

    public C54041LIv() {
        C54040LIu.LIZJ = LJ5.LJFF();
        if (C53095Ksd.LIZ()) {
            SettingsManager.LIZLLL().LJIIIZ(new LJ2(this));
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRegionChange(RoamingLocationInfo event) {
        String defaultTabName;
        int LIZ;
        LocationRegion LIZJ;
        Integer locateMethod;
        o.LJIIIZ(event, "event");
        if (!NearbyTabConfig.LIZLLL()) {
            LLQ llq = this.LJLJI;
            if (llq != null) {
                String str = this.LJLJJI;
                String defaultTabName2 = C54040LIu.LIZ;
                o.LJIIIIZZ(defaultTabName2, "defaultTabName");
                llq.LJJIZ(str, defaultTabName2);
            }
            View view = this.LJLJJL;
            if (view != null) {
                this.LJLILLLLZI.LIZIZ(view);
                return;
            } else {
                o.LJIJI("tabView");
                throw null;
            }
        }
        C54040LIu.LIZIZ = event;
        LLQ llq2 = this.LJLJI;
        if (llq2 != null) {
            String str2 = this.LJLJJI;
            C54045LIz.LIZ.getClass();
            if (!C54045LIz.LIZIZ() || ((LIZ = C00F.LIZ(31744, 0, "nearby_bottom_tab_show_city_name", false)) != 1 && (LIZ != 2 || (LIZJ = NearbyTabConfig.LIZJ()) == null || (locateMethod = LIZJ.getLocateMethod()) == null || locateMethod.intValue() != 1))) {
                defaultTabName = C54040LIu.LIZ;
                o.LJIIIIZZ(defaultTabName, "defaultTabName");
            } else {
                RoamingLocationInfo roamingLocationInfo = C54040LIu.LIZIZ;
                if (roamingLocationInfo != null && (defaultTabName = roamingLocationInfo.getManualRegionName()) != null) {
                    if (defaultTabName.length() > C53209KuT.LIZ() || defaultTabName.length() <= 0) {
                        defaultTabName = C54040LIu.LIZ;
                        o.LJIIIIZZ(defaultTabName, "{\n                    de…TabName\n                }");
                    }
                } else {
                    defaultTabName = C54040LIu.LIZ;
                    o.LJIIIIZZ(defaultTabName, "defaultTabName");
                }
            }
            llq2.LJJIZ(str2, defaultTabName);
        }
        View view2 = this.LJLJJL;
        if (view2 != null) {
            this.LJLILLLLZI.LIZIZ(view2);
        } else {
            o.LJIJI("tabView");
            throw null;
        }
    }

    @Override // X.C54117LLt
    public final View LIZ(LCZ lcz, LH4 iconData) {
        LLQ llq;
        ActivityC45651qj LJJIFFI;
        o.LJIIIZ(iconData, "iconData");
        View LIZ = super.LIZ(lcz, iconData);
        Context context = LIZ.getContext();
        this.LJLJJL = LIZ;
        if (context != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null) {
            llq = LNZ.LIZIZ.getHomeTabViewModel(LJJIFFI).Xm0();
        } else {
            llq = null;
        }
        this.LJLJI = llq;
        LIZ.addOnAttachStateChangeListener(new IDCListenerS246S0100000_9(this, 6));
        if (NearbyTabConfig.LIZLLL()) {
            C54045LIz.LIZ.getClass();
            if (!C54045LIz.LIZ()) {
                C54040LIu.LIZIZ = C54040LIu.LIZJ;
                LIZ.post(new ARunnableS28S0200000_9(this, LIZ, 62));
            }
        }
        C54044LIy c54044LIy = this.LJLILLLLZI;
        c54044LIy.getClass();
        LIZ.post(new NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1(LIZ, c54044LIy));
        this.LJLILLLLZI.LIZIZ(LIZ);
        this.LJLILLLLZI.LIZ(LIZ);
        return LIZ;
    }
}
