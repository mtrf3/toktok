package X;

import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAboutMeMergeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BPG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ActivityC45651qj fragmentActivity, boolean z, boolean z2) {
        String urlUpgradePopup;
        String str;
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        if (o.LJ(((IBrowserService) CN1.LIZ(IBrowserService.class)).Wn(fragmentActivity, "aboutme-upgrade-show"), "1")) {
            if (z2) {
                urlUpgradePopup = LiveAboutMeMergeSetting.urlPopupLiveSheet();
            } else {
                urlUpgradePopup = LiveAboutMeMergeSetting.urlPopup();
            }
        } else if (z2) {
            urlUpgradePopup = LiveAboutMeMergeSetting.urlUpgradePopupLiveSheet();
        } else {
            urlUpgradePopup = LiveAboutMeMergeSetting.urlUpgradePopup();
        }
        C32364Cn2 c32364Cn2 = new C32364Cn2(urlUpgradePopup);
        if (z) {
            str = "live_take_page";
        } else {
            str = "live_take_detail";
        }
        c32364Cn2.LIZJ("enter_from", str);
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(fragmentActivity, UriProtector.parse(c32364Cn2.LIZLLL()));
    }
}
