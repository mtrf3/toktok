package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.PageSchemaListResponse;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _PageSchemaListResponse_Data_ProtoDecoder implements InterfaceC31105CIr<PageSchemaListResponse.Data> {
    public static PageSchemaListResponse.Data LIZIZ(Q9H q9h) {
        PageSchemaListResponse.Data data = new PageSchemaListResponse.Data();
        data.schema = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
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
                            data.schema.put(str, str2);
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
    public final PageSchemaListResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
