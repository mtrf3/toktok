package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _MemberMessage_EffectConfigBean_ProtoDecoder implements InterfaceC31105CIr<MemberMessage.EffectConfigBean> {
    public static MemberMessage.EffectConfigBean LIZIZ(Q9H q9h) {
        MemberMessage.EffectConfigBean effectConfigBean = new MemberMessage.EffectConfigBean();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 4) {
                            if (LJI != 8) {
                                Q9J.LIZJ(q9h);
                            } else {
                                effectConfigBean.badge = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            effectConfigBean.textKey = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        effectConfigBean.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    effectConfigBean.type = (int) q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return effectConfigBean;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MemberMessage.EffectConfigBean LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
