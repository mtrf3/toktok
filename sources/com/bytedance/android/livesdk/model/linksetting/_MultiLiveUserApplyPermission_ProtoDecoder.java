package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MultiLiveUserApplyPermission_ProtoDecoder implements InterfaceC31105CIr<MultiLiveUserApplyPermission> {
    public static MultiLiveUserApplyPermission LIZIZ(Q9H q9h) {
        MultiLiveUserApplyPermission multiLiveUserApplyPermission = new MultiLiveUserApplyPermission();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            multiLiveUserApplyPermission.applierSortGiftScoreThreshold = q9h.LJIIJJI();
                        }
                    } else {
                        multiLiveUserApplyPermission.applierSortSetting = q9h.LJIIJJI();
                    }
                } else {
                    multiLiveUserApplyPermission.multiLiveApplyPermission = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveUserApplyPermission;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveUserApplyPermission LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
