package com.bytedance.android.live.network.response.pb;

import X.InterfaceC65349Pkn;
import X.Q9H;
import X.Q9J;
import X.R2O;
import java.io.IOException;

/* loaded from: classes12.dex */
public class ProtoResponse {

    @InterfaceC65349Pkn("body")
    public byte[] body = new byte[0];

    @InterfaceC65349Pkn("header")
    public R2O header;

    public static ProtoResponse LIZ(Q9H q9h) {
        ProtoResponse protoResponse = new ProtoResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        protoResponse.body = q9h.LJII();
                    }
                } else {
                    R2O r2o = new R2O();
                    long LIZJ2 = q9h.LIZJ();
                    while (true) {
                        int LJI2 = q9h.LJI();
                        if (LJI2 != -1) {
                            switch (LJI2) {
                                case 1:
                                    r2o.LIZ = (int) q9h.LJIIJJI();
                                    break;
                                case 2:
                                    r2o.LIZIZ = Q9J.LIZIZ(q9h);
                                    break;
                                case 3:
                                    r2o.LIZJ = Q9J.LIZIZ(q9h);
                                    break;
                                case 4:
                                    r2o.LIZLLL = Q9J.LIZIZ(q9h);
                                    break;
                                case 5:
                                    r2o.LJ = q9h.LJIIJJI();
                                    break;
                                case 6:
                                    r2o.LJFF = Q9J.LIZIZ(q9h);
                                    break;
                                default:
                                    Q9J.LIZJ(q9h);
                                    break;
                            }
                        } else {
                            q9h.LJ(LIZJ2);
                            if (r2o.LIZ != -1) {
                                if (r2o.LJ != -1) {
                                    protoResponse.header = r2o;
                                } else {
                                    throw new IOException("Invalid protobuf data: missing header.now!");
                                }
                            } else {
                                throw new IOException("Invalid protobuf data: missing header.statusCode!");
                            }
                        }
                    }
                }
            } else {
                q9h.LJ(LIZJ);
                if (protoResponse.header != null) {
                    return protoResponse;
                }
                throw new IOException("Invalid protobuf data: response.header is null!");
            }
        }
    }
}
