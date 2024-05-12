package com.bytedance.android.livesdk.chatroom.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* loaded from: classes6.dex */
public final class SubLevel extends F9E {

    @InterfaceC65349Pkn("badge")
    public LevelBadge badge;

    @InterfaceC65349Pkn("badge_struct")
    public BadgeStruct badgeStruct;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("level")
    public Integer level;

    @InterfaceC65349Pkn("month_limit")
    public Integer monthLimit;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.level;
        String str = this.desc;
        Integer num2 = this.monthLimit;
        LevelBadge levelBadge = this.badge;
        return new Object[]{num, num, str, str, num2, num2, levelBadge, levelBadge};
    }
}
