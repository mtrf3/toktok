package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.FansClubData;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _FansClubData_UserBadge_ProtoDecoder implements InterfaceC31105CIr<FansClubData.UserBadge> {
    public static FansClubData.UserBadge LIZIZ(Q9H q9h) {
        FansClubData.UserBadge userBadge = new FansClubData.UserBadge();
        userBadge.icons = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        userBadge.title = Q9J.LIZIZ(q9h);
                    }
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    Integer num = null;
                    ImageModel imageModel = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                imageModel = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            num = Integer.valueOf(q9h.LJIIJ());
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (num != null) {
                        if (imageModel != null) {
                            userBadge.icons.put(num, imageModel);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return userBadge;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansClubData.UserBadge LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
