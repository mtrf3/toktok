package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* loaded from: classes6.dex */
public final class LiveIntroMessage extends CR6 {

    @InterfaceC65349Pkn("audit_status")
    public int auditStatus;

    @InterfaceC65349Pkn("badges")
    public List<BadgeStruct> badges;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("content_language")
    public String contentLanguage;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("intro_mode")
    public Integer introMode;

    @InterfaceC65349Pkn("user")
    public User user;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    @Override // X.CR6, com.ss.ugc.live.sdk.message.data.IMessage
    public final int consumingStrategy() {
        return 2;
    }

    public LiveIntroMessage() {
        this.type = EnumC31509CYf.LIVE_INTRO_MESSAGE;
        this.introMode = 0;
        this.contentLanguage = "";
    }
}
