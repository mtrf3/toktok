package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;

/* loaded from: classes6.dex */
public class ScreenMessage extends CR6 {

    @InterfaceC65349Pkn("background_image_v2")
    public ImageModel background;

    @InterfaceC65349Pkn("background_image")
    public ImageModel backgroundImage;

    @InterfaceC65349Pkn("effect_v2")
    public CeremonyEffect ceremonyEffect;

    @InterfaceC65349Pkn("chat_id")
    public long chatId;

    @InterfaceC65349Pkn("screen_chat_type")
    public int chatType;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("effect")
    public CeremonyEffect effect;

    @InterfaceC65349Pkn("priority")
    public int priority;

    @InterfaceC65349Pkn("public_area_common")
    public PublicAreaCommon publicAreaCommon;

    @InterfaceC65349Pkn("user")
    public User userInfo;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.userInfo != null && !TextUtils.isEmpty(this.content)) {
            return true;
        }
        return false;
    }

    public ScreenMessage() {
        this.type = EnumC31509CYf.SCREEN;
    }
}
