package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _AboutMeInputBox_ProtoDecoder implements InterfaceC31105CIr<AboutMeInputBox> {
    public static AboutMeInputBox LIZIZ(Q9H q9h) {
        AboutMeInputBox aboutMeInputBox = new AboutMeInputBox();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            aboutMeInputBox.content = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        aboutMeInputBox.maxCharacterCount = q9h.LJIIJ();
                    }
                } else {
                    aboutMeInputBox.guideContent = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return aboutMeInputBox;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AboutMeInputBox LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
