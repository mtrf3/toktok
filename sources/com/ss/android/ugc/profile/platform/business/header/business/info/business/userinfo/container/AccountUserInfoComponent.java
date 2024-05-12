package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.container;

import X.C55096Ljo;
import X.C65352Pkq;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountUserInfoBaseUIComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountModifyUserNameComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountQRCodeComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountUserNameComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountVerifyComponent;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class AccountUserInfoComponent extends AccountUserInfoBaseComponent {
    public AccountUserInfoComponent() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.profile.platform.base.component.BaseContainerComponent
    public final void v3() {
        BaseContainerComponent.x3(this, "user_info_base_item", C65352Pkq.LIZ(AccountUserInfoBaseUIComponent.class), null, 0, 12);
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            BaseContainerComponent.x3(this, "user_account_user_name", C65352Pkq.LIZ(AccountUserNameComponent.class), null, 0, 4);
            BaseContainerComponent.x3(this, "user_account_verify", C65352Pkq.LIZ(AccountVerifyComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "user_account_user_name_modify", C65352Pkq.LIZ(AccountModifyUserNameComponent.class), null, 0, 12);
            BaseContainerComponent.x3(this, "user_account_qr_code", C65352Pkq.LIZ(AccountQRCodeComponent.class), null, 0, 12);
            return;
        }
        BaseContainerComponent.x3(this, "user_account_user_name", C65352Pkq.LIZ(AccountUserNameComponent.class), null, 0, 4);
        BaseContainerComponent.x3(this, "user_account_verify", C65352Pkq.LIZ(AccountVerifyComponent.class), null, 0, 12);
    }
}
