package com.ss.android.ugc.aweme.setting.api;

import X.AbstractC73672Svk;
import X.C40609Fwj;
import X.E4Q;
import X.E4T;
import X.InterfaceC27211Am7;

/* loaded from: classes7.dex */
public interface BetaAppApi {
    public static final C40609Fwj LIZ = C40609Fwj.LIZ;

    @E4T("/notice/save_user_info/v1/")
    AbstractC73672Svk<SimpleResponseBody> email(@InterfaceC27211Am7 EmailRequestBody emailRequestBody);

    @E4Q("/check_version/v7/")
    AbstractC73672Svk<BetaVersionBody> latestVersionFromBits();

    @E4T("/notice/send_inbox_message/v1/")
    AbstractC73672Svk<SimpleResponseBody> sendInboxMsg(@InterfaceC27211Am7 InboxMsgRequestBody inboxMsgRequestBody);
}
