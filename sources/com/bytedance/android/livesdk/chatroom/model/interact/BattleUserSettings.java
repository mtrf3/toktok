package com.bytedance.android.livesdk.chatroom.model.interact;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleUserSettings extends F9E {

    @InterfaceC65349Pkn("accept_not_follower_invite")
    public Boolean acceptNotFollowerInvite;

    @InterfaceC65349Pkn("allow_gift_to_other_anchors")
    public Boolean allowGiftToOtherAnchors;

    @InterfaceC65349Pkn("is_turn_on")
    public Boolean isTurnOn;

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.isTurnOn;
        Boolean bool2 = this.acceptNotFollowerInvite;
        Boolean bool3 = this.allowGiftToOtherAnchors;
        return new Object[]{bool, bool, bool2, bool2, bool3, bool3};
    }
}
