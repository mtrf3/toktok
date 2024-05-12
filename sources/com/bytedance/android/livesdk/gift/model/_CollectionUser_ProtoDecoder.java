package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _CollectionUser_ProtoDecoder implements InterfaceC31105CIr<CollectionUser> {
    public static CollectionUser LIZIZ(Q9H q9h) {
        CollectionUser collectionUser = new CollectionUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                collectionUser.avatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            collectionUser.displayId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        collectionUser.userIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    collectionUser.userId = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return collectionUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CollectionUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
