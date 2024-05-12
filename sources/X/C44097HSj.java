package X;

import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HSj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44097HSj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C7F9 c7f9, boolean z) {
        List<AnchorCommonStruct> anchors = c7f9.LIZ.getAnchors();
        if (anchors == null || anchors.isEmpty()) {
            return;
        }
        for (AnchorCommonStruct anchorCommonStruct : anchors) {
            if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() || anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                String LJJLJLI = ((S1E) ORZ.LJLLJ(c7f9.LIZJ())).LJIIIZ().LJJLJLI();
                int LJIILJJIL = ((S1E) ORZ.LJLLJ(c7f9.LIZJ())).LJIILJJIL();
                if (LJIILJJIL != 0) {
                    if (LJIILJJIL != 1) {
                        if (!(ORZ.LJLLJ(c7f9.LIZJ()) instanceof S0Q)) {
                            LIZJ(-9, LJJLJLI, false);
                            return;
                        }
                        return;
                    } else {
                        if (!((S1E) ORZ.LJLLJ(c7f9.LIZJ())).LJIILLIIL()) {
                            return;
                        }
                        LIZJ(-8, LJJLJLI, true);
                        return;
                    }
                }
                LIZJ(-6, LJJLJLI, z);
                return;
            }
        }
    }

    public static void LIZJ(int i, String str, boolean z) {
        String str2;
        int i2;
        C188727au c188727au = new C188727au();
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        c188727au.LJIIIZ("is_single_anchor", str2);
        c188727au.LJIIIZ("entrance_form", str);
        c188727au.LIZLLL(i, "error_code");
        java.util.Map<String, String> extraParams = c188727au.LIZ;
        FMX.LJIIL("rd_tiktokec_video_anchor_view_show_fail", extraParams);
        if (i != -9) {
            if (i != -6) {
                i2 = 4001;
            } else {
                i2 = 4006;
            }
        } else {
            i2 = 4008;
        }
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        Integer valueOf = Integer.valueOf(i2);
        o.LJIIIIZZ(extraParams, "extraParams");
        LJJJJI.LJJIJLIJ(valueOf, str, z, C113554cx.LJJLIL(extraParams));
    }

    public static void LIZIZ(int i, String str, String str2, List list) {
        String str3;
        String str4;
        C188727au c188727au = new C188727au();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c188727au.LJIIIZ("author_id", curUserId);
        c188727au.LJIIIZ("creation_id", str);
        if (list != null) {
            str3 = ORZ.LLD(list, ",", null, null, C42794Gqs.LJLIL, 30);
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("anchor_types", str3);
        c188727au.LJFF(Boolean.FALSE, "is_avaliable");
        c188727au.LJIIIZ("schema", str2);
        switch (i) {
            case 3003:
                str4 = "To add a product link, add a sound from the Commercial Sound Page.";
                break;
            case 3004:
                str4 = "It's a photo mode video, and photo mode is closed in ecommerce.";
                break;
            case 3005:
                str4 = "Is not shopify music.";
                break;
            case 3006:
                str4 = "Don't support adding multi anchors.";
                break;
            default:
                str4 = "unknown";
                break;
        }
        c188727au.LJI("na_reason", str4);
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        Integer valueOf = Integer.valueOf(i);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "eventMapBuilder.builder()");
        LJJJJI.LJJIIZ(valueOf, str4, C113554cx.LJJLIL(map));
    }
}
