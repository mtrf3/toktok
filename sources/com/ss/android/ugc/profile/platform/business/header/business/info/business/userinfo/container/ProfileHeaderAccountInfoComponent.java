package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C55096Ljo;
import X.C65352Pkq;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account.AccountAGSWarningComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account.AccountHonorLabelComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account.AccountRBAIdentifierComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.account.AccountStateControlMediaComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class ProfileHeaderAccountInfoComponent extends ProfileHeaderAccountBaseComponent {
    public ProfileHeaderAccountInfoComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "user_account_base_info", C65352Pkq.LIZ(AccountUserInfoComponent.class), null, 0, 4);
        BaseContainerComponent.x3(this, "user_account_state_control_media", C65352Pkq.LIZ(AccountStateControlMediaComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "user_account_honor_label", C65352Pkq.LIZ(AccountHonorLabelComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "user_account_rba_identifier", C65352Pkq.LIZ(AccountRBAIdentifierComponent.class), null, 0, 12);
        BaseContainerComponent.x3(this, "user_account_base_item", C65352Pkq.LIZ(AccountInfoBaseUIComponent.class), null, 0, 12);
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            BaseContainerComponent.x3(this, "user_account_ags_warning", C65352Pkq.LIZ(AccountAGSWarningComponent.class), null, 0, 12);
        }
    }
}
