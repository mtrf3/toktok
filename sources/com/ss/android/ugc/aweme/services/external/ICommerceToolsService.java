package com.ss.android.ugc.aweme.services.external;

import X.InterfaceC51059K2d;
import android.content.Context;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface ICommerceToolsService {
    InterfaceC51059K2d getMusicContext();

    void handleReceptionByEvent(JSONObject jSONObject, Context context);

    boolean isCommerceChallenge();

    boolean isTcm();

    void openBrandedContentPage(Context context);

    void setCommerceChallenge(boolean z);

    boolean usedCommerceSticker();
}
