package com.bytedance.android.livesdk.model;

import X.C29991Fr;
import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _DonationSticker_ProtoDecoder implements InterfaceC31105CIr<DonationSticker> {
    public static DonationSticker LIZIZ(Q9H q9h) {
        DonationSticker donationSticker = new DonationSticker();
        donationSticker.inputRect = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        donationSticker.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        donationSticker.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        donationSticker.type = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        C29991Fr.LIZ(q9h, donationSticker.inputRect);
                        break;
                    case 5:
                        donationSticker.textSize = (int) q9h.LJIIJJI();
                        break;
                    case 6:
                        donationSticker.textColor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        donationSticker.content = _OrganizationModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        donationSticker.maxLength = q9h.LJIIJJI();
                        break;
                    case 9:
                        donationSticker.status = q9h.LJIIJJI();
                        break;
                    case 10:
                        donationSticker.screenHeight = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        donationSticker.x = (int) q9h.LJIIJJI();
                        break;
                    case 12:
                        donationSticker.screenWidth = (int) q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        donationSticker.y = (int) q9h.LJIIJJI();
                        break;
                    case 14:
                        donationSticker.kind = q9h.LJIIJJI();
                        break;
                    case 15:
                        donationSticker.subType = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return donationSticker;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final DonationSticker LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
