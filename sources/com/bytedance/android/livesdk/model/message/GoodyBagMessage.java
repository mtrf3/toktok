package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagWinnerInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GoodyBagMessage extends CR6 {

    @InterfaceC65349Pkn("base_info")
    public GoodyBagBaseInfo baseInfo;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("winners")
    public List<GoodyBagWinnerInfo> winners;

    public GoodyBagMessage() {
        super.type = EnumC31509CYf.GOODY_BAG_MESSAGE;
        this.winners = new ArrayList();
    }
}
