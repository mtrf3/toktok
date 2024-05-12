package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.api.room.MockResponse;

/* loaded from: classes6.dex */
public final class _MockResponse_GuideVideoURL_ProtoDecoder implements InterfaceC31105CIr<MockResponse.GuideVideoURL> {
    public static MockResponse.GuideVideoURL LIZIZ(Q9H q9h) {
        MockResponse.GuideVideoURL guideVideoURL = new MockResponse.GuideVideoURL();
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
                                    guideVideoURL.multiguestUrl = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                guideVideoURL.giftUrl = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            guideVideoURL.cohostUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        guideVideoURL.interactUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    guideVideoURL.matchUrl = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guideVideoURL;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MockResponse.GuideVideoURL LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
