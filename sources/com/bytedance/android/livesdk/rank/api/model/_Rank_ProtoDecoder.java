package com.bytedance.android.livesdk.rank.api.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _Rank_ProtoDecoder implements InterfaceC31105CIr<Rank> {
    public static Rank LIZIZ(Q9H q9h) {
        Rank rank = new Rank();
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
                                    rank.userRestrictionLevel = q9h.LJIIJJI();
                                }
                            } else {
                                rank.gapDescription = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            rank.rank = q9h.LJIIJJI();
                        }
                    } else {
                        rank.score = q9h.LJIIJJI();
                    }
                } else {
                    rank.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return rank;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Rank LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
