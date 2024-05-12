package X;

import Y.ARunnableS9S1100000_8;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.easteregg.core.config.Settings;
import java.util.LinkedHashMap;

/* renamed from: X.JoF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50275JoF implements InterfaceC50075Jl1 {
    @Override // X.InterfaceC50075Jl1
    public final void LIZ(C50073Jkz c50073Jkz) {
        Integer num;
        ActivityC45651qj activityC45651qj;
        String str;
        InterfaceC49833Jh7 interfaceC49833Jh7;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        String str4;
        String str5;
        C50433Jqn searchCommonModel;
        Settings LIZ = E8R.LIZ();
        if (LIZ == null || (num = LIZ.enabled) == null || num.intValue() != 1 || (activityC45651qj = c50073Jkz.LIZ) == null) {
            return;
        }
        DynamicPatch dynamicPatch = c50073Jkz.LIZIZ;
        C50160JmO c50160JmO = null;
        if (dynamicPatch == null || (str = dynamicPatch.schema) == null) {
            return;
        }
        String rawData = dynamicPatch.getRawData();
        if (!c50073Jkz.LJFF.getUserVisibleHint()) {
            return;
        }
        InterfaceC50639Ju7 interfaceC50639Ju7 = (InterfaceC50639Ju7) C50641Ju9.LIZ().get(OBR.class);
        if (interfaceC50639Ju7 != null) {
            interfaceC49833Jh7 = interfaceC50639Ju7.getData();
        } else {
            interfaceC49833Jh7 = null;
        }
        if (!(interfaceC49833Jh7 instanceof C50277JoH)) {
            interfaceC49833Jh7 = null;
        }
        C50277JoH c50277JoH = (C50277JoH) interfaceC49833Jh7;
        if (c50277JoH != null && c50277JoH.LJLIL) {
            SearchStartViewModel searchStartViewModel = (SearchStartViewModel) ViewModelProviders.of(c50073Jkz.LIZ).get(SearchStartViewModel.class);
            InterfaceC50548Jse interfaceC50548Jse = searchStartViewModel.LJLZ;
            if (interfaceC50548Jse != null && interfaceC50548Jse.LIZ() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = !z;
            if (C50605JtZ.LJIIJJI() >= 0) {
                Integer value = searchStartViewModel.iv0().getValue();
                int LJIIJJI = C50605JtZ.LJIIJJI();
                if (value != null && value.intValue() == LJIIJJI) {
                    z2 = true;
                    if (z3 && z2) {
                        SparkContext sparkContext = new SparkContext();
                        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
                        sparkContext.LJJIJLIJ(str);
                        sparkContext.LJII(InterfaceC60819Ntv.class, new C50276JoG(rawData));
                        c40342FsQ.getClass();
                        C40343FsR LIZ2 = C40342FsQ.LIZ(activityC45651qj, sparkContext);
                        InterfaceC50157JmL LIZ3 = K0M.LIZ();
                        if (LIZ3 != null) {
                            c50160JmO = LIZ3.LIZJ();
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        SearchResultActivity LJ = C50989Jzl.LJ();
                        boolean LJII = KB1.LJII(KB1.LIZ(JTO.LIZIZ(LJ)));
                        C50652JuK.Companion.getClass();
                        C50650JuI LJII2 = C50651JuJ.LJII(LJ);
                        String str6 = "";
                        if (LJII2 == null || (searchCommonModel = LJII2.getSearchCommonModel()) == null || (str2 = searchCommonModel.getEnterFrom()) == null) {
                            str2 = "";
                        }
                        if (c50160JmO == null || (str3 = c50160JmO.LIZ) == null) {
                            str3 = "";
                        }
                        linkedHashMap.put("impr_id", str3);
                        if (c50160JmO == null || (str4 = c50160JmO.LIZ) == null) {
                            str4 = "";
                        }
                        linkedHashMap.put("search_id", str4);
                        if (c50160JmO != null && (str5 = c50160JmO.LIZIZ) != null) {
                            str6 = str5;
                        }
                        linkedHashMap.put("search_keyword", str6);
                        linkedHashMap.put("enter_from", "general_search");
                        linkedHashMap.put("search_entrance", str2);
                        linkedHashMap.put("is_mall", Integer.valueOf(LJII ? 1 : 0));
                        linkedHashMap.put("coupon_trigger_mechanism", "password_red_envelope");
                        sparkContext.LJJIIZ(linkedHashMap, "ec_log_params");
                        LIZ2.LIZIZ();
                        C82544WaS.LIZ(new ARunnableS9S1100000_8(new C50278JoI(), rawData, 11));
                        return;
                    }
                    return;
                }
            }
            z2 = false;
            if (z3) {
                return;
            } else {
                return;
            }
        }
        C50280JoK c50280JoK = new C50280JoK();
        c50280JoK.LJIIZILJ("fail_type", "1");
        C82544WaS.LIZ(new ARunnableS9S1100000_8(c50280JoK, rawData, 11));
    }
}
