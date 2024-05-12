package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.guide.model.GuideKeywordsResponse;

/* loaded from: classes14.dex */
public final class _GuideKeywordsResponse_UserInfo_ProtoDecoder implements InterfaceC31105CIr<GuideKeywordsResponse.UserInfo> {
    public static GuideKeywordsResponse.UserInfo LIZIZ(Q9H q9h) {
        GuideKeywordsResponse.UserInfo userInfo = new GuideKeywordsResponse.UserInfo();
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
                                    userInfo.coinExchangePrompt = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                userInfo.suggestedMaxCoins = q9h.LJIIJJI();
                            }
                        } else {
                            userInfo.suggestedMinCoins = q9h.LJIIJJI();
                        }
                    } else {
                        userInfo.hasEverRecharged = Q9J.LIZ(q9h);
                    }
                } else {
                    userInfo.isInEea = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideKeywordsResponse.UserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
