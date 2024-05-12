package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _FansClubMember_ProtoDecoder implements InterfaceC31105CIr<FansClubMember> {
    public static FansClubMember LIZIZ(Q9H q9h) {
        FansClubMember fansClubMember = new FansClubMember();
        fansClubMember.preferData = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        long LIZJ2 = q9h.LIZJ();
                        Integer num = null;
                        FansClubData fansClubData = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 == -1) {
                                break;
                            }
                            if (LJI2 != 1) {
                                if (LJI2 == 2) {
                                    fansClubData = _FansClubData_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                num = Integer.valueOf(q9h.LJIIJ());
                            }
                        }
                        q9h.LJ(LIZJ2);
                        if (num != null) {
                            if (fansClubData != null) {
                                fansClubMember.preferData.put(num, fansClubData);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    fansClubMember.data = _FansClubData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansClubMember;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansClubMember LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
