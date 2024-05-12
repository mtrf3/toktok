package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _LinkMicCommonResp_ProtoDecoder implements InterfaceC31105CIr<LinkMicCommonResp> {
    public static LinkMicCommonResp LIZIZ(Q9H q9h) {
        LinkMicCommonResp linkMicCommonResp = new LinkMicCommonResp();
        linkMicCommonResp.extra = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            long LIZJ2 = q9h.LIZJ();
                            String str = null;
                            byte[] bArr = null;
                            while (true) {
                                int LJI2 = q9h.LJI();
                                if (LJI2 == -1) {
                                    break;
                                }
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        bArr = q9h.LJII();
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            }
                            q9h.LJ(LIZJ2);
                            if (str != null) {
                                if (bArr != null) {
                                    linkMicCommonResp.extra.put(str, bArr);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        linkMicCommonResp.errorMsg = Q9J.LIZIZ(q9h);
                    }
                } else {
                    linkMicCommonResp.errorCode = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicCommonResp;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkMicCommonResp LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
