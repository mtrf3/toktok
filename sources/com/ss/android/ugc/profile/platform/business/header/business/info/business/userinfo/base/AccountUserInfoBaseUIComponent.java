package com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base;

import X.C232459Aj;
import X.C55096Ljo;
import android.view.View;
import com.ss.android.ugc.profile.platform.base.data.BizBaseData;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class AccountUserInfoBaseUIComponent<T extends BizBaseData> extends AccountInfoBaseUIComponent<T> {
    public final Map<Integer, View> LJLJJL = new LinkedHashMap();

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.base.AccountInfoBaseUIComponent, com.ss.android.ugc.profile.platform.base.component.BaseUIComponent
    public final void addComponentToParent() {
        IAccountUserInfoAbility iAccountUserInfoAbility;
        int i;
        View view = this.componentView;
        if (view != null && (iAccountUserInfoAbility = (IAccountUserInfoAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IAccountUserInfoAbility.class, null)) != null) {
            String str = this.assemTagInternal;
            if (str == null) {
                str = "";
            }
            C232459Aj c232459Aj = (C232459Aj) this.LJLIL.getValue();
            if (c232459Aj != null) {
                i = c232459Aj.LJLIL;
            } else {
                i = -1;
            }
            iAccountUserInfoAbility.LJFF(i, view, str);
        }
    }
}
