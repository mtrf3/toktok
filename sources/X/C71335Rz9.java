package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS0S3201000_12;
import kotlin.jvm.internal.AqS6S0211000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71335Rz9 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final Activity LJLILLLLZI;
    public final List<ShopWindowAnchorModel> LJLJI;
    public final CommonVideoAnchorModel LJLJJI;
    public final ArrayList<Integer> LJLJJL;
    public final ArrayList<Integer> LJLJJLL;
    public final ArrayList<Integer> LJLJL;
    public final IECommerceVideoService LJLJLJ;
    public final IECommerceAnchorService LJLJLLL;
    public final EnumC71337RzB LJLL;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJLLI;
    public java.util.Map<String, C71376Rzo> LJLLILLLL;
    public final java.util.Map<String, String> LJLLJ;
    public final int LJLLL;

    public final String M(String str) {
        String str2;
        if (this.LJLLJ.containsKey(str)) {
            return String.valueOf(((LinkedHashMap) this.LJLLJ).get(str));
        }
        CommonVideoAnchorModel commonVideoAnchorModel = this.LJLJJI;
        if (commonVideoAnchorModel != null) {
            str2 = C71360RzY.LJIIIIZZ(commonVideoAnchorModel, str);
        } else {
            str2 = "";
        }
        this.LJLLJ.put(str, str2);
        return str2;
    }

    public final void L(View view, int i, ShopWindowAnchorModel shopWindowAnchorModel, String str) {
        String string;
        String str2;
        String str3;
        Integer num;
        String eventType;
        String str4;
        HashMap<String, String> hashMap;
        CommonVideoAnchorModel commonVideoAnchorModel;
        String str5;
        String str6;
        C71370Rzi.LIZ = false;
        boolean LJJJIL = C78857UxB.LJJJIL(shopWindowAnchorModel.LIZ.schema);
        Integer num2 = shopWindowAnchorModel.LIZ.productStatus;
        String str7 = "";
        if (num2 == null || num2.intValue() != 100) {
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LJLLI;
            Boolean bool = Boolean.TRUE;
            interfaceC88472Yns.invoke(bool);
            String trackerId = M(String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJI, i)).LIZ.productId));
            if (LJJJIL) {
                Integer num3 = shopWindowAnchorModel.type;
                if (num3 == null || num3.intValue() != 33 || (num = shopWindowAnchorModel.LIZ.platform) == null || num.intValue() != 100) {
                    CommonVideoAnchorModel commonVideoAnchorModel2 = this.LJLJJI;
                    if (commonVideoAnchorModel2 == null || (str4 = commonVideoAnchorModel2.getEventType()) == null) {
                        str4 = "";
                    }
                    String LJJI = C71360RzY.LJJI(shopWindowAnchorModel, commonVideoAnchorModel2, str4, "video_comment_multi_anchor", trackerId);
                    CommonVideoAnchorModel commonVideoAnchorModel3 = this.LJLJJI;
                    if (commonVideoAnchorModel3 != null) {
                        hashMap = commonVideoAnchorModel3.getMMobParams();
                    } else {
                        hashMap = null;
                    }
                    if ((hashMap == null || (str5 = hashMap.get("request_id")) == null) && ((commonVideoAnchorModel = this.LJLJJI) == null || (str5 = commonVideoAnchorModel.getRequestId()) == null)) {
                        str5 = "";
                    }
                    if (hashMap == null || (str6 = hashMap.get("rec_session_id")) == null) {
                        str6 = "";
                    }
                    Bundle bundle = new Bundle();
                    if (trackerId.length() > 0) {
                        bundle.putString("track_id", trackerId);
                    }
                    if (str5.length() > 0) {
                        bundle.putString("request_id", str5);
                    }
                    if (str6.length() > 0) {
                        bundle.putString("rec_session_id", str6);
                    }
                    bundle.putBoolean("video_anchor", true);
                    bundle.putString("title", String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJI, i)).LIZ.title));
                    bundle.putString("price", String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJI, i)).LIZ.formatPrice));
                    int i2 = this.LJLLL;
                    String str8 = ((ShopWindowAnchorModel) ListProtector.get(this.LJLJI, i)).LIZ.coverUrl;
                    if (str8 != null) {
                        str7 = str8;
                    }
                    bundle.putString("cover", C1E4.LJJIIJZLJL(i2, i2, str7));
                    bundle.putString("id", String.valueOf(((ShopWindowAnchorModel) ListProtector.get(this.LJLJI, i)).LIZ.productId));
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLILLLLZI, LJJI);
                    buildRoute.withParam(bundle);
                    buildRoute.open();
                } else {
                    Activity activity = this.LJLILLLLZI;
                    CommonVideoAnchorModel commonVideoAnchorModel4 = this.LJLJJI;
                    if (commonVideoAnchorModel4 != null && (eventType = commonVideoAnchorModel4.getEventType()) != null) {
                        str7 = eventType;
                    }
                    C71360RzY.LJJIIJ(activity, shopWindowAnchorModel, commonVideoAnchorModel4, str7, "video_comment_multi_anchor", trackerId);
                }
            } else {
                Activity activity2 = this.LJLILLLLZI;
                Integer num4 = shopWindowAnchorModel.type;
                if (num4 == null || num4.intValue() != 33) {
                    str2 = null;
                } else {
                    C71361RzZ c71361RzZ = C71361RzZ.LIZ;
                    String str9 = shopWindowAnchorModel.LIZ.finalUrl;
                    c71361RzZ.getClass();
                    if (C71361RzZ.LJJJJIZL(str9, false)) {
                        str2 = shopWindowAnchorModel.LIZ.finalUrl;
                    } else {
                        str2 = shopWindowAnchorModel.LIZ.detailUrl;
                    }
                    String str10 = shopWindowAnchorModel.LIZ.detailUrl;
                    if (str10 == null) {
                        str10 = "";
                    }
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(activity2, str10, "");
                }
                Integer num5 = shopWindowAnchorModel.type;
                if (num5 != null && num5.intValue() == 6) {
                    str2 = shopWindowAnchorModel.schema;
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(activity2, shopWindowAnchorModel.schema, "");
                }
                ECommerceAnchorService.LJJJJI().LJIJ(activity2, str2);
            }
            CommonVideoAnchorModel commonVideoAnchorModel5 = this.LJLJJI;
            o.LJIIIZ(trackerId, "trackerId");
            if (commonVideoAnchorModel5 != null) {
                C76542zS.LIZJ("tiktokec_product_click", new AqS0S3201000_12(i, commonVideoAnchorModel5, shopWindowAnchorModel, str, trackerId, "video_comment_multi_anchor", 0));
            }
            CommonVideoAnchorModel commonVideoAnchorModel6 = this.LJLJJI;
            if (commonVideoAnchorModel6 != null && o.LJ(commonVideoAnchorModel6.isAd(), bool)) {
                C58655N0h LIZLLL = C58704N2e.LIZLLL("anchor_detail", "otherclick", this.LJLJJI.getAwemeRawAd());
                LIZLLL.LIZJ("shop_anchor", "refer");
                LIZLLL.LJI();
            }
            CommonVideoAnchorModel commonVideoAnchorModel7 = this.LJLJJI;
            if (commonVideoAnchorModel7 != null) {
                str3 = commonVideoAnchorModel7.getEventType();
            } else {
                str3 = null;
            }
            C71363Rzb.LJIIJ(true, str3, null, this.LJLJJI, shopWindowAnchorModel, ORZ.LLJILJILJ(this.LJLJI), "comment_anchor", 4);
            return;
        }
        String str11 = shopWindowAnchorModel.LIZ.unavailableText;
        if (TextUtils.isEmpty(str11)) {
            Context context = view.getContext();
            if (context != null && (string = context.getString(R.string.pc9)) != null) {
                str7 = string;
            }
            str11 = str7;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIZ(str11);
        c26045AKb.LJIIJ();
    }

    public final void N(int i, boolean z, SHA sha, ShopWindowAnchorModel shopWindowAnchorModel, String str) {
        Long startClickTime;
        if (!this.LJLJL.contains(Integer.valueOf(i))) {
            this.LJLJL.add(Integer.valueOf(i));
            CommonVideoAnchorModel commonVideoAnchorModel = this.LJLJJI;
            if (commonVideoAnchorModel != null && (startClickTime = commonVideoAnchorModel.getStartClickTime()) != null) {
                C76542zS.LIZJ("rd_tiktokec_video_shopping_detail_render", new AqS6S0211000_12(i, this.LJLJJI, Long.valueOf(SystemClock.elapsedRealtime() - startClickTime.longValue()), z, 0));
            }
        }
        C71361RzZ.LIZ.getClass();
        C71361RzZ.LJIJJ(sha, shopWindowAnchorModel, str, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C71335Rz9(View rootView, Activity context, List<ShopWindowAnchorModel> anchors, CommonVideoAnchorModel commonVideoAnchorModel, ArrayList<Integer> exposedProductMap, ArrayList<Integer> exposedButtonMap, ArrayList<Integer> exposedImageMap, IECommerceVideoService iECommerceVideoService, IECommerceAnchorService iECommerceAnchorService, EnumC71337RzB commodityListStyle, InterfaceC88472Yns<? super Boolean, C76800UCe> clickListener) {
        super(rootView);
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(anchors, "anchors");
        o.LJIIIZ(exposedProductMap, "exposedProductMap");
        o.LJIIIZ(exposedButtonMap, "exposedButtonMap");
        o.LJIIIZ(exposedImageMap, "exposedImageMap");
        o.LJIIIZ(commodityListStyle, "commodityListStyle");
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLIL = rootView;
        this.LJLILLLLZI = context;
        this.LJLJI = anchors;
        this.LJLJJI = commonVideoAnchorModel;
        this.LJLJJL = exposedProductMap;
        this.LJLJJLL = exposedButtonMap;
        this.LJLJL = exposedImageMap;
        this.LJLJLJ = iECommerceVideoService;
        this.LJLJLLL = iECommerceAnchorService;
        this.LJLL = commodityListStyle;
        this.LJLLI = clickListener;
        this.LJLLJ = new LinkedHashMap();
        this.LJLLL = 300;
    }

    public final void P(String str, int i, ShopWindowAnchorModel shopWindowAnchorModel, CommonVideoAnchorModel commonVideoAnchorModel, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7) {
        C76542zS.LIZJ(str, new C71324Ryy(i, shopWindowAnchorModel, this, str2, str6, commonVideoAnchorModel, bool, str3, str4, str5, str7));
    }
}
