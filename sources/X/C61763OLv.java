package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.live.business.links.model.ActiveCard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.OLv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61763OLv implements InterfaceC31687Cc7 {
    public final /* synthetic */ C61764OLw LIZ;

    public C61763OLv(C61764OLw c61764OLw) {
        this.LIZ = c61764OLw;
    }

    @Override // X.InterfaceC31687Cc7
    public final void LIZ(View view, String str) {
        Long l;
        String str2;
        ActivityC45651qj context;
        Long l2;
        String str3;
        String valueOf;
        if (((ArrayList) this.LIZ.LJLLI).size() == 0) {
            return;
        }
        ActiveCard activeCard = (ActiveCard) ListProtector.get(this.LIZ.LJLLI, 0);
        A72 a72 = this.LIZ.LJLJJI;
        if (a72 != null && (context = a72.getContext()) != null) {
            C61764OLw c61764OLw = this.LIZ;
            if (activeCard.getCardType() == 2 && activeCard.getGameUrl() != null) {
                String gameUrl = activeCard.getGameUrl();
                if (gameUrl != null) {
                    SmartRouter.buildRoute(context, gameUrl).open();
                }
            } else {
                Activity LIZJ = KR3.LIZJ(context);
                if (LIZJ == null && (LIZJ = C84763XOl.LJIIIIZZ()) == null) {
                    return;
                }
                Uri.Builder appendQueryParameter = UriProtector.parse("sslocal://webcast_webview").buildUpon().appendQueryParameter("url", activeCard.getUrl()).appendQueryParameter("type", "popup").appendQueryParameter("title", activeCard.getTitle()).appendQueryParameter("height", String.valueOf((int) (C45804HyK.LJJJLIIL(LIZJ, Integer.valueOf(C60605NqT.LJIIJ(C60605NqT.LJI(LIZJ), LIZJ))) * 0.9d))).appendQueryParameter("show_title_bar", "true").appendQueryParameter("show_title_share", "true").appendQueryParameter("show_title_close", "true").appendQueryParameter("title_bar_share_add_report_action", "true");
                c61764OLw.getClass();
                String str4 = "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1";
                String LIZJ2 = C31461Li.LIZJ("live_links_report_schema", "https://www.tiktok.com/falcon/tiktok_ba_lynx_v2/live-report?hide_nav_bar=1&use_bdx=1&trans_status_bar=1", "getInstance().getStringV…eportSetting::class.java)");
                if (!TextUtils.isEmpty(LIZJ2)) {
                    str4 = LIZJ2;
                }
                Uri.Builder buildUpon = UriProtector.parse(str4).buildUpon();
                Room room = c61764OLw.LJLJI;
                if (room != null) {
                    l2 = Long.valueOf(room.getOwnerUserId());
                } else {
                    l2 = null;
                }
                Uri.Builder appendQueryParameter2 = buildUpon.appendQueryParameter("anchor_id", String.valueOf(l2));
                Room room2 = c61764OLw.LJLJI;
                if (room2 != null) {
                    str3 = C17280m4.LIZ(room2);
                } else {
                    str3 = null;
                }
                Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("room_id", str3);
                if (((ArrayList) c61764OLw.LJLLI).size() == 0) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(((ActiveCard) ListProtector.get(c61764OLw.LJLLI, 0)).getId());
                }
                String builder = appendQueryParameter3.appendQueryParameter("link_id", valueOf).appendQueryParameter("enter_from_merge", c61764OLw.LJLJLJ).appendQueryParameter("enter_method", c61764OLw.LJLJLLL).toString();
                o.LJIIIIZZ(builder, "uriBuilder.appendQueryPa…)\n            .toString()");
                String builder2 = UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", builder).appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("use_bdx", "1").appendQueryParameter("trans_status_bar", CardStruct.IStatusCode.DEFAULT).appendQueryParameter("hybrid_sdk_version", "bullet").appendQueryParameter("webview_clear_color", "1").appendQueryParameter("container_bg_color", "00000000").appendQueryParameter("keyboard_adjust", CardStruct.IStatusCode.DEFAULT).toString();
                o.LJIIIIZZ(builder2, "parse(\"aweme://webview_p…              .toString()");
                LiveOuterService.LJJJLL().LJJIJIL().LJJJIL(context, appendQueryParameter.appendQueryParameter("report_schema", builder2).appendQueryParameter("gravity", "bottom").build());
            }
        }
        C61764OLw c61764OLw2 = this.LIZ;
        c61764OLw2.getClass();
        C188727au c188727au = new C188727au();
        Room room3 = c61764OLw2.LJLJI;
        if (room3 != null) {
            l = Long.valueOf(room3.getOwnerUserId());
        } else {
            l = null;
        }
        c188727au.LJIIIZ("anchor_id", String.valueOf(l));
        Room room4 = c61764OLw2.LJLJI;
        if (room4 != null) {
            str2 = C17280m4.LIZ(room4);
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("room_id", str2);
        c188727au.LJIIIZ("link_id", "");
        c188727au.LJIIIZ("enter_from_merge", c61764OLw2.LJLJLJ);
        c188727au.LJIIIZ("enter_method", c61764OLw2.LJLJLLL);
        c188727au.LJFF(c61764OLw2.LJLL, "is_ad");
        FMX.LJIIL("livesdk_links_click", c188727au.LIZ);
    }
}
