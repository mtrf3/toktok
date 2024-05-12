package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _DonationMessage_ProtoDecoder implements InterfaceC31105CIr<DonationMessage> {
    @Override // X.InterfaceC31105CIr
    public final DonationMessage LIZ(Q9H q9h) {
        DonationMessage donationMessage = new DonationMessage();
        donationMessage.sponsor = new ArrayList();
        donationMessage.user = new ArrayList();
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
                                    donationMessage.user.add(_User_ProtoDecoder.LIZIZ(q9h));
                                }
                            } else {
                                donationMessage.sponsor.add(_User_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            donationMessage.currency = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        donationMessage.total = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    donationMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return donationMessage;
            }
        }
    }
}
