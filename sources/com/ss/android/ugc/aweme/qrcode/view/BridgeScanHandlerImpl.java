package com.ss.android.ugc.aweme.qrcode.view;

import X.C58096Mr6;
import X.C58733N3h;
import X.C58735N3j;
import X.InterfaceC58734N3i;
import com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BridgeScanHandlerImpl implements IBridgeScanHandler {
    public static IBridgeScanHandler LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IBridgeScanHandler.class, false);
        if (LIZ != null) {
            return (IBridgeScanHandler) LIZ;
        }
        if (C58096Mr6.m4 == null) {
            synchronized (IBridgeScanHandler.class) {
                if (C58096Mr6.m4 == null) {
                    C58096Mr6.m4 = new BridgeScanHandlerImpl();
                }
            }
        }
        return C58096Mr6.m4;
    }

    @Override // com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler
    public final void LIZ(InterfaceC58734N3i scanResultHandler) {
        o.LJIIIZ(scanResultHandler, "scanResultHandler");
        ((ArrayList) C58733N3h.LIZIZ).remove(scanResultHandler);
    }

    @Override // com.ss.android.ugc.aweme.qrcode.handler.IBridgeScanHandler
    public final void LIZIZ(C58735N3j c58735N3j) {
        ((ArrayList) C58733N3h.LIZIZ).add(c58735N3j);
    }
}
