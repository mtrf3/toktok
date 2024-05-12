package com.bytedance.android.livesdk.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;

/* loaded from: classes6.dex */
public class UserAttr extends F9E {

    @InterfaceC65349Pkn("admin_permissions")
    public Map<Integer, Integer> adminPermissions;

    @InterfaceC65349Pkn("is_admin")
    public boolean isAdmin;

    @InterfaceC65349Pkn("is_muted")
    public boolean isMuted;

    @InterfaceC65349Pkn("is_super_admin")
    public boolean isSuperAdmin;

    @InterfaceC65349Pkn("mute_duration")
    public long muteDuration;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isMuted), Boolean.valueOf(this.isAdmin)};
    }
}
