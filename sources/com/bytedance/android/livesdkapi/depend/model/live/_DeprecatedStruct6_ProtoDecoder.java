package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _DeprecatedStruct6_ProtoDecoder implements InterfaceC31105CIr<DeprecatedStruct6> {
    public static DeprecatedStruct6 LIZIZ(Q9H q9h) {
        DeprecatedStruct6 deprecatedStruct6 = new DeprecatedStruct6();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        deprecatedStruct6.deprecated1 = _DeprecatedStruct6_DeprecatedStruct7_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        deprecatedStruct6.deprecated2 = _DeprecatedStruct6_DeprecatedStruct7_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        deprecatedStruct6.deprecated3 = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        deprecatedStruct6.deprecated4 = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        deprecatedStruct6.deprecated5 = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        deprecatedStruct6.deprecated6 = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        deprecatedStruct6.deprecated7 = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        deprecatedStruct6.deprecated8 = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        deprecatedStruct6.deprecated9 = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 10:
                        deprecatedStruct6.deprecated10 = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        deprecatedStruct6.deprecated11 = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return deprecatedStruct6;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DeprecatedStruct6 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
