package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _PrivilegeLogExtra_ProtoDecoder implements InterfaceC31105CIr<PrivilegeLogExtra> {
    public static PrivilegeLogExtra LIZIZ(Q9H q9h) {
        PrivilegeLogExtra privilegeLogExtra = new PrivilegeLogExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    privilegeLogExtra.level = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                privilegeLogExtra.privilege_order_id = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            privilegeLogExtra.privilege_version = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        privilegeLogExtra.privilege_id = Q9J.LIZIZ(q9h);
                    }
                } else {
                    privilegeLogExtra.data_version = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return privilegeLogExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PrivilegeLogExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
