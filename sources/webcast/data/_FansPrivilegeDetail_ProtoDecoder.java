package webcast.data;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _FansPrivilegeDetail_ProtoDecoder implements InterfaceC31105CIr<FansPrivilegeDetail> {
    public static FansPrivilegeDetail LIZIZ(Q9H q9h) {
        FansPrivilegeDetail fansPrivilegeDetail = new FansPrivilegeDetail();
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
                                    fansPrivilegeDetail.richText = _FansPrivilegeRichText_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                fansPrivilegeDetail.description = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            fansPrivilegeDetail.title = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        fansPrivilegeDetail.privilegeType = q9h.LJIIJ();
                    }
                } else {
                    fansPrivilegeDetail.level = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return fansPrivilegeDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansPrivilegeDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
