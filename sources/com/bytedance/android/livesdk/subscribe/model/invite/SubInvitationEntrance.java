package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes6.dex */
public final class SubInvitationEntrance {

    @InterfaceC65349Pkn("be_invited")
    public boolean beInvited;

    @InterfaceC65349Pkn("entrance_prompts")
    public List<SubInvitationEntrancePrompt> entrancePrompt;

    @InterfaceC65349Pkn("has_entrance")
    public boolean hasInvitationEntrance;

    @InterfaceC65349Pkn("invitation_status")
    public int invitationStatus;

    @InterfaceC65349Pkn("switcher")
    public SubInvitationFunctionSwitcher switcher;
}
