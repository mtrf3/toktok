package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes.dex */
public final class _PrivilegeLogExtra_ProtoEncoder implements InterfaceC64604PXc<PrivilegeLogExtra> {
    public static int LIZLLL(PrivilegeLogExtra privilegeLogExtra) {
        if (privilegeLogExtra == null) {
            return 0;
        }
        return C30957CCz.LJIIL(5, privilegeLogExtra.level) + C30957CCz.LJIIL(4, privilegeLogExtra.privilege_order_id) + C30957CCz.LJIIL(3, privilegeLogExtra.privilege_version) + C30957CCz.LJIIL(2, privilegeLogExtra.privilege_id) + C30957CCz.LJIIL(1, privilegeLogExtra.data_version);
    }

    public static void LIZIZ(CD6 cd6, PrivilegeLogExtra privilegeLogExtra) {
        C30957CCz.LIZLLL(cd6, 1, privilegeLogExtra.data_version);
        C30957CCz.LIZLLL(cd6, 2, privilegeLogExtra.privilege_id);
        C30957CCz.LIZLLL(cd6, 3, privilegeLogExtra.privilege_version);
        C30957CCz.LIZLLL(cd6, 4, privilegeLogExtra.privilege_order_id);
        C30957CCz.LIZLLL(cd6, 5, privilegeLogExtra.level);
    }

    public static int LJ(int i, PrivilegeLogExtra privilegeLogExtra) {
        if (privilegeLogExtra == null) {
            return 0;
        }
        int LIZLLL = LIZLLL(privilegeLogExtra);
        return CD6.LIZ(i) + CD6.LIZIZ(LIZLLL) + LIZLLL;
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, PrivilegeLogExtra privilegeLogExtra) {
        LIZIZ(cd6, privilegeLogExtra);
    }

    public static void LIZJ(CD6 cd6, int i, PrivilegeLogExtra privilegeLogExtra) {
        if (privilegeLogExtra == null) {
            return;
        }
        cd6.LIZLLL(i, 2);
        cd6.LJ(LIZLLL(privilegeLogExtra));
        LIZIZ(cd6, privilegeLogExtra);
    }
}
