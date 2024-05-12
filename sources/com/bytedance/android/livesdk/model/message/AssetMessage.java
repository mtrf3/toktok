package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class AssetMessage extends CR6 {

    @InterfaceC65349Pkn("asset_id")
    public long assetId;

    @InterfaceC65349Pkn("asset")
    public AssetsModel assets;

    @InterfaceC65349Pkn("user")
    public User fromUser;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("panel_display_text")
    public Text panelDisplayText;

    @InterfaceC65349Pkn("priority")
    public GiftIMPriority priority;

    @InterfaceC65349Pkn("show_message")
    public boolean showMessage;

    @InterfaceC65349Pkn("show_panel")
    public boolean showPanel;

    @InterfaceC65349Pkn("to_user")
    public User toUser;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public AssetMessage() {
        this.type = EnumC31509CYf.ASSET_MESSAGE;
    }
}
