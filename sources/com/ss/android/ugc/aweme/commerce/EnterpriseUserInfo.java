package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import X.OHQ;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class EnterpriseUserInfo implements Serializable {

    @InterfaceC65349Pkn("commerce_info")
    public final CommerceInfo commerceInfo;

    @InterfaceC65349Pkn(OHQ.LIZIZ)
    public final List<EnterprisePermission> permissions;

    public final CommerceInfo getCommerceInfo() {
        return this.commerceInfo;
    }

    public final List<EnterprisePermission> getPermissions() {
        return this.permissions;
    }

    public final boolean hasPermission(String str) {
        List<EnterprisePermission> list;
        if (str == null || str.length() == 0 || (list = this.permissions) == null || list.isEmpty()) {
            return false;
        }
        Iterator<EnterprisePermission> it = this.permissions.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            EnterprisePermission next = it.next();
            EnterprisePermission enterprisePermission = next;
            if (enterprisePermission != null) {
                str2 = enterprisePermission.getKey();
            }
            if (TextUtils.equals(str, str2)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
