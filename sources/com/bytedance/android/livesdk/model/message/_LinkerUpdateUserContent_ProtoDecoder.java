package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _LinkerUpdateUserContent_ProtoDecoder implements InterfaceC31105CIr<LinkerUpdateUserContent> {
    public static LinkerUpdateUserContent LIZIZ(Q9H q9h) {
        LinkerUpdateUserContent linkerUpdateUserContent = new LinkerUpdateUserContent();
        linkerUpdateUserContent.updateInfo = new HashMap();
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
                            String str2 = null;
                            while (true) {
                                int LJI2 = q9h.LJI();
                                if (LJI2 == -1) {
                                    break;
                                }
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        str2 = Q9J.LIZIZ(q9h);
                                    }
                                } else {
                                    str = Q9J.LIZIZ(q9h);
                                }
                            }
                            q9h.LJ(LIZJ2);
                            if (str != null) {
                                if (str2 != null) {
                                    linkerUpdateUserContent.updateInfo.put(str, str2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        linkerUpdateUserContent.toUserId = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    linkerUpdateUserContent.fromUserId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return linkerUpdateUserContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkerUpdateUserContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
