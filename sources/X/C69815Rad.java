package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Rad, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69815Rad extends AbstractC69707RXj {
    @Override // X.AbstractC69707RXj
    public final List LIZ(Object obj, RY7 ry7) {
        ProductPackStruct productPackStruct;
        BundleBrief bundleBrief;
        String str;
        BundleInfoResponseData bundleInfoResponseData;
        ProductPackStruct productPackStruct2;
        BundleInfoResponseData bundleInfoResponseData2;
        BundleInfoResponseData bundleInfoResponseData3;
        List<BundleInfo> list;
        BundleInfo bundleInfo;
        PdpViewModel pdpViewModel = (PdpViewModel) obj;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "vm");
        if (!ry7.LIZLLL && pdpViewModel.ow0() && (productPackStruct = pdpViewModel.LJLJLLL) != null && (bundleBrief = productPackStruct.bundleBrief) != null) {
            Integer num = bundleBrief.position;
            int value = EnumC69897Rbx.UNDER_COUPON.getValue();
            if (num != null && num.intValue() == value) {
                BundleInfoResponse bundleInfoResponse = pdpViewModel.LLLIIIL;
                if (bundleInfoResponse == null || (bundleInfoResponseData3 = bundleInfoResponse.data) == null || (list = bundleInfoResponseData3.bundleInfoList) == null || (bundleInfo = (BundleInfo) ORZ.LJLLLL(list)) == null || (str = bundleInfo.title) == null) {
                    str = "Bundle";
                }
                if (pdpViewModel.LLLIILIL) {
                    BundleInfoResponse bundleInfoResponse2 = pdpViewModel.LLLIIIL;
                    if (bundleInfoResponse2 != null && bundleInfoResponse2.LIZ() && (productPackStruct2 = pdpViewModel.LJLJLLL) != null) {
                        BundleInfoResponse bundleInfoResponse3 = pdpViewModel.LLLIIIL;
                        if (bundleInfoResponse3 != null) {
                            bundleInfoResponseData2 = bundleInfoResponse3.data;
                        } else {
                            bundleInfoResponseData2 = null;
                        }
                        C35635Dyh LJJJJI = C78555UsJ.LJJJJI(productPackStruct2, bundleInfoResponseData2);
                        LJ.add(C69717RXt.LIZ);
                        LJ.add(new C27631Ast(str, null, 2));
                        LJ.add(LJJJJI);
                    }
                } else {
                    ProductPackStruct productPackStruct3 = pdpViewModel.LJLJLLL;
                    if (productPackStruct3 != null) {
                        BundleInfoResponse bundleInfoResponse4 = pdpViewModel.LLLIIIL;
                        if (bundleInfoResponse4 != null) {
                            bundleInfoResponseData = bundleInfoResponse4.data;
                        } else {
                            bundleInfoResponseData = null;
                        }
                        C35635Dyh LJJJJI2 = C78555UsJ.LJJJJI(productPackStruct3, bundleInfoResponseData);
                        LJ.add(C69717RXt.LIZ);
                        LJ.add(new C27631Ast(str, null, 2));
                        LJ.add(LJJJJI2);
                    }
                }
            }
        }
        return LJ;
    }
}
