package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.List;

/* loaded from: classes6.dex */
public class LikeMessage extends CR6 {

    @InterfaceC65349Pkn("color")
    public int color;

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("effect_cnt")
    public long effectCnt;

    @InterfaceC65349Pkn("icon")
    public String icon;

    @InterfaceC65349Pkn("icons")
    public List<ImageModel> icons;

    @InterfaceC65349Pkn("like_effect")
    public List<LikeEffect> likeEffect;

    @InterfaceC65349Pkn("specified_display_text")
    public List<SpecifiedDisplayText> specifiedDisplayText;

    @InterfaceC65349Pkn("total")
    public long total;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.CR6
    public final boolean supportDisplayText() {
        CommonMessageData commonMessageData = this.baseMessage;
        if (commonMessageData != null && commonMessageData.displayText != null) {
            return true;
        }
        return false;
    }

    public LikeMessage() {
        this.type = EnumC31509CYf.LIKE;
    }

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final long getMessageId() {
        return super.getMessageId();
    }

    public LikeMessage(Boolean bool, User user) {
        this.user = user;
        this.type = EnumC31509CYf.LIKE;
        this.isLocalInsertMsg = bool.booleanValue();
    }
}
