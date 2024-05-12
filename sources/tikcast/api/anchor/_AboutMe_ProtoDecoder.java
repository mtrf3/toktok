package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _AboutMe_ProtoDecoder implements InterfaceC31105CIr<AboutMe> {
    public static AboutMe LIZIZ(Q9H q9h) {
        AboutMe aboutMe = new AboutMe();
        aboutMe.templateList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        aboutMe.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        aboutMe.auditStatus = q9h.LJIIJJI();
                        break;
                    case 3:
                        aboutMe.switchStatus = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        aboutMe.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        aboutMe.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        aboutMe.templateList.add(_AboutMeTemplate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        aboutMe.currentTemplateId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return aboutMe;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AboutMe LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
