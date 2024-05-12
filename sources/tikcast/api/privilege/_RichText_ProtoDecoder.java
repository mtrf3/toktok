package tikcast.api.privilege;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _RichText_ProtoDecoder implements InterfaceC31105CIr<RichText> {
    public static RichText LIZIZ(Q9H q9h) {
        RichText richText = new RichText();
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
                                richText.description = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            richText.rightIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        richText.leftIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    richText.background = _Background_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return richText;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RichText LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
