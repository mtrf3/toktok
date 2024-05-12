package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._BadgeStruct_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubLevel_ProtoDecoder implements InterfaceC31105CIr<SubLevel> {
    public static SubLevel LIZIZ(Q9H q9h) {
        SubLevel subLevel = new SubLevel();
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
                                    subLevel.badgeStruct = _BadgeStruct_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                subLevel.badge = _LevelBadge_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            subLevel.monthLimit = Integer.valueOf(q9h.LJIIJ());
                        }
                    } else {
                        subLevel.desc = Q9J.LIZIZ(q9h);
                    }
                } else {
                    subLevel.level = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return subLevel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubLevel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
