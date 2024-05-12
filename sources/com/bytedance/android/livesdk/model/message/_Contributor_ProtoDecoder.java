package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _Contributor_ProtoDecoder implements InterfaceC31105CIr<Contributor> {
    public static Contributor LIZIZ(Q9H q9h) {
        Contributor contributor = new Contributor();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                contributor.mDelta = q9h.LJIIJJI();
                            }
                        } else {
                            contributor.mRank = q9h.LJIIJJI();
                        }
                    } else {
                        contributor.mUser = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    contributor.mScore = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return contributor;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final Contributor LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
