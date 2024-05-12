package com.bytedance.android.live.publicscreen.impl.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.EKC;
import X.InterfaceC195727mC;
import com.bytedance.android.live.publicscreen.impl.api.model.AutoTranslateParams;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;

/* loaded from: classes6.dex */
public interface PublicScreenAutoTranslateApi {
    @E8M("/webcast/room/mget_translation/")
    @EKC({"Content-Type: application/json"})
    AbstractC73672Svk<C28467BFf<MGetTranslationResponse.Data>> translate(@InterfaceC195727mC AutoTranslateParams autoTranslateParams);
}
