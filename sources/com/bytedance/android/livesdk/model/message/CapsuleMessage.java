package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.Text;

/* loaded from: classes6.dex */
public final class CapsuleMessage extends CR6 {

    @InterfaceC65349Pkn("biz_params")
    public CapsuleBizParams bizParams;

    @InterfaceC65349Pkn("button_text")
    public Text buttonText;

    @InterfaceC65349Pkn("type")
    public int capsuleType;

    @InterfaceC65349Pkn("desc")
    public Text desc;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.desc != null) {
            return true;
        }
        return false;
    }

    public CapsuleMessage() {
        this.type = EnumC31509CYf.CAPSULE_MESSAGE;
        this.scene = "";
    }
}
