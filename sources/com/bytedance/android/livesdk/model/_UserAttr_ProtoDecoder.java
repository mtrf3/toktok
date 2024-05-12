package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _UserAttr_ProtoDecoder implements InterfaceC31105CIr<UserAttr> {
    public static UserAttr LIZIZ(Q9H q9h) {
        UserAttr userAttr = new UserAttr();
        userAttr.adminPermissions = new HashMap();
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
                                    long LIZJ2 = q9h.LIZJ();
                                    Integer num = null;
                                    Integer num2 = null;
                                    while (true) {
                                        int LJI2 = q9h.LJI();
                                        if (LJI2 == -1) {
                                            break;
                                        }
                                        if (LJI2 != 1) {
                                            if (LJI2 == 2) {
                                                num2 = Integer.valueOf(q9h.LJIIJ());
                                            }
                                        } else {
                                            num = Integer.valueOf(q9h.LJIIJ());
                                        }
                                    }
                                    q9h.LJ(LIZJ2);
                                    if (num != null) {
                                        if (num2 != null) {
                                            userAttr.adminPermissions.put(num, num2);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                userAttr.muteDuration = q9h.LJIIJJI();
                            }
                        } else {
                            userAttr.isSuperAdmin = Q9J.LIZ(q9h);
                        }
                    } else {
                        userAttr.isAdmin = Q9J.LIZ(q9h);
                    }
                } else {
                    userAttr.isMuted = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userAttr;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UserAttr LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
