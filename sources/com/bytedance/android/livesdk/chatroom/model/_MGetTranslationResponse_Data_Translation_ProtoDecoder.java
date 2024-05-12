package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _MGetTranslationResponse_Data_Translation_ProtoDecoder implements InterfaceC31105CIr<MGetTranslationResponse.Data.Translation> {
    public static MGetTranslationResponse.Data.Translation LIZIZ(Q9H q9h) {
        MGetTranslationResponse.Data.Translation translation = new MGetTranslationResponse.Data.Translation();
        translation.emotesIndexMap = new HashMap();
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
                            Long l = null;
                            Long l2 = null;
                            while (true) {
                                int LJI2 = q9h.LJI();
                                if (LJI2 == -1) {
                                    break;
                                }
                                if (LJI2 != 1) {
                                    if (LJI2 == 2) {
                                        l2 = Long.valueOf(q9h.LJIIJJI());
                                    }
                                } else {
                                    l = Long.valueOf(q9h.LJIIJJI());
                                }
                            }
                            q9h.LJ(LIZJ2);
                            if (l != null) {
                                if (l2 != null) {
                                    translation.emotesIndexMap.put(l, l2);
                                } else {
                                    throw new IllegalStateException("Map value must not be null!");
                                }
                            } else {
                                throw new IllegalStateException("Map key must not be null!");
                            }
                        }
                    } else {
                        translation.translation = Q9J.LIZIZ(q9h);
                    }
                } else {
                    translation.translated = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return translation;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MGetTranslationResponse.Data.Translation LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
