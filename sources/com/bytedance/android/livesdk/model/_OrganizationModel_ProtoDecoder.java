package com.bytedance.android.livesdk.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _OrganizationModel_ProtoDecoder implements InterfaceC31105CIr<OrganizationModel> {
    public static OrganizationModel LIZIZ(Q9H q9h) {
        OrganizationModel organizationModel = new OrganizationModel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        organizationModel.name = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        organizationModel.desc = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        organizationModel.detailUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        organizationModel.donateLink = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        organizationModel.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        organizationModel.organizationId = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return organizationModel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OrganizationModel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
