package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.MGetUserLinkmicStatusResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import java.util.HashMap;

/* loaded from: classes14.dex */
public final class _MGetUserLinkmicStatusResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<MGetUserLinkmicStatusResponse.ResponseData> {
    public static MGetUserLinkmicStatusResponse.ResponseData LIZIZ(Q9H q9h) {
        MGetUserLinkmicStatusResponse.ResponseData responseData = new MGetUserLinkmicStatusResponse.ResponseData();
        responseData.linkmicStatusMap = new HashMap();
        responseData.roomInfo = new HashMap();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                Long l = null;
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        long LIZJ2 = q9h.LIZJ();
                        Room room = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 == -1) {
                                break;
                            }
                            if (LJI2 != 1) {
                                if (LJI2 == 2) {
                                    room = _Room_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                l = Long.valueOf(q9h.LJIIJJI());
                            }
                        }
                        q9h.LJ(LIZJ2);
                        if (l != null) {
                            if (room != null) {
                                responseData.roomInfo.put(l, room);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long LIZJ3 = q9h.LIZJ();
                    MGetUserLinkmicStatusResponse.LinkmicStatus linkmicStatus = null;
                    while (true) {
                        int LJI3 = q9h.LJI();
                        if (LJI3 == -1) {
                            break;
                        }
                        if (LJI3 != 1) {
                            if (LJI3 == 2) {
                                linkmicStatus = _MGetUserLinkmicStatusResponse_LinkmicStatus_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ3);
                    if (l != null) {
                        if (linkmicStatus != null) {
                            responseData.linkmicStatusMap.put(l, linkmicStatus);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MGetUserLinkmicStatusResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
