package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.MGetTranslationResponse;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _MGetTranslationResponse_Data_ProtoDecoder implements InterfaceC31105CIr<MGetTranslationResponse.Data> {
    public static MGetTranslationResponse.Data LIZIZ(Q9H q9h) {
        MGetTranslationResponse.Data data = new MGetTranslationResponse.Data();
        data.translations = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    long LIZJ2 = q9h.LIZJ();
                    String str = null;
                    MGetTranslationResponse.Data.Translation translation = null;
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 == -1) {
                            break;
                        }
                        if (LJI2 != 1) {
                            if (LJI2 == 2) {
                                translation = _MGetTranslationResponse_Data_Translation_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            str = Q9J.LIZIZ(q9h);
                        }
                    }
                    q9h.LJ(LIZJ2);
                    if (str != null) {
                        if (translation != null) {
                            data.translations.put(str, translation);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MGetTranslationResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
