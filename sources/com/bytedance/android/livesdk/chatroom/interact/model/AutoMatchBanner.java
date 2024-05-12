package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes14.dex */
public final class AutoMatchBanner extends F9E {

    @InterfaceC65349Pkn("button_text")
    public Text buttonText;

    @InterfaceC65349Pkn("main_guide_text")
    public Text mainGuideText;

    @InterfaceC65349Pkn("sub_guide_text")
    public Text subGuideText;

    @Override // X.F9E
    public final Object[] getObjects() {
        Text text = this.mainGuideText;
        Text text2 = this.subGuideText;
        Text text3 = this.buttonText;
        return new Object[]{text, text, text2, text2, text3, text3};
    }
}
