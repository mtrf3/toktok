package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.emoji._EmoteModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _AnchorSubWaveChallengeSettings_ProtoDecoder implements InterfaceC31105CIr<AnchorSubWaveChallengeSettings> {
    public static AnchorSubWaveChallengeSettings LIZIZ(Q9H q9h) {
        AnchorSubWaveChallengeSettings anchorSubWaveChallengeSettings = new AnchorSubWaveChallengeSettings();
        anchorSubWaveChallengeSettings.emoteList = new ArrayList();
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
                                    anchorSubWaveChallengeSettings.emoteList.add(_EmoteModel_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                anchorSubWaveChallengeSettings.duringTime = q9h.LJIIJJI();
                            }
                        } else {
                            anchorSubWaveChallengeSettings.needSubCounts = q9h.LJIIJJI();
                        }
                    } else {
                        anchorSubWaveChallengeSettings.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    anchorSubWaveChallengeSettings.id = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorSubWaveChallengeSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorSubWaveChallengeSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
