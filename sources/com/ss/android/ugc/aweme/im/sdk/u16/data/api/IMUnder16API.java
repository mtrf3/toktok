package com.ss.android.ugc.aweme.im.sdk.u16.data.api;

import X.AbstractC73638SvC;
import X.C4IG;
import X.E4Q;
import com.ss.android.ugc.aweme.im.sdk.u16.data.model.DisableChatUnder16Resp;

/* loaded from: classes2.dex */
public interface IMUnder16API {
    public static final C4IG LIZ = C4IG.LIZ;

    @E4Q("im/disable/chat/notice/")
    AbstractC73638SvC<DisableChatUnder16Resp> getUnder16Info();
}
