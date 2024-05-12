package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class AccessControlMessage extends CR6 {

    @InterfaceC65349Pkn("captcha")
    public AccessControlCaptcha captcha;

    public AccessControlMessage() {
        this.type = EnumC31509CYf.ACCESS_CONTROL_MESSAGE;
    }
}
