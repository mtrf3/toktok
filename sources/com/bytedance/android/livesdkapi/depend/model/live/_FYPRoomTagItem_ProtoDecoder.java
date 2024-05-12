package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes16.dex */
public final class _FYPRoomTagItem_ProtoDecoder implements InterfaceC31105CIr<FYPRoomTagItem> {
    @Override // X.InterfaceC31105CIr
    public final FYPRoomTagItem LIZ(Q9H q9h) {
        FYPRoomTagItem fYPRoomTagItem = new FYPRoomTagItem();
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
                                    fYPRoomTagItem.daInfo = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                fYPRoomTagItem.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            fYPRoomTagItem.content = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        fYPRoomTagItem.style = Integer.valueOf(q9h.LJIIJ());
                    }
                } else {
                    fYPRoomTagItem.id = Integer.valueOf(q9h.LJIIJ());
                }
            } else {
                q9h.LJ(LIZJ);
                return fYPRoomTagItem;
            }
        }
    }
}
