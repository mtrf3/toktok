package com.ss.android.ugc.aweme.service;

import X.C16880lQ;
import X.C48478J0w;
import X.C58096Mr6;
import X.EF7;
import X.J1A;
import X.JYH;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PaidContentSdpTrailerService implements IPaidContentSdpTrailerService {
    public final Map<String, Boolean> LIZ = new LinkedHashMap();
    public BroadcastReceiver LIZIZ;

    public static IPaidContentSdpTrailerService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IPaidContentSdpTrailerService.class, false);
        if (LIZ != null) {
            return (IPaidContentSdpTrailerService) LIZ;
        }
        if (C58096Mr6.d5 == null) {
            synchronized (IPaidContentSdpTrailerService.class) {
                if (C58096Mr6.d5 == null) {
                    C58096Mr6.d5 = new PaidContentSdpTrailerService();
                }
            }
        }
        return C58096Mr6.d5;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService
    public final void LIZIZ() {
        if (this.LIZIZ != null) {
            C16880lQ.LJJLIIIJL(EF7.LIZIZ(), this.LIZIZ);
            this.LIZIZ = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService
    public final void LIZ(C48478J0w receiver) {
        o.LJIIIZ(receiver, "receiver");
        if (this.LIZIZ == null) {
            this.LIZIZ = receiver;
            C16880lQ.LJJLIIIJILLIZJL(receiver, EF7.LIZIZ(), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        }
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService
    public final J1A LIZJ(String collectionId, boolean z) {
        boolean LJIIJ;
        o.LJIIIZ(collectionId, "collectionId");
        if (!z) {
            return J1A.HIDE_BUTTON;
        }
        Boolean bool = (Boolean) ((LinkedHashMap) this.LIZ).get(collectionId);
        if (bool != null) {
            LJIIJ = bool.booleanValue();
        } else {
            LJIIJ = JYH.LIZIZ.LJIIJ();
        }
        if (LJIIJ) {
            return J1A.SHOW_BUTTON_MUTED;
        }
        return J1A.SHOW_BUTTON_UNMUTED;
    }
}
