package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SkinHostAccount_ProtoDecoder implements InterfaceC31105CIr<SkinHostAccount> {
    public static SkinHostAccount LIZIZ(Q9H q9h) {
        SkinHostAccount skinHostAccount = new SkinHostAccount();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    Q9J.LIZJ(q9h);
                } else {
                    skinHostAccount.bgImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return skinHostAccount;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SkinHostAccount LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
