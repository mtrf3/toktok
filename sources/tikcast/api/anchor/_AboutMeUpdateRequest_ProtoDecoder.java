package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public final class _AboutMeUpdateRequest_ProtoDecoder implements InterfaceC31105CIr<AboutMeUpdateRequest> {
    @Override // X.InterfaceC31105CIr
    public final AboutMeUpdateRequest LIZ(Q9H q9h) {
        AboutMeUpdateRequest aboutMeUpdateRequest = new AboutMeUpdateRequest();
        aboutMeUpdateRequest.inputContentList = new ArrayList();
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
                                    aboutMeUpdateRequest.mockRoomId = q9h.LJIIJJI();
                                }
                            } else {
                                aboutMeUpdateRequest.imageUri = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            aboutMeUpdateRequest.inputContentList.add(Q9J.LIZIZ(q9h));
                        }
                    } else {
                        aboutMeUpdateRequest.templateId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    aboutMeUpdateRequest.methodType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return aboutMeUpdateRequest;
            }
        }
    }
}
