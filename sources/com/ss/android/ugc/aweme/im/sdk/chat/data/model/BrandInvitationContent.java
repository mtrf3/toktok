package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C72972SkS;
import X.C97343ru;
import android.content.Context;
import com.zhiliaoapp.musically.R;

/* loaded from: classes2.dex */
public final class BrandInvitationContent extends SystemCardContent {
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getQuoteHint(Context context) {
        return C72972SkS.LJ(context, "context", R.string.h81, "context.resources.getStr…g(R.string.im_quote_link)");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemCardContent, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        return C97343ru.LJFF(R.string.s50);
    }
}
