package tikcast.api.anchor;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _AboutMeTemplate_ProtoDecoder implements InterfaceC31105CIr<AboutMeTemplate> {
    public static AboutMeTemplate LIZIZ(Q9H q9h) {
        AboutMeTemplate aboutMeTemplate = new AboutMeTemplate();
        aboutMeTemplate.inputBoxList = new ArrayList();
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
                                    aboutMeTemplate.inputBoxList.add(_AboutMeInputBox_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                aboutMeTemplate.iconImageDark = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            aboutMeTemplate.iconImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        aboutMeTemplate.name = Q9J.LIZIZ(q9h);
                    }
                } else {
                    aboutMeTemplate.id = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return aboutMeTemplate;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AboutMeTemplate LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
