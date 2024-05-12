package webcast.api.envelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.HashMap;
import webcast.api.envelope.RevenuePermissionResponse;

/* loaded from: classes6.dex */
public final class _RevenuePermissionResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<RevenuePermissionResponse.ResponseData> {
    public static RevenuePermissionResponse.ResponseData LIZIZ(Q9H q9h) {
        RevenuePermissionResponse.ResponseData responseData = new RevenuePermissionResponse.ResponseData();
        responseData.envelopePermission = new HashMap();
        responseData.goodyBagPermission = new HashMap();
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
                        Boolean bool = null;
                        while (true) {
                            int LJI2 = q9h.LJI();
                            if (LJI2 == -1) {
                                break;
                            }
                            if (LJI2 != 1) {
                                if (LJI2 == 2) {
                                    bool = Boolean.valueOf(Q9J.LIZ(q9h));
                                }
                            } else {
                                l = Long.valueOf(q9h.LJIIJJI());
                            }
                        }
                        q9h.LJ(LIZJ2);
                        if (l != null) {
                            if (bool != null) {
                                responseData.goodyBagPermission.put(l, bool);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    long LIZJ3 = q9h.LIZJ();
                    Boolean bool2 = null;
                    while (true) {
                        int LJI3 = q9h.LJI();
                        if (LJI3 == -1) {
                            break;
                        }
                        if (LJI3 != 1) {
                            if (LJI3 == 2) {
                                bool2 = Boolean.valueOf(Q9J.LIZ(q9h));
                            }
                        } else {
                            l = Long.valueOf(q9h.LJIIJJI());
                        }
                    }
                    q9h.LJ(LIZJ3);
                    if (l != null) {
                        if (bool2 != null) {
                            responseData.envelopePermission.put(l, bool2);
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
    public final RevenuePermissionResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
