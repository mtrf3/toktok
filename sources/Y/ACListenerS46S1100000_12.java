package Y;

import X.AI8;
import X.ActivityC45651qj;
import X.C0F1;
import X.C188727au;
import X.C40883G2t;
import X.C71360RzY;
import X.C76542zS;
import X.FMX;
import X.ORZ;
import X.SBQ;
import X.SD3;
import X.SD4;
import X.SD5;
import X.SD6;
import X.SD7;
import X.SVL;
import X.T5F;
import X.T87;
import X.T88;
import X.X1D;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.IChallengeDetailLegacyService;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceCommodityListActivity;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.music.v2.assem.MusicFavoriteButtonAssem;
import com.ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS61S0201000_12;

/* loaded from: classes13.dex */
public class ACListenerS46S1100000_12 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        String str;
        String str2;
        Long l;
        ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLLLL(0, ((ECommerceCommodityListActivity) aCListenerS46S1100000_12.l1).LJLJJI);
        ECommerceCommodityListActivity eCommerceCommodityListActivity = (ECommerceCommodityListActivity) aCListenerS46S1100000_12.l1;
        C76542zS.LIZJ("tiktokec_cart_entrance_click", new AqS61S0201000_12(eCommerceCommodityListActivity.LJLLI, shopWindowAnchorModel, eCommerceCommodityListActivity.LJLJL, 8));
        ECommerceCommodityListActivity eCommerceCommodityListActivity2 = (ECommerceCommodityListActivity) aCListenerS46S1100000_12.l1;
        eCommerceCommodityListActivity2.LJLLL = true;
        String str3 = aCListenerS46S1100000_12.s0;
        ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLLLL(0, eCommerceCommodityListActivity2.LJLJJI);
        if (shopWindowAnchorModel2 != null) {
            String str4 = aCListenerS46S1100000_12.s0;
            ShopWindowExtraModel shopWindowExtraModel = shopWindowAnchorModel2.LIZ;
            if (shopWindowExtraModel == null || (l = shopWindowExtraModel.productId) == null || (str = l.toString()) == null) {
                str = "";
            }
            CommonVideoAnchorModel commonVideoAnchorModel = ((ECommerceCommodityListActivity) aCListenerS46S1100000_12.l1).LJLJL;
            if (commonVideoAnchorModel != null) {
                str2 = commonVideoAnchorModel.getEventType();
            } else {
                str2 = null;
            }
            str3 = C71360RzY.LJIL(str4, shopWindowAnchorModel2, str, commonVideoAnchorModel, false, str2, "video_multi_anchor", "");
        }
        SmartRouter.buildRoute((ECommerceCommodityListActivity) aCListenerS46S1100000_12.l1, str3).open();
    }

    public static final void onClick$1(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((AI8) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public static final void onClick$10(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((SD5) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public static final void onClick$11(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        Context context = ((MusicFavoriteButtonAssem) aCListenerS46S1100000_12.l1).x3().getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("//favorite?tab_name=music&music_id=");
        LIZ.append(aCListenerS46S1100000_12.s0);
        SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ)).open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("music_id", ((MusicFavoriteButtonAssem) aCListenerS46S1100000_12.l1).N3().LJLIL);
        c188727au.LJIIIZ("enter_from", "single_song");
        FMX.LJIIL("view_favourite_song", c188727au.LIZ);
        SVL.LIZ("2", "New format", ((MusicFavoriteButtonAssem) aCListenerS46S1100000_12.l1).M3(), ((MusicFavoriteButtonAssem) aCListenerS46S1100000_12.l1).N3().LJLIL);
    }

    public static final void onClick$2(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((SD6) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public static final void onClick$3(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((SD7) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public static final void onClick$4(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((SBQ) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public static final void onClick$5(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((SD4) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public static final void onClick$6(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        ((T87) aCListenerS46S1100000_12.l1).LJLILLLLZI.vg0(aCListenerS46S1100000_12.s0, "click_answer");
    }

    public static final void onClick$7(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        ((T88) aCListenerS46S1100000_12.l1).LJLILLLLZI.vg0(aCListenerS46S1100000_12.s0, "click_question");
    }

    public static final void onClick$8(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        T5F t5f = (T5F) aCListenerS46S1100000_12.l1;
        String str = aCListenerS46S1100000_12.s0;
        String str2 = t5f.LLD.LJFF;
        String cid = t5f.getMChallenge().getCid();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("process_id", str2);
        c188727au.LJIIIZ("tag_id", cid);
        FMX.LJIIL("tag_detail_click_icon", c188727au.LIZ);
        IChallengeDetailLegacyService LIZ = ChallengeDetailLegacyServiceImpl.LIZ();
        ActivityC45651qj activity = t5f.getActivity();
        C40883G2t c40883G2t = new C40883G2t();
        ((Bundle) c40883G2t.LIZ).putParcelable("extra_zoom_info", ZoomAnimationUtils.LIZ(t5f.getMAvatar()));
        ((Bundle) c40883G2t.LIZ).putFloat("wh_ratio", 0.1f);
        c40883G2t.LIZJ("enable_download_img", false);
        ((Bundle) c40883G2t.LIZ).putSerializable("challenge_info", t5f.getMChallenge());
        c40883G2t.LIZLLL("process_id", t5f.LLD.LJFF);
        String[] strArr = new String[1];
        if (TextUtils.isEmpty(str)) {
            str = C0F1.LIZ("res").path(String.valueOf(R.drawable.bom)).build().toString();
        }
        strArr[0] = str;
        ((BaseBundle) c40883G2t.LIZ).putStringArray("uri", strArr);
        LIZ.LJII(activity, (Bundle) c40883G2t.LIZ);
    }

    public static final void onClick$9(ACListenerS46S1100000_12 aCListenerS46S1100000_12, View view) {
        SmartRouter.buildRoute(((SD3) aCListenerS46S1100000_12.l1).getContext(), aCListenerS46S1100000_12.s0).open();
    }

    public ACListenerS46S1100000_12(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
