package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.WM7;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.message.CommonMessageData;

/* loaded from: classes6.dex */
public class RoomMessage extends CR6 {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("is_welcome")
    public boolean isWelcome;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public String scene = "";

    @InterfaceC65349Pkn("source")
    public int source;

    @InterfaceC65349Pkn("supprot_landscape")
    public Boolean supprotLandscape;

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 1;
    }

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public boolean canText() {
        if (!TextUtils.isEmpty(this.content) || supportDisplayText()) {
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

    public RoomMessage() {
        this.type = EnumC31509CYf.ROOM;
    }
}
