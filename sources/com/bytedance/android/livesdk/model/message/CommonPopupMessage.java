package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class CommonPopupMessage extends CR6 {

    @InterfaceC65349Pkn("anchor_pop_up")
    public boolean anchorPopup;

    @InterfaceC65349Pkn("schema_url")
    public String schemaUrl;

    public CommonPopupMessage() {
        this.type = EnumC31509CYf.COMMON_POPUP_MESSAGE;
    }
}
