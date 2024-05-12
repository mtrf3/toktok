package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Ccn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31729Ccn {
    public static final java.util.Set<String> LIZ = C77275UUl.LJ("GiftWidget", "LiveNewVideoGiftWidget", "LiveNewSpecialGiftWidget", "NormalGiftAnimWidget", "LiveNewGiftBottomWidget", "LiveNewGiftGuestInfoWidget", "LiveNewGiftPageIndicatorWidget", "LiveNewGiftPanelWidget", "LiveGiftBottomWidget", "LiveGiftPanelWidget", "LiveGiftGuestInfoWidget", "LiveFirstRechargeWidget", "LiveGiftTrayWidget", "SocialAnchorWidget", "SocialGuestWidget", "FrameSlotWidget", "FrameL2SlotWidget", "FrameL3SlotWidget", "LiveMaskLayerWidget", "OnlineAudienceRankWidget", "HourlyRankWidget", "RankEntranceWidget", "SurveyCardWidget", "LiveGiftTopWidget", "LiveGiftPanelWidgetV2", "LiveGiftBottomWidget");

    public static final ActivityC45651qj LIZ(Context context) {
        if (context instanceof ActivityC45651qj) {
            return (ActivityC45651qj) context;
        }
        if (context instanceof ContextWrapper) {
            return LIZ(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static final boolean LIZIZ(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 2) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(Context context) {
        if (context == null) {
            return false;
        }
        if (!o.LJ(context.getResources().getConfiguration().locale.getLanguage(), "ar") && C012403c.LIZ(context) != 1) {
            return false;
        }
        return true;
    }
}
