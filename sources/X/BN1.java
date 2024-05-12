package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchScrollFpsOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.ViewAutoPreloadOptSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveUseSurfaceViewExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BN1 {
    public static boolean LIZ;
    public static boolean LIZIZ;

    public static void LIZIZ() {
        if (LIZ) {
            return;
        }
        int intValue = ((Number) new OSZ(Integer.valueOf(R.layout.d4p), "ttlive_fragment_live_play").getFirst()).intValue();
        if (!C20760rg.LIZJ.containsKey(Integer.valueOf(intValue))) {
            C38995FSd.LIZLLL().submit(new RunnableC20770rh(2, intValue, 2));
        }
        LIZ = true;
    }

    public static void LIZ(Context context) {
        OSZ osz;
        OSZ osz2;
        if (ViewAutoPreloadOptSetting.INSTANCE.getEnable()) {
            LIZIZ();
        } else if (LiveUseSurfaceViewExperiment.INSTANCE.isEnable()) {
            OSZ osz3 = new OSZ(Integer.valueOf(R.layout.d4p), "ttlive_fragment_live_play");
            C20910rv.LJIILL(((Number) osz3.getFirst()).intValue(), 2, (String) osz3.getSecond(), EnumC20860rq.FOUNDATION, null, false, 96);
        }
        ((IInteractService) CN1.LIZ(IInteractService.class)).wN(context, true);
        if (C30922CBq.LIZIZ) {
            C0NB.LJIIIZ("DebugFullVideoButton", "WatchPreloadHelper. load R.layout.ttlive_fragment_portrait_interaction");
        }
        if (ToolBarButtonWithTextExperiment.hasText()) {
            osz = new OSZ(Integer.valueOf(R.layout.dlw), "ttlive_view_toolbar_audience_slot_icon_with_text");
        } else {
            Integer layoutId = EnumC30204BtI.AUDIENCE_SLOT.getLayoutId();
            o.LJI(layoutId);
            osz = new OSZ(layoutId, "ttlive_view_toolbar_audience_slot_icon");
        }
        C20910rv c20910rv = C20910rv.LIZ;
        C20910rv.LJIILIIL(c20910rv, ((Number) osz.getFirst()).intValue(), C20880rs.LIZ((String) osz.getSecond()), null, false, 24);
        if (ToolBarButtonWithTextExperiment.hasText()) {
            osz2 = new OSZ(Integer.valueOf(R.layout.dlt), "ttlive_view_toolbar_audience_interaction_with_text");
        } else {
            Integer layoutId2 = EnumC30204BtI.AUDIENCE_INTERACTION_FEATURES.getLayoutId();
            o.LJI(layoutId2);
            osz2 = new OSZ(layoutId2, "ttlive_view_toolbar_audience_interaction");
        }
        C20910rv.LJIILIIL(c20910rv, ((Number) osz2.getFirst()).intValue(), C20880rs.LIZ((String) osz2.getSecond()), null, false, 24);
        if (LiveWatchScrollFpsOptSetting.INSTANCE.enable("interaction")) {
            OSZ osz4 = new OSZ(Integer.valueOf(R.layout.d55), "ttlive_fragment_portrait_interaction_constraint ");
            C20910rv.LJIILL(((Number) osz4.getFirst()).intValue(), 2, (String) osz4.getSecond(), EnumC20860rq.FOUNDATION, null, false, 96);
        }
    }
}
