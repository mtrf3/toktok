package com.bytedance.android.live.wallet.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.SubscribeBadge;

/* loaded from: classes6.dex */
public class CheckSubOrderResultStruct {
    public String orderID = "";

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("sub_info")
    public SubChargeInfo subChargeInfo;

    @InterfaceC65349Pkn("toast")
    public String toast;

    /* loaded from: classes6.dex */
    public class SubChargeInfo {

        @InterfaceC65349Pkn("sub_level")
        public SubLevel subLevel;

        public SubChargeInfo(CheckSubOrderResultStruct checkSubOrderResultStruct) {
        }
    }

    /* loaded from: classes6.dex */
    public class SubLevel {

        @InterfaceC65349Pkn("badge")
        public SubscribeBadge subscribeBadge;

        public SubLevel(CheckSubOrderResultStruct checkSubOrderResultStruct) {
        }
    }
}
