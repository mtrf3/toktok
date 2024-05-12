package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _FansPrivilegeBackground_ProtoDecoder implements InterfaceC31105CIr<FansPrivilegeBackground> {
    public static FansPrivilegeBackground LIZIZ(Q9H q9h) {
        FansPrivilegeBackground fansPrivilegeBackground = new FansPrivilegeBackground();
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
                                fansPrivilegeBackground.borderColorCode = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fansPrivilegeBackground.backgroundColorCode = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        fansPrivilegeBackground.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansPrivilegeBackground.useImage = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansPrivilegeBackground;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansPrivilegeBackground LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
