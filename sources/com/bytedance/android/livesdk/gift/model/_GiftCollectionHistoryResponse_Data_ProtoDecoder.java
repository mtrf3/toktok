package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model.GiftCollectionHistoryResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GiftCollectionHistoryResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GiftCollectionHistoryResponse.Data> {
    public static GiftCollectionHistoryResponse.Data LIZIZ(Q9H q9h) {
        GiftCollectionHistoryResponse.Data data = new GiftCollectionHistoryResponse.Data();
        data.historyRounds = new ArrayList();
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
                                    data.historyDescription = _CollectionDescription_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                data.titleText = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            data.isHost = Boolean.valueOf(Q9J.LIZ(q9h));
                        }
                    } else {
                        data.historyRounds.add(_GiftCollectionHistoryResponse_EffectList_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    data.anchorInfo = _CollectionUser_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GiftCollectionHistoryResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
