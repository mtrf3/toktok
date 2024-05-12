package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _MGetTranslationRequest_ProtoDecoder implements InterfaceC31105CIr<MGetTranslationRequest> {
    @Override // X.InterfaceC31105CIr
    public final MGetTranslationRequest LIZ(Q9H q9h) {
        MGetTranslationRequest mGetTranslationRequest = new MGetTranslationRequest();
        mGetTranslationRequest.texts = new ArrayList();
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
                                mGetTranslationRequest.texts.add(_MGetTranslationRequest_Text_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            mGetTranslationRequest.secAnchorId = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        mGetTranslationRequest.anchorId = q9h.LJIIJJI();
                    }
                } else {
                    mGetTranslationRequest.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return mGetTranslationRequest;
            }
        }
    }
}
