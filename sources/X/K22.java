package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes9.dex */
public final class K22 implements ITopLiveProductViewProvider {
    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
    public final String getAnchorInfo(boolean z) {
        return z ? "search_live_single_anchor" : "search_live_merge_entrance";
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
    public final boolean shouldShow(boolean z) {
        if (z) {
            if (C00F.LIZ(31744, 0, "show_live_middle_card_product_entrance", true) != 1) {
                return false;
            }
        } else if (C00F.LIZ(31744, 0, "show_live_large_card_product_entrance", true) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
    public final ITopLiveProductView getTopLiveProductView(ViewGroup view, boolean z) {
        o.LJIIIZ(view, "view");
        if (z) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            return new KSE(context);
        }
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        return new KSB(context2);
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
    public final EnterRoomConfig prepareEcLiveExtraArgs(EnterRoomConfig enterRoomConfig, String str) {
        long j;
        EnterRoomConfig.ECWrapData eCWrapData;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("room_id");
                if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null) {
                    j = roomsData2.roomId;
                } else {
                    j = 0;
                }
                if (!o.LJ(optString, String.valueOf(j))) {
                    return enterRoomConfig;
                }
                String optString2 = jSONObject.optString("live_auto_route_schema");
                if (C78685UuP.LJJJZ(optString2)) {
                    Uri.Builder buildUpon = UriProtector.parse(optString2).buildUpon();
                    buildUpon.appendQueryParameter("click_scene_start_time", String.valueOf(SystemClock.elapsedRealtime()));
                    String builder = buildUpon.toString();
                    if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                        roomsData.extraSchema = builder;
                    }
                    return enterRoomConfig;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("product_bag_extra");
                if (optJSONObject != null && enterRoomConfig != null) {
                    EnterRoomConfig.ECWrapData eCWrapData2 = enterRoomConfig.mECData;
                    if (eCWrapData2 != null) {
                        eCWrapData2.autoOpenProductBag = optJSONObject.optInt("auto_open_product_bag", 0);
                    }
                    if (enterRoomConfig != null && (eCWrapData = enterRoomConfig.mECData) != null) {
                        eCWrapData.autoOpenProductBagTrackParams = optJSONObject.optString("auto_open_product_bag_track_params");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return enterRoomConfig;
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
    public final void addBagIconIfNeed(boolean z, LinearLayout linearLayout, Boolean bool) {
        if (linearLayout != null) {
            C16880lQ.LJZI(linearLayout, linearLayout.findViewById(R.id.fv8));
            if (o.LJ(bool, Boolean.TRUE)) {
                if (z) {
                    if (C00F.LIZ(31744, 0, "show_live_middle_card_shop_icon", true) != 1) {
                        return;
                    }
                } else if (C00F.LIZ(31744, 0, "show_live_large_card_shop_icon", true) != 1) {
                    return;
                }
                Context context = linearLayout.getContext();
                o.LJIIIIZZ(context, "liveTagLayout.context");
                TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
                tuxIconView.setId(R.id.fv8);
                tuxIconView.setIconRes(R.raw.icon_bag_fill);
                tuxIconView.setTintColorRes(R.attr.dj);
                tuxIconView.setIconHeight(C17N.LJIILL(12.0d));
                tuxIconView.setIconWidth(C17N.LJIILL(12.0d));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMarginEnd(C17N.LJIILL(2.0d));
                layoutParams.gravity = 17;
                linearLayout.addView(tuxIconView, 0, layoutParams);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider
    public final java.util.Map<String, Object> getEcomParams(String str, Boolean bool, java.util.Map<String, Object> params) {
        boolean z;
        boolean z2;
        o.LJIIIZ(params, "params");
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (!z) {
            try {
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "bundle");
                if (queryParameter != null) {
                    str2 = ujb.o.LJJJJZ(queryParameter, "/template.js", "", false);
                }
            } catch (Exception unused) {
            }
        }
        if (s.LJJJLZIJ(str2, "on-live-single", false)) {
            if (bool != null) {
                params.put("has_ecom_intent", Boolean.valueOf(bool.booleanValue()));
            }
            if (C00F.LIZ(31744, 0, "show_user_merge_card_product_entrance", true) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                params.put("show_user_merge_card_product_entrance", 1);
            }
            if (C00F.LIZ(31744, 0, "show_user_merge_card_shop_icon", true) == 1) {
                params.put("show_user_merge_card_shop_icon", 1);
            }
            if (C00F.LIZ(31744, 0, "show_user_single_card_product_entrance", true) == 1) {
                params.put("show_user_single_card_product_entrance", 1);
            }
            if (C00F.LIZ(31744, 0, "show_user_single_card_shop_icon", true) == 1) {
                params.put("show_user_single_card_shop_icon", 1);
            }
        }
        return params;
    }
}
