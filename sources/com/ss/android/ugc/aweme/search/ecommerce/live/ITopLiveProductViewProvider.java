package com.ss.android.ugc.aweme.search.ecommerce.live;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.Map;

/* loaded from: classes9.dex */
public interface ITopLiveProductViewProvider {
    void addBagIconIfNeed(boolean z, LinearLayout linearLayout, Boolean bool);

    String getAnchorInfo(boolean z);

    Map<String, Object> getEcomParams(String str, Boolean bool, Map<String, Object> map);

    ITopLiveProductView getTopLiveProductView(ViewGroup viewGroup, boolean z);

    EnterRoomConfig prepareEcLiveExtraArgs(EnterRoomConfig enterRoomConfig, String str);

    boolean shouldShow(boolean z);
}
