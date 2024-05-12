package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class NewAnchorGuideMessage extends CR6 {

    @InterfaceC65349Pkn("guide_msg")
    public NewAnchorGuideMsgInfo guideMsg;

    public NewAnchorGuideMessage() {
        this.type = EnumC31509CYf.NEW_ANCHOR_GUIDE_MESSAGE;
    }
}
