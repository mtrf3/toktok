package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FansPrivilegeRichText_ProtoDecoder implements InterfaceC31105CIr<FansPrivilegeRichText> {
    public static FansPrivilegeRichText LIZIZ(Q9H q9h) {
        FansPrivilegeRichText fansPrivilegeRichText = new FansPrivilegeRichText();
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
                                fansPrivilegeRichText.description = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fansPrivilegeRichText.rightIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        fansPrivilegeRichText.leftIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansPrivilegeRichText.background = _FansPrivilegeBackground_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansPrivilegeRichText;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansPrivilegeRichText LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
