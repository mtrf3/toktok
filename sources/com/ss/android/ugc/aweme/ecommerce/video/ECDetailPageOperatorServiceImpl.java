package com.ss.android.ugc.aweme.ecommerce.video;

import X.C55528Lqm;
import X.InterfaceC50422Jqc;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import com.ss.android.ugc.aweme.ecommerce.video.settings.ECVideoListOperatorWhiteList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class ECDetailPageOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC50422Jqc> LIZ() {
        HashMap<String, InterfaceC50422Jqc> hashMap = new HashMap<>();
        C55528Lqm c55528Lqm = new C55528Lqm();
        hashMap.put("from_ttmall_homepage", c55528Lqm);
        hashMap.put("from_order_center", c55528Lqm);
        hashMap.put("from_ecom_search", c55528Lqm);
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig = ECVideoListOperatorWhiteList.LIZ;
        ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig eCVideoListOperatorWhiteListConfig2 = (ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig) LIZLLL.LJIIIIZZ("ec_video_list_operator_white_list", ECVideoListOperatorWhiteList.ECVideoListOperatorWhiteListConfig.class, eCVideoListOperatorWhiteListConfig);
        if (eCVideoListOperatorWhiteListConfig2 != null) {
            eCVideoListOperatorWhiteListConfig = eCVideoListOperatorWhiteListConfig2;
        }
        Iterator<String> it = eCVideoListOperatorWhiteListConfig.getFromWhiteList().iterator();
        while (it.hasNext()) {
            hashMap.put(it.next(), c55528Lqm);
        }
        return hashMap;
    }
}
