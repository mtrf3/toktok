package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.ShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerDetailPopup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ard, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27553Ard extends TAT {
    public final /* synthetic */ SellerDetailInfo LJLJJI;
    public final /* synthetic */ ShopProfileVH LJLJJL;
    public final /* synthetic */ LinearLayout LJLJJLL;
    public final /* synthetic */ C27546ArW LJLJL;

    @Override // X.TAT
    public final void LIZ(View view) {
        String str;
        String str2;
        HashMap<String, Object> trackParams;
        Long l;
        if (view != null) {
            SellerDetailPopup sellerDetailPopup = this.LJLJJI.sellerDetailPopup;
            String str3 = null;
            if (sellerDetailPopup != null && (str = sellerDetailPopup.content) != null) {
                Context context = this.LJLJJLL.getContext();
                o.LJIIIIZZ(context, "context");
                C142425iQ c142425iQ = new C142425iQ(context);
                Context context2 = this.LJLJJLL.getContext();
                o.LJIIIIZZ(context2, "context");
                C5ZB c5zb = new C5ZB(context2);
                c5zb.LIZ(str);
                ((TuxTextView) c5zb.getView().findViewById(R.id.ghd)).setTextColorRes(R.attr.dj);
                ((TuxTextView) c5zb.getView().findViewById(R.id.ghd)).setTuxFont(61);
                C82682Wcg c82682Wcg = c142425iQ.LIZ;
                c82682Wcg.LJIJ = c5zb;
                c82682Wcg.LIZIZ = view;
                c142425iQ.LJI(WHL.BOTTOM);
                c142425iQ.LJIIIZ(R.attr.gy);
                C82682Wcg c82682Wcg2 = c142425iQ.LIZ;
                c82682Wcg2.LJII = -1001L;
                c82682Wcg2.LJIIIZ = true;
                c82682Wcg2.LJIIL = true;
                c142425iQ.LIZJ().show();
                PdpViewModel viewModel = this.LJLJJL.getViewModel();
                String str4 = this.LJLJJI.key;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                C27546ArW c27546ArW = this.LJLJL;
                String str6 = c27546ArW.LJLIL;
                Float LJJIJLIJ = C38350F3i.LJJIJLIJ(c27546ArW.LJLJJL);
                C27546ArW c27546ArW2 = this.LJLJL;
                StoreOfficialLabel storeOfficialLabel = c27546ArW2.LJLJLJ;
                if (storeOfficialLabel != null) {
                    str2 = storeOfficialLabel.labelTypeStr;
                } else {
                    str2 = null;
                }
                List<SellerDetailInfo> list = this.LJLJJL.detailInfo;
                SellerSellingPoint sellerSellingPoint = c27546ArW2.LJLLLL;
                if (sellerSellingPoint != null) {
                    str3 = sellerSellingPoint.sellingPoints;
                }
                viewModel.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("page_name", PdpViewModel.fw0(viewModel.aw0()));
                if (str6 != null) {
                    str5 = str6;
                }
                linkedHashMap.put("shop_id", str5);
                linkedHashMap.put("is_self", Integer.valueOf(viewModel.ww0() ? 1 : 0));
                linkedHashMap.put("traceparent", PII.LIZIZ());
                linkedHashMap.put("entrance_info", viewModel.Ax0("entrance_info"));
                linkedHashMap.put("source_page_type", viewModel.Ax0("source_page_type"));
                if (list != null) {
                    for (SellerDetailInfo sellerDetailInfo : list) {
                        String str7 = sellerDetailInfo.key;
                        if (str7 != null && (l = sellerDetailInfo.count) != null) {
                            linkedHashMap.put(str7, l);
                        }
                    }
                }
                if (str3 != null) {
                    linkedHashMap.put("entrance_selling_point", str3);
                }
                String Ax0 = viewModel.Ax0("enter_from_info");
                if (!ujb.o.LJJJJJL(Ax0)) {
                    linkedHashMap.put("enter_from", Ax0);
                }
                String Ax02 = viewModel.Ax0("source_content_id");
                if (!ujb.o.LJJJJJL(Ax02)) {
                    linkedHashMap.put("list_source_content_id", Ax02);
                }
                if (LJJIJLIJ != null) {
                    linkedHashMap.put("shop_rating", Float.valueOf(LJJIJLIJ.floatValue()));
                }
                if (!ujb.o.LJJJJJL("showcase_detail")) {
                    linkedHashMap.put("entrance_type", "showcase_detail");
                }
                if (str2 != null && !ujb.o.LJJJJJL(str2)) {
                    linkedHashMap.put("logo_type", str2);
                }
                IPdpStarter.PdpEnterParam pdpEnterParam = viewModel.LJLJJLL;
                if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                    for (Map.Entry entry : ((LinkedHashMap) C113554cx.LJJLIL(trackParams)).entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                C70414RkI c70414RkI = viewModel.LLFII;
                if (c70414RkI != null) {
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.putAll(linkedHashMap);
                    c70414RkI.LJJI(str4, hashMap);
                }
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            this.LJLJJL.onClick(this.LJLJJI.key);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27553Ard(SellerDetailInfo sellerDetailInfo, ShopProfileVH shopProfileVH, LinearLayout linearLayout, C27546ArW c27546ArW) {
        super(700L);
        this.LJLJJI = sellerDetailInfo;
        this.LJLJJL = shopProfileVH;
        this.LJLJJLL = linearLayout;
        this.LJLJL = c27546ArW;
    }
}
