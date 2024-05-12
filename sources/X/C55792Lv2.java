package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunFragmentPanel;
import com.ss.android.ugc.aweme.ecommerce.mall.ui.racun.MallRacunPageFragment;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Lv2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55792Lv2 implements InterfaceC55798Lv8 {
    public final /* synthetic */ MallRacunPageFragment LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC55798Lv8
    public final void LIZ(C55794Lv4 productInfo) {
        int i;
        String str;
        o.LJIIIZ(productInfo, "productInfo");
        C55793Lv3.LIZIZ("tiktokec_product_click", productInfo);
        if (this.LIZ.LLFF != null) {
            Context context = this.LIZIZ.getContext();
            o.LJIIIIZZ(context, "view.context");
            Uri.Builder buildUpon = UriProtector.parse(productInfo.LJIIL).buildUpon();
            JSONObject jSONObject = new JSONObject();
            Integer num = productInfo.LJIILJJIL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            String str2 = productInfo.LJII;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = productInfo.LIZJ;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = productInfo.LIZLLL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = productInfo.LJIILIIL;
            if (str6 != null) {
                str3 = str6;
            }
            int i2 = productInfo.LJ;
            if (i2 == 2) {
                str = "live";
            } else if (i2 == 3) {
                str = "video";
            } else {
                str = "mall";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append('_');
            LIZ.append(str5);
            LIZ.append('_');
            LIZ.append(str4);
            LIZ.append('_');
            LIZ.append(i);
            jSONObject.put("track_id", X1D.LIZIZ(LIZ));
            jSONObject.put("product_id", str4);
            jSONObject.put("author_id", str5);
            jSONObject.put("product_source", str3);
            jSONObject.put("enter_from", "mall_racun_channel");
            jSONObject.put("entrance_form", "mall_racun_channel");
            jSONObject.put("enter_from_info", "mall_racun_channel");
            jSONObject.put("source_page_type", str);
            buildUpon.appendQueryParameter("trackParams", jSONObject.toString());
            SmartRouter.buildRoute(context, buildUpon.toString()).open();
        }
    }

    @Override // X.InterfaceC55798Lv8
    public final void LIZIZ(C55794Lv4 productInfo) {
        C2MA curViewHolder;
        boolean z;
        java.util.Map<String, String> map;
        o.LJIIIZ(productInfo, "productInfo");
        C55793Lv3.LIZIZ("tiktokec_product_entrance_click", productInfo);
        if (productInfo.LJFF != null) {
            if (this.LIZ.LLFF != null) {
                Context context = this.LIZIZ.getContext();
                o.LJIIIIZZ(context, "view.context");
                if (productInfo.LJFF != null) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://ec/webcast_room");
                    buildRoute.withParam("bag_auto_route", "1");
                    buildRoute.withParam("room_id", productInfo.LJFF);
                    buildRoute.withParam("enter_method", "live_cover");
                    buildRoute.withParam("enter_from_merge", "mall_racun_channel");
                    buildRoute.withParam("action_type", "click");
                    buildRoute.withParam("anchor_id", productInfo.LIZLLL);
                    buildRoute.withParam("user_id", productInfo.LIZLLL);
                    buildRoute.open();
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.Dl(false, true, true);
        MallRacunFragmentPanel mallRacunFragmentPanel = this.LIZ.LLFF;
        if (mallRacunFragmentPanel == null || (curViewHolder = mallRacunFragmentPanel.getCurViewHolder()) == null) {
            return;
        }
        Aweme currentAweme = mallRacunFragmentPanel.getCurrentAweme();
        if (currentAweme != null) {
            AnchorCustomData anchorCustomData = currentAweme.getAnchorCustomData();
            if (anchorCustomData != null) {
                z = anchorCustomData.getOpenOnLaunch();
            } else {
                z = false;
            }
            AnchorCustomData anchorCustomData2 = currentAweme.getAnchorCustomData();
            String str = null;
            if (anchorCustomData2 != null) {
                map = anchorCustomData2.getTrackingData();
            } else {
                map = null;
            }
            AnchorCustomData anchorCustomData3 = currentAweme.getAnchorCustomData();
            if (anchorCustomData3 != null) {
                str = anchorCustomData3.getEcEntranceFormMall();
            }
            AnchorCustomData anchorCustomData4 = new AnchorCustomData(z, false, map, str, null, null, null, 114, null);
            anchorCustomData4.setShouldOpen(true);
            currentAweme.setAnchorCustomData(anchorCustomData4);
        }
        curViewHolder.E8(mallRacunFragmentPanel.mCurIndex, currentAweme);
    }

    public C55792Lv2(MallRacunPageFragment mallRacunPageFragment, View view) {
        this.LIZ = mallRacunPageFragment;
        this.LIZIZ = view;
    }
}
