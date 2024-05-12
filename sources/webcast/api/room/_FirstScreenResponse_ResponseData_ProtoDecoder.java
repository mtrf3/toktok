package webcast.api.room;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._RoomMessage_ProtoDecoder;
import webcast.api.room.FirstScreenResponse;

/* loaded from: classes6.dex */
public final class _FirstScreenResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<FirstScreenResponse.ResponseData> {
    public static FirstScreenResponse.ResponseData LIZIZ(Q9H q9h) {
        FirstScreenResponse.ResponseData responseData = new FirstScreenResponse.ResponseData();
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
                                responseData.roomMsg = _RoomMessage_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            responseData.anchor = _User_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.user = _User_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    responseData.room = _FirstScreenRoom_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FirstScreenResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
