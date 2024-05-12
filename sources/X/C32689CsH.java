package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.mt.protector.impl.UriProtector;
import java.net.URLEncoder;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CsH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32689CsH {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Gift gift, String str, GiftGuideMessage giftGuideMessage) {
        String str2;
        String str3;
        List<String> urls;
        if (!(context instanceof Activity)) {
            return;
        }
        String str4 = null;
        if (giftGuideMessage != null) {
            str2 = giftGuideMessage.triggerName;
        } else {
            str2 = null;
        }
        GuideInfoResponse.UserStats userStats = C32696CsO.LJ;
        if (giftGuideMessage == null || (str3 = giftGuideMessage.schemaUrl) == null) {
            str3 = C32696CsO.LIZLLL;
        }
        try {
            Uri.Builder buildUpon = UriProtector.parse(str3).buildUpon();
            if (gift != null) {
                ImageModel imageModel = gift.image;
                if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                    str4 = (String) ORZ.LJLLJ(urls);
                }
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                buildUpon.appendQueryParameter("gift_icon_url", str4);
                String str6 = gift.name;
                if (str6 != null) {
                    str5 = str6;
                }
                buildUpon.appendQueryParameter("gift_name", URLEncoder.encode(str5, "UTF-8"));
                buildUpon.appendQueryParameter("gift_price", String.valueOf(gift.diamondCount));
                buildUpon.appendQueryParameter("gift_id", String.valueOf(gift.id));
            }
            buildUpon.appendQueryParameter("education_entrance", str);
            if (userStats != null) {
                buildUpon.appendQueryParameter("gift_panel_show_cnt", String.valueOf(userStats.giftPanelShowCnt));
                buildUpon.appendQueryParameter("convenient_gift_click_cnt", String.valueOf(userStats.shortcutGiftClickCnt));
                buildUpon.appendQueryParameter("gift_guide_popup_show_cnt", String.valueOf(userStats.giftGuidePopupShowCnt));
                buildUpon.appendQueryParameter("like_cnt", String.valueOf(userStats.likeCnt));
                buildUpon.appendQueryParameter("watch_duration", String.valueOf(userStats.watchDuration));
            }
            if (str2 != null) {
                buildUpon.appendQueryParameter("trigger_rule", str2);
            }
            String uri = buildUpon.build().toString();
            o.LJIIIIZZ(uri, "builder.build().toString()");
            str3 = uri;
        } catch (Exception e) {
            C0NB.LIZIZ("LiveEducationHelper", e.toString());
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("doOpenSchema:\n");
        LIZ2.append(str3);
        C0NB.LIZIZ("LiveEducationHelper", X1D.LIZIZ(LIZ2));
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, str3);
    }
}
