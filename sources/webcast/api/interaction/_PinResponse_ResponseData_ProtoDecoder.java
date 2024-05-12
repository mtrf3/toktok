package webcast.api.interaction;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PinMessage_ProtoDecoder;
import webcast.api.interaction.PinResponse;
import webcast.data._InteractionConflict_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PinResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<PinResponse.ResponseData> {
    public static PinResponse.ResponseData LIZIZ(Q9H q9h) {
        PinResponse.ResponseData responseData = new PinResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.interactionConflict = _InteractionConflict_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.pinMsg = _PinMessage_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.status = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PinResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
