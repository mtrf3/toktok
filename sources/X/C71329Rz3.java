package X;

import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Rz3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71329Rz3 extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ CommonVideoAnchorModel LJLIL;
    public final /* synthetic */ ShopWindowAnchorModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Aweme LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71329Rz3(CommonVideoAnchorModel commonVideoAnchorModel, ShopWindowAnchorModel shopWindowAnchorModel, boolean z, String str, Aweme aweme) {
        super(1);
        this.LJLIL = commonVideoAnchorModel;
        this.LJLILLLLZI = shopWindowAnchorModel;
        this.LJLJI = z;
        this.LJLJJI = str;
        this.LJLJJL = aweme;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        String str;
        C27943Axv c27943Axv2 = c27943Axv;
        C71313Ryn.LIZLLL(c27943Axv2, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "is_from_comment", "1");
        String aid = this.LJLIL.getAid();
        if (aid == null) {
            aid = "";
        }
        c27943Axv2.LIZLLL("group_id", aid);
        String authorUid = this.LJLIL.getAuthorUid();
        if (authorUid == null) {
            authorUid = "";
        }
        c27943Axv2.LIZLLL("author_id", authorUid);
        String requestId = this.LJLIL.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        c27943Axv2.LIZLLL("request_id", requestId);
        String eventType = this.LJLIL.getEventType();
        if (eventType == null) {
            eventType = "";
        }
        c27943Axv2.LIZLLL("enter_from", eventType);
        c27943Axv2.LIZLLL("anchor_show_type", "video_cart_tag");
        c27943Axv2.LIZLLL("product_source", String.valueOf(this.LJLILLLLZI.LIZ.platform));
        String str2 = this.LJLILLLLZI.LIZ.source;
        if (str2 == null) {
            str2 = "";
        }
        c27943Axv2.LIZLLL("source", str2);
        c27943Axv2.LIZLLL("product_id", String.valueOf(this.LJLILLLLZI.LIZ.productId));
        c27943Axv2.LIZLLL("biz_type", C71366Rze.LJFF(this.LJLILLLLZI));
        int i = 0;
        c27943Axv2.LIZLLL("is_self", Integer.valueOf(o.LJ(this.LJLIL.getAuthorUid(), BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID()) ? 1 : 0));
        c27943Axv2.LIZLLL("is_single_anchor", "no");
        if (this.LJLIL.isAd() != null) {
            c27943Axv2.LIZLLL("is_ad", Integer.valueOf(o.LJ(this.LJLIL.isAd(), Boolean.TRUE) ? 1 : 0));
            AwemeRawAd awemeRawAd = this.LJLIL.getAwemeRawAd();
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
                o.LJIIIIZZ(adId, "it.adId");
                c27943Axv2.LIZLLL("ad_id", adId);
                Long creativeId = awemeRawAd.getCreativeId();
                o.LJIIIIZZ(creativeId, "it.creativeId");
                c27943Axv2.LIZLLL("creative_id", creativeId);
            }
        }
        Integer LJIILL = C71360RzY.LJIILL(this.LJLIL);
        if (LJIILL != null) {
            i = LJIILL.intValue();
        }
        c27943Axv2.LIZLLL("follow_status", Integer.valueOf(i));
        Integer num = this.LJLILLLLZI.LIZ.productStatus;
        if (num == null || num.intValue() != 70) {
            c27943Axv2.LIZLLL("shopping_status", "product_available");
        } else {
            c27943Axv2.LIZLLL("shopping_status", "product_not_available");
        }
        c27943Axv2.LIZLLL("is_mix_product", C71360RzY.LJIILLIIL(this.LJLILLLLZI.extra));
        c27943Axv2.LIZLLL("source_page_type", "video");
        c27943Axv2.LIZLLL("page_name", "video");
        if (this.LJLJI) {
            str = "video_comment_single_anchor";
        } else {
            str = "video_comment_multi_anchor";
        }
        c27943Axv2.LIZLLL("entrance_form", str);
        CommonVideoAnchorModel commonVideoAnchorModel = this.LJLIL;
        c27943Axv2.LJ(C71360RzY.LJIIL(commonVideoAnchorModel, commonVideoAnchorModel.getEventType()));
        if (this.LJLJI) {
            String str3 = this.LJLJJI;
            if (str3 != null) {
                c27943Axv2.LIZLLL("track_id", str3);
            }
            c27943Axv2.LIZLLL("is_single_anchor", "yes");
        }
        C71361RzZ c71361RzZ = C71361RzZ.LIZ;
        Aweme aweme = this.LJLJJL;
        c71361RzZ.getClass();
        c27943Axv2.LIZLLL("pure_ecommerce", Integer.valueOf(C71361RzZ.LJJJIL(aweme) ? 1 : 0));
        java.util.Map LJI = C71370Rzi.LJI(this.LJLJJL.getAid());
        if (LJI != null) {
            Object obj = LJI.get("volume");
            if (obj != null) {
                c27943Axv2.LIZLLL("volume", obj.toString());
            }
            Object obj2 = LJI.get("volume_type");
            if (obj2 != null) {
                c27943Axv2.LIZLLL("volume_type", obj2.toString());
            }
            Object obj3 = LJI.get("inherited_volume");
            if (obj3 != null) {
                c27943Axv2.LIZLLL("inherited_volume", obj3.toString());
            }
        }
        HashMap<String, String> mMobParams = this.LJLIL.getMMobParams();
        if (mMobParams != null) {
            for (Map.Entry<String, String> entry : mMobParams.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    c27943Axv2.LIZLLL(key, value);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
