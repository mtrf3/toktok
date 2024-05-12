package tikcast.api.eco;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GuideDetail_ProtoDecoder implements InterfaceC31105CIr<GuideDetail> {
    public static GuideDetail LIZIZ(Q9H q9h) {
        GuideDetail guideDetail = new GuideDetail();
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
                                    guideDetail.eduId = q9h.LJIIJJI();
                                }
                            } else {
                                guideDetail.linkUrl = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            guideDetail.imageUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        guideDetail.description = Q9J.LIZIZ(q9h);
                    }
                } else {
                    guideDetail.title = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return guideDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
