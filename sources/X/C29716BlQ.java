package X;

import android.graphics.Color;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeUserFaqNative;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.BlQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29716BlQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(SubscriptionPrivilegeDetailFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
        if (mo49getActivity != null) {
            InterfaceC06390Mx LIZ2 = CN1.LIZ(IHybridContainerService.class);
            o.LJIIIIZZ(LIZ2, "getService(IHybridContainerService::class.java)");
            C29682Bks LIZJ = C29683Bkt.LIZJ(LiveSubscribeUserFaqNative.INSTANCE.getValue());
            LIZJ.LJIIIZ("bottom");
            C29682Bks.LJIJI(LIZJ, 8);
            LIZJ.LJIJJ("bottom");
            ((HashMap) LIZJ.LIZ).put("show_mask", "1");
            ((HashMap) LIZJ.LIZ).put("mask_bg_color", "00000080");
            LIZJ.LJIIJ((int) (C15380j0.LJIJ(C15380j0.LJIIJJI()) * 0.6f), BY3.DP);
            String uri = LIZJ.LIZLLL().toString();
            o.LJIIIIZZ(uri, "SparkPopupSchemaBuilder.…thoutLiveTag().toString()");
            ((IHybridContainerService) LIZ2).Vs0(mo49getActivity, uri, null);
        }
    }

    public static int LIZIZ(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
